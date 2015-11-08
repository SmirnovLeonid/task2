package com.epam.task2.io.printer;

import com.epam.task2.tools.Paragraph;
import com.epam.task2.tools.Sentence;
import com.epam.task2.tools.Text;
import com.epam.task2.tools.token.Token;

import java.util.List;

/**
 * Created by Admin on 07.11.2015.
 */
public class ConsolePrinter implements IPrinter {

    public void displayText(Text text) {
        System.out.println(text.getAsString());
    }

    public void print(Text text) {
        String result = "";
        for (Paragraph paragraph : text) {
            for (Sentence sentence : paragraph) {
                for (Token token : sentence) {
                    result += token;
                }
                result += " ";
            }
            result = result.trim();
            result += "\n";
        }
        System.out.println(result);
    }

    public void print(List<Sentence> sentences) {
        for (Sentence sentence : sentences) {
            System.out.println(sentence);
        }
    }
}
