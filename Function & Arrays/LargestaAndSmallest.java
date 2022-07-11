//Largest and smallest element in an array element in the array
import java.util.*;

public class LargestaAndSmallest{
    public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter size of the array");
int size=sc.nextInt();
int []nums=new int[size];

for( int i=0;i<nums.length;i++){

    nums[i]=sc.nextInt();
}
System.out.println("Largest element is : "+largest(nums));
System.out.println("Smallest element is : "+smallest(nums));
sc.close();

    }
    //To find largest
    public static int largest(int nums[]){
        int largest=nums[0];
        for(int i=1;i<nums.length;i++){
            if(largest<nums[i]){
                largest=nums[i];
            }
        }
        return largest;
    }
    //To find smallest
   
    public static int smallest(int nums[]){
        int smallest=nums[0];
        for(int i=1;i<nums.length;i++){
            if(smallest>nums[i]){
                smallest=nums[i];
            }
        }
        return smallest;

    }
    
}
