package workWithNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> listTmp = new ArrayList<>();

        for (Integer integer : list) {
            if (integer > 0 && integer % 2 == 0)
                listTmp.add(integer);
        }

        int tmp;

        for (int i = 0; i < listTmp.size() - 1; i++) {
            for (int j = i + 1; j < listTmp.size(); j++) {
                if (listTmp.get(i) > listTmp.get(j)) {
                    tmp = listTmp.get(i);
                    listTmp.set(i, listTmp.get(j));
                    listTmp.set(j, tmp);
                }
            }
        }

        for (Integer integer : listTmp) {
            System.out.println(integer);
        }
    }
}