public class CreatingVariables {
    public static void main ( String[] args ) {
        int x, y, age;
        double seconds, e, checking;
        String firstName, lastName, title;

        x = 100;
        y = 400;
        age = 32;

        seconds = 4.71;
        e = 2.71828182845904523536;
        checking = 1.89;

        firstName = "Yash";
        lastName = "Shah";
        title = "Dr.";

        System.out.println( "The variable x contains : " + x );
        System.out.println( "The value " + y + " is stored in the variable y." );
        System.out.println( "The experiment took " + seconds + " seconds." );
        System.out.println( "A favorite irrational # is Euler's number: " + e );
        System.out.println( "Hopefully you have more than $" + checking + "!" );
        System.out.println( "My name is " + title + " " + firstName + " " + lastName );
    }
}