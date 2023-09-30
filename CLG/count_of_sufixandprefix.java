package CLG;
import java.util.Scanner;

public class count_of_sufixandprefix {
    public static int count(String k){
        int n = k.length();
        if(n < 2) {
            return 0;
        }

        int left = 0;
        int right = (n + 1)/2;
        while(right < n)
        {
            if(k.charAt(right) == k.charAt(left))
            {
                ++left;
                ++right;
            }
            else
            {
                right= right - left + 1;
                left = 0;
            }
        }
        return left;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String k =sc.nextLine();
        System.out.println(count(k));
    }
}
