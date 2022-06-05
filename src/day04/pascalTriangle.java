package day04;

import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            row.add(0, 1); // first element
            for (int j = 1; j < i; j++){
                row.set(j, row.get(j)+ row.get(j+1));
            }
                ans.add(new ArrayList<>(row));
        }
        return ans;
    }
}
