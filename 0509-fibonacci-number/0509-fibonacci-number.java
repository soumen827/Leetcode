class Solution {
    public int fib(int n) {
         return fibo(n);
    }
    public int fibo(int n){
        //int[] arr = new int[n];
        if(n<=1) return n;
        return fib(n-1)+ fib(n-2);
    }
}