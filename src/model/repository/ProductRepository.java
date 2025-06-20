package model.repository;

import mapper.ProductMapper;
import model.Dto.ProductResponseDto;
import model.ProductData;
import model.entites.Product;

import java.util.List;
import java.util.NoSuchElementException;

public class ProductRepository implements Repository<Product, Integer> {

    @Override
    public Product save(Product product) {
        ProductData.products.add(product);

        return product ;
    }

    @Override
    public List<Product> findAll() {
        return ProductData.products;
    }

    @Override
    public Integer delete(Integer id) throws NoSuchElementException {
        Product product =
        ProductData.products
                .stream()
                .filter(p->p.getId().equals(id))
                .findFirst().get();
       boolean isDeleted = ProductData.products.remove(product);
        return isDeleted? 1:0;
    }
}
