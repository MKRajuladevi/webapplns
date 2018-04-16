package in.gov.cgg.base.masters.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

//import in.gov.cgg.base.masters.service.UserSecurityService;

import java.security.SecureRandom;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    //@Autowired
    //private UserSecurityService userSecurityService;

    private static final String SALT = "jlkjslakhuihsxa";

    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder(12);//(12, new SecureRandom(SALT.getBytes())
    }

    private static final String[] PUBLIC_MATCHERS = {
            "/webjars/**",
            "/css/**",
            "/js/**",
            "/common/**",
            "/fonts/**",
            "/images/**"
            ,"/"
    };
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        
    	http.csrf().disable().authorizeRequests().antMatchers(PUBLIC_MATCHERS).permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin().loginPage("/login").permitAll().defaultSuccessUrl("/homepage")
                .failureUrl("/login?error=true").permitAll()
                .and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login");
    }

    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth)
            throws Exception {
        /*auth.userDetailsService(userSecurityService).passwordEncoder(passwordEncoder());*/

        auth.inMemoryAuthentication().withUser("hello").password("dummy")
                .roles("USER", "ADMIN");

    }
}

