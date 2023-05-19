package Task3PS3;
import java.util.Scanner;
public class SimpleLongNumber implements Number{
    long b;
    String c;
    public SimpleLongNumber (long b)
    {
        this.b = b;

    }
    @Override
    public long getB() {
        return b;
    }
    @Override
    public String getC() {
        return c;
    }
    @Override
    public Number add(Number n) {
        if(n.getC()==null) {
            long vv = getB() + n.getB();
            return new SimpleLongNumber(vv);
        }
        else
        {
            char[] m = new char[n.getC().length()];
            m=n.getC().toCharArray();
            long h=0;

            for (int l = 1;n.getC().length()-l>=0; l++)
            {
                h+=((m[n.getC().length()-l])-48)*Math.pow(10,l-1);
            }

            long vv = getB() + h;

            return new SimpleLongNumber(vv);
        }
    }
    @Override
    public Number sub(Number n) {
        long vv=getB()-n.getB();

        return new SimpleLongNumber(vv);
    }
    @Override
    public int compareTo(Number n) {
        if(getB()>n.getB())
        {
            return 1;
        }
        else if (getB()==n.getB())
        {
            return 0;
        }
        else
        {
            return -1;
        }
    }
    @Override
    public String toString(){return "("+b+")";}
}