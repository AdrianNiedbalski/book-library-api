package pl.adrian.booklibrary.book;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.Immutable;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Book {
    @Id
    @NotNull
    private Long id;
    private String title;
    @Immutable
    private String author;
    private BookStatus status;
    private LocalDateTime createdAt;

    public Book () {
        this.createdAt = LocalDateTime.now();
    }
}
