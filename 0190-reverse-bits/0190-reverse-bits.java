class Solution {
    public int reverseBits(int n) {
        int i=0, j = 31;
        while(i<j){
            int iMask = 1<<i;
            int jMask = 1<<j;
            boolean iOn = ((iMask&n) != 0); // if 1 then on if 0 then of
            boolean jOn = ((jMask&n) != 0); // same for j
            if(iOn!=jOn){ // i j same nehi hay to flip
                n ^= iMask; // ith bit now fliped
                n ^= jMask; // jth bit now fliped
            }
            i++;
            j--;
             
        }
        return n;
    }
}