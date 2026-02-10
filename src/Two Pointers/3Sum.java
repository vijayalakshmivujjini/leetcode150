class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        Arrays.sort(nums);// o/p is expected as list in sorted form
        Set<List<Integer>> set = new HashSet<>(); // to remove duplicae lists

//-4,-1,-1,0,1,2

        for(int i=0;i<nums.length-1;i++){

            int target=0,j=i+1,k=nums.length-1;
            while (j < k) {
                int sum=nums[i]+nums[j]+nums[k];
                if(i != j && i != k && j != k && sum==0){

                    List<Integer> triplet=Arrays.asList(nums[i],nums[j],nums[k]);
                    set.add(triplet);
                    j++;
                    k--;
                }
                else if (sum < target) {
                    j++;
                } else {
                    k--;
                }


            }
        }
        return new ArrayList<>(set);

    }
    public static void main(String args[]){
        int[] arr={-1,0,1,2,-1,-4};
        List<List<Integer>> test=threeSum(arr);

    }
}