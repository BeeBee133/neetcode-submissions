class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int startArray = 0;
        for(int i = 0;i<matrix.length;i++){
            if(target==matrix[i][0]){
                return true;
            }else if(target>=matrix[i][0] && target<=matrix[i][matrix[i].length-1]){
                startArray = i;
            }
            // System.out.println((target>=matrix[i][0])+" "+(target<=matrix[i][3]));
        }
        
        System.out.println(startArray);
        // System.out.print(Math.ceil(5/2));
        int left = 0;
        int right = matrix[startArray].length-1 ;
        int mid = 0;
        while(left<=right){
            mid=left+(right-left)/2;
            // System.out.println(left+" "+mid+" "+right);
            if(matrix[startArray][mid]==target){
                return true;
            }else if(matrix[startArray][mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
                }
        }
        

        return false;
    }
}
