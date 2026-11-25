class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=0;
        int k=1;
        int ind=0;
        while(i<=j && j<nums.length){
            if(nums[i]==nums[j]){
                j++;
            }
            else
            {
                nums[++ind]=nums[j];
                //ind+=1;
                k++;
                i=j;
                j++;
            }

            
        }
        return k;
    }
}