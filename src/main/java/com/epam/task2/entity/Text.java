package com.epam.task2.entity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Text implements Iterable<Paragraph> {
    private List<Paragraph> paragraphsList;

    public Text() {
        paragraphsList = new ArrayList<>();
    }

    public void addParagraph(Paragraph ph){
        paragraphsList.add(ph);
    }

    public Iterator<Paragraph> iterator() {
        return paragraphsList.iterator();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Text text1 = (Text) o;

        return paragraphsList.equals(text1.paragraphsList);

    }


    public String getAsString() {
        StringBuilder result = new StringBuilder();
        for (Paragraph paragraph : paragraphsList) {
            result.append(paragraph.getAsString());
        }
        return result.toString();
    }
}
