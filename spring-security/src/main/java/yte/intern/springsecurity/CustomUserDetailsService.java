package yte.intern.springsecurity;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public CustomUser loadUserByUsername(final String username) //username is the key
    {
        return new CustomUser(username, username, new ArrayList<>()); //returns user with same username and password
    }
}
