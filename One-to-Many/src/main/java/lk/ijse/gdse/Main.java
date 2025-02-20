package lk.ijse.gdse;

import lk.ijse.gdse.config.FactoryConfiguration;
import lk.ijse.gdse.entity.Customer;
import lk.ijse.gdse.entity.Order;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();

        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("sasuni");

        List<Order> orders = new ArrayList<>();

        Order order = new Order();
      //  order.setId(1);
        order.setDate("2025/02/20");
        order.setCustomer(customer);

        orders.add(order);

        customer.setOrders(orders);

        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();

        session.close();
    }
}