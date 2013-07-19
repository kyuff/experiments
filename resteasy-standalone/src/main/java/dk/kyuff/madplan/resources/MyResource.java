package dk.kyuff.madplan.resources;

import dk.kyuff.madplan.MyService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

/**
 * User: swi
 * Date: 19/07/13
 * Time: 16.23
 */
@Path("hello")
public class MyResource {

    @Inject
    MyService myService;

    @GET
    @Produces("text/plain")
    public String hello() {
        if( myService == null ) {
            return "NULL";
        }
        return myService.getName();
    }
}
