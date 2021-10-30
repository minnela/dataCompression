package com.minel.compressor.service;

import junit.framework.TestCase;
import me.lemire.integercompression.differential.IntegratedIntCompressor;
import org.junit.Test;

public class CompressorTest extends TestCase {

    private static int[] data = new int[5];
    private static int[] compressedData;
    private static int[] uncompressedData;

    @Override
    public void setUp() throws Exception {
        for(int i=0; i<5; i++){
            data[i] = i;
        }
        compressedData = Compressor.compressData(data);
        uncompressedData = Compressor.uncompressData(compressedData);
    }

    @Test
    public void testCompressData() {
        assertTrue(compressedData.length < uncompressedData.length);
    }

    public void testUncompressData() {
        assertEquals(data.length, uncompressedData.length);
    }
}