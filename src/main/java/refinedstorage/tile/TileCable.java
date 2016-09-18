package refinedstorage.tile;

import refinedstorage.RefinedStorage;

public class TileCable extends TileMultipartNode {
    @Override
    public int getEnergyUsage() {
        return RefinedStorage.INSTANCE.config.cableUsage;
    }

    @Override
    public void updateNode() {
        // NO OP
    }
}
