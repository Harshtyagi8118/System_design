package problems.OnlineShopping;

import java.util.*;

public class User {
    private final String name;
    private final String id;
    private final String email;
    private final String password;
    private final List<Order> orders;

    public User(String name, String id, String email, String password) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.password = password;
        this.orders = new ArrayList<Order>();
    }
    public void addOrder(Order order){
        orders.add(order);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<Order> getOrders() {
        return orders;
    }
}
