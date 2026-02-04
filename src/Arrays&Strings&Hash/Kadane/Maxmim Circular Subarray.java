class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum=0;
        int max=Integer.MIN_VALUE;int min=Integer.MAX_VALUE;
        int maxSum=0;int minSum=0;
        for(int right=0;right<nums.length;right++){
            totalSum=totalSum+nums[right];
            maxSum=maxSum+nums[right];
            if(maxSum>max)
                max=maxSum;
            if (maxSum<0)
                maxSum=0;
            minSum=minSum+nums[right];
            if(minSum<min)
                min=minSum;
            if(minSum>0)
                minSum=0;
        }
        if(max<0) //edge case
            return max;
        if(totalSum-min >max)
            return totalSum-min;
        else
            return max;
    }
}