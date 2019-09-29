class Solution { 
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++) { 
            if(map.containsKey(target - nums[i]))
            { 
                return new int[] {map.get(target-nums[i]),i};
            }
            map.put(nums[i], i); }//不存在将当前（nums[i],i)存放再map中
        throw new IllegalArgumentException("No two sum solution");
    }
}

