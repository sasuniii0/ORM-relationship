package lk.ijse.gdse;

import lk.ijse.gdse.config.FactoryConfiguration;
import lk.ijse.gdse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Query<Customer> query = session.createQuery("from Customer WHERE name ='bob'", Customer.class);
        List<Customer> customer = query.list();

        for (Customer customer1 : customer) {
            System.out.println(customer);
        }
        session.close();
    }
}