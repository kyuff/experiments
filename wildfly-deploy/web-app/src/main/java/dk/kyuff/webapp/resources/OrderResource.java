package dk.kyuff.webapp.resources;

/**
 * User: swi
 * Date: 11/10/14
 * Time: 06.37
 */

import dk.kyuff.webapp.OrderDao;
import dk.kyuff.webapp.model.Order;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.*;

@Path("orders")
@Produces("application/json")
@Consumes("application/json")
public class OrderResource {

    @Inject
    OrderDao dao;

    public OrderResource() {


    }

    @GET
    public List<Order> getAll() {
        return dao.getAll();
    }

    @GET
    @Path("{id}")
    public Order getOne(@PathParam("id") long id) {
        Order order = dao.find(id);
        if (order == null) {
            throw new WebApplicationException(404);
        }
        return order;
    }

    @POST
    public Order create(Order order) {
        return dao.persist(order);
    }

    @PUT
    public Order update(Order order) {
        return dao.update(order);
    }


}
