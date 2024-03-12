package arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle_119 {
    public static void main(String[] args) {
        int num = 5;
        List<Integer> list = getRow(num);
    }

    public static List<Integer> getRow(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> arrayList;
        for (int i = 1; i <= numRows; i++) {
            if (i < 3) {
                arrayList = new ArrayList<>(i);
                for (int j = 0; j < i; j++) {
                    arrayList.add(1);
                }
                list.add(arrayList);
            }
            if (i >= 3) {
                arrayList = new ArrayList<>(i);
                arrayList.add(1);
                for (int j = 0; j < list.get(i - 2).size() - 1; j++) {
                    arrayList.add(list.get(i - 2).get(j) + list.get(i - 2).get(j + 1));
                }
                arrayList.add(1);
                list.add(arrayList);
            }
        }
        return list.get(numRows-1);
    }
}
