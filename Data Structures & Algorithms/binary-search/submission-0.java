class Solution {
    // nums = [-1,0,2,4,6,8], target = 4
    // s = 0, e = nums.length()-1, m= s+e/2
    // s<=e, m equals target, if correct return m
    // not m>4(target), e = m-1, 
    // not m<4(target), s = m+1

    public int search(int[] nums, int target) {
        int start = 0;//0(-1), 2. 3(4)
        int end = nums.length-1;//5(8), 3. 3(4)
        // System.out.println("Test");
        
        while(start<=end){
            // System.out.println(start+" "+end);
            int mid = (start+end)/2;//0+5/2 -> 2, 2. 3+5/2 -> 4, 3. 4+4/2 ->4
            if(nums[mid]<target){ 
                start = mid+1;// 2+1 -> 3
            }else if( nums[mid]>target){ //2>4 -> false, 6>4 -> true;
                end = mid-1; //4-1 -> 3, 2. 4-1 = 3
            }else{//nums[2](2)==4 -> false, 2. nums[4](6)==4 -> false
                return mid;
            }
        }
        return -1;
    }
}
