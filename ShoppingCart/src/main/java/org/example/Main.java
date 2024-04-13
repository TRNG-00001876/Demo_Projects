package org.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main {

    private static final Logger LOG=LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        User user=new User("Praveena");
        Product p1=new Product("Laptop",99.9);
        Product p2=new Product("Phone",799.0);

        LOG.info(user.getUsername() +"logged in");
        LOG.info("Browsing products: "+p1.getName()+" , "+p2.getName());

        ShoppingCart c=new ShoppingCart(user);

        c.addItem(p1);
        c.addItem(p2);

        LOG.info("Added: "+p1.getName()+" and "+p2.getName());

        LOG.info("Checkout successful");


        System.out.println("Hello world!");
    }
}