package yte.intern.springdata.repository;


import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import yte.intern.springdata.entity.Book;

import java.time.LocalDateTime;
import java.util.List;


public interface BookRepository extends JpaRepository<Book, Long> {
    Book findByTitle(String title);

    List<Book> findByAge(Long age, Sort sort);

    List<Book> findByPublishDateAfter(LocalDateTime publishDate, PageRequest pageRequest);

    List<Book> findByTitleContains(String title);

    @Query("select b from Book b where b.title = :title")
    Book findByTitleQuery(String title);

    @Query("select b from Book b where b.age >= :age")
    List<Book> findByAgeQuery(Long age, Sort sort);

    @Query("select b from Book b where b.publishDate > :publishDate") // > means after
    List<Book> findByPublishDateAfterQuery(LocalDateTime publishDate, PageRequest pageRequest);

    @Query("select b from Book b where b.title like %:title%") // %:title% means that title can be anywhere in the string
    List<Book> findByTitleLike(String title);

    @Query("select b from Book b where b.author = :author and b.age >= :age")
    List<Book> findByAuthorAndAge(String author, Long age);

    @Query("select count(b) from Book b where b.author = :author")
    long countByAuthorQuery(String author);
}
