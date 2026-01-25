class Solution {
    public static boolean isHappy(int n) {
        Set<Integer> seen=new HashSet<>();//some numbers never reach 1 — they get stuck in a loop (cycle)
        //2 → 4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4 → 16. store everynumber and stop if you already compute the number

        while(n!=1 && !seen.contains(n)){ //this loop is to exit
            seen.add(n);
            int sum=0; //missed adding this inside loop, we need it beacuse every number after sum will be a number & new sum
            while(n!=0){ //this loop is calc
                int dig =n%10;
                sum+=Math.pow(dig,2);
                n=n/10;
            }
            n=sum;
        }
        if(n==1)
            return true;
        return false;
    }
}
