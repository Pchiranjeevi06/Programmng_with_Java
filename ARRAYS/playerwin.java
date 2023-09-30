package ARRAYS;

import java.util.Scanner;

class playerwin
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner vn=new Scanner(System.in);
        int l=vn.nextInt();
        int a=0,b=0,c=0,win=-1;
        while(l!=0)
        {
            int x=vn.nextInt();
            int y=vn.nextInt();
            a+=x;
            b+=y;
            if(a-b>c)
            {
                win=1;
                c=a-b;
            }if(b-a>c)
        {
            win=2;
            c=b-a;
        }l--;
        }System.out.println(win+" "+c);
    }
}