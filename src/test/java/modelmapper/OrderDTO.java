package modelmapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 2013. 12. 26.
 * Time: 오후 4:47
 * To change this template use File | Settings | File Templates.
 */
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class OrderDTO {
    private String customerFirstName;
    private String customerLastName;
    private String billingStreet;
    private String billingCity;
}
