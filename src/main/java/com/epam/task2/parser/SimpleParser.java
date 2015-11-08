package com.epam.task2.parser;

import com.epam.task2.tools.Paragraph;
import com.epam.task2.tools.Sentence;
import com.epam.task2.tools.Text;
import com.epam.task2.tools.token.Token;
import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 05.11.2015.
 */
public class SimpleParser implements ParserInterface
{
    private static Logger logger = Logger.getLogger(SimpleParser.class);

    private static Properties prop = new Properties();
    static  {
                try {
                    prop.load(new InputStreamReader(new FileInputStream("src/main/resources/regex.properties"),"UTF-8"));
                    logger.info("Regex wasn't loaded");
              } catch (IOException ex) {
                    logger.error("Regex not wasn't loaded");
        }
    }


        public Text parseText(String text) throws IOException {

            System.out.println("Start parsing text...\n");
            Text result = new Text();
            String[] tmp = Pattern.compile(prop.getProperty("PARAGRAPH_REGEX")).split(text);
            for (String paragraph : tmp) {
                result.addParagraph(parseParagraph(paragraph));
            }
            System.out.println("Complite parsing text...\n");
            return result ;

        }


    private Paragraph parseParagraph(String text) {
        Paragraph result = new Paragraph();
        Matcher matcher = Pattern.compile(prop.getProperty("SENTENCE_REGEX")).matcher(text);
        while (matcher.find()) {
            result.addSentence(parseSentence(matcher.group()));
        }
        return result;
    }


    private Sentence parseSentence(String text) {
        Sentence result = new Sentence();
        Matcher matcher = Pattern.compile(prop.getProperty("TOKEN_REGEX")).matcher(text);
        while (matcher.find()) {
            result.addToken(parseToken(matcher.group()));
        }

        return result;
    }


    private Token parseToken(String text) {
        if (Token.TokenChecker.isWord(text)) {
            return Token.TokenBuilder.createWord(text);
        }
        if (Token.TokenChecker.isMark(text)) {
            return Token.TokenBuilder.createPunctuationMark(text);
        }
        throw null;

        }

}