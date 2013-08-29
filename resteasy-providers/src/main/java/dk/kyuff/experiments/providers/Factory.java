package dk.kyuff.experiments.providers;

import javax.ws.rs.core.Feature;
import javax.ws.rs.core.FeatureContext;
import javax.ws.rs.ext.Provider;

/**
 * User: swi
 * Date: 21/07/13
 * Time: 21.07
 */
@Provider
public class Factory implements Feature {


    @Override
    public boolean configure(FeatureContext context) {
        context.register(new MyServiceImpl());
        return true;
    }

}
