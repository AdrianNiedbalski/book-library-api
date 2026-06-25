package pl.adrian.booklibrary.book;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String author;
    @Enumerated(EnumType.STRING)
    private BookStatus status;
    private LocalDateTime createdAt;

    public Book () {
        this.createdAt = LocalDateTime.now();
        this.status = BookStatus.TO_READ;
    }
}
