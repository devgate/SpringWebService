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
public class Name {
    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

}
