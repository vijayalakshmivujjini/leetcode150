class Solution {
    public int removeDuplicates(int[] nums) {
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(left<1||nums[right]!=nums[left-1]){ //each element compared to prev element
                nums[left]=nums[right];
                left++;
            }
        }
        return left;
    }
}