package kz.iitu.lms.service;

import kz.iitu.lms.model.User;

import java.util.List;

public interface IUserService {
    User create(User o);
    User update(User o);
    void delete(Long o);
    User getById(Long id);
    List<User> getAll();
    List<User> getAllByName(String name);
}
