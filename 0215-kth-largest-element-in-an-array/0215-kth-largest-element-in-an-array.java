class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums){
            pq.add(num);
        }
        for(int i=0;i<k;i++){
            if(i==k-1){
                return pq.peek();
            }
            pq.poll();
        }
        return pq.peek();
    }
}
