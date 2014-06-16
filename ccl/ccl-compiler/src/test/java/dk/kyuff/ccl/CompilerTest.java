package dk.kyuff.ccl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * User: swi
 * Date: 16/06/14
 * Time: 21.15
 */
public class CompilerTest {

    Compiler compiler;

    @Before
    public void setUp() throws Exception {
        compiler = new Compiler();
    }

    @Test
    public void testHelloWorld() throws Exception {
        // setup
        String expr = "a cup of beer";
        // execute
        boolean valid = compiler.isValid(expr);
        // validate
        assertTrue(valid);
    }

    @Test
    public void testFailure() throws Exception {
        // setup
        String expr = "something gibberish";
        // execute
        boolean valid = compiler.isValid(expr);
        // validate
        assertFalse(valid);
    }

    @Test
    public void testErrors() throws Exception {
        // setup
        String expr = "uh keg of beer";
        // execute
        compiler.getErrors(expr);
    }
}
