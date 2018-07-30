package tk.mybatis.simple.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tk.mybatis.simple.model.Country;

import java.util.List;

public class CountryMapperTest extends BaseMapperTest{
    private static Logger logger = LoggerFactory.getLogger(BaseMapperTest.class);
    @Test
    public void testSelectAll(){
        SqlSession sqlSession = getSqlSession();
        try {
            List<Country> countryList = sqlSession.selectList("tk.mybatis.simple.mapper.CountryMapper.selectAll");
            printCountryList(countryList);
        } finally {
            sqlSession.close();
        }
    }

    private void printCountryList(List<Country> countryList) {
        for (Country country : countryList){
            logger.info("{}-{}-{}",  country.getId(), country.getCountryName(), country.getCountryCode());
        }
    }
}
