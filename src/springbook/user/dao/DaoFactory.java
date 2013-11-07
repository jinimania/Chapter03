package springbook.user.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

/**
 * Created with IntelliJ IDEA.
 * User: 2SsooN
 * Date: 2013. 11. 8.
 * Time: AM 1:05
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class DaoFactory {
    @Bean
    public javax.sql.DataSource dataSource() {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource ();

        dataSource.setDriverClass(com.mysql.jdbc.Driver.class);
        dataSource.setUrl("jdbc:mysql://localhost/springbook?characterEncoding=UTF-8");
        dataSource.setUsername("spring");
        dataSource.setPassword("book");

        return dataSource;
    }

    @Bean
    public UserDao userDao() {
        UserDao userDao = new UserDao();
        userDao.setDataSource(dataSource());
        return userDao;
    }
}
