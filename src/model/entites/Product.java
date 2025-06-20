package model.entites;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor
@Data
public class Product {
    private Integer id;
    private String uuid;
    private String pName;
    private LocalDate expiredDate;

}
