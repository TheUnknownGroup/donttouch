package xyz.theunknowngroup;

import xyz.theunknowngroup.blocks.ModBlock;

public class InitializeComponents {
    public static void start() {
        ModBlock.registerModBlocks();
        ModBlock.initialize();
    }
}
