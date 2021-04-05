package kz.iitu.lms.service.impl;

import kz.iitu.lms.model.User;
import kz.iitu.lms.repository.UserRepo;
import kz.iitu.lms.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public User create(User o) {
        return userRepo.save(o);
    }

    @Override
    public User update(User o) {
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

}
