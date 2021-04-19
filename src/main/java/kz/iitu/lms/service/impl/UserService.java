package kz.iitu.lms.service.impl;

import kz.iitu.lms.model.User;
import kz.iitu.lms.repository.UserRepo;
import kz.iitu.lms.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService, UserDetailsService {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    @Override
    public User create(User o) {
        o.setPassword(passwordEncoder.encode(o.getPassword()));
        return userRepo.save(o);
    }

    @Override
    public User update(User o) {
        o.setPassword(passwordEncoder.encode(o.getPassword()));
        return userRepo.save(o);
    }

    @Override
    public void delete(Long o) {
        userRepo.delete(getById(o));
    }

    @Override
    public User getById(Long id) {
        return userRepo.getById(id);
    }

    @Override
    public List<User> getAll() {
        return userRepo.findAll();
    }

    @Override
    public List<User> getAllByName(String name) {
        return userRepo.getAllByFullNameContaining(name);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return userRepo.getByUsername(s);
    }
}
