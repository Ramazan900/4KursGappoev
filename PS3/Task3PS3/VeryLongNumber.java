package Task3PS3;
public class VeryLongNumber implements Number{
    String c;
    public VeryLongNumber(String c)
    {

        this.c=c;

    }
    @Override
    public String getC() {
        return c;
    }

    @Override
    public Number add(Number n) {
        char[] m1 = new char[getC().length()];
        char[] m = new char[n.getC().length()];
        m=n.getC().toCharArray();
        long h=0;
        for (int l = 1;n.getC().length()-l>=0; l++)
        {
            h+=((m[n.getC().length()-l])-48)*Math.pow(10,l-1);
        }
        m1=getC().toCharArray();
        long h1=0;
        for (int l = 1;getC().length()-l>=0; l++)
        {
            h1+=((m1[getC().length()-l])-48)*Math.pow(10,l-1);
        }

        long vv = h1 + h;
        String c1 = Long.toString(vv);
        return new VeryLongNumber(c1);

    }
    @Override
    public Number sub(Number n) {
        char[] m1 = new char[getC().length()];
        char[] m = new char[n.getC().length()];
        m=n.getC().toCharArray();
        long h=0;
        for (int l = 1;n.getC().length()-l>=0; l++)
        {
            h+=((m[n.getC().length()-l])-48)*Math.pow(10,l-1);
        }
        m1=getC().toCharArray();
        long h1=0;
        for (int l = 1;getC().length()-l>=0; l++)
        {
            h1+=((m1[getC().length()-l])-48)*Math.pow(10,l-1);
        }

        long vv = h1 - h;
        String c1 = Long.toString(vv);
        return new VeryLongNumber(c1);
    }
    @Override
    public int compareTo(Number n) {
        char[] m1 = new char[getC().length()];
        char[] m = new char[n.getC().length()];
        m=n.getC().toCharArray();
        long h=0;
        for (int l = 1;n.getC().length()-l>=0; l++)
        {
            h+=((m[n.getC().length()-l])-48)*Math.pow(10,l-1);
        }
        m1=getC().toCharArray();
        long h1=0;
        for (int l = 1;getC().length()-l>=0; l++)
        {
            h1+=((m1[getC().length()-l])-48)*Math.pow(10,l-1);
        }
        if(h1>h)
        {
            return 1;
        }
        else if (h1==h)
        {
            return 0;
        }
        else
        {
            return -1;
        }
    }
    @Override
    public long getB() {
        return 0;
    }
    public String toString(){return "(" + c + ")";}
}

