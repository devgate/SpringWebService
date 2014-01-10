package com.drjun.orm;

import org.junit.Test;
import static org.junit.Assert.assertSame;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 13. 9. 23.
 * Time: 오후 3:13
 * To change this template use File | Settings | File Templates.
 */
public class CustomerTest {

    public void setUp(){
        Registrar.init();
    }

    @Test
    public void testCustomerIdentical(){
        Customer customer = (Customer) new Customer("CUST-01", "홍길동", "경기도 안양시").persist();
        Customer anotherCustomer = Customer.find("CUST-01");
        assertSame(customer, anotherCustomer);
    }

    @Test
    public void testCustomerIdentical2() {
        CustomerRepository customerRepository = new CustomerRepository();

        Customer customer = new Customer("CUST-01", "홍길동", "경기도 안양시");
        customerRepository.save(customer);

        Customer anotherCustomer = customerRepository.find("CUST-01");
        assertSame(customer, anotherCustomer);
    }

}
