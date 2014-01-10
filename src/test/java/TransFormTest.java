import com.drjun.orm.Person;
import com.google.common.collect.Lists;
import org.junit.Test;
import com.google.common.base.Function;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class TransFormTest{

    @Test
    public void test() throws Exception{

        Person p1 = new Person("JJI Test1", 1);
        Person p2 = new Person("JJI Test2", 2);
        Person p3 = new Person("JJI Test3", 3);

        List<Person> list = new ArrayList<Person>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        Function<Person, String> nameFilter = new Function<Person, String>(){
            public String apply(Person person){
                return person.getName();
            }
        };

        Function<Person, Integer> ageFilter = new Function<Person, Integer>(){
            public Integer apply(Person person) {
                return person.getAge();
            }
        };

        List<String> result = Lists.transform(list, nameFilter);

        for(String str: result){
            System.out.println("[]"+str);
        }

        List<Integer> result2 = Lists.transform(list, ageFilter);

        for(Integer integer: result2){
            System.out.println("[]"+integer);
        }

        assertEquals(result.size(), list.size());
        assertEquals(result.get(0), p1.getName());

    }



}