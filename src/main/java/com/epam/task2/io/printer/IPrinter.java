package com.epam.task2.io.printer;

import com.epam.task2.entity.Sentence;
import com.epam.task2.entity.Text;

import java.util.List;


public interface IPrinter {
    void displayText(Text text);
    void print(Text text);
    void print(List<Sentence> sentences);
}
