


import java.util.Random;

class firstLab {

    private static final int K = 50;

    public static void main(String[] args) {
        Random r = new Random();
        byte[] a = new byte[K];
        for(int i = 0; i < K; i++) {
            a[i] = (byte)r.nextInt();
            System.out.print("a[" + i + "] = " + a[i]);
            System.out.print(" ");
        }
        System.out.println();

        Byte[] aByte = new Byte[a.length];
        for(int i = 0; i < aByte.length; i++) {
            aByte[i] = new Byte(a[i]);
            System.out.print("aByte[" + i + "] = " + aByte[i]);
            System.out.print(" ");
        }
        System.out.println();

        Integer[] aInteger = new Integer[a.length];
        for(int i = 0; i < aInteger.length; i++) {
            aInteger[i] = Integer.valueOf(aByte[i]);
            System.out.print("aInteger[" + i + "] = " + aInteger[i]);
            System.out.print(" ");
        }
        System.out.println();

        int[] aInt = new int[a.length];
        for(int i = 0; i < aInt.length; i++) {
            aInt[i] = aInteger[i].intValue();
            System.out.print("aInt[" + i + "] = " + aInt[i]);
            System.out.print(" ");
        }
        System.out.println();

        String[] aString = new String[a.length];
        for(int i = 0; i < aString.length; i++) {
            aString[i] = aInteger[i].toString();
            System.out.print("aString[" + i + "] = " + aString[i]);
            System.out.print(" ");
        }
        System.out.println();

    }
}