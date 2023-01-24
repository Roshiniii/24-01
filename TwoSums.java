//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int val = target-nums[i];
            if(map.containsKey(val)){
                res[0] = map.get(val);
                res[1]=i;
                return res;
            }
            map.put(nums[i],i);
        }
        return res;
    }
}
