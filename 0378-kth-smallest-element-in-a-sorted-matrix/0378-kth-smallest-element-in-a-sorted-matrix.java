import java.util.*;

class Solution {
    public int kthSmallest(int[][] matrix, int k) {

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[0] - b[0]
        );

        // Add first element of every row
        for(int i = 0; i < matrix.length; i++) {
            pq.add(new int[]{matrix[i][0], i, 0});
        }

        while(k > 1) {
            int[] curr = pq.poll();

            int row = curr[1];
            int col = curr[2];

            // Add next element from the same row
            if(col + 1 < matrix[row].length) {
                pq.add(new int[]{matrix[row][col+1], row, col+1});
            }

            k--;
        }

        return pq.poll()[0];
    }
}