package kz.iitu.lms.repository;

import kz.iitu.lms.model.Book;
import kz.iitu.lms.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepo extends JpaRepository<Book,Long> {
    Book getById(Long id);
    List<Book> getByNameContaining(String name);
    List<Book> getAllByInfoContaining(String desc);
    List<Book> getAllByAuthorId(Long author);
}
