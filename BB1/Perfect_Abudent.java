package BB1;

class Perfect_Abudent
{
    public static void main (String[]args)
    {
        int n = 6;
        if(n == getDivisorsSum(n))
            System.out.println (n + " is a perfect number");
        else
            System.out.println (n + " is not a perfect number");
    }

    static int getDivisorsSum(int n) {
        int sum = 0;

        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (i == 1)
                    sum = sum + i;
                else if (i == n / i)
                    sum = sum + i;
                else
                    sum = sum + i + n / i;
            }
            if (sum > n) {
                return sum;
            }
        }
        return sum;
    }
}

/*public class Friendly_pair
{
    public static void main (String[]args)
    {

        int num1 = 30, num2 = 140;

        int sum1 = getDivisorsSum (num1);
        int sum2 = getDivisorsSum (num2);

        if (sum1 / num1 == sum2 / num2)
            System.out.println (num1 + " & " + num2 + " are friendly pairs");
        else
            System.out.println (num1 + " & " + num2 + " are not friendly pairs");
    }

    static int getDivisorsSum (int n)
    {

        int sum = 0;

        for(int i = 1; i < Math.sqrt(n); i++)
        {
            if (n % i == 0)
            {
                if(i == 1)
                    sum = sum + i;
                else if(i == n/i)
                    sum = sum + i;
                else
                    sum = sum + i + n/i;
            }
        }
        return sum;
    }
}*/

