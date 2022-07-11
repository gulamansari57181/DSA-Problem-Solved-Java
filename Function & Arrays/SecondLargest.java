//Largest and smallest element in an array element in the array
import java.util.*;

public class SecondLargest{
    public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter size of the array");
int size=sc.nextInt();
int []nums=new int[size];

for( int i=0;i<nums.length;i++){

    nums[i]=sc.nextInt();
}
System.out.println("Largest element is : "+secondLargest(nums));

sc.close();

    }
    //To find Second llargest
    public static int secondLargest(int nums[]){
      Arrays.sort(nums);
      return nums[nums.length-2];

    }
   
    
}
