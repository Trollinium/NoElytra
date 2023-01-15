package io.github.trollinium.noelytra.mixin;

import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin {
    @Inject(method="startFallFlying",at=@At("HEAD"),cancellable = true)
    private void injected(CallbackInfo ci) {
        ci.cancel();
    }
}
