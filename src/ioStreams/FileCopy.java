package ioStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input file name");
        String inputFile = sc.nextLine();

        System.out.println("Enter the output file name");
        String outputFile = sc.nextLine();

        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("File is copied.");

        } catch (IOException e) {
            System.out.println("File not found or unable to copy file.");
        }

        sc.close();
    }
}