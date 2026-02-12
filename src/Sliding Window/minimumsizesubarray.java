class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0,sum=0,size=Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum+=nums[right];
            while(sum>=target){
                if((right-left+1)<size)
                    size=right-left+1;
                sum -= nums[left]; // shrink window
                left++;
            }
        }
        return size==Integer.MAX_VALUE?0:size;
    }
}
// | Step | left | right | Window      | sum | Action               |
// | ---: | ---: | ----: | ----------- | --: | -------------------- |
// |    1 |    0 |     0 | `[2]`       |   2 | expand right         |
// |    2 |    0 |     1 | `[2,3]`     |   5 | expand right         |
// |    3 |    0 |     2 | `[2,3,1]`   |   6 | expand right         |
// |    4 |    0 |     3 | `[2,3,1,2]` |   8 | ❌ sum > 7 → shrink   |
// |    5 |    1 |     3 | `[3,1,2]`   |   6 | stop shrinking       |
// |    6 |    1 |     4 | `[3,1,2,4]` |  10 | ❌ sum > 7 → shrink   |
// |    7 |    2 |     4 | `[1,2,4]`   |   7 | ✅ valid window       |
// |    8 |    2 |     5 | `[1,2,4,3]` |  10 | ❌ sum > 7 → shrink   |
// |    9 |    3 |     5 | `[2,4,3]`   |   9 | ❌ still > 7 → shrink |
// |   10 |    4 |     5 | `[4,3]`     |   7 | ✅ valid window       |
