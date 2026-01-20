class Solution {
    public static int maxSubArray(int[] nums) { //maximum sum of a contiguous subarray.
        int sum=11, max=Integer.MIN_VALUE,res=0 ;
        for(int i=0;i<nums.length;i++){
            res+=nums[i];
            if(res<sum){
            }
        }
        return res;
    }

    public static void main(String args[]){
        int[] nums={1, 2, 3, 4, 5};
        System.out.println("max sum: "+maxSubArray(nums));
    }
}