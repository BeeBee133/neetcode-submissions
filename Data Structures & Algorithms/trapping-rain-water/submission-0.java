class Solution {
    public int trap(int[] height) {
        int left=0,maxLeft=0,maxRight=0,result =0;
        int right = height.length-1;
        while(left<right){
            if(height[left]<height[right]){
                maxLeft = Math.max(maxLeft,height[left]);
                result += maxLeft-height[left];
                left++;
            }else{
                maxRight = Math.max(maxRight,height[right]);
                result += maxRight-height[right];
                right--;
            }
        }
        return result;
    }
}
