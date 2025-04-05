class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int left = 0, right = height.length - 1;
        
        while(left < right){
            
            int currentArea = (right - left) * Math.min(height[left], height[right]);
            area = Math.max(currentArea, area);

            if(height[right] > height[left])
                left++; 
            else
                right--;
        }
        return area;
    }
}