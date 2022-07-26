import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PRA2 {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        Vehicle[]v=new Vehicle[n];
        
        for(int i=0;i<n;i++){
            int number=sc.nextInt();sc.nextLine();
            String name=sc.nextLine();
            double price=sc.nextDouble();sc.nextLine();
            
           v[i] = new Vehicle(number, name, price); 
        }
        
        //
        String name=sc.nextLine();
        
        Vehicle r1=findVehicleWithMinimumPrice(v);
        if(r1==null){
            System.out.println("No Vehicle found with mentioned attribute");
            
        }else{
             System.out.println("number-"+r1.getNumber());
             System.out.println("name-"+r1.getName());
             System.out.println("price-"+r1.getPrice());
            
            
            
        }
        
       Vehicle  r2=searchVehicleByName(v,name);
        if(r2==null){
            System.out.println("No Vehicle found with mentioned attribute");
            
        }else{
             System.out.println("number-"+r2.getNumber());
             System.out.println("name-"+r2.getName());
             System.out.println("price-"+r2.getPrice());
            
            
            
        }
       
        
        
        
    }
    
    public static Vehicle findVehicleWithMinimumPrice(Vehicle[] vl){
        
        Vehicle m=null;
        int minPrice=-1;
        
        if(vl !=null){
            
            for(int i=0;i<vl.length;i++){
                if(vl[i].getPrice()<minPrice){
                    m=vl[i];
                }
            }
        }
        return m;

        // Enter your code here
    }

public static Vehicle searchVehicleByName(Vehicle[] vl,String name){
    
    
    Vehicle n=null;
    if(vl !=null && name.length()>0){
        for( int i=0;i<vl.length;i++){
            if(vl[i].getName().equalsIgnoreCase(name)){
                n=vl[i];
            }
        }
        
        
    }
    return n;
 
    // Enter your code here
}

   
   
    class Vehicle {
   
    // Enter your code here
    int number;
    String name;
    double price;
    
    //constructor
    
    Vehicle(int number,String name,double price){
        this.number=number;
        this.name=name;
        this.price=price;
        
    }
    
    //getters
    
    public int getNumber(){
        return number;
    }
    
    public String getName(){
        
        return name;
    }
    public double getPrice(){
        return price;
    }
    
    
    
    }
    
}


