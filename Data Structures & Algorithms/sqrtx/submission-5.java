class Solution {
    public int mySqrt(int x) {
        //13/2 = 6 (6*6 = 36 -> 36>13)... s = 0, e = 5
        //5/2 = 2 (2*2 = 4 -> 4<13)... s = 3,e =5
        //8/2 = 4  (4*4 = 16 -> 16>13)... s = 3, e = 3
        // 6/2 = 3 (3*3 = 9 -> 9<13)... s = 
        //****
        //2/2 = 1 (1*1=1 -> 1<2) s = 2, e = 2, m =1
        // 4/2 = 2 (2*2 = 4 -> 4>2) s = 2 , e =1 , m=2
        int s = 0;
        int e = x;
        int ans = 0;
        while (s<=e){
           int m = (s+e)/2;
           long compare = (long) m*m;
        //    System.out.println(compare);
           if(compare==x){
            return m;
           }
           else if (compare>x){
            e = m-1;
           }else {
            ans = m;
            s = m+1;
           }
        }
        return ans;
    }
}