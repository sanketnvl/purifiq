package com.ds.dao;

import java.util.ArrayList;
import java.util.List;
 
import org.springframework.stereotype.Repository;
 
import com.ds.model.CustomUser;
import com.ds.model.Role;
 
@Repository
public class UserDAOImpl {
    
     public CustomUser loadUserByUsername(final String username) {
         //Write your DB call code to get the user details from DB,But I am just hard coding the user
            CustomUser user = new CustomUser();
            user.setFirstName("sanket");
            user.setLastName("navale");
            user.setUsername("sanketnvl");
            user.setPassword("sanket@123");
            Role r = new Role();
            r.setName("ROLE_USER");
            List<Role> roles = new ArrayList<Role>();
            roles.add(r);
            user.setAuthorities(roles);
            return user;
        }
 
}