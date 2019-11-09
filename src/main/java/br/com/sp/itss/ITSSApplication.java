package br.com.sp.itss;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
public class ITSSApplication extends BaseApplication {

	@SuppressWarnings("deprecation")
	@Bean 
	public HibernateJpaSessionFactoryBean sessionFactory() {
		return new HibernateJpaSessionFactoryBean();
	}

	public static void main(String[] args) {
		SpringApplication.run(ITSSApplication.class, args);
	}

}
