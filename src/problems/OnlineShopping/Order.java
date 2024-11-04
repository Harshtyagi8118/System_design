package problems.OnlineShopping;

import java.util.*;

public class Order {
    private final String id;
    private final User user;
    private final List<OrderItem> items;
    private final double totalAmount;
    private OrderStatus status ;

    public Order(String id, User user, List<OrderItem> orderItemList, double totalAmount) {
        this.id = id;
        this.user = user;
        this.items = orderItemList;
        this.totalAmount = totalAmount;
    }
    public double calculateTotalAmt(){
        return this.items.stream().mapToDouble(item -> item.getProduct().getPrice()*item.getQuantity()).sum();
    }
    public void setStatus(OrderStatus status){
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public OrderStatus getStatus() {
        return status;
    }
}
