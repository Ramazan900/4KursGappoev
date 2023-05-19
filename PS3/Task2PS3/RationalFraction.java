package Task2PS3;
import java.util.Scanner;

/**
 * @author Gappoev Ramazan и ChatGPT
 * 01-961
 * Problem Set 3 Task 1
 */

public class RationalFraction {
    public int x;
    public int y;
    public double x1;
    public double y1;
    static Scanner sc = new Scanner(System.in);
    public RationalFraction() {}
    //*конструктор для дроби, равной нулю;


    public RationalFraction(int x, int y) {
        if(y==0){ System.out.println("Знаменатель не может быть равен 0");
            System.exit(0);
        } //*Прервать код если знаменатель 0
        this.x = x;
        this.y = y;
    }
    //*конструктор дроби со значениями числителя и знаменателя
    public RationalFraction(double x1, double y1) {
        if(y1==0){ System.out.println("Знаменатель не может быть равен 0");
            System.exit(0);
        } //*Прервать код если знаменатель 0
        this.x1 = x1;
        this.y1 = y1;
    }


    //* Cокращение дроби
    public void reduce() //*сокращение дроби;
    {
        //*System.out.println("п0");
        int Proverka1 = 0;
        while(Proverka1!=1)
        {
            //*System.out.println("п221");
            if(x==2)
            {
                if(y%2==0)
                {
                    x/=2;
                    y/=2;
                }
                Proverka1=1;
            }
            else if(x==0||x==1)
            {
                Proverka1 = 1;

            }


            else {
                for (int i = 2; Math.abs(i)<Math.abs(x);i++)
                {
                    //*System.out.println("п41");
                    if (x%i==0)
                    {
                        //*System.out.println("п1");
                        if (y%i==0)
                        {
                            //*System.out.println("п2");
                            x/=i;
                            y/=i;
                            i=x+1;
                        }
                    }
                    if(i+1==x)
                    {
                        Proverka1=1;
                        System.out.println("Cократил");
                    }
                }
            }
        }
    }






    public RationalFraction add(RationalFraction v2) {
        return new RationalFraction(x* v2.y+ v2.x*y,y * v2.y);
    }
    //*сложение дроби с другой дробью, результат возвращается как новый объект (не забудьте сократить)
    public RationalFraction sub(RationalFraction v2) {
        return new RationalFraction(x* v2.y- v2.x*y,y * v2.y);
    }
    //*вычитание из дроби другой дроби, результат возвращается как новый объект (не забудьте сократить);
    public RationalFraction mult(RationalFraction v2) {
        return new RationalFraction(x* v2.x,y * v2.y);
    }
    //*умножение дроби на другую дробь, результат возвращается как новый объект (сократить)
    public RationalFraction div(RationalFraction v2) {
        return new RationalFraction(x* v2.y,y * v2.x);
    }
    //*деление дроби на другую дробь, результат возвращается как новый объект (сократить)

    public double value() {
        double r = x;
        double rr = y;
        return r/rr;
    }
    //*десятичное значение дроби;
    @Override
    public String toString() { //*строковое представление дроби (например, -2/3);
        if(Double.toString(x1)!=null){

            if (x1 == 0) {


                return "0";
            }
            if (x1 != y1) {
                if (x1 < 0) {
                    return "( - " + -x1 + "/" + y1 + ")";
                } else if (y1 < 0) {
                    return "( - " + x1 + "/" + -y1 + ")";
                } else
                    return "(" + x1 + "/" + y1 + ")";
            } else {
                return "1";
            }
        }
        else {
            if (x == 0) {


                return "0";
            }
            if (x != y) {
                if (x < 0) {
                    return "( - " + -x + "/" + y + ")";
                } else if (y < 0) {
                    return "( - " + x + "/" + -y + ")";
                } else
                    return "(" + x + "/" + y + ")";
            } else {
                return "1";
            }
        }}

    public static void main(String[] args) {
        RationalFraction v1 = new RationalFraction(10, 10);
        RationalFraction v2 = new RationalFraction(3, 10);
        RationalFraction v3 = new RationalFraction(0, 1);
        double m;
        v1.reduce();
        System.out.println(v1);
        System.out.println("Выполняется сумма");
        v3=v2.add(v1);v3.reduce();
        System.out.println(v3);
        System.out.println("Выполняется вычитание");
        v3=v2.sub(v1);
        v3.reduce();
        System.out.println(v3);
        System.out.println("Выполняется умножение");
        v3=v2.mult(v1);v3.reduce();
        System.out.println(v3);
        System.out.println("Выполняется деление");
        v3=v2.div(v1);v3.reduce();
        System.out.println(v3);
        System.out.println("десятичная дроб");
        m=v3.value();
        System.out.println(m);


    }
}