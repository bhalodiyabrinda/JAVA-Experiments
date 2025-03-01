/*7.Implement  following built function of java.lang.Math class.- random(),min(),max(),sqrt(),pow(),abs(),round().
*/


public class Ex7 
{
    public static void main(String args[]) 
    {
        double randomValue = Math.random();
        System.out.println("Random Value: " + randomValue);

        int minmum = Math.min(20, 10);
        System.out.println("Minimum: " + minmum);

        int maximum = Math.max(20, 10);
        System.out.println("Maximum: " + maximum);

        double sqrtResult = Math.sqrt(25.0);
        System.out.println("Square Root: " + sqrtResult);

        double power = Math.pow(2.0, 3.0);
        System.out.println("Power: " + power);

        int abs = Math.abs(-15);
        System.out.println("Absolute Value: " + abs);

        long round = Math.round(4.7);
        System.out.println("Rounded Value: " + round);
    }
}
