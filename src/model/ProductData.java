
package model;

import model.entites.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ProductData {
    public static List<Product> products =new ArrayList<>(
            List.of(new Product(1, UUID.randomUUID().toString(),"John", LocalDate.of(2002,12,3)))
    );
}
