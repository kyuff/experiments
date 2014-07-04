package dk.kyuff.arquillian.greet;

import javax.ws.rs.*;

/**
 * User: swi
 * Date: 04/07/14
 * Time: 21.44
 */
@Path("greet")
public interface GreetResource {

    @GET
    @Produces("text/plain")
    @Path("/{name}")
    public String greet(@PathParam("name") String name);

    @GET
    @Produces("text/plain")
    public String hi();
}
