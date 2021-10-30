package com.minel.compressor.service;

import com.minel.compressor.utils.Util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    static List<Integer> intList = new ArrayList<Integer>();

    public static int[] readFile() {
        try {
            Scanner scanner = new Scanner(new File(Util.filePath));
            while (scanner.hasNextInt()) {
                intList.add(scanner.nextInt());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
        return intList.stream().mapToInt(i -> i).toArray();
    }
}
