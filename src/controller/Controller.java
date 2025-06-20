package controller;

import model.Dto.ProductCreateDto;
import model.Dto.ProductResponseDto;
import model.Service.ServiceImpl;

import java.util.List;

public class Controller{
    private static final ServiceImpl service = new ServiceImpl();
    public  static List<ProductResponseDto> getAllProduct(){
        return service.DisplayProduct();
    }
    public static void insertNewProduct(ProductCreateDto productCreateDto){
        service.InsertProduct(productCreateDto);
    };
}