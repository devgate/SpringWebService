package modelmapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 2013. 12. 26.
 * Time: 오후 4:46
 * To change this template use File | Settings | File Templates.
 */
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class Address {
    String street;
    String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }
}
