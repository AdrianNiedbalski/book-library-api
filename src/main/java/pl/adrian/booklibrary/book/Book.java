package pl.adrian.booklibrary.book;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String author;
    private BookStatus status;
    private LocalDateTime createdAt;

    public Book () {
        this.createdAt = LocalDateTime.now();
        this.status = BookStatus.TO_READ;
    }
}
