//Find maximum sum of subarray of size k

    import java.util.*;
    public class MaxInSubArray {
        public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of the array");
    int size=sc.nextInt();
    int []nums=new int[size];

    for( int i=0;i<nums.length;i++){

        nums[i]=sc.nextInt();
    }
    System.out.println("Enter size of the window");
    int k=sc.nextInt();
    
    System.out.println("Maximum sum of subarray of size "+ k + " is :"+maxSum(nums,k));
    sc.close();
    
        
    }

    public static int  maxSum(int[]nums, int k){
       

        int maxSum=-1;
        int sum=0;
        int i=0; // tarck start of the window
        int j=0; // track end of the window

        while(j<nums.length){
            sum=sum+nums[j];
            if(j-i+1<k){
                //window size is not reached, we simply add all elements in sum untill j reached to end of window
                j++;
               
            }
            else if(j-i+1==k){
             //window size is reached , have to check sum for maximum sum ,
             //subtract last element from window , and slide window one index ahead
             maxSum=Math.max(maxSum, sum);
             sum=sum-nums[i];
             i++;
             j++;

            }

        }

        return maxSum;
    }
    }