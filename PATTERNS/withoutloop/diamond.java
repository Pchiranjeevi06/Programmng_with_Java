package PATTERNS.withoutloop;

public class diamond {
    public static void main(String[] args) {
        for (int i = 0; i <5; i++) {
            int p=1;
            for (int j = 0; j <5-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <i; j++,p++) {
                System.out.print(p);
            }
            for (int j = 0; j <=i; j++) {
                System.out.print(p++);
            }
            System.out.println();

        }
    }
}
