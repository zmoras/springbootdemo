package com.omegacode.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.omegacode.repository.UserRepository;

@Configuration
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserRepository userRepository;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
			.antMatchers("/", "/signup", "/about", "/assets/**","/login","/confirm").permitAll()
			.antMatchers("/admin/**").hasRole("ADMIN")
			.antMatchers("/actuator/**").hasRole("ADMIN")
			.antMatchers("/user/**").hasRole("USER")
			.antMatchers("/configprops").hasRole("ADMIN")
			.antMatchers("/health").hasRole("ADMIN")
			.anyRequest().authenticated()
			.and()
//		.requiresChannel() 
//			.anyRequest()
//			.requiresSecure()
//			.and()	
		.formLogin()
			.loginPage("/login")
			.defaultSuccessUrl("/")
			.and()
		.logout()
			.logoutSuccessUrl("/");
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(username ->
				userRepository.getUserByUsername(username)).passwordEncoder(passwordEncoder());
//	    auth.inMemoryAuthentication()
//        .withUser("kma").password("123").roles("USER")
//        .and()
//        .withUser("admin").password("321").roles("USER", "ADMIN");

	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
 