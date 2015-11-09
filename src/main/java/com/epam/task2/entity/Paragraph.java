package com.epam.task2.entity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Paragraph implements Iterable<Sentence>{
    private List<Sentence> sentencesList;

    public Paragraph(){
        sentencesList = new ArrayList<>();
    }

    public void addSentence(Sentence sentence){
        sentencesList.add(sentence);
    }

       @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Paragraph paragraph1 = (Paragraph) o;

        return sentencesList.equals(paragraph1.sentencesList);

    }

    @Override
    public int hashCode() {
        return sentencesList.hashCode();
    }

    public String getAsString() {
        StringBuilder result = new StringBuilder();
        for (Sentence sentence : sentencesList) {
            result.append(sentence.getAsString());
        }
        return result.toString();
    }

    @Override
    public Iterator<Sentence> iterator() {
        return sentencesList.iterator();
    }

}