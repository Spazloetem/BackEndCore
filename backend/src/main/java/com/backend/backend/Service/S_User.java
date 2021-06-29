package com.backend.backend.Service;


import com.backend.backend.DataBaseaccessObject.D_User;
import com.backend.backend.Model.User;
import com.backend.backend.Systemtool.Exception.NotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class S_User {

    private D_User DAOUser;
    private BCryptPasswordEncoder passwordEncoder;

    public S_User(D_User DAOUser) {
        this.DAOUser = DAOUser;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    public User createUser(User request) {
        request.setPassword(passwordEncoder.encode(request.getPassword()));
        return DAOUser.save(request);
    }

    public User getUser(long id) {
        return DAOUser.findById(id).orElseThrow(() -> new NotFoundException("Can't find product."));
    }

    public User replaceUser(User request) {
        if( DAOUser.findById(request.getU_ID()).orElse(null) == null){
            return null;
        }
        return DAOUser.save(request);
    }

    public void deleteUser(Long id) {
        DAOUser.deleteById(id);
    }

    public User getUserByAccount(String account) {
        return DAOUser.getAccount(account);
    }

}
