package model.Service;

import mapper.ProductMapper;
import model.Dto.ProductCreateDto;
import model.Dto.ProductResponseDto;
import model.entites.Product;
import model.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ServiceImpl implements service {
    private final ProductRepository productRepository = new ProductRepository();

    @Override
    public List<ProductResponseDto> DisplayProduct() {
        List<ProductResponseDto> productResponseDtoList = new ArrayList<>();
        productRepository.findAll().stream().forEach(p-> productResponseDtoList.add((new ProductResponseDto(p.getUuid(),p.getPName(),p.getExpiredDate()))));
        return productResponseDtoList;
    }

    @Override
    public ProductResponseDto InsertProduct(ProductCreateDto productCreateDto) {
        Product product1
                = ProductMapper.mapFromProductCreateDtoToProduct(productCreateDto);
        return ProductMapper.mapFromProductToProductResponseDto(productRepository.save(product1));
    }

}
