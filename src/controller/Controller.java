package controller;

import model.Dto.ProductCreateDto;
import model.Dto.ProductResponseDto;
import model.Service.ServiceImpl;

import java.util.List;

public class Controller{
    private static ServiceImpl service = new ServiceImpl();
    public  static List<ProductResponseDto> getAllProduct(){
        return service.DisplayProduct();
    }
    public static ProductResponseDto insertNewProduct(ProductCreateDto productCreateDto){
        return service.InsertProduct(productCreateDto);
    };
}