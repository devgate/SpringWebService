import com.drjun.modelmapper.*;
import org.junit.*;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import static junit.framework.Assert.*;


/**
 * Created by dr.jun on 2014. 1. 21..
 */
public class ModelMapperTest2 {
    @Test
    public void companyModelShouldMap() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        modelMapper.addMappings(new CompanyModelMap()); //Exception thrown here
        modelMapper.addMappings(new LocationModelMap());

        Company company = new Company();
        company.setName("Pepsi Co.");
        Location location = new Location();
        company.setLocation(location);
        location.setAddress("1234 Main St.");

        CompanyModel model = modelMapper.map(company, CompanyModel.class);

        assertNotNull(model);
        assertEquals(company.getName(), model.getName());
        assertNotNull(model.getLocation());
        assertEquals(company.getLocation().getAddress(), model.getLocation().getAddress());
    }
}
