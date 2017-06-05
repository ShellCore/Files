package com.shellcore.java.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Buscando por tokens delimitados
 * Scannerfile
 * Created by Cesar. 02/06/2017.
 */
public class ScannerMain {

    public static void main(String[] args) throws Exception {
        String inputFile = "./src/inputFile.txt";
        String outputFile = "./src/outputFile.txt";
        Scanner input = null;

        // Token por token
        try {
            input = new Scanner(new BufferedReader(new FileReader(inputFile)));

            while (input.hasNext()) {
                System.out.print(" > " + input.next() + "\n");
            }
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }
}
