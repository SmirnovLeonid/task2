package com.epam.task2.entity.token;

/**
 * Created by user on 05.11.2015.
 */
public class Symbol {
    private char symbol;

    public Symbol(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }
    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Symbol symbol1 = (Symbol) o;

        return symbol == symbol1.symbol;
    }

    @Override
    public int hashCode() {
        return (int) symbol;
    }


    public String getAsString() {
        return Character.toString(symbol);
    }


    @Override
    public String toString() {
        return Character.toString(symbol);
    }
}
