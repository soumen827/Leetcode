class Solution {
    public int beautySum(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            Map<Character, Integer> map = new HashMap<>();
            for (int j = i; j < s.length(); j++) {  
                char ch = s.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
                int maxFreq = Integer.MIN_VALUE;
                int minFreq = Integer.MAX_VALUE;
                for (char c : map.keySet()) {       
                    int freq = map.get(c);
                    maxFreq = Math.max(maxFreq, freq);
                    minFreq = Math.min(minFreq, freq);
                }
                count += (maxFreq - minFreq);
            }
        }
        return count;
    }
}
