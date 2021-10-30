package com.minel.compressor.service;

public class RatioCalculator {

    public static double calculateCompressionRatio(int compressedDataSize, int uncompressedDataSize) {
        return (double) compressedDataSize / uncompressedDataSize;
    }
}
