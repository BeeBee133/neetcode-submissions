class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[\\W]","");
        String[] temp = s.toLowerCase().split(" ");
        String str = String.join("",temp);
        System.out.println(str);
        if (str.equals("a") || str.isEmpty())return true;
        if (str.length()==1)return false;
        int j=str.length()-1; 
        for(int i = 0 ;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            j--;
        }

        return true;
    }
}
