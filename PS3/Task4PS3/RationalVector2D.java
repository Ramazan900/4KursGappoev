package Task4PS3;

import Task2PS3.RationalFraction;

import java.util.Scanner;
/**
 * @author Gappoev Ramazan и ChatGPT
 * 01-961
 * Problem Set 3 Task 01
 */

public class RationalVector2D {

    public int x1; //*числитель
    public int x2; //*знаменатель
    public int y1; //*числитель
    public int y2; //*знаменатель

    public double x11; //*числитель
    public double x22; //*знаменатель
    public double y11; //*числитель
    public double y22; //*знаменатель

    public RationalFraction v1;
    public RationalFraction v2;

    static Scanner sc = new Scanner(System.in);
    public RationalVector2D() {}
    //*конструктор для нулевого вектора

    //* конструктор вектора с координатами
    public RationalVector2D(RationalFraction v1, RationalFraction v2)
    {
        this.v1=v1;
        this.v2=v2;
    }

    public void reduce(RationalFraction b1) //*сокращение дроби;
    {
        //*System.out.println("п0");
        int Proverka1 = 0;
        while(Proverka1!=1)
        {
            //*System.out.println("п221");
            if(b1.x==2)
            {
                if(b1.y%2==0)
                {
                    b1.x/=2;
                    b1.y/=2;
                }
                Proverka1=1;
            }
            else if(b1.x==0||b1.x==1)
            {
                Proverka1 = 1;

            }


            else {
                for (int i = 2; Math.abs(i)<Math.abs(b1.x);i++)
                {
                    //*System.out.println("п41");
                    if (b1.x%i==0)
                    {
                        //*System.out.println("п1");
                        if (b1.y%i==0)
                        {
                            //*System.out.println("п2");
                            b1.x/=i;
                            b1.y/=i;
                            i=b1.x+1;
                        }
                    }
                    if(i+1==b1.x)
                    {
                        Proverka1=1;

                    }
                }
            }
        }
    }















    RationalVector2D add(RationalVector2D a2)
    {
        RationalFraction v123;
        RationalFraction v1234;
        v123=v1.add(a2.v1);
        reduce(v123);
        v1234=v1.add(a2.v2);
        reduce(v1234);
        return new RationalVector2D(v123, v1234);
    }
    public double length() {



        return Math.sqrt(Math.pow((double)v1.x/((double)v1.y), 2) + Math.pow((double)v2.x/((double)v2.y), 2));
    }
    //*длина (модуль) вектора;
    RationalFraction scalarProduct(RationalVector2D a2)
    {
        System.out.println(((double)v1.x/ (double)v1.y)*((double)a2.v1.x/ (double)a2.v1.y));
        return new RationalFraction(((double)v1.x/ (double)v1.y)*((double)a2.v1.x/ (double)a2.v1.y), ((double)v2.x/ (double)v2.y)*((double)a2.v2.x/ (double)a2.v2.y));
    }




    @Override
    public String toString() {
        return "("+ v1 + ", " + v2 + ")";
    }
//*строковое представление вектора;

    //*строковое представление вектора;
    public static void main(String[] args) {
        RationalFraction a1 = new RationalFraction(2,3);
        RationalFraction a2 = new RationalFraction(5,6);
        RationalFraction a3 = new RationalFraction();
        RationalFraction a11 = new RationalFraction(6,8);
        RationalFraction a22 = new RationalFraction(3,5);
        RationalVector2D v1 = new RationalVector2D(a1,a2);
        RationalVector2D v2 = new RationalVector2D(a11,a22);
        //*RationalVector2D v3 = new RationalVector2D();
        System.out.println("Выполняется сумма");
        System.out.println(v1.add(v2));


        System.out.println("Выполняется длина?");
        System.out.println(v1.length());

        System.out.println("Cкаляр");
        a3 = v1.scalarProduct(v2);a3.reduce();
        System.out.println(a3);

    }
}