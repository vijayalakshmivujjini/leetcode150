class Solution {
    public int maxArea(int[] heights) {
        int res = 0, start=0, end=heights.length-1;
        while(start<=end){
            res=Math.max(res,Math.min(heights[start],heights[end])*(end-start));
            if(heights[start]<heights[end])
                start++;
            else
                end--;
        }
        return res;
    }
}