class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

 //       int res[]=new int[nums2.length];
//        for(int i=0;i<nums1.length;i++){
// for(int j=0;j<nums2.length;j++){

// if(nums1[i]==nums2[j]){
// res[i]=-1;
//     int k=j;
//     while(k<nums2.length){
// if(nums2[k]>nums1[i]){
//       res[i]=nums2[k];
//       break; //missed this as it has to break after first element found
// }
//  k++; //increment has to be outside loop
//     }
// }
// }
//        }return res;

        int res[]=new int[nums2.length+1]; //next great number of last number so +1
    Stack<Integer> st=new Stack<>();
    for(int i=nums2.length-1;i>=0;i--){
        while(!st.isEmpty() && st.peek()<=nums2[i]){ // We only remove elements from the stack until the top is bigger than nums2[i] (or stack becomes empty).for every pop the top value schnages and while loop iterates until zero
            st.pop();
        }
        res[nums2[i]]=st.isEmpty()?-1:st.peek();
        st.push(nums2[i]); //st.push(i) will push index and st.push(nums[i]) will push value
    }

  for (int i = 0; i < nums1.length; i++) { //this llop is to satisfy  nums1[i] == nums2[j],  refer to notes
            nums1[i]=res[nums1[i]];
        }
return nums1;

     }
}