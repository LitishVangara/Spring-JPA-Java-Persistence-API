package org.jsp.springJPA.configuration;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configurable
@ComponentScan(basePackages = "org.jsp.springJPA")
//To get Object of Implementation Class of Repository Interface
@EnableJpaRepositories(basePackages = "org.jsp.springJPA")
public class ApplicationConfiguration 
{
	@Bean(name = "entityManagerFactory")
	public LocalEntityManagerFactoryBean getLocalEntityManagerFactoryBean()
	{
		LocalEntityManagerFactoryBean bean = new LocalEntityManagerFactoryBean();
		bean.setPersistenceUnitName("SpringJPA");
		return bean;
	}
	@Bean(name = "transactionManager")
	public JpaTransactionManager getJpaTransactionManager(EntityManagerFactory entityManagerFactory)
	{
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		return transactionManager;
	}
}
