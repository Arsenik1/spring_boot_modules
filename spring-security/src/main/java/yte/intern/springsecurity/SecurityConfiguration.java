package yte.intern.springsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableMethodSecurity
public class SecurityConfiguration {
    @Autowired
    public SecurityConfiguration(AuthenticationManagerBuilder authenticationManagerBuilder,
                                    UserDetailsServiceImp userDetailsServiceImp)
        throws Exception{
//        UserDetails admin = User.builder()
//                .username("admin")
//                .password("admin")
//                .authorities("ADMIN")
//                .build();
//
//        UserDetails user = User.builder()
//                .username("salih")
//                .password("user")
//                .authorities("USER")
//                .build();
//
//        UserDetails user2 = User.builder()
//                .username("yetkisiz")
//                .password("user")
//                .authorities("MEMBER")
//                .build();

//        authenticationManagerBuilder.userDetailsService(userDetailsServiceImp)
//                .passwordEncoder(NoOpPasswordEncoder.getInstance());

    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.authorizeHttpRequests(authorize -> authorize.requestMatchers(new AntPathRequestMatcher("/login")).permitAll().anyRequest().authenticated())
                .formLogin(formlogin -> formlogin.disable())
                .logout(logout-> logout.disable())
                .csrf(csrf -> csrf.disable())
                .build();

//                .requestMatchers(AntPathRequestMatcher.antMatcher("/user")).hasAnyAuthority("USER", "ADMIN")
//                .requestMatchers(AntPathRequestMatcher.antMatcher("/admin")).hasAuthority("ADMIN")
//                .anyRequest().authenticated()
//                //diğer matcherlarım
//                .and()
//                .formLogin()
//                .and()
//               .build();
        }
    @Bean
    public AuthenticationManager AuthenticationManager(CustomAuthenticationProvider customAuthenticationProvider) throws Exception {
        return new ProviderManager(customAuthenticationProvider);
    }
}
