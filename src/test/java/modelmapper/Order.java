package modelmapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 2013. 12. 26.
 * Time: 오후 4:44
 * To change this template use File | Settings | File Templates.
 */
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class Order {
    private Customer customer;
    private Address billingAddress;

    public Order(Customer customer, Address billingAddress) {
        this.setCustomer(customer);
        this.setBillingAddress(billingAddress);
    }

}
