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
    public void testCompiler1() throws Exception {
        // setup
        String expr = "a cup of beer\nyes sir";
        // execute
        String out = compiler.compile(expr);
        // validate
        System.out.println(out);
    }

    @Test
    public void testCompiler2() throws Exception {
        // setup
        String expr = "mug of beer\n";
        // execute
        String out = compiler.compile(expr);
        // validate
        System.out.println(out);
    }

    @Test
    public void testHelloWorld() throws Exception {
        // setup
        String expr = "a cup of beer\nyes sir";
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

}
