class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b) -> b-a);
        for(int i=0; i<nums.length;i++){
            q.offer(nums[i]);
        }
        while(k>1){
            q.poll();
            k--;
        }
        return q.peek();
    }
}