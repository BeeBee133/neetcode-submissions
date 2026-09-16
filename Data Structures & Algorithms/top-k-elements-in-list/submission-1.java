class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> dict = new HashMap<>();
        for(int num:nums){
            dict.put(num,dict.getOrDefault(num,0)+1);
        }
        List<Map.Entry<Integer,Integer>> entryList = new ArrayList<>(dict.entrySet());
        entryList.sort((a,b)->b.getValue()- a.getValue());

        List<Integer> value = new ArrayList<>();
        int i=0;
        for(Map.Entry<Integer,Integer> entry:entryList){
            if(i<k){
                value.add(entry.getKey());
                i++;
            }
        }

        int[] arrValue = new int[value.size()];
        i = 0;
        for(Integer num:value){
            arrValue[i]=num;
            i++;
        }
        return arrValue;



    }
}
