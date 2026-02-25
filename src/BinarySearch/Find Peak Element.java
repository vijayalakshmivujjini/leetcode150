class Solution {
    public int findPeakElement(int[] nums) {
// if(nums.length==2){
//     if(nums[0]>nums[1])
//     return 0;
//     else
//     return 1;
// }
// if(nums.length<2)
// return 0;
// int n = nums.length;
// if(nums[n-1] > nums[n-2])
//     return n-1;
//         for(int i=0;i<nums.length-2;i++){
// int low=i,high=i+2;
// int mid=low+(high-low)/2;
// if(nums[mid]>nums[low] && nums[mid]>nums[high])
// return mid;
//         }
//         return 0;

//my above solution is patchy for each and every condition
        int low=0,high=nums.length-1;
        while(low < high) {

            int mid = low + (high - low) / 2;

            if(nums[mid] > nums[mid + 1])
                high = mid;      // peak on left
            else
                low = mid + 1;   // peak on right
        } return low;
    }
}