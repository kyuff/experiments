package dk.kyuff.ccl;

import org.antlr.v4.runtime.*;
import test.DrinkLexer;
import test.DrinkParser;

import java.io.IOException;

/**
 * User: swi
 * Date: 16/06/14
 * Time: 21.14
 */
public class Compiler {

    public void getErrors(String expr) {
        DrinkParser parser = getDrinkParser(expr);
        BartenderErrorListener errors = new BartenderErrorListener();
        parser.addErrorListener(errors);
        parser.drinkSentence();

    }

    public boolean isValid(String expr) {

        DrinkParser parser = getDrinkParser(expr);
        parser.drinkSentence();
        return parser.getNumberOfSyntaxErrors() == 0;

    }

    private DrinkParser getDrinkParser(String expr) {
        CharStream is = new ANTLRInputStream(expr);
        DrinkLexer lexer = new DrinkLexer(is);
        TokenStream tokens = new CommonTokenStream(lexer);
        return new DrinkParser(tokens);
    }
}
