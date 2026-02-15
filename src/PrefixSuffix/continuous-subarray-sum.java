class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // int left=0;
        // if(nums.length<2) return false;
        // while(left<nums.length){
        //      int sum = nums[left];
        //     for(int right=left+1;right<nums.length;right++){
        //          sum=sum+nums[right];
        //         if(sum%k==0){
        //             return true;
        //         }
        //     } left++;
        // } return false;

        int sum=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1); //this is needed for length calculation correctly for ex like [6,6]

        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i]; //calculating prefix
            if(hm.containsKey(sum%k)){ // Check if we have seen the same remainder before,
                if(i-hm.get(sum%k)>1) //extra condition to be good is size of subarray is min 2
                    return true;
            }
            else //if we dnt put else condition eventhough the element ontaind=s it will be replaced by this put and we will loose the index value
                hm.put(sum%k,i);// reason to put index as value is for calculating size of array
        }
        return false;
    }
}


// | i | nums[i] | sum | sum%k | Map (mod → first idx) | Comment                                    |
// | - | ------- | --- | ----- | --------------------- | ------------------------------------------ |
// | 0 | 23      | 23  | 5     | {0:-1}                | 5 not in map → store 5:0                   |
// | 1 | 2       | 25  | 1     | {0:-1,5:0}            | 1 not in map → store 1:1                   |
// | 2 | 4       | 29  | 5     | {0:-1,5:0,1:1}        | 5 seen at 0, i-prev=2 → valid! return true |
