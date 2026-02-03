class Solution {
    public void rotate(int[] nums, int k) {
//         for(int i=0;i<k;i++){
//             int last=nums[nums.length-1]; //save last element

//    for (int j = nums.length - 1; j > 0; j--) { //move each elemnt 2 right
//                 nums[j] = nums[j - 1];
//             }

//               nums[0]=last; // copy above save element to 1st index

//             System.out.println(Arrays.toString(nums));
//         }

// my above sol worked but for some inputs it h=gave limit exceeded error so below pattern based approach

// “Reposition every element to its final index in ONE PASS”
// Reverse Algorithm - when we see Rotate ,Cyclic shift, Reorder by k, Move blocks we follow this pattern
// 1 2 3 4 5 6 7   , k = 3
// ↓
// Reverse whole
// 7 6 5 4 3 2 1
// ↓
// Reverse first k
// 5 6 7 4 3 2 1
// ↓
// Reverse rest
// 5 6 7 1 2 3 4  ✅
// reverse(0, n-1)
// reverse(0, k-1)
// reverse(k, n-1)

        int n=nums.length;
        k=k%n; //nums = [1, 2, 3, 4, 5], n = 5 k = 7, if Rotate 5 times → same as no rotation but with that Extra 2 rotations → actual rotation = 2 steps. k = k % n = 7 % 5 = 2 // this also handle edhe cases for i.e, k=0, k=n or k>n

        reverse(nums, 0, n - 1);   // 1. reverse whole
        reverse(nums, 0, k - 1);   // 2. reverse first k
        reverse(nums, k, n - 1);   // 3. reverse rest


    }

    private void reverse(int[] nums,int left, int right){
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right]; //swapping of letters from left and right
            nums[right]=temp;
            left++;
            right--;
        }
    }
}