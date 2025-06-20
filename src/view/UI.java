package view;

import controller.Controller;
import model.Dto.ProductCreateDto;
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
           System.out.print("[+] Insert your Option: ");
           int userInput = new Scanner(System.in).nextInt();
           switch (new Scanner(System.in).nextInt()){
               case 1->{
                   System.out.print("[+] Insert your Product name: ");
                   String pName = new Scanner(System.in).nextLine();
                   System.out.print("[+] Insert your Expired Date: ");
                   int year = new Scanner(System.in).nextInt();
                   System.out.print("[+] Insert your Expired Month: ");
                   int month = new Scanner(System.in).nextInt();
                   System.out.print("[+] Insert your Expired Date: ");
                   int day = new Scanner(System.in).nextInt();
                   ProductCreateDto productCreateDto = new ProductCreateDto(pName, LocalDate.of(year,month,day));
                   Controller.insertNewProduct(productCreateDto);


               }
               case 2->{
                   Controller.getAllProduct().forEach(System.out::println);

               }
               case 3->{
                   System.out.println("this part isn't finsihed yet (this part should be delete service)");
               }
               case 4->{
                   System.exit(0);
               }
           }
       }
    }


}
