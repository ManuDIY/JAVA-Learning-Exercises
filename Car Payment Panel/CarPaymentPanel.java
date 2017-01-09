import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;

public class CarPaymentPanel extends JPanel
{
    private JLabel cstlbl, numlbl, ratelbl, pmntlbl;
    private JTextField cost, num, rate;
    private JButton button;

    public CarPaymentPanel()
    {
        cstlbl = new JLabel ("Principal:");
        ratelbl = new JLabel ("Interest: ");
        numlbl = new JLabel ("Months: ");
        pmntlbl = new JLabel ("The Monthly Payment is");

        cost = new JTextField (5);
        rate = new JTextField (5);
        num = new JTextField (5); 
        button = new JButton("Calculate");
        button.addActionListener (new TempListener());

        add (cstlbl);
        add (cost);
        add (ratelbl);
        add (rate);
        add (numlbl);
        add (num);
        add (button);
        add (pmntlbl);

        setPreferredSize (new Dimension(400, 100));
        setBackground (Color.cyan);
    }

    private class TempListener implements ActionListener
    {

        public void actionPerformed (ActionEvent event)
        {
            int principle = Integer.parseInt(cost.getText());
            int payments = Integer.parseInt(num.getText());         
            double interest = Double.parseDouble(rate.getText())/100.0;
            interest = interest / 12;
            double val = Math.pow(1+interest, payments);
            double payment = principle*interest*val/(val-1);
            NumberFormat fmt = NumberFormat.getCurrencyInstance();
            pmntlbl.setText ("Payment is " + fmt.format(payment));
        }
    }

    public static void main (String[] args)
    {
        JFrame frame = new JFrame ("Car Payment Calculator");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

        CarPaymentPanel panel = new CarPaymentPanel();

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }   
}

