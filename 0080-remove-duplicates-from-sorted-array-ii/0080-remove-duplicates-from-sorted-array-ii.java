class Solution {
    public int removeDuplicates(int[] nums) {
        int s=2,f=2;
        while(s<=f && f<nums.length){
            if(nums[s-2]==nums[f]){
                f++;
            }
            else{
                nums[s]=nums[f];
                s++;
                f++;
            }
        }
        return s;
    }
}