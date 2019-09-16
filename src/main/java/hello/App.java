package hello;

/**
 * Hello world!
 *
 */
public class App 
{

    public static boolean checkTwoAndThree(int num) {
        return (num%2==0) && (num%3 == 0);
    }

    public static boolean checkTwoOrThree(int num) {
        return (num%2==0) || (num%3 == 0);
    }

    public static boolean checkTwoThree(int num) {
        return ((num%2==0) && (num%3==1)) || ((num%2==0) && (num%3 == 0));
    }

    public static void main( String[] args )
    {
        
        System.out.println( "Hello World!" );
    }
}
