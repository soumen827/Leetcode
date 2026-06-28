public class Triplate implements Comparable<Triplate>{
    int ele;
    int row;
    int col;
    Triplate(int val,int row,int col){
        this.ele = val;
        this.row = row;
        this.col = col;
    }
    public int compareTo(Triplate t){
        return this.ele - t.ele;
    }

}
class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        int[] ans = {0,Integer.MAX_VALUE};
        PriorityQueue<Triplate> pq = new PriorityQueue<>();
        int k = nums.size();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            int ele = nums.get(i).get(0);  // Ith row ka first ele
            pq.add(new Triplate(ele,i,0));
            max = Math.max(max,ele);
        }
        while(true){
            Triplate top = pq.remove();
            int ele = top.ele, row = top.row, col =top.col;
            // Update the min Range
            if(max-ele<ans[1]-ans[0]){
                ans[0] = ele;
                ans[1] = max;
            }
            if(col==nums.get(row).size()-1) break;
            int next = nums.get(row).get(col+1);
            max = Math.max(max,next);
            pq.add(new Triplate(next,row,col+1));
        }
        return ans;
    }
}