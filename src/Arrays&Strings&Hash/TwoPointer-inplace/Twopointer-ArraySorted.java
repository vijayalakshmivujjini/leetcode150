class Solution {
    public int[] twoSum(int[] numbers, int target) {
//       int[] newarr=new int[2];
//        int left=0;
//       while(left<numbers.length){

//       for(int right=left+1;right<numbers.length;right++){
// if(numbers[left]+numbers[right]==target){
//     newarr[0]=left+1;
//  newarr[1]= right+1;
//   return newarr;
// }
//       }  left++;
//       }return newarr;
//

//my brute force works but o(n^2) as array is soreted we can use binary search or 2 pointer

        int left=0,right=numbers.length-1;
        while(left<=right){
            if(numbers[left]+numbers[right]==target){
                return new int[]{left+1,right+1};
            }  else if (numbers[left]+numbers[right] < target) { // as array is sorted we can follow greater or less
                left++;
            } else {
                right--;
            }
        }return new int[]{-1,-1};


    }
}