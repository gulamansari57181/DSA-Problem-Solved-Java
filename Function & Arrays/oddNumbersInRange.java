import java.util.*;
public class oddNumbersInRange {
    public static void main(String []args){
Scanner sc=new Scanner(System.in);

System.out.println("Enter lower value");
int low=sc.nextInt();
System.out.println("Enter highest value");
int high =sc.nextInt();
int ans=range(low,high);
System.out.println("Total number of odd numbers between "+ low +" and "+ high + " is "+ ans );
sc.close();



    }
    public static int range(int low , int high){
        
                
               if(low%2 !=0 || high%2 !=0)
                 return (high-low)/2+1;
                
                 else
                    return (high-low)/2;
        
    

    }
    
}
