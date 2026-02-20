class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int counter=0;
        int prod=1;
        int [] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){

                prod=prod*nums[i];
            }
            else{
                counter++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(counter==0){

                nums[j]=prod/nums[j];
            }
            else if(counter==1){
                nums[j]=nums[j]==0? prod:0;

            }else{
                nums[j]=0;
            }

        }


        return nums;
    }
    public static void main(String args[]) {
        int[] nums = {1,2,3,4};

        int[] res = productExceptSelf(nums);
        System.out.println("res: " + Arrays.toString(res));
    }
}