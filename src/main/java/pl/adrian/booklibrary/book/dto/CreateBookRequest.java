package pl.adrian.booklibrary.book.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CreateBookRequest(@NotNull @NotBlank String title, @NotNull @NotBlank String author) {

}
