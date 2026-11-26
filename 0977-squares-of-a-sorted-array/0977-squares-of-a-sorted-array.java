class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int i=0,j=nums.length-1;
        int ind=nums.length-1;
        while(i<=j ){
            if( Math.pow(nums[i],2) > Math.pow(nums[j],2) ){
                res[ind]=(int)Math.pow(nums[i],2);
                ind--;
                i++;
            }
            else{
                  res[ind]=(int)Math.pow(nums[j],2);
                ind--;
                j--;
            }
        }
        return res;
    }
}