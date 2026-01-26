//my solution
// class Solution {
//     public int[] plusOne(int[] digits) {
//         int num=0;
//         List<Integer> li=new ArrayList();
//          for(int i=0;i<=digits.length-1;i++){
//             li.add(digits[i]);
//          }
//         int i=digits.length-1;

//         while(i>=0&&li.get(i)==9){
//             li.set(i,0);
//             i--;
//         }
//         if(i>=0){
//             li.set(i,li.get(i)+1);
//         }else{
//             li.add(0,1);
//         }

//             int[] arr = new int[li.size()];
//             for(int k=0;k<li.size();k++){
//                 arr[k]=li.get(k);
//             }
//            // li.stream().mapToInt(k -> k).toArray(); -streams
//           return arr;
//      }
// }
//my solution is overcomplicate dbecause i missed concept of adding 1 to the the digit inplace , no need of conversions
//optimal solution
class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0; // carry continues
        }

        // if all digits were 9
        int[] res = new int[digits.length + 1];
        res[0] = 1; //In Java, all int arrays are automatically initialized with 0. so we can just add 1 at begining
        return res;
    }
}
