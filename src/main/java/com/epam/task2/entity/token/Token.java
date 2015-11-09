package com.epam.task2.entity.token;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 05.11.2015.
 */
public class Token {
    public static final class TokenBuilder{

        public static Word createWord(String text){
            Word word = new Word();
            char[] temp = text.toCharArray();
            List<Symbol> symbols = new ArrayList<>();
            for (char i : temp){
                symbols.add(new Symbol(i));
            }
            word.addSymbols(symbols);
            return word;
        }


        public static PunctuationMark createPunctuationMark(String text){
            PunctuationMark punctuationMark = new PunctuationMark();
            punctuationMark.addMark(new Symbol(text.charAt(0)));
            return punctuationMark;
        }
    }
    public String getAsString() {
        return "";
    }
    public static final class TokenChecker{

        private TokenChecker(){
        }

        public static boolean isWord(String text) {
            Matcher matcher = Pattern.compile(("\\w+")).matcher(text);
            return matcher.find();
        }
               public static boolean isMark(String text){
            Matcher matcher = Pattern.compile("[$-/:-?{-~!\"^_`[\\]]]|(\\s)").matcher(text);
            return matcher.find();
        }
    }
}