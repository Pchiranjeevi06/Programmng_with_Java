package normal;

class gcd2 {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max= nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return gcd(min,max);
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
        int[] num = new int[] {5,6,9,17};
        gcd2 s= new gcd2();
        int k=s.findGCD(num);
        System.out.println(k);
    }
}