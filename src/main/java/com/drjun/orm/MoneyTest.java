package com.drjun.orm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 13. 9. 23.
 * Time: 오후 2:04
 * To change this template use File | Settings | File Templates.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
public class MoneyTest {

    @Test
    public void ormTest(){
        Customer customer = new Customer("CUST-01", "홍길동", "경기도 안양시");
        Customer anotherCustomer = customer;

        long price = 1000;
        customer.purchase(price);

        System.out.println("price*0.01:"+(price*0.01));
        assertEquals(price*0.01, anotherCustomer.getMileage(), 0.1);
        assertEquals(0, anotherCustomer.getMileage());
    }


    @Test
    public void testMehodAlaising() {
        Money money = new Money(2000);

        doSomethingWithMoney(money);
        assertEquals(new Money(2000), money);
    }

    private void doSomethingWithMoney(final Money money) {
        money.add(new Money(2000));
    }


}
