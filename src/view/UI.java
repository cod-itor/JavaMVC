package view;

import controller.Controller;
import model.Dto.ProductCreateDto;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class UI {
     public static void displayMenu(){
         System.out.println("""
                 =======================================
                    WELCOME TO MVC JAVA PRODUCT PROCESS
                 =======================================
                 
                 1. INSERT YOUR PRODUCT
                 2. DISPLAY YOUR PRODUCT
                 3. EXIT
                 """);
    }
    public static void inputUserOpt(){
       while(true){
           displayMenu();
           System.out.println("[+] Insert your Option: ");
           int userInput = new Scanner(System.in).nextInt();
           switch (new Scanner(System.in).nextInt()){
               case 1->{
                   System.out.println("[+] Insert your Product name: ");
                   String pName = new Scanner(System.in).nextLine();
                   System.out.println("[+] Insert your Expired Date: ");
                   int year = new Scanner(System.in).nextInt();
                   System.out.println("[+] Insert your Expired Month: ");
                   int month = new Scanner(System.in).nextInt();
                   System.out.println("[+] Insert your Expired Date: ");
                   int day = new Scanner(System.in).nextInt();
                   ProductCreateDto productCreateDto = new ProductCreateDto(pName, LocalDate.of(year,month,day));
                   Controller.insertNewProduct(productCreateDto);


               }
               case 2->{
                   Controller.getAllProduct().forEach(System.out::println);

               }
               case 3->{}
               case 4->{
                   System.exit(0);
               }
           }
       }
    }


}
