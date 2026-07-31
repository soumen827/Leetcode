class Solution {
    public int hammingWeight(int n) {
        // Method 1
        int count =0;
        // while(n!=0){
        //     n = n& (n-1);
        //     count++;
        // }
            // method 2 
        for(int i=0;i<=31;i++){
            int mask = 1<<i;
            if((n & mask) != 0) count ++;
        }
        return count;

    }
}