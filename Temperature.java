
package temperature;

/**
 *
 * @author Sam Tell
 */
public class Temperature 
{
    /**
     * Degrees.
     */
    private double degrees = 0;
    /**
     * Scale; C or F.
     */
    private char scale = 'C';
    /**
     * Constructor for degrees and scale.
     * @param d Degrees.
     * @param s Scale; C or F.
     */
    public void Temperature(double d, char s)
    {
        degrees = d;
        scale = s;
    }
    /**
     * Constructor for degrees.
     * @param d Degrees.
     */
    public void Temperature(double d)
    {
        degrees = d;
        scale = 'C';
    }
    /**
     * Constructor for scale.
     * @param s Scale; C or F.
     */
    public void Temperature(char s)
    {
        degrees = 0;
        scale = s;
    }
    /**
     * Default constructor; Degrees = 0, Scale = C.
     */
    public void Temperature()
    {
        degrees = 0;
        scale = 'C';
    }
    /**
     * Converts a temperature into Celsius.
     * @return Degrees in Celsius.
     */
    public double celsius()
    {
        if(scale == 'C')
            return degrees;
        else
        {
            scale = 'C';
            degrees = 5 * (degrees - 32) / 9;
            return degrees;
        }
    }
    /**
     * Converts a temperature into Fahrenheit.
     * @return Degrees in Fahrenheit.
     */
    public double fahrenheit()
    {
        if(scale == 'F')
            return degrees;
        else
        {
            scale = 'F';
            degrees = 9 * degrees / 5 + 32;
            return degrees;
        }
    }
    /**
     * Tests whether two temperatures are equal.
     * @param n1 The degrees of the first temperature.
     * @param s1 The scale of the first temperature.
     * @param n2 The degrees of the second temperature.
     * @param s2 The scale of the second temperature.
     * @return True or False.
     */
    public boolean eq(double n1, char s1, double n2, char s2)
    {
        double m1, m2;
        Temperature(n1, s1);
        m1 = celsius();
        Temperature(n2, s2);
        m2 = celsius();
        return (m1 == m2);
    }
    /**
     * Tests whether one Temperature is greater than the other.
     * @param n1 The degrees of the first temperature.
     * @param s1 The scale of the first temperature.
     * @param n2 The degrees of the second temperature.
     * @param s2 The scale of the second temperature.
     * @return True or False.
     */
    public boolean gr(double n1, char s1, double n2, char s2)
    {
        double m1, m2;
        Temperature(n1, s1);
        m1 = celsius();
        Temperature(n2, s2);
        m2 = celsius();
        return (m1 > m2);
    }
    /**
     * Tests whether one Temperature is less than the other.
     * @param n1 The degrees of the first temperature.
     * @param s1 The scale of the first temperature.
     * @param n2 The degrees of the second temperature.
     * @param s2 The scale of the second temperature.
     * @return True or False.
     */
    public boolean ls(double n1, char s1, double n2, char s2)
    {
        double m1, m2;
        Temperature(n1, s1);
        m1 = celsius();
        Temperature(n2, s2);
        m2 = celsius();
        return (m1 < m2);
    }
}