import com.minel.compressor.service.Compressor;
import com.minel.compressor.service.FileReader;
import com.minel.compressor.service.RatioCalculator;

public class CompressionApp {

    public static void main(String[] args) {

        int[] compressedData = Compressor.compressData(FileReader.readFile());
        int[] uncompressedData = Compressor.uncompressData(compressedData);
        double ratio = RatioCalculator.calculateCompressionRatio(compressedData.length, uncompressedData.length);
        System.out.printf("Compression Ratio: %.3f %n", ratio);

    }
}
