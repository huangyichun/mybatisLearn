import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tk.mybatis.simple.mapper.CountryMapperTest;
import tk.mybatis.simple.mapper.UserMapperTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CountryMapperTest.class,
        UserMapperTest.class
})
public class AllTest {

}
