class Solution {

    public String encode(List<String> strs) {
        String code = "";
        for(String str: strs){
            code+=str.length()+"#"+str;
        }
        // System.out.println(code);
        return code;
    }

    public List<String> decode(String str) {
        // if(str=="") return "";
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i<str.length()){
            int j = str.indexOf("#",i);
            int size = Integer.parseInt(str.substring(i,j));
            String data = str.substring(j+1,j+size+1);
            res.add(data);
            i = j+size+1;
        }
        // System.out.print(res);
        return res;
    }
}
