package dk.kyuff.ccl;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.misc.Nullable;

/**
 * User: swi
 * Date: 16/06/14
 * Time: 21.46
 */
public class BartenderErrorListener extends BaseErrorListener {

    @Override
    public void syntaxError(@NotNull Recognizer<?, ?> recognizer, @Nullable Object offendingSymbol, int line, int charPositionInLine, @NotNull String msg, @Nullable RecognitionException e) {
        CommonToken token = (CommonToken) offendingSymbol;
        System.out.println("Offending Symbol: " + offendingSymbol);
        System.out.println("line: " + line + " pos: " + charPositionInLine);
        System.out.println("message: " + msg);
        System.out.println(token.getText());
    }
}
