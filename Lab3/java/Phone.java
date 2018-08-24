
package javalab3;
   
import java.util.Scanner;

public class Phone {
    
   private String name;
   private float price;


    public Phone(String name, float price) 
    {
        this.name = name;
        this.price = price;
    }
    
    public Phone() 
    {
        this.name = "No item";
        this.price = 0;
    }

    public String getName() 
    {
        return name;
    }

    public float getPrice() 
    {
        return price;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setPrice(float price) 
    {
        this.price = price;
    }

    public void inputData() 
    {
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input phone name:");
        name = scanner.nextLine();
        System.out.println("Input price:");
        price = scanner.nextFloat();
    
    }
    
    public void outputData() 
    {
    
        System.out.println("Phone's name: " + name);
        System.out.println("Price: " + price);
    
    }
    
    public static void sortPrices (Phone ph1, Phone ph2) 
    {
        Phone[] ph = new Phone[2];
        if (ph1.getPrice()>(ph2.getPrice())) {

            ph[0] = ph2;
            ph[1] = ph1;
            
        } else {

            ph[0] = ph1;
            ph[1] = ph2;
           
        }
        for (Phone phone: ph) {
        
            phone.outputData();
        
        }
    }
}


    

