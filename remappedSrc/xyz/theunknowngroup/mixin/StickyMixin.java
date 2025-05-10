package xyz.theunknowngroup.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.piston.PistonHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import xyz.theunknowngroup.blocks.ModBlock;

@Mixin(PistonHandler.class)
public class StickyMixin {
	@Inject(method = "isBlockSticky", at = @At("HEAD"), cancellable = true)
	private static void makeSlipStoneNonSticky(BlockState state,
	   CallbackInfoReturnable<Boolean> cir) {
		if (state.getBlock() == ModBlock.SLIP_STONE) {
			cir.setReturnValue(false);
		}
	}
}