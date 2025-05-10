package xyz.theunknowngroup;

import xyz.theunknowngroup.blocks.ModBlock;
import xyz.theunknowngroup.item.ModItem;

public class InitializeComponents {
    public static void start() {
        ModBlock.registerModBlocks();
        ModBlock.initialize();
        ModItem.registerModItems();
        ModItem.initialize();
    }
}
