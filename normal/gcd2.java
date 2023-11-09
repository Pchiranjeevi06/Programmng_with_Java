package normal;

class gcd2 {
    public int findGCD(int[] nums) {
        int gcd = nums[0];
        int lcm = nums[0];
        for(int i=1;i<nums.length;i++){
           gcd= gcd(gcd,nums[i]);
        }
        return gcd;
    }
    public static int gcd(int a,int b){
//        if(b==0){
//            return profit;
//        }
//        return gcd(b,profit%b);
        while(b!=0){
            int t= b;
            b=a%b;
            a=t;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] num = new int[] {8,12,20};
        gcd2 s= new gcd2();
        int k=s.findGCD(num);
        System.out.println(k);
    }
}