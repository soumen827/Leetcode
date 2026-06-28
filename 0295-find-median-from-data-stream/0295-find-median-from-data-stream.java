class MedianFinder {
    PriorityQueue<Integer> minpq = new PriorityQueue<>();
    PriorityQueue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(maxpq.size()==0) maxpq.add(num);
        else {
            if(num<maxpq.peek()) maxpq.add(num);
            else minpq.add(num);
        }
        if (maxpq.size() > minpq.size() + 1) {
        minpq.add(maxpq.remove());
        }
        else if (minpq.size() > maxpq.size() + 1) {
        maxpq.add(minpq.remove());
        }
    }
    public double findMedian() {
        if(maxpq.size()==minpq.size()){
            return (maxpq.peek()+minpq.peek())/2.0;
        }
        else if(maxpq.size()>minpq.size()) return maxpq.peek();
        else return minpq.peek();
    }
}