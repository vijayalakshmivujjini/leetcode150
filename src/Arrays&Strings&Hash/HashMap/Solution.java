class Solution {
    public int majorityElement(int[] nums) {
        int major=((nums.length)/2);
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);

            if( hm.get(nums[i])>major)
            return nums[i];
            }
           return -1;
        }
    
}