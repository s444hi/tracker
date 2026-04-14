package 347;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap(); // map stores num and its freqency
        for (int n : nums) { // loop through the array and count frequency of each numebr
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Integer> max = new PriorityQueue<>((a, b) -> freq.get(b) - freq.get(a)); // orders numbers by highest frequency
        max.addAll(freq.keySet()); // add unique nums to heap

        int[] answer = new int[k];
        for (int i = 0; i < k; i++) {
            answer[i] = max.poll(); // removes max freq
        }

        return answer;
    }
} {
    
}
