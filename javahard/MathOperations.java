public class MathOperations {
    public static void main ( String[] args ) {
        int a, b, c, d, e, f, g;
        double x, y, z, v, w;
        String one, two, both;

        a = 10;
        b = 27;
        System.out.println( "a = " + a + ", b = " + b );

        c = a + b;
        System.out.println( "a+b = " + c );
        d = a - b;
        System.out.println( "a-b = " + d );
        e = a+b*3;
        System.out.println( "a+b*3 = " + e );
        f = b / 2;
        System.out.println( "b/2 = " + f );
        g = b % 10;
        System.out.println( "b%10 = " + g );

        x = 1.1;
        v=2.0;
        System.out.println( "\nx = " + x );
        y = x*x;
        System.out.println( "x*x = " + y );
        z = b / 2;
        System.out.println( "b/2 = " + z );
        w = b / v;
        System.out.println( "v = " + v );
        System.out.println( "b/" + v + " = " + w );
        System.out.println();

        one = "dog";
        two = "house";
        both = one + two;
        System.out.println( both );
    }
}