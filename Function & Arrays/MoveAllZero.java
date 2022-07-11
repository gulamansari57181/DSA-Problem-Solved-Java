
// Moving all zero present in the arry to last arr[1,0,2,0,3] -> ans=[1,2,3,0,0,0] maintaing the order of the other elements
import java.util.*;
public class MoveAllZero {
    public static void main(String[]atgs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size=sc.nextInt();

        int[] arr=new int[size];
        
        for(int i=0; i<size;i++){
            arr[i]=sc.nextInt();
        }

        moveAllZero(arr);

    }
    public static void moveAllZero(int[] nums){

        int i=0;
        for(int j=0;j<nums.length;j++){
            
            //ith pointer track non-zero value , 
            if(nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j]; 
                nums[j]=temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));  

    }
    
}
