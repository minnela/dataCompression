package com.minel.compressor.service;

import me.lemire.integercompression.differential.IntegratedIntCompressor;

public class Compressor {
    private static IntegratedIntCompressor iic = new IntegratedIntCompressor();

    public static int[] compressData(int[] data) {
        return iic.compress(data);
    }

    public static int[] uncompressData(int[] data) {
        return iic.uncompress(data);
    }

}