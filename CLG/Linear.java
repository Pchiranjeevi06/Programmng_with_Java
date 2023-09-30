package CLG;

public class Linear {
    String a;
    int b;
    Linear(String a,int b){
        this.a=a;
        this.b=b;
    }
    void print(){
        System.out.println(a+"--->"+b);
    }
    public static void main(String[] args)   {
        Linear s=new Linear("chiru",99);
        s.print();
    }

}
