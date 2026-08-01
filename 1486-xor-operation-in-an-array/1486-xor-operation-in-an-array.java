class Solution {

    private int xorPrefix(int x) {
        if (x < 0) return 0;

        if (x % 4 == 0) return x;
        if (x % 4 == 1) return 1;
        if (x % 4 == 2) return x + 1;
        return 0;
    }

    private int xorRange(int l, int r) {
        return xorPrefix(r) ^ xorPrefix(l - 1);
    }

    public int xorOperation(int n, int start) {

        int s = start >> 1;
        int e = s + n - 1;

        int ans = xorRange(s, e) << 1;

        // Least significant bit
        if ((start & 1) == 1 && (n & 1) == 1)
            ans |= 1;

        return ans;
    }
}