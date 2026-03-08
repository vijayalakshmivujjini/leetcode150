class Solution {
    public int sumSubarrayMins(int[] arr) {

        // long sum = 0;
        // int mod=1_000_000_007;
        // for (int i = 0; i < arr.length; i++) {
        //     int min = arr[i];
        //     for (int j = i; j < arr.length; j++) {
        //         min = Math.min(min, arr[j]);//find min and add below
        //         sum =(sum+min)%mod;
        //     }
        // }
        // return (int) sum;

// if we keep expanding to the left while the current element is still the minimum, as soon as we encounter an element smaller than the current one, that marks the boundary of its left range.
// if we expand to the right, the moment we find a smaller element, that becomes the boundary of its right range.

Stack<Integer> leftstack=new Stack<>();
Stack<Integer> rightstack=new Stack<>();

int[] leftarr=new int[arr.length];
int[] rightarr=new int[arr.length];

long result = 0;
long mod = 1_000_000_007;



 // Previous Smaller Element (strictly smaller)
for(int i=0;i<arr.length;i++){
    while(!leftstack.isEmpty() && arr[leftstack.peek()]>arr[i]){
        leftstack.pop();
    }
    leftarr[i]=leftstack.isEmpty() ? (i + 1) : (i - leftstack.peek()); //calc How far can this element stretch left before hitting a smaller element? If stack is empty:That means no smaller element exists to the left. So this element is smallest from index 0 to i; else if stack gives you index of previous smaller element.So we can stretch from (previous smaller index + 1) → i which will become i-previous smaller index

    leftstack.push(i);
}
// Next Smaller Element (smaller or equal)
for(int i=arr.length-1;i>=0;i--){
    while(!rightstack.isEmpty() && arr[rightstack.peek()]>=arr[i]){
        rightstack.pop();
    }
    rightarr[i]=rightstack.isEmpty() ? (arr.length - i) : (rightstack.peek() - i);
    rightstack.push(i);
}

//calculate the contribution of easch element
for(int i=0;i<arr.length;i++){
      //result += arr[i] * leftarr[i] * rightarr[i];

result = (result + (long)arr[i] * leftarr[i] * rightarr[i]) % mod;
}

return (int) result;

    }
}