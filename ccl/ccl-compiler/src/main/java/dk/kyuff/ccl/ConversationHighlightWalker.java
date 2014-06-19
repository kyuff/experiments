package dk.kyuff.ccl;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;
import test.DrinkBaseListener;
import test.DrinkLexer;
import test.DrinkParser;

/**
 * User: swi
 * Date: 19/06/14
 * Time: 21.25
 */
public class ConversationHighlightWalker extends DrinkBaseListener {

    private StringBuilder sb;
    private boolean inDrink = false;
    private boolean bartenderReplied = false;

    public ConversationHighlightWalker() {
        this.sb = new StringBuilder();
    }

    @Override
    public void enterDrinkSentence(@NotNull DrinkParser.DrinkSentenceContext ctx) {
        sb.append("You say to the Bar tender: ");
    }

    @Override
    public void exitDrinkSentence(@NotNull DrinkParser.DrinkSentenceContext ctx) {
        sb.append("\n");
    }

    @Override
    public void enterDrink(@NotNull DrinkParser.DrinkContext ctx) {
        inDrink = true;
        sb.append("-");
    }

    @Override
    public void exitDrink(@NotNull DrinkParser.DrinkContext ctx) {
        inDrink = false;
        sb.append("-");
    }

    @Override
    public void visitTerminal(@NotNull TerminalNode node) {
        if(DrinkLexer.EOL == node.getSymbol().getType()) {
            // do nothing
        } else if(!inDrink) {
            sb.append("[");
            sb.append(node.getSymbol().getText());
            sb.append("] ");
        }  else {
            sb.append(node.getSymbol().getText());
        }
    }

    @Override
    public void enterTitulation(@NotNull DrinkParser.TitulationContext ctx) {
        super.enterTitulation(ctx);
    }

    @Override
    public void exitTitulation(@NotNull DrinkParser.TitulationContext ctx) {
        super.exitTitulation(ctx);
    }

    @Override
    public void enterBarConversation(@NotNull DrinkParser.BarConversationContext ctx) {
        sb.append("This is what went on at the bar:\n");
        sb.append("------------------------------------------------------------");
        sb.append("\n");

    }

    @Override
    public void exitBarConversation(@NotNull DrinkParser.BarConversationContext ctx) {
        if( !bartenderReplied ) {
            sb.append("But the bartender didn't reply!\n");
        }
        sb.append("------------------------------------------------------------");
    }

    @Override
    public void enterBarTenderReply(@NotNull DrinkParser.BarTenderReplyContext ctx) {
        bartenderReplied = true;
        sb.append("And the bartender replied: ");
    }

    @Override
    public void exitBarTenderReply(@NotNull DrinkParser.BarTenderReplyContext ctx) {
        sb.append("\n");
    }

    public String getOutput() {
        return sb.toString();
    }
}
