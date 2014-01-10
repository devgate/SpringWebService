
import modelmapper.Customer;
import modelmapper.Name;
import modelmapper.*;
import modelmapper.OrderDTO;
import org.junit.Test;
import org.modelmapper.ModelMapper;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 2013. 12. 26.
 * Time: 오후 4:48
 * To change this template use File | Settings | File Templates.
 */
public class ModelMapperTest {

    @Test
    public void test(){
        Customer customer = new Customer(new Name("Joe", "Smith"));
        Address billingAddress = new Address("2233 Pike Street", "Seattle");
        Order order = new Order(customer, billingAddress);

        ModelMapper modelMapper = new ModelMapper();
        OrderDTO orderDTO = modelMapper.map(order, OrderDTO.class);

        assertEquals(orderDTO.getCustomerFirstName(), order.getCustomer().getName().getFirstName());
        assertEquals(orderDTO.getCustomerLastName(), order.getCustomer().getName().getLastName());
        assertEquals(orderDTO.getBillingStreet(), order.getBillingAddress().getStreet());
        assertEquals(orderDTO.getBillingCity(), order.getBillingAddress().getCity());
    }
}
