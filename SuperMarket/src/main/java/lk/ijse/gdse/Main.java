package lk.ijse.gdse;

import lk.ijse.gdse.config.FactoryConfiguration;
import lk.ijse.gdse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class Main {
    public static void main(String[] args) {

        /*transient state*/
        Customer customer = new Customer();
        customer.setName("john doe");

        /*persistence state*/
        Session session1 = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session1.beginTransaction();

        /*detached state*/
        // not in use  --> session.save(customer);
        session1.persist(customer);
        transaction.commit();

        /*removed state*/
        session1.close();

        /*without use object --> eligible to GC--> Garbage Collection*/

        //edited object
        customer.setName("jane doe");

        //get new session
        Session session2 = FactoryConfiguration.getInstance().getSession();

        //persistance state
        //update krnn puluwn --> session.update(customer);
        session2.merge(customer);

        /*removed state*/
        //session2.delete(customer);
        session2.remove(customer);
    }
}