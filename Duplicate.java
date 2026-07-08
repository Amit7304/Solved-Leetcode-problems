public class Duplicate {




    /***********************Brute-force aproach********************/
    public static boolean containsDuplicate(int[] nums) {
        for (int i=0; i<nums.length;i++){
           for(int j=i+1; j<nums.length;j++){
               if(nums[i]==nums[j]){
                   return true;
               }
           }
       }
       return false;
   }

    public static void main(String[] args) {
        int nums[] = { 4,6,8,3,4,5};
        System.out.println(containsDuplicate(nums));
    }
}
