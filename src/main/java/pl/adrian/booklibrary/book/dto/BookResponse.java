package pl.adrian.booklibrary.book.dto;

import pl.adrian.booklibrary.book.BookStatus;

import java.time.LocalDateTime;

public record BookResponse(Long id, String title, String author, BookStatus status, LocalDateTime createdAt) {
}
