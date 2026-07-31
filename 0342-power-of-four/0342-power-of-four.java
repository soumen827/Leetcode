class Solution {
    public boolean isPowerOfFour(int n) {
        //Brute forse
        // if(n==1) return true;
        // if(n<=0 || n%4!=0) return false;
        // return isPowerOfFour(n/4);
        
        // M-2
        if(n<=0) return false;
        // return ((n&(n-1))==0) && isPerfectSqare(n);
        return ((n&(n-1))==0) && (n%3==1);
    }
    public boolean isPerfectSqare(int n){
        int root = (int)Math.sqrt(n);
        return (root*root==n);
    }
}