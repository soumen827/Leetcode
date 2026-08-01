class Solution {
    public int reverseBits(int n) {
        int i=0, j = 31;
        while(i<j){
            int iMask = 1<<i;
            int jMask = 1<<j;
            boolean iOn = ((iMask&n) != 0);
            boolean jOn = ((jMask&n) != 0);
            if(iOn!=jOn){ // i j same nehi hay to flip
                n ^= iMask;
                n ^= jMask;
            }
            i++;
            j--;
             
        }
        return n;
    }
}