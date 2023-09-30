package normal;

class sqrt {
    public static int mySqrt(int x) {
        long r = x;
        while (r*r > x)
            r = (r + x/r) / 2;
        return (int) r;
    }
    public static int mySqrt1(int x){
        int l=0,r=x,res=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(mid==res){
                return mid;
            }
            if(mid*mid>x){
                r=mid-1;
            } else if (mid*mid<x) {
                l = mid + 1;
            }

        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt1(18));
    }
}
