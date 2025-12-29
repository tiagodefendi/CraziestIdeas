package com.defendi.craziestideas.item.custom;

import com.defendi.craziestideas.item.ModItems;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.List;

public class ScrapperItem extends Item {
    public ScrapperItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        BlockPos clickedBlockPos = context.getClickedPos();
        Block clickedBlock = level.getBlockState(clickedBlockPos).getBlock();

        if(clickedBlock == Blocks.BIRCH_LOG) {
            if(!level.isClientSide()) {
                level.setBlockAndUpdate(clickedBlockPos, Blocks.STRIPPED_BIRCH_LOG.defaultBlockState());

                level.addFreshEntity(
                        new ItemEntity(
                                level,
                                clickedBlockPos.getX() + 0.5f,
                                clickedBlockPos.getY() + 1,
                                clickedBlockPos.getZ() + 0.5f,
                                new ItemStack(
                                        ModItems.BIRCH_BARK.get(),
                                        4
                                )
                        )
                );


                context.getItemInHand().hurtAndBreak(
                        1,
                        ((ServerLevel) level),
                        context.getPlayer(),
                        item -> context.getPlayer().onEquippedItemBroken(
                                item,
                                EquipmentSlot.MAINHAND
                        )
                );

                level.playSound(
                        null,
                        clickedBlockPos,
                        SoundEvents.AXE_STRIP,
                        SoundSource.BLOCKS
                );
            }
        }

        return InteractionResult.SUCCESS;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        if(!Screen.hasShiftDown()) {
            tooltipComponents.add(Component.translatable("tooltip.craziestideas.shift_down"));
        }
        else {
            tooltipComponents.add(Component.translatable("tooltip.craziestideas.scrapper"));
        }

        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}
