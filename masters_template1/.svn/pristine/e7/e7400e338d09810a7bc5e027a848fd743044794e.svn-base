package in.gov.cgg.base.masters;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@ComponentScan(basePackages = {"in.gov.cgg.base.masters", "in.gov.cgg.base.masters.config", "in.gov.cgg.base.masters.mvc.config","in.gov.cgg.base.masters.mvc.controller"})
@EnableJpaRepositories("in.gov.cgg.base.masters")
public class MastersTemplate1ApplicationForWeb extends SpringBootServletInitializer{

	//This would create a Spring boot application within a standalone Tomcat 8.5 Server(also mark spring-boot-starter-tomcat in POM as provided)
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MastersTemplate1ApplicationForWeb.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MastersTemplate1ApplicationForWeb.class, args);
    }
}    


/*@SpringBootApplication
@ComponentScan(basePackages = {"in.gov.cgg.base.masters", "in.gov.cgg.base.masters.config", "in.gov.cgg.base.masters.mvc.config","in.gov.cgg.base.masters.mvc.controller"})
public class MastersTemplate1Application {

	public static void main(String[] args) {
		SpringApplication.run(MastersTemplate1Application.class, args);
	}
}*/


