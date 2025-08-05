class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>(nums.length);
        for(int i=0;i<nums.length;i++){
            int to_find=target-nums[i];
            if(map.containsKey(to_find)){
                return new int[]{map.get(to_find),i};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return nums;
    }
}
