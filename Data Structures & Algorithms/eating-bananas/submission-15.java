class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       Arrays.sort(piles);
       //[1,2,3,4]
       //1...4
       long right = piles[piles.length-1];
       long left = 1;
       long minRate= right;
       while(left<=right){
        long mid = left+(right-left)/2;
        long duration = 0;
        // System.out.println(left+" "+right+" "+mid);
        for(int i=0;i<piles.length;i++){
            duration += (long)Math.ceil((double)piles[i]/mid);
        }
        if(duration > h){
            left = mid+1;
        }else{
            right = mid-1;
            if(minRate>mid){
                minRate = mid;
            }
        }

       }
       return (int)minRate;
    }
}
