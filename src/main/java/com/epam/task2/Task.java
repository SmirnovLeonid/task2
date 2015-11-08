package com.epam.task2;

import com.epam.task2.io.printer.ConsolePrinter;
import com.epam.task2.io.printer.IPrinter;
import com.epam.task2.tools.Sentence;
import com.epam.task2.tools.Text;
import com.epam.task2.tools.token.Word;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 07.11.2015.
 */

public class Task {


    IPrinter consolePrinter = new ConsolePrinter();
    Word word= new Word();
    Sentence sentence = new Sentence();
    List<Sentence> sentences;

    public void run(Text text) {
        List<Sentence> result = new ArrayList<>();
        sentences = sentence.extractAllSentence(text);

        for (Sentence sentence : sentences) {
            if (isSameWords(sentence)) {
                result.add(sentence);
            }
        }

        consolePrinter.print(result);

    }


    private boolean isSameWords(Sentence sentence) {
        List<Word> words = word.extractAllWordFromSentence(sentence);

        for (int i = 0; i < words.size(); i++) {
            for (int j = 0; j < words.size(); j++) {
                if (i != j) {
                    if (words.get(i).equals(words.get(j))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
