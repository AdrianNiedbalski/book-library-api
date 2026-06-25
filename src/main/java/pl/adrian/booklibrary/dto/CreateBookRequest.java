package pl.adrian.booklibrary.dto;

import jakarta.validation.constraints.NotNull;

public record CreateBookRequest(@NotNull String title, @NotNull String author) {

}
