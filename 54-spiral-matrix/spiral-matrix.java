class Solution {
    public static List<Integer> spiralOrder(int[][] matrix) {
        int sr = 0;
        int sc = 0;
        int er = matrix.length - 1;
        int ec = matrix[0].length - 1;
        List<Integer> l1 = new ArrayList<>();

        while (sr <= er && sc <= ec) {
            // Top 
            for (int i = sc; i <= ec; i++) {
                l1.add(matrix[sr][i]);
            }
            sr++; 

            // Right 
            for (int i = sr; i <= er; i++) {
                l1.add(matrix[i][ec]);
            }
            ec--; 

            // Bottom 
            if (sr <= er) {
                for (int i = ec; i >= sc; i--) {
                    l1.add(matrix[er][i]);
                }
                er--; 
            }

            // Left 
            if (sc <= ec) {
                for (int i = er; i >= sr; i--) {
                    l1.add(matrix[i][sc]);
                }
                sc++; 
            }
        }
        return l1;
    }
}