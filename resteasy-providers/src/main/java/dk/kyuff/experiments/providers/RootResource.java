package dk.kyuff.experiments.providers;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

/**
 * User: swi
 * Date: 21/07/13
 * Time: 20.51
 */
@Path("/")
public class RootResource {

    @Context
    @Inject
    private MyServiceImpl service;

    @GET
    @Produces("text/plain")
    public String get() {
        return "Hello: " + service.getNameCount();
    }
}
