package dk.kyuff.experiments.providers;

/**
 * User: swi
 * Date: 21/07/13
 * Time: 20.55
 */
public class MyServiceImpl implements MyService {

    private int count;

    public MyServiceImpl() {
        count = 0;
    }

    @Override
    public String getNameCount() {
        count++;
        return "Povl Hansen The " + count;
    }
}
