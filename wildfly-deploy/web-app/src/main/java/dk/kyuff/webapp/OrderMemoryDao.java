package dk.kyuff.webapp;

import dk.kyuff.webapp.model.Order;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * User: swi
 * Date: 11/10/14
 * Time: 07.21
 */
@Singleton
public class OrderMemoryDao implements OrderDao {

    Map<Long, Order> db;
    long nextId = 1L;

    public OrderMemoryDao() {
        this.db = new TreeMap<>();
        persist(new Order(4, "Orange"));
        persist(new Order(7, "Apple"));
        persist(new Order(3, "Kiwi"));√Order current = getOne(order.getId());
        current.setAmount(order.getAmount());
        current.setId(order.getAmount());
        return current;
    }

    @Override
    public List<Order> getAll() {
        return new ArrayList<>(db.values());
    }

    @Override
    public Order find(long id) {
        return db.get(id);
    }

    @Override
    public Order persist(Order order) {
        order.setId(nextId++);
        db.put(order.getId(), order);
        return order;
    }

    @Override
    public Order update(Order order) {
        if (order != null && order.getId() != 0L) {
            db.put(order.getId(), order);
        }
        return order;
    }
}
