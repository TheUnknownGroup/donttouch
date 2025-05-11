package xyz.theunknowngroup.custom;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.sound.BlockSoundGroup;

public class SlipStone extends Block {
    public SlipStone(Settings settings) {
        super(settings);
    }

    public static int getLuminance(BlockState x) {
        return 10;
    }

    public static Settings blockCreate() {
        return AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE)
                .solid().resistance(100000000).luminance(SlipStone::getLuminance)
                .breakInstantly();
    }
}
