class Solution {
    public class Pair implements Comparable<Pair>{
    int ele;
    int freq;
    Pair(int ele,int freq){
        this.ele = ele;
        this.freq = freq;
    }
    public int compareTo(Pair s){
        if(this.freq==s.freq) return s.ele-this.ele;
          return this.freq - s.freq;
    }
}
    public int[] frequencySort(int[] arr) {
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int ele:arr){
            if(map.containsKey(ele)){
                map.put(ele,map.get(ele)+1);
            }else map.put(ele,1);
        }
        for(int ele:map.keySet()){
            int freq = map.get(ele);
            pq.add(new Pair(ele,freq));
        }
        int ans[] = new int[n];
        int idx = 0;
        while(pq.size()>0){
            Pair p = pq.remove();
            for(int i=0;i<p.freq;i++){
                 ans[idx++] = p.ele;
                 
            }
             
        }

        return ans;

    }
}