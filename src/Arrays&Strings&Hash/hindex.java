class Solution {
    public int hIndex(int[] citations) {

//         int left=0,hindex=0;
//         while(left<citations.length){
//             int count=0;
//         for(int right=0;right<citations.length;right++){

//             if(citations[left]<=citations[right]){
// count++;
//             }
//             if (count >= citations[left]) {
//                 hindex = Math.max(hindex, citations[left]);
//             }
//         }
//             left++;
//         }
//         return hindex;
// my above sol is o(n^2)
        Arrays.sort(citations);
        int hindex=0;
        for(int i=0;i<citations.length;i++){
            hindex=citations.length-i; //  // number of papers with citations >= citations[i]
            if(citations[i]>=hindex)
                return hindex;
        } return 0;

    }
}