import java.util.Arrays;

class Solution {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> m=new HashMap<>();

        for(int i=0;i<nums.length;i++){

//         for(int j=nums.length-1;j>0;j--){
// if (nums[i] + nums[j] == target && i!=j) {
//                 result[0] = i;
//                 result[1] = j;
//             }
// }

            int c=target-nums[i];
            if(m.containsKey(c)){
                return new int[] {m.get(c),i};

            }
            m.put(nums[i],i);
        }

        return new int[0];
    }

    public static void main(String args[]) {
        int[] nums = {3,2,3};
        int target = 6;

        int[] res = twoSum(nums, target);
        System.out.println("res: " + Arrays.toString(res));
    }
}
