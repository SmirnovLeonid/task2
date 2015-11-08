package com.epam.task2.tools.token;

import com.epam.task2.tools.Sentence;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 05.11.2015.
 */
public class Word extends Token{

    private List<Symbol> symbolList;

    public Word(List<Symbol> letters) {
        this.symbolList = letters;
    }

    public String getWord() {
        String result = "";
        for (Symbol letter : symbolList) {
            result += letter;
        }
        return result;
    }
    public Word(){
        symbolList = new ArrayList<>();
    }

    public void addSymbol(Symbol symbol){
        symbolList.add(symbol);
    }

    public void addSymbols(List<Symbol> symbols){
        this.symbolList.addAll(symbols);
    }

    @Override
    public boolean equals(Object obj) {
        String wordOne = this.getWord().toLowerCase();
        Word other = (Word) obj;
        String wordTwo = other.getWord().toLowerCase();
        if (wordOne.equals(wordTwo)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + symbolList.hashCode();
        return result;
    }


    public List<Word> extractAllWordFromSentence(Sentence sentence) {
        List<Word> result = new ArrayList<>();
        for (Token token : sentence) {
            if (token instanceof Word) {
                result.add((Word) token);
            }
        }
        return result;
    }

    @Override
    public String getAsString() {
        StringBuilder result = new StringBuilder();
        for (Symbol symbol : symbolList) {
            result.append(symbol.getAsString());
        }
        return result.toString();

}
    @Override
    public String toString() {
        String result = "";
        for (Symbol letter : symbolList) {
            result += letter;
        }
        return result;
    }
}

