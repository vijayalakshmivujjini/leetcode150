class Solution {
    public int longestConsecutive(int[] nums) {
        // Arrays.sort(nums);
        // int wind=1,max=1;
        // if(nums.length==0)
        // return 0;
        // for(int right=1;right<nums.length;right++){
        //    if(nums[right]==nums[right-1]) //missed this duplicate check
        //     continue;
        //     if(nums[right]==nums[right-1]+1){
        //         wind++;
        //     }else{
        //         wind=1; //wind only tracks the current consecutive sequence. When the sequence breaks, wind sets to 1
        //     }

        //     if(wind>max)
        //     max=wind;
        // }return max;

        //my above sol works but Arrays.sort(nums) give o(nlogn)
        int globalseq=1;
        HashSet<Integer> hs=new HashSet<>();
        for(Integer i:nums)
            hs.add(i);

        for(int i=0;i<nums.length;i++){
            if(!hs.contains(nums[i]-1))
            {
                int curr=nums[i]; //here i forgot the concept of hasset do nt have get method, get(i) -not possible
                int currseq=1; //maintaiang 2 seq withh helpwhen multiple sequences and if A shorter sequence appears   after a longer one, our goal is to fetch longer but if we return currseq then it will be sorter

                //  if(hs.contains(curr+1))//Repeats for next step only.
                while(hs.contains(curr+1))//Repeats as long as curr + 1 exists.
                {
                    currseq++;
                    curr++;
                }
                if(currseq>globalseq)
                    globalseq=currseq;

            }

        }return globalseq;
    }
}