class Solution {
    public int maxArea(int[] heights) {
        //1,7,2,5,4,7,3,6
        //i,j , left, right, (i<left,curr<a), (j<right,curr<a)

        //1(0),6(7) -> w = 7, h = 1, a = 7, crr = 7
        //7(1),6(7) -> w = 6, h = 6, a = 36 (a>crr) , crr = 36
        
        int left = 0;
        int right = heights.length-1;
        int maxArea = 0;
        // System.out.println(right);
        // System.out.println(heights[right]);
        while(left<right){
            int area = (right-left)*Math.min(heights[left],heights[right]);
            if(maxArea<area){
                maxArea = area;
            }
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}
