class Solution {
    static List<String> ans;
    public static void print(int open, int close ,String s, int n){
        if(s.length()==2*n){
        ans.add(s);
        return;
        }
        if(close<open) print(open,close+1,s+")",n);
        if(open<n) print(open+1,close,s+"(",n);
    }
     
    public List<String> generateParenthesis(int n) {
         ans = new ArrayList<>();
         print(0,0,"",n);
         return ans;
    }
}