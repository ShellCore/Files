package com.shellcore.java.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Solo la lectura de los archivos
 * FileStreams
 * Created by Cesar. 02/06/2017.
 */
public class FileStreamMain {

    public static void main(String[] args) throws Exception {
        String inputFile = "./src/inputFile.txt";
        String outputFile = "./src/outputFile.txt";
        FileInputStream input = null;
        FileOutputStream output = null;

        // Byte por byte
        try {
            input = new FileInputStream(inputFile);
            output = new FileOutputStream(outputFile);

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
