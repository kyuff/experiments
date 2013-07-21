package dk.kyuff.madplan.resources;

import dk.kyuff.madplan.MyService;
import dk.kyuff.madplan.filter.MyBinding;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * User: swi
 * Date: 19/07/13
 * Time: 16.23
 */
@Path("greet/")
public class MyResource {

    @Inject
    MyService myService;

    @GET
    @Produces("text/plain")
    @Path("hello")
    public String hello(@HeaderParam("X-Username") String userName) {
        if (myService == null) {
            return "NULL";
        }
        return myService.getName() + " says hello to " + userName;
    }

    @GET
    @Produces("text/plain")
    @Path("yo")
    @MyBinding
    public String yo(@HeaderParam("X-Username") String userName) {
        return "yo " + userName;
    }
}
