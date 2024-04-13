package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
public class ShoppingCart {
    private List<Product> items=new ArrayList<>();
    private User user;

    public ShoppingCart(User user)
    {
        this.user=user;
    }
    public void addItem(Product product)
    {
        items.add(product);
    }
    public double calculateTotalPrice()
    {
        return items.stream().mapToDouble(Product::getPrice).sum();
    }

}
