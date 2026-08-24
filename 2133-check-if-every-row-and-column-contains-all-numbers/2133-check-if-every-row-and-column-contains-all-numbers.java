class Solution {
    public boolean checkValid(int[][] matrix) {
       HashSet set = new HashSet();
       HashSet set1 = new HashSet();
        for(int i=0;i<=matrix.length-1;i++)
        { set.clear();
        set1.clear();
            for(int j=0;j<=matrix.length-1;j++)
            {
                if(!set.add(matrix[i][j]))
                return false;
                if(!set1.add(matrix[j][i]))
                return false;
            }
        }
        return true;
    }
}