package lk.ijse.gdse;

import lk.ijse.gdse.config.FactoryConfiguration;
import lk.ijse.gdse.entity.Customer;
import org.hibernate.Session;


public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();

        Customer customer = session.get(Customer.class, "C001");
        System.out.println(customer);

        /*List<Order> orders = customer.getOrders(); // <Order>
        for (Order order : orders) {
            System.out.println(order);
        }*/
        session.close();
    }
}