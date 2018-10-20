package org.mql.platform.configuration;

import com.mysql.jdbc.Driver;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * Configure the Database using Java instead of the xml config, play with it to know the source of
 * the xml configuration. this class is not scanned by spring during boot time .
 *
 * @author mehdithe
 */
//@EnableJpaRepositories(basePackages = "org.mql.platform.dao")
//@Configuration
public class DatabaseConfiguration {

  @Bean
  public DataSource dataSource() throws Exception {
    DriverManagerDataSource ds = new DriverManagerDataSource();
    ds.setDriverClassName(Driver.class.getCanonicalName());
    ds.setUrl("jdbc:mysql://localhost:3306/mql_platform");
    ds.setUsername("root");
    ds.setPassword("root");
    return ds;
  }

  @Bean
  public LocalContainerEntityManagerFactoryBean entityManagerFactory(
      DataSource dataSource, JpaVendorAdapter jpaVendorAdapter) {
    LocalContainerEntityManagerFactoryBean lef = new LocalContainerEntityManagerFactoryBean();
    lef.setDataSource(dataSource);
    lef.setJpaVendorAdapter(jpaVendorAdapter);
    lef.setPackagesToScan("org.mql.platform.models");
    return lef;
  }

  @Bean
  public JpaVendorAdapter jpaVendorAdapter() {
    HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
    hibernateJpaVendorAdapter.setShowSql(true);
    hibernateJpaVendorAdapter.setGenerateDdl(true);
    hibernateJpaVendorAdapter.setDatabase(Database.MYSQL);
    return hibernateJpaVendorAdapter;
  }

  @Bean
  public PlatformTransactionManager transactionManager() {
    return new JpaTransactionManager();
  }
}
