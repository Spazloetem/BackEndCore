package com.backend.backend.Systemtool.LoginAPI;

import com.backend.backend.Model.User;
import com.backend.backend.Model.UserAuthority;
import com.backend.backend.Service.S_Group;
import com.backend.backend.Service.S_User;
import com.backend.backend.Systemtool.Exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class SpringUserService implements UserDetailsService {
    @Autowired
    private S_User ServiceUser;
    @Autowired
    private S_Group ServiceGroup;

    @Override
    public UserDetails loadUserByUsername(String account) throws UsernameNotFoundException {
        try {
            User user = ServiceUser.getUserByAccount(account);
            List<String> authority = ServiceGroup.getAuthority(user.getU_ID());
            return new UserAuthority(user,authority);
        } catch (NotFoundException e) {
            throw new UsernameNotFoundException("Username is wrong.");
        }
    }
}
