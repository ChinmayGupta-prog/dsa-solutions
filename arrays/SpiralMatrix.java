import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiralTraversal = new ArrayList<>();
        int n = matrix.length,m=matrix[0].length;
        int left = 0,right = m-1,top =0, bottom = n-1;
        while(top<=bottom && left <= right){
            for(int i=left;i<=right;i++){
                spiralTraversal.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                spiralTraversal.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    spiralTraversal.add(matrix[bottom][i]);
                }
            }   
            bottom--;
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    spiralTraversal.add(matrix[i][left]);
                }
            }
            left++;
        }
        return spiralTraversal;
    }
}
