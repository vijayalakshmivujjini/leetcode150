// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//         int left=0;
//         while(left<nums.length){
//         for(int right=left+1;right<nums.length;right++){
//             System.out.println("right"+right+"left"+left);
//             if(nums[left]==nums[right] &&right-left<=k ){
//                 return true;
//             }

//         }
//         left++;
//         }

//         return false;
//     }
// }

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>(); //my above sol is TLE, use hashmap when their are large input values

        for (int i = 0; i < nums.length; i++) {
            if (h.containsKey(nums[i]) && i - h.get(nums[i]) <= k) {
                return true;
            }
            h.put(nums[i], i);
        }

        return false;
    }
}
