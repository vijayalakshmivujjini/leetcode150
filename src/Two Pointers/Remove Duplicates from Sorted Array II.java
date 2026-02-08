class Solution {
    public int removeDuplicates(int[] nums) {
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(left<2||nums[right]!=nums[left-2]){ //each element compared to prev 2nd element and shift
                nums[left]=nums[right];
                left++;
            }
        }
        return left;
    }
}

// | right | nums[right] | left | Check            | Action | Result      |
// | ----: | ----------: | ---: | ---------------- | ------ | ----------- |
// |     0 |           1 |    0 | left < 2         | write  | [1]         |
// |     1 |           1 |    1 | left < 2         | write  | [1,1]       |
// |     2 |           1 |    2 | nums[2]==nums[0] | skip   | [1,1]       |
// |     3 |           2 |    2 | nums[3]!=nums[0] | write  | [1,1,2]     |
// |     4 |           2 |    3 | nums[4]!=nums[1] | write  | [1,1,2,2]   |
// |     5 |           3 |    4 | nums[5]!=nums[2] | write  | [1,1,2,2,3] |
