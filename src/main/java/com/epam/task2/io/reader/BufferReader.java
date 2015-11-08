package com.epam.task2.io.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by user on 05.11.2015.
 */
public class BufferReader  {

    public static String reader(String file) throws FileNotFoundException {
        String result = "";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                result += currentLine + "\n";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
