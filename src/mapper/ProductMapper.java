package mapper;

import model.Dto.ProductCreateDto;
import model.Dto.ProductResponseDto;
import model.entites.Product;

import java.util.Random;
import java.util.UUID;

public class ProductMapper {
    public static ProductResponseDto mapFromProductToProductResponseDto (Product product){
        return new ProductResponseDto(product.getUuid(), product.getPName(), product.getExpiredDate());
    }
    public static Product mapFromProductCreateDtoToProduct(ProductCreateDto productCreateDto){
        return new Product(new Random().nextInt(99999),
                UUID.randomUUID().toString(),productCreateDto.pName(), productCreateDto.expiredDate()
                );
    }

}
