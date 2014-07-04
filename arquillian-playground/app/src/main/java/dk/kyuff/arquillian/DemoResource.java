package dk.kyuff.arquillian;

import dk.kyuff.arquillian.greet.GreetService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * User: swi
 * Date: 04/07/14
 * Time: 22.43
 */
@Path("demo")
public class DemoResource {

    @Inject
    GreetService greetService;

    @GET
    @Produces("text/plain")
    public String demo() {
        return greetService.greet("Erik");
    }
}
