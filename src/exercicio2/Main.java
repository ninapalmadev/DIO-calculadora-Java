package exercicio2;

public class Main {
    public static void main(String[] args) {

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        //short s2 = 40000;

        //int i1 = -1000000000000; muito abaixo do menor valor negativo aceitável
        int i2 = 28500;

        long l1 = 100000000000000L;
        long l2 = 200400500055000L;

        //float f1 = 4.5; sem o f, interpreta como double
        float f2 = 10.86F;

        double d1 = 56.98;
        double d2 = 99.04D;

        char c1 = 'W';
        //char c2 = 'Tw'; somente 1 character
        char c3 = '\u0057'; // = W

        String st1= "Teste 1";
        String st2= "Teste 2";
        String st3= "9e8qw dijasdoih 2733672 ncsdkf";

        //String dt1 = "15/09/2022";

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);
    }
}
