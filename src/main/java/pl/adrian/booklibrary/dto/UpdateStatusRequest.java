package pl.adrian.booklibrary.dto;

import jakarta.validation.constraints.NotNull;
import pl.adrian.booklibrary.book.BookStatus;

public record UpdateStatusRequest(@NotNull BookStatus status) {
}
