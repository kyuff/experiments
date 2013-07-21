/*
 * Created by IntelliJ IDEA.
 * User: swi
 * Date: 19/07/13
 * Time: 16.18
 */
package dk.kyuff.madplan;

import com.google.inject.AbstractModule;
import dk.kyuff.madplan.filter.MyFeature;
import dk.kyuff.madplan.filter.MyFilter;
import dk.kyuff.madplan.resources.MyResource;

public class HelloWorldModule extends AbstractModule {
    protected void configure() {
        bind(MyService.class).to(MyServiceImpl.class);




        bind(MyResource.class);
        bind(MyFilter.class);
    }
}
