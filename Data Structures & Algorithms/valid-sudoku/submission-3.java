class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<List<Character>> matrixs = new ArrayList<>();
        List<List<Character>> rows=new ArrayList<>();
        List<List<Character>> columns = new ArrayList<>();

        for(int i=0;i<9;i++){
            matrixs.add(new ArrayList<>());
            rows.add(new ArrayList<>());
            columns.add(new ArrayList<>());
        }

        for(int i =0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                char item = board[i][j];
                if(item!='.'){
                int matrixNum = (3*(i/3))+j/3;
                matrixs.get(matrixNum).add(item);
                rows.get(i).add(item);
                columns.get(j).add(item);
                }
            }
        }
        
        for(List<Character> mat : matrixs){
            Set<Character> check = new HashSet<>();
            for(Character item : mat){
              if(!check.add(item)){
                return false;
              }
            }
        }

        for(List<Character> mat : rows){
            Set<Character> check = new HashSet<>();
            for(Character item : mat){
              if(!check.add(item)){
                return false;
              }
            }
        }

        for(List<Character> mat : columns){
            Set<Character> check = new HashSet<>();
            for(Character item : mat){
              if(!check.add(item)){
                return false;
              }
            }
        }

        return true;
    }
}
