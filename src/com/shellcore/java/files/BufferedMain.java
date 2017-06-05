package com.shellcore.java.files;

import java.io.*;

/**
 * Solo leyendo bytes
 * BufferReaders
 * Created by Cesar. 02/06/2017.
 */
public class BufferedMain {

    public static void main(String[] args) throws Exception {
        String inputFile = "./src/inputFile.txt";
        String outputFile = "./src/outputFile.txt";
        BufferedReader input = null;
        BufferedWriter output = null;

        // Byte por byte
        try {
            input = new BufferedReader(new FileReader(inputFile));
            output = new BufferedWriter(new FileWriter(outputFile));

            int character;

            while ((character = input.read()) != -1) {
                System.out.printf("0x%02X", character);
                System.out.println("\n");
                output.write(character);
            }
        } finally {
            if (input != null) {
                input.close();
            }
            if (output != null) {
                output.close();
            }
        }
    }
}
