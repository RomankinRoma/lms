package kz.iitu.lms.service.impl;

import kz.iitu.lms.model.Book;
import kz.iitu.lms.model.User;
import kz.iitu.lms.repository.BookRepo;
import kz.iitu.lms.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {

    @Autowired
    private BookRepo bookRepo;

    @Override
    public Book create(Book o) {
        return bookRepo.save(o);
    }

    @Override
    public Book update(Book o) {
        return bookRepo.save(o);
    }

    @Override
    public void delete(Long o) {
        bookRepo.delete(getById(o));
    }

    @Override
    public Book getById(Long id) {
        return bookRepo.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookRepo.findAll();
    }

    @Override
    public List<Book> getAllByName(String name) {
        return bookRepo.getByNameContaining(name);
    }

    @Override
    public List<Book> getAllByDesc(String desc) {
        return bookRepo.getAllByInfoContaining(desc);
    }

    @Override
    public List<Book> getAllByAuthor(Long user) {
        return bookRepo.getAllByAuthorId(user);
    }
}
