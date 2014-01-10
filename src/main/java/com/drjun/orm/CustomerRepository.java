package com.drjun.orm;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 13. 9. 23.
 * Time: 오후 4:53
 * To change this template use File | Settings | File Templates.
 */
public class CustomerRepository {
    public void save(Customer customer) {
        Registrar.add(Customer.class, customer);
    }

    public Customer find(String identity) {
        return (Customer)Registrar.get(Customer.class, identity);
    }
}
