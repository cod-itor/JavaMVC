package model.Dto;

import java.time.LocalDate;

public record ProductCreateDto(
        String pName,
        LocalDate expiredDate
) {
}
