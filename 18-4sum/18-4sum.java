class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            for(int j = nums.length-1; j>i; j--){
                int low = i+1; int high = j-1;
                while(low<high){
                    if(nums[i]+nums[j]+nums[low]+nums[high]==target){
                        List<Integer> arr = new ArrayList<>();
                        arr.add(nums[i]);
                        arr.add(nums[j]);
                        arr.add(nums[low]);
                        arr.add(nums[high]);
                        res.add(arr);
                        low++; high--;
                    }
                    else if (nums[i]+nums[j]+nums[low]+nums[high]<target) low++;
                    else high--;
                }
            }
        }
        return new ArrayList<>(res);
    }
}