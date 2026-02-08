class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        // int n = nums.length;
        // int[] newArr = new int[n * 2];

        // // Copy nums twice
        // for (int i = 0; i < n; i++) {
        //     newArr[i] = nums[i];
        //     newArr[i + n] = nums[i];
        // }
        // int max = Integer.MIN_VALUE;
        // int sum = 0;

        // for (int i = 0; i < newArr.length; i++) {
        //     sum += newArr[i];

        //    // If window size > n, remove the leftmost element // keep track of subarray length, to ensure that the subarray length never exceeds n because we have doubled array but orinal length is not doubled
        //         if (i >= n) {
        //             sum -= newArr[i - n];
        //         }
        //     max = Math.max(max, sum);

        //     if (sum < 0) { // optional reset
        //         sum = 0;
        //     }
        // }

        // return max;

        //my above bruteforce make the circular subarray as linear and then apply kadanes maximum sum but its not covering all scenarios. correct approach is Use the total sum - min subarray sum

        int total=0,currmin=0,currmax=0;
        int minsum=Integer.MAX_VALUE, maxsum=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            total+=nums[i];
            currmax=Math.max(nums[i],currmax+nums[i]);
            maxsum=Math.max(currmax,maxsum);
            currmin=Math.min(nums[i],currmin+nums[i]);
            minsum=Math.min(currmin,minsum);
        }

        if(maxsum<0) //if all are negtive nums then return  maxsum
            return maxsum;


        return Math.max(maxsum,total-minsum);

    }

}