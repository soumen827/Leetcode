public class Solution {
    public int minFlips(int[][] mat) {
        int m = mat.length, n = mat[0].length;

        // Convert the initial matrix into an integer bitmask
        int start = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                start |= (mat[i][j] << (i * n + j));

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.offer(start);
        visited.add(start);

        int steps = 0;
        int[][] dirs = {{0,0}, {1,0}, {-1,0}, {0,1}, {0,-1}};

        while (!queue.isEmpty()) {
            int size = queue.size();

            while (size-- > 0) {
                int state = queue.poll();

                if (state == 0) return steps;

                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        int next = state;

                        for (int[] dir : dirs) {
                            int ni = i + dir[0];
                            int nj = j + dir[1];

                            if (ni >= 0 && ni < m && nj >= 0 && nj < n) {
                                int bit = ni * n + nj;
                                next ^= (1 << bit); // Toggle the bit
                            }
                        }

                        if (!visited.contains(next)) {
                            queue.offer(next);
                            visited.add(next);
                        }
                    }
                }
            }

            steps++;
        }

        return -1; // Not possible to reach all-zero state
    }
}
