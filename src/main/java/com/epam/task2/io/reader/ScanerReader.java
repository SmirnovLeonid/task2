package com.epam.task2.io.reader;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScanerReader  {
    private static Logger logger = Logger.getLogger(ScanerReader.class);
    public static  String reader(String file) throws FileNotFoundException {
        String fulText = "";
        try {
            logger.info("Start reader ..........");
            Scanner scaner = new Scanner(new File(file)).useDelimiter("\\Z");
            fulText = scaner.next();
            scaner.close();

           }
           catch (FileNotFoundException ex){
               logger.error("ERROR SCANER READER");
           }
        return fulText;

    }
}
