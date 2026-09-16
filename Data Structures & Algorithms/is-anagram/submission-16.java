class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            System.out.println("Reach very first Check");
            return false;
        }
        HashMap<Character,Integer> wordMap= new HashMap<>();
        HashMap<Character,Integer> wordMap1 = new HashMap<>();
        boolean check = false;
        for(int i=0;i<s.length();i++){
            if(wordMap.containsKey(s.charAt(i))==false){
                wordMap.put(s.charAt(i),1);
            }else{
                int num = wordMap.get(s.charAt(i));
                num++;
                wordMap.put(s.charAt(i),num);
            }
        }

        for(int i=0;i<t.length();i++){
            if(wordMap1.containsKey(t.charAt(i))==false){
                wordMap1.put(t.charAt(i),1);
            }else{
                int num = wordMap1.get(t.charAt(i));
                num++;
                wordMap1.put(t.charAt(i),num);
            }
        }
        for(Character key : wordMap.keySet()){
            System.out.print(key + ":" + wordMap.get(key)+" ");
        }
        System.out.println();
        for(Character key : wordMap1.keySet()){
            System.out.print(key + ":" + wordMap1.get(key)+" ");
        }
        System.out.println();
        for(Map.Entry<Character,Integer> map : wordMap.entrySet()){
            System.out.println("Current : "+map.getKey());
            if(wordMap1.containsKey(map.getKey())){
                System.out.println("Contain : "+map.getKey());
                if(wordMap1.get(map.getKey()).equals(map.getValue())){
                                        System.out.println("Value Check PASS!! ("+wordMap1.get(map.getKey())+") == ("+map.getValue()+")");
                    check = true;
                }else{
                    System.out.println("Value Check Fail!! ("+wordMap1.get(map.getKey())+") != ("+map.getValue()+")");
                    return false;
                }
            }else{
                System.out.println("Character Not Contain!!");
                return false;
            }
        }

    return check;
    }
}
