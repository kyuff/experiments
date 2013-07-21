package dk.kyuff.madplan.filter;

import javax.ws.rs.container.DynamicFeature;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.FeatureContext;
import javax.ws.rs.ext.Provider;

/**
 * User: swi
 * Date: 19/07/13
 * Time: 21.10
 */
@Provider
public class MyFeature implements DynamicFeature{
    @Override
    public void configure(ResourceInfo resourceInfo, FeatureContext featureContext) {
        System.out.println("configure: " + resourceInfo.getResourceMethod().getName());
        if(resourceInfo.getResourceMethod().isAnnotationPresent(MyBinding.class)) {
            System.out.println("FOUND IT!");
            featureContext.register(MyFilter.class);
        }
    }
}
