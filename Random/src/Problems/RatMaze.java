package Problems;

import java.util.ArrayList;
import java.util.Collections;

public class RatMaze {

    private void solve(ArrayList<ArrayList<Integer>> m, int n, ArrayList<String> ans, int srcx, int srcy, ArrayList<ArrayList<Integer>> visited, String path) {

        if(srcx == n-1 && srcy == n-1){
            ans.add(path);
            return;
        }
        visited.get(srcx).set(srcy, 1);

        int newx = srcx +1;
        int newy = srcy +1;


        visited.get(srcx).set(srcy, 0);
    }

    ArrayList<String> findPath(ArrayList<ArrayList<Integer>> m, int n){
        ArrayList<String> ans = null;

        if(m.get(0).get(0) == 0){
            return null;
        }

        int srcx = 0;
        int srcy = 0;

        ArrayList<ArrayList<Integer>> visited = new ArrayList<ArrayList<Integer>>();

        for(int i =0; i<n; i++){
            for(int j =0;j<n; j++){
                 visited.get(i).set(j, 0);
            }
        }

        String path = "";
        solve(m, n, ans, srcx, srcy, visited, path);
        Collections.sort(ans);

        return ans;
    }




}
