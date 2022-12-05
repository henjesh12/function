import java.util.Scanner;
class Moverloading
{
    void add(int a,int b)
    {
        int sum=a+b;
        System.out.println("method overload sum=" +sum);
    }

    void add(int a,int b,int c)
    {
        int sum=a+b+c;
        System.out.println("method overload sum=" +sum);
    }
    void add(float a,float b)    {
        float sum=a+b;
        System.out.println("method overload sum =" +sum);
    }
}
class Moverload {
    public static void main(String args[]) {
        Moverloading obj = new Moverloading();
        obj.add(10, 20);
        obj.add(10, 20, 30);
        obj.add(2.2f, 2.2f);
    }
}
