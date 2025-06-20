package model.Dto;

public record ProductCreateDto(
        String pName,
        java.time.LocalDate expiredDate
) {
}
