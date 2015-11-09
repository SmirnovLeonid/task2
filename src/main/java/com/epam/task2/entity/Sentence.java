package com.epam.task2.entity;

import com.epam.task2.entity.token.Token;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Sentence implements Iterable<Token> {
    private List<Token> tokensList;

    public Sentence(){
        tokensList = new ArrayList<>();
    }

    public void addToken(Token token){
        tokensList.add(token);
    }

     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sentence sentence1 = (Sentence) o;

        return tokensList.equals(sentence1.tokensList);

    }


    public List<Sentence> extractAllSentence(Text text) {
        List<Sentence> resultList = new ArrayList<>();
        for (Paragraph paragraph : text) {
            for (Sentence sentence : paragraph) {
                resultList.add(sentence);
            }
        }
        return resultList;
    }

    @Override
    public int hashCode() {
        return tokensList.hashCode();
    }

    public String getAsString() {
        StringBuilder result = new StringBuilder();
        for (Token tokens : this.tokensList) {
            result.append(tokens.getAsString());
        }
        return result.toString();
    }

    public Iterator<Token> iterator() {
        return tokensList.iterator();
    }

    public String toString() {
        String result = "";
        for (Token token : tokensList) {
            result += token;
        }
        return result;
    }

}