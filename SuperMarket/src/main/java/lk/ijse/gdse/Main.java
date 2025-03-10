package lk.ijse.gdse;

import lk.ijse.gdse.config.FactoryConfiguration;
import lk.ijse.gdse.entity.Customer;
import lk.ijse.gdse.entity.Order;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;


public class Main {
    public static void main(String[] args) {

   /*    //transient state
        Customer customer = new Customer();
        customer.setName("john doe");

        //persistence state
        Session session1 = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session1.beginTransaction();

       //detached state
        // not in use  --> session.save(customer);
        session1.persist(customer);
        transaction.commit();

        //removed state
        session1.close();

*//*
    without use object --> eligible to GC--> Garbage Collection
*//*

        //edited object
        customer.setName("jane doe");

        //get new session
        Session session2 = FactoryConfiguration.getInstance().getSession();

        //persistence state
        //update krnn puluwn --> session.update(customer);
        session2.merge(customer);

        //removed state
        //session2.delete(customer);
        session2.remove(customer);
*/
        // eager fetching... one query for all
        Session session = FactoryConfiguration.getInstance().getSession();
        Customer customer = session.get(Customer.class, "C001");
        System.out.println(customer.getId());
        System.out.println(customer.getName());
        System.out.println(customer.getNic());
        System.out.println(customer.getEmail());

        // lazy fetching... each query for each data
        // default fetching eka wenne lazy fetching
        Customer customer1 = session.load(Customer.class, "C002");
        System.out.println(customer1.getId());
        System.out.println(customer1.getName());
        System.out.println(customer1.getNic());
        System.out.println(customer1.getEmail());

        List<Order> orderList = customer.getOrders();
        System.out.println(orderList);

        /*
        data fetching
        eager fetching --> one query for all parent child data
        lazy fetching --> one query for parent data and another query for child data
        (Query for each fetching..)

        parent patte dagnna one fetching...

        hibernate 5 wala wge wda krnne dn api inne hibernate 6 wala
        load eka lazy fetching widihta thamai wada krnne...
        */

    }
}