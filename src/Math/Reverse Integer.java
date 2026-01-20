class Solution {
    public static int reverse(int x) {
        int rev=0;
        int MAX = Integer.MAX_VALUE;
        int MIN = Integer.MIN_VALUE;
        while(x!=0){
            int digit=x%10;
            if (rev > MAX / 10 || rev < MIN / 10)
                return 0;
            rev=rev*10+digit;
            x=x/10;
        }
        return rev;
    }
    public static void main(String args[]){
        System.out.println("rev is: "+reverse(123));
    }

}