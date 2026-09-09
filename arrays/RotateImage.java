public class RotateImage {

    private void reverseArray(int arr[], int n) {
        int p1 = 0, p2 = n - 1;

        while (p1 < p2) {
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;

            p1++;
            p2--;
        }
    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            reverseArray(matrix[i], n);
        }
    }
}
