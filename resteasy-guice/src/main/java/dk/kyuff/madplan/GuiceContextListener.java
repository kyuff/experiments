package dk.kyuff.madplan;

import com.google.inject.Module;
import org.jboss.resteasy.plugins.guice.GuiceResteasyBootstrapServletContextListener;
import org.jboss.resteasy.plugins.guice.ext.JaxrsModule;
import org.jboss.resteasy.plugins.guice.ext.RequestScopeModule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * User: swi
 * Date: 19/07/13
 * Time: 16.17
 */
public class GuiceContextListener extends GuiceResteasyBootstrapServletContextListener {
    @Override
    protected List<Module> getModules(javax.servlet.ServletContext context) {
        System.out.println("Yo, running my modules list!");
        List<Module> modules = new ArrayList<Module>();
        modules.add(new HelloWorldModule());
        modules.add(new JaxrsModule());
        modules.add(new RequestScopeModule());
        return modules;
    }
}
