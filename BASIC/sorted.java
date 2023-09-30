package BASIC;

public class sorted {
    public static void main(String[] args) {
        int ar[]={1,2,4,23,13,3,42123,332};
        System.out.println(sor(ar,0,3));
    }

     static int sor(int[] ar,int in,int t) {
        if (in==ar.length){
            return -1;
        }
        if (ar[in]==t) return in;
        else return sor(ar,in+1,t);
    }
}
