package model.Dto;

import java.time.LocalDate;
import java.util.Date;

public record ProductResponseDto(
        String uuid,
        String pName,
        LocalDate expiredDate
) {
}
