package com.epam.task2.prepare;

/**
 * Created by user on 05.11.2015.
 */
public class InitialPreparationOfTheText implements PrepareInterface{
    @Override
    public String prepareText(String text) {
        text = text.trim();
        text = text.replace("\t", "");
        text = text.replaceAll("(\r\n)+", "\r\n");
        return text;
    }
}
