package me.jellysquid.mods.phosphor.mixin.chunk.light;

import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import me.jellysquid.mods.phosphor.common.chunk.light.SkyLightStorageMapAccess;
import net.minecraft.world.lighting.SkyLightStorage;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(SkyLightStorage.StorageMap.class)
public class MixinSkyLightStorageMap implements SkyLightStorageMapAccess {
    @Shadow
    private int minY;

    @Shadow
    @Final
    private Long2IntOpenHashMap surfaceSections;

    @Override
    public int getDefaultHeight() {
        return this.minY;
    }

    @Override
    public Long2IntOpenHashMap getHeightMap() {
        return this.surfaceSections;
    }
}
