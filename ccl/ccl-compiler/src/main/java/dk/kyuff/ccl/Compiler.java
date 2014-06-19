package dk.kyuff.ccl;

import org.antlr.v4.runtime.*;
import test.DrinkLexer;
import test.DrinkParser;

/**
 * User: swi
 * Date: 16/06/14
 * Time: 21.14
 */
public class Compiler {


    public boolean isValid(String expr) {
        DrinkParser parser = getDrinkParser(expr);
        parser.barConversation();
        return parser.getNumberOfSyntaxErrors() == 0;
    }

    private DrinkParser getDrinkParser(String expr) {
        CharStream is = new ANTLRInputStream(expr);
        DrinkLexer lexer = new DrinkLexer(is);
        TokenStream tokens = new CommonTokenStream(lexer);
        return new DrinkParser(tokens);
    }

    public String compile(String expr) {
        DrinkParser parser = getDrinkParser(expr);
        ConversationHighlightWalker walker = new ConversationHighlightWalker();
        parser.addParseListener(walker);
        parser.barConversation();
        return walker.getOutput();
    }
}
