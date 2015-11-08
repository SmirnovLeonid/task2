package com.epam.task2.tools.token;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 05.11.2015.
 */
public class PunctuationMark extends Token{

    private List<Symbol> symbolsList;

    public PunctuationMark(){
        symbolsList = new ArrayList<>();
    }

    public void addMark(Symbol symbol){
        symbolsList.add(symbol);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PunctuationMark mark1 = (PunctuationMark) o;

        return symbolsList.equals(mark1.symbolsList);
    }

    @Override
    public int hashCode() {
        return symbolsList.hashCode();
    }

    public String getAsString() {
        StringBuilder result = new StringBuilder();
        for (Symbol symbol : symbolsList) {
            result.append(symbol.getAsString());
        }
        return result.toString();
    }
    public String toString() {
        String result = "";
        for (Symbol symbol : symbolsList) {
            result += symbol;
        }
        return result;
    }
}