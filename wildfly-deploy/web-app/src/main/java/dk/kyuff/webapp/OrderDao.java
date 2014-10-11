package dk.kyuff.webapp;

import dk.kyuff.webapp.model.Order;

import java.util.List;

/**
 * User: swi
 * Date: 11/10/14
 * Time: 07.13
 */
public interface OrderDao {
    List<Order> getAll();

    Order find(long id);

    Order persist(Order order);

    Order update(Order order);
}
