class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,j=0;
        while(i<=j && j<nums.length){
            if(nums[j]!=0){
                nums[i]=nums[j];
                i++;
               
            }
            j++;
        }
        for(int ind=i;ind<nums.length;ind++){
            nums[ind]=0;
        }
        
    }
}