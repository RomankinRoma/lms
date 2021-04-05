package kz.iitu.lms.repository;

import kz.iitu.lms.model.UserBooks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserBooksRepo extends JpaRepository<UserBooks,Long> {
    UserBooks getById(Long id);
    List<UserBooks> getAllByUserId(Long id);
    List<UserBooks> getAllByBookId(Long id);
}
