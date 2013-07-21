package dk.kyuff.madplan.filter;

import dk.kyuff.madplan.MyService;

import javax.inject.Inject;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

/**
 * User: swi
 * Date: 19/07/13
 * Time: 20.23
 */
@MyBinding
@Provider
public class MyFilter implements ContainerRequestFilter {

    @Inject
    MyService myService;

    @Override
    public void filter(ContainerRequestContext ctx) throws IOException {
        System.out.println("filtering");
        ctx.getHeaders().add("X-Username", myService.getName());
        ctx.setProperty("name", null);
    }

}
