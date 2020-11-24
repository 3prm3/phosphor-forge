package me.jellysquid.mods.phosphor.mixin.block;

import me.jellysquid.mods.phosphor.common.chunk.BlockStateAccess;
import me.jellysquid.mods.phosphor.common.chunk.BlockStateCacheAccess;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(AbstractBlock.AbstractBlockState.class)
public abstract class MixinBlockState implements BlockStateAccess {
    @Shadow
    private AbstractBlock.AbstractBlockState.Cache cache;

    @Override
    public BlockStateCacheAccess getCache() {
        return (BlockStateCacheAccess) this.cache;
    }
}
