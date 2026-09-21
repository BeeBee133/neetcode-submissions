class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int bestSize = 0;
        for(int num:nums){
            set.add(num);
        }

        for(Integer item : set){
            int curItem = item;
            if(!set.contains(item-1)){
                int length = 1;
                while(set.contains(curItem+1)){
                    curItem++;
                    length++;
                }
                bestSize = Math.max(bestSize,length);
            }
        }

        return bestSize;
    }
}
