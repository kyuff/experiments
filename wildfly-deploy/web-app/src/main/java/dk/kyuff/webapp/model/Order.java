package dk.kyuff.webapp.model;

/**
 * User: swi
 * Date: 11/10/14
 * Time: 06.38
 */
public class Order {

    private long id;
    private int amount;
    private String item;

    public Order() {
    }

    public Order(int amount, String item) {
        this.amount = amount;
        this.item = item;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
