class Solution {
    public int mySqrt(int x) {
        int left=1,right=x/2,ans=0;
        if (x < 2) return x; //forgot edge case
        while(left<=right){
            int mid=left+(right-left)/2; //couldnt estimate pattern as binary search
//int sq=mid*mid;  //some test cases failed for int due to overflow so changed to long
            long sq=(long)mid*mid;

            if(sq==x)
                return mid;
            if(sq<x){
                ans=mid;
                left=mid+1;
            }
            else
                right=mid-1;
        }
        return ans;
    }
}