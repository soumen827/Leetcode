 
class Solution {
    public class Pair implements Comparable<Pair>{
    int ele;
    int diff;
    Pair(int ele,int diff){
        this.ele = ele;
        this.diff = diff;
    }
     public int compareTo(Pair s){
        if(this.diff==s.diff) return this.ele - s.ele;
        
          return this.diff - s.diff;
    }
}
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        // int left = 0, right = arr.length - k;
        // while (left < right) {
        //     int mid = left + (right - left) / 2;

        //     if (x - arr[mid] > arr[mid + k] - x) {
        //         left = mid + 1;
        //     } else {
        //         right = mid;
        //     }
        // }
        // List<Integer> result = new ArrayList<>();
        // for (int i = left; i < left + k; i++) {
        //     result.add(arr[i]);
        // }
        // return result;
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
            for(int ele:arr){
                int diff = Math.abs(x-ele);
                pq.add(new Pair(ele,diff));
                if(pq.size()>k) pq.remove();
            }
            List<Integer> ans = new ArrayList<>(); 
            while(pq.size()>0){
                Pair p = pq.remove();
                ans.add(p.ele);

            }
            Collections.sort(ans);
            return ans;
    }
}
