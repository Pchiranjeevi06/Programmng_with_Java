package ITERATION;

public class perfect_Number {
    public static void main(String[] args) {
        int n=140;
        int sum=0;
        for (int i = 1; i <= (int)Math.sqrt(n); i++) {
            if(n%i==0 ){
                sum+=i;
                if(n%i!=i && i!=1){
                    sum+=n/i;
                }
            }
        }
        System.out.println(sum);
    }
}
