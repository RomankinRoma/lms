package kz.iitu.lms.service;

import kz.iitu.lms.model.UserBooks;
import kz.iitu.lms.model.User;

import java.util.List;

public interface IUserBooksService {
    UserBooks create(UserBooks o);
    UserBooks update(UserBooks o);
    void delete(UserBooks o);
    UserBooks getById(Long id);
    List<UserBooks> getAll();
    List<UserBooks> getAllByUser(Long userId);
    List<UserBooks> getAllByBook(Long bookId);
}
