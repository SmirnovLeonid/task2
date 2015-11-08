package com.epam.task2.io.printer;

import com.epam.task2.tools.Sentence;
import com.epam.task2.tools.Text;

import java.util.List;

/**
 * Created by Admin on 07.11.2015.
 */
public interface IPrinter {
    void displayText(Text text);
    void print(Text text);
    void print(List<Sentence> sentences);
}
