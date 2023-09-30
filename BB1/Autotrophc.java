package BB1;

class Autotrophc{
    public static void main(String[] args) {
        int num=5;
        int sqt=num*num;
        int count=0;
        int temp=num;
        while(temp!=0)
        {
            temp=temp/10;
            count++;
        }
        if(sqt%Math.pow(10,count)==num)
            System.out.println("Automorphic Number");
        else
            System.out.println("No Automorphic Number");
    }
}
