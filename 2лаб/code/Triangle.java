

public class Triangle {

    public Integer[][] get() {
        return triangle;
    }

    final Integer [][] triangle;

    public Triangle(Integer n) {
        triangle = new Integer[n][];
        // Integer bufPrev, newVal;
        triangle[0] = new Integer[1];
        triangle[0][0] = 1;
        for(Integer level = 1; level < n; level++) {
            triangle[level] = new Integer[level + 1];
            // bufPrev = 1;
            triangle[level][0] = 1;
            for(Integer i = 1; i < level; i++) {
                triangle[level][i] = triangle[level-1][i-1] + triangle[level-1][i];
            }
            triangle[level][level] = 1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Triangle) {
            Triangle tg = (Triangle)o;
            return triangle.length == tg.triangle.length;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        Integer h = 17;
        h = 37*h + triangle.length;
        return h;
    }

    @Override
    public String toString() {
        String s = "";

        for(Integer row = 0; row < triangle.length; row++) {
            if(row > 0)
                s += "\n";
            for (Integer i = 0; i < triangle[row].length; i++) {
                if (i > 0)
                    s += " ";
                s += triangle[row][i];
            }
        }


        return s;
    }

    public static void test() {
        Triangle o1 = new Triangle(2);
        Triangle o2 = new Triangle(2);
        Triangle o3 = new Triangle(3);

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
        Integer N = 10;
        Triangle tg = new Triangle(N);
        Integer[][] triangle = tg.get();
        for(int level = 0; level < N; level++)
            printlnRow(triangle[level]);
    }

    static void printlnRow(Integer[] a) {
        for(int i = 0; i < a.length && a[i] != 0; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
