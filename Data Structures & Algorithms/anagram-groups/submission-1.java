class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> words = new HashMap<>();
        for(String str : strs){
            char[] strArray = str.toCharArray();
            Arrays.sort(strArray);
            String sortedStr = new String(strArray);
            words.putIfAbsent(sortedStr,new ArrayList<String>());
            words.get(sortedStr).add(str);
        }
        // for(List<String> group: words.values()){
        //     System.out.print(group+" ");
        // }
        return new ArrayList<>(words.values());
    }
}
