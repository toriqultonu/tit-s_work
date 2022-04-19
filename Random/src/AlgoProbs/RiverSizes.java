package AlgoProbs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class RiverSizes {

    public static List<Integer> riverSizes(int[][] matrix){
        List<Integer> sizes = new ArrayList<>();
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];

        for(int i = 0; i<matrix.length;i++){
            for(int j= 0;j<matrix[i].length;j++){
                if(visited[i][j])
                    continue;
                traverseNode(i, j, matrix, visited, sizes);
            }
        }
        return sizes;
    }

    public static void traverseNode(int i, int j, int[][] matrix, boolean[][] visited, List<Integer> sizes){
        int currentSize = 0;
        List<Integer[]> nodeToExplore = new ArrayList<>();
        nodeToExplore.add(new Integer[]{i,j});
        while(!nodeToExplore.isEmpty()){
            Integer[] currentNode = nodeToExplore.get(nodeToExplore.size() - 1);

            if(visited[currentNode[0]][currentNode[1]])
                continue;
            visited[currentNode[0]][currentNode[1]] = true;

            if(matrix[currentNode[0]][currentNode[1]] == 0)
                continue;

            currentSize++;

            List<Integer[]> unvisitedNeighbors = getUnvisitedNeighbors(i, j, matrix, visited);

            for (Integer[] neighbor : unvisitedNeighbors) {
                nodeToExplore.add(neighbor);
            }

            if(currentSize>0)
                sizes.add(currentSize);
        }
    }

    public static List<Integer[]> getUnvisitedNeighbors(
            int i, int j, int[][] matrix, boolean[][] visited) {
        List<Integer[]> unvisitedNeighbors = new ArrayList<Integer[]>();
        if (i > 0 && !visited[i - 1][j]) {
            unvisitedNeighbors.add(new Integer[] {i - 1, j});
        }
        if (i < matrix.length - 1 && !visited[i + 1][j]) {
            unvisitedNeighbors.add(new Integer[] {i + 1, j});
        }
        if (j > 0 && !visited[i][j - 1]) {
            unvisitedNeighbors.add(new Integer[] {i, j - 1});
        }
        if (j < matrix[0].length - 1 && !visited[i][j + 1]) {
            unvisitedNeighbors.add(new Integer[] {i, j + 1});
        }
        return unvisitedNeighbors;
    }
}
