class Solution {
    public int removeElement(int[] nums, int val) {
       int i=0,j=0;
       int k=0;
       while(i<=j && j<nums.length){
        if(nums[j]!=val){
            k++;
           nums[i]=nums[j];
            i++;

        }
        
        j++;
       } 
       return k;
    }
}