package lk.ijse.gdse;

import lk.ijse.gdse.config.FactoryConfiguration;
import lk.ijse.gdse.entity.Customer;
import lk.ijse.gdse.entity.Order;
import org.hibernate.Session;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();

        Customer customer = session.get(Customer.class, 1);
        System.out.println(customer);

        List<Order> orders = customer.getOrders(); // <Order>
        for (Order order : orders) {
            System.out.println(order);
        }
        session.close();
    }
}