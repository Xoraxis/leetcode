class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 2; i++) {
            
            if(i > 0 && nums[i] == nums[i-1])
                continue;
            
            int left = i+1;
            int right = nums.length -1; 
            while(left < right){
                int sum = nums[left] + nums[i] + nums[right];

                if(sum == 0) {
                    res.add(List.of(nums[left], nums[i], nums[right]));

                    while( left < right && nums[left] == nums[left+1])
                        left++;
                    
                    while( right < left && nums[right] == nums[right-1])
                        right--;
                    
                    right--;
                    left++;
                }
                else if(sum < 0)
                    left++;
                else right--;
            }

        }
        return res;
    }
}