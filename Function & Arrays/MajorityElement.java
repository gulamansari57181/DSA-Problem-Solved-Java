//Majority element means the elemnt which occurs more than (n/2) time in array where n is the size of an array

import java.util.*;
public class MajorityElement {
    public static void main(String[]atgs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size=sc.nextInt();

        int[] arr=new int[size];
        
        for(int i=0; i<size;i++){
            arr[i]=sc.nextInt();
        }

        int ans=majorityElement(arr);
        System.out.println("Majority element is : "+ans);

    }
    public static int majorityElement(int []nums){


         //Creating hashmap to make frequncy count of each element
        
         HashMap<Integer , Integer> hm= new HashMap<>();
        
         for(int i=0;i<nums.length;i++){
            //if element present in hashmap, then its corresponding vallue incremented by 1
             
             if(hm.containsKey(nums[i])){
                 int of=hm.get(nums[i]);
                 int nf=of+1;
                 hm.put(nums[i],nf);
                 
             }
             else{
                 //if element is not present in hashmap
                 hm.put(nums[i],1);
             }
         }
         
         // Traversing in hashmap with help of keySet() method
         for(Integer key:hm.keySet()){
             
             if(hm.get(key)>Math.ceil(nums.length/2)){
                 return key;
             }
         }
         return 0;
        
    }
    
}
