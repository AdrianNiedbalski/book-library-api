package pl.adrian.booklibrary.dto;

import pl.adrian.booklibrary.book.BookStatus;

import java.time.LocalDate;

public record BookResponse(Long id, String title, String author, BookStatus status, LocalDate createdAt) {
}
