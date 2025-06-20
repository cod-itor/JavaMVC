package model.Service;

import model.Dto.ProductCreateDto;
import model.Dto.ProductResponseDto;

import java.util.List;

public interface service {
    List<ProductResponseDto> DisplayProduct();
    ProductResponseDto InsertProduct(ProductCreateDto productCreateDto);

}
