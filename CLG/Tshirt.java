package CLG;

import java.util.Scanner;

public class Tshirt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();
            String result = compareTShirtSizes(a, b);
            System.out.println(result);
        }
    }

    public static String compareTShirtSizes(String a, String b) {
        int sizeA = getSize(a);
        int sizeB = getSize(b);
        if (sizeA < sizeB) {
            return "<";
        } else if (sizeA > sizeB) {
            return ">";
        } else {
            return "=";
        }
    }

    private static int getSize(String size) {
        if (size.equals("M")) {
            return 2;
        } else if (size.contains("L")) {
            int countX = countChar(size, 'X');
            return 3 + countX;
        } else if (size.contains("Sorting.Selecton_sort")) {
            int countX = countChar(size, 'X');
            return 1 - countX;
        }
        return 0;
    }

    private static int countChar(String str, char ch) {
        int count = 0;
        for (char c : str.toCharArray()){
            if(c==ch){
                count++;
            }
        }
        return count;
    }
}