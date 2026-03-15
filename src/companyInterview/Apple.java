package companyInterview;

import java.util.ArrayList;
import java.util.List;

public class Apple {
    public static void main(String[] args) {
        String str = "apple,'banana,mango',\"grapes,orange\",kiwi";
        stringTokenizationWithQuotes(str);
    }

    public static void stringTokenizationWithQuotes(String inputString) {
        List<String> result = new ArrayList<>();
        int i = 0;
        int n = inputString.length();

        while (i < n) {
            if (inputString.charAt(i) == '\'') {
                int j = inputString.indexOf('\'', i + 1);
                if (j == -1) {
                    result.add(inputString.substring(i + 1));
                    break;
                }
                result.add(inputString.substring(i + 1, j));
                i = j + 2;
            } else if (inputString.charAt(i) == '"') {
                int j = inputString.indexOf('"', i + 1);
                if (j == -1) {
                    result.add(inputString.substring(i + 1));
                    break;
                }
                result.add(inputString.substring(i + 1, j));
                i = j + 2;
            } else {
                int j = inputString.indexOf(',', i);
                if (j == -1) {
                    result.add(inputString.substring(i));
                    break;
                }
                result.add(inputString.substring(i, j));
                i = j + 1;
            }
        }
        System.out.println("After separting by comma = " + result);
    }
}