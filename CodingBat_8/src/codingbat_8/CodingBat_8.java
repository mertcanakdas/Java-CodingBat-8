
package codingbat_8;

import java.util.Arrays;
import java.util.Random;


public class CodingBat_8 {

public static int [] nums(){
    Random rn = new Random();
    int []nums = new int[rn.nextInt(10)+1];
    
    for(int i=0;i<nums.length;i++){
        nums[i] = rn.nextInt(100)+1;
        
    }
     System.out.println(Arrays.toString(nums));
    return nums;
}
    
public static boolean has22(int []nums){
  boolean c = false;
  
  for(int i=0;i<nums.length-1;i++){
      if(nums[i]==2 && nums[i+1]==2 ){
          c = true;
      }
  }
        System.out.println("değer: "+c);
        
        
    return c;
}

public static boolean has222(int []nums){
   for(int i=0;i<nums.length-1;i++){
       if(nums[i]==2 && nums[i+1]==2){
           return  true;
           
       }
   } 
    return false;
}

    public static void main(String[] args) {
        has22(nums());
        System.out.println("değer: "+has222(nums()));
    }
    
}
