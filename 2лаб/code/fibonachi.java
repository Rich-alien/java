

public final class fibonachi{

    final Integer[] f;

    public Integer[] get() {
        return f;
    }

    public fibonachi(Integer n) {
        f = new Integer[n];
        f[0] = 0;
        f[1] = 1;

        for(Integer i = 2; i < n; i++)
            f[i] = f[i-1] + f[i-2];
    }

    static void printlnArray(Integer[] a) {
        for(Integer i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof fibonachi) {
            fibonachi fg = (fibonachi)o;
            return fg.f.length == f.length;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        Integer h = 17;
        h = 37*h + f.length;
        return h;
    }

    @Override
    public String toString() {
        String s = "";
        if(f.length >= 1)
            s = String.valueOf(f[0]);
        for(Integer i = 1; i < f.length; i++) {
            s += " " + f[i];
        }
        return s;
    }

    public static void test() {
        fibonachi o1 = new fibonachi(5);
        fibonachi o2 = new fibonachi(5);
        fibonachi o3 = new fibonachi(10);

        System.out.println("o1 = " + o1);
        System.out.println("o2 = " + o2);
        System.out.println("o3 = " + o3);

        System.out.println("hash(o1) = " + o1.hashCode());
        System.out.println("hash(o2) = " + o2.hashCode());
        System.out.println("hash(o3) = " + o3.hashCode());

        System.out.println("o1.equals(o2) = " + o1.equals(o2));
        System.out.println("o1.equals(o3) = " + o1.equals(o3));
    }

    public static void main(String[] args) {
        fibonachi fc = new fibonachi(10);
        fibonachi fe = fc;
        printlnArray(fc.get());
    }
}
