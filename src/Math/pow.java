class Solution {
    public double myPow(double x, int n) {
        double sum=1;
        long pow=Math.abs((long)n);
        //         for(long i=0;i<pow;i++){
// sum=sum*x;
//         }
        while(pow>0){
            if(pow%2==1)
                sum=sum*x;
            x=x*x;
            pow=pow/2;
        }
        if(n<0){
            sum=1/sum;
        }
        return sum;
    }
}

// 1st iteration
// pow = 10 (1010)
// last bit = 0 → skip
// x = 2*2 = 4
// pow = 10/2 = 5 (101)
// 2nd iteration
// pow = 5 (101)
// bit=1 → sum = 1*4 = 4
// x = 4*4 = 16
// pow = 5/2 = 2 (10)
// 3rd iteration
// pow = 2 (10)
// bit=0 → skip
// x = 16*16 = 256
// pow = 2/2 = 1 (1)
// 4th iteration
// pow = 1 (1)
// bit=1 → sum = 4*256 = 1024
// x = 256*256 = 65536
// pow = 1/2 = 0