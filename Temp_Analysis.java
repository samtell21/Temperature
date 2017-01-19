package temperature;

import javax.swing.JOptionPane;
/**
 *
 * @author Sam Tell
 */
public class Temp_Analysis
{
    /**
     * Enter a temperature in Celsius or Fahrenheit into a gui;
     * prints into console the temperature in Celsius and Fahrenheit.
     * @param args unused
     */
    public static void main(String[] args)
    {
        double n; char s, C = 'C', F = 'F', d = '°'; String ns, output, head; 
        Double cn, fn;  String[] b = {"Continue", "Exit"};
        Temperature temp = new Temperature();
        int cont = JOptionPane.YES_OPTION;
        head = "      Celsius\t   Fahrenheit\n------------------" +
               "-----------";
        System.out.println(head);
        while(cont == JOptionPane.YES_OPTION)
        {
            ns = JOptionPane.showInputDialog("Enter degrees");
                n = Double.parseDouble(ns);
            s = Custom_Comparison.gets();
            temp.Temperature(n, s);
            cn = temp.celsius();
            fn = temp.fahrenheit();
            output = String.format("%10.2f%1c %1c\t%10.2f%1c %1c",
                                    cn,     d, C,   fn,    d, F);
            System.out.println(output);
            
            cont = JOptionPane.showOptionDialog(null, head+"\n"+output, null,
                                                 JOptionPane.YES_NO_OPTION,
                                                 JOptionPane.QUESTION_MESSAGE,
                                                 null, b, b[0]);
        }
    }
}
