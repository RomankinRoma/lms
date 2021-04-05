package kz.iitu.lms.service.impl;

import kz.iitu.lms.model.UserBooks;
import kz.iitu.lms.repository.UserBooksRepo;
import kz.iitu.lms.service.IUserBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserBooksService implements IUserBooksService {

    @Autowired
    private UserBooksRepo userBooksRepo;

    @Override
    public UserBooks create(UserBooks o) {
        return userBooksRepo.save(o);
    }

    @Override
    public UserBooks update(UserBooks o) {
        return userBooksRepo.save(o);
    }

    @Override
    public void delete(UserBooks o) {
        userBooksRepo.delete(o);
    }

    @Override
    public UserBooks getById(Long id) {
        return userBooksRepo.getById(id);
    }

    @Override
    public List<UserBooks> getAll() {
        return userBooksRepo.findAll();
    }

    @Override
    public List<UserBooks> getAllByUser(Long userId) {
        return userBooksRepo.getAllByUserId(userId);
    }

    @Override
    public List<UserBooks> getAllByBook(Long bookId) {
        return userBooksRepo.getAllByBookId(bookId);
    }
}
