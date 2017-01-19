
package temperature;

/**
 *
 * @author Sam Tell
 */
import javax.swing.JOptionPane;
public class Custom_Comparison
{
    /**
     * Compares two temperatures (Celsius or Fahrenheit) using methods defined
     * in Temperature class: this.gr(), this.ls(), and this.eq(); respectively they
     * are greater than, less than, and equal to.
     * @param args unused.
     */
    public static void main(String[] args)
    {
        Temperature temp = new Temperature();
        double n1, n2; char s1, s2; String comp; boolean b = true;
        String[] comps = {"Less Than", "Greater Than", "Equal To"};
        int cont = JOptionPane.YES_OPTION;
        while(cont == JOptionPane.YES_OPTION)
        {
            n1 = getn(" first ");     s1 = gets();
            comp = (String) JOptionPane.showInputDialog(null, "is _____ to",
                                            null, JOptionPane.QUESTION_MESSAGE,
                                            null, comps, comps[0]);
            n2 = getn(" second ");    s2 = gets();
            switch(comp)
            {
                case "Greater Than" :   b = temp.gr(n1, s1, n2, s2);    break;
                case "Less Than"    :   b = temp.ls(n1, s1, n2, s2);    break;
                case "Equal To"     :   b = temp.eq(n1, s1, n2, s2);    break;
            }
            JOptionPane.showMessageDialog(null,b?"Yes":"No");
            cont = JOptionPane.showConfirmDialog(null, "Continue", null,
                                               JOptionPane.YES_NO_OPTION);
        }
    }
    
    /**
     * Gets a number.
     * @param s String to use in message.
     * @return the number.
     */
    public static double getn(String s)
    {
        String ns = JOptionPane.showInputDialog("Enter the"+s+"number");
        double n = Double.parseDouble(ns);
        return n;
    }
    
    /**
     * Gets the scale; Celsius or Fahrenheit
     * @return 'C' or 'F'
     */
    public static char gets()
    {
        String[] scales = {"C","F"};
        String cs = (String) JOptionPane.showInputDialog(null, "Celsius or Fahrenheit",
                                                  "Scale", JOptionPane.QUESTION_MESSAGE,
                                                   null, scales, scales[0]);
        char c = cs.charAt(0);
        return c;
    }
}
