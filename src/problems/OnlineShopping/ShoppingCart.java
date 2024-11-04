package problems.OnlineShopping;

import java.util.*;

public class ShoppingCart {
    private final Map<String, OrderItem> items;

    public ShoppingCart(Map<String, OrderItem> items) {
        this.items = items;
    }
    public void addItem(Product product,int quantity){
        String productId = product.getId();
        if(items.containsKey(productId)){
            OrderItem item = items.get(productId);
            quantity += item.getQuantity();
        }
        items.put(productId,new OrderItem(product,quantity));
    }
    public void removeItem(Product product){
        items.remove(product.getId());
    }
    public void updateItemQuantity(Product product, int quantity){
        if(items.containsKey(product.getId())){
            items.put(product.getId(), new OrderItem(product,quantity));
        }

    }
    public List<OrderItem> getItems(){
        return new ArrayList<>(items.values());
    }
    public void clear(){
        items.clear();
    }
}
