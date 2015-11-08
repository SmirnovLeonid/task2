package com.epam.task2;

import com.epam.task2.io.printer.ConsolePrinter;
import com.epam.task2.io.printer.IPrinter;
import com.epam.task2.io.reader.ScanerReader;
import com.epam.task2.parser.SimpleParser;
import com.epam.task2.parser.exception.WrongTokenException;
import com.epam.task2.prepare.InitialPreparationOfTheText;
import com.epam.task2.prepare.PrepareInterface;
import com.epam.task2.tools.Text;

import java.io.IOException;

/**
 * Created by user on 05.11.2015.
 */
public class Main {


    public static void main(String[] args) throws IOException, WrongTokenException {
        String rawText = ScanerReader.reader("src/main/resources/file.txt");
        PrepareInterface prepare = new InitialPreparationOfTheText();
        rawText = prepare.prepareText(rawText);
        SimpleParser parser = new SimpleParser();
        IPrinter printer = new ConsolePrinter();
        Text text = parser.parseText(rawText);
        Task task = new Task();
        printer.displayText(text);
        System.out.println("========================================================================================");
        System.out.println("Original text" + "\n" );
        System.out.println(rawText);
        System.out.println("========================================================================================");
        System.out.println("Compare text :");
        System.out.println(text.getAsString().equals(rawText));
        System.out.println("========================================================================================");
        task.run(text);

    }
}