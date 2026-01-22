class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1; //2 pointer -inplace
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[k-1]){ //each element compared to prev element
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}