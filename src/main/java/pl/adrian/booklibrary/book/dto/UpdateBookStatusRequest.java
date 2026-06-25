package pl.adrian.booklibrary.book.dto;

import jakarta.validation.constraints.NotNull;
import pl.adrian.booklibrary.book.BookStatus;

public record UpdateBookStatusRequest(@NotNull BookStatus status) {
}
