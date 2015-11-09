package com.epam.task2.io.printer;

import com.epam.task2.entity.Paragraph;
import com.epam.task2.entity.Sentence;
import com.epam.task2.entity.Text;
import com.epam.task2.entity.token.Token;

import java.util.List;


public class ConsolePrinter implements IPrinter {

    public void displayText(Text text) {
        System.out.println(text.getAsString());
    }

    @Override
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
