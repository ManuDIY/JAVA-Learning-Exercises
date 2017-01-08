import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;

public class PizzaGUI extends JPanel{

    // define the instance variables
    private JRadioButton small;
    private JRadioButton medium;
    private JRadioButton large;

    private JRadioButton thin;
    private JRadioButton pan;
    private JRadioButton stuffed;

    private JCheckBox sausage;
    private JCheckBox peperoni;
    private JCheckBox bacon;
    private JCheckBox ham;

    private JCheckBox onions;
    private JCheckBox peppers;
    private JCheckBox mushrooms;
    private JCheckBox olives;

    private JLabel priceLabel;

    double pizzaPrice, itemPrice;

    /*****************************************************
     * Main Method
     ****************************************************/
    public static void main(String aargs[]){
        JFrame f = new JFrame("TJ's Pizzeria");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PizzaGUI menuPanel = new PizzaGUI();
        f.add(menuPanel);
        f.pack();
        f.setVisible(true);

    }  

    /*****************************************************
     * Constructor
     ****************************************************/  
    public PizzaGUI(){

        // initialize radio buttons for size      
        small = new JRadioButton("Small");
        medium = new JRadioButton("Medium");
        large = new JRadioButton("Large");

        ButtonGroup sizes = new ButtonGroup();
        sizes.add(small);
        sizes.add(medium);
        sizes.add(large);

        // Size Panel
        JPanel sizePanel= new JPanel();
        sizePanel.setLayout(new BoxLayout(sizePanel, BoxLayout.Y_AXIS));
        sizePanel.setBackground(Color.yellow);
        sizePanel.setBorder(BorderFactory.createLineBorder(Color.black));        
        sizePanel.add(new JLabel("Select Size"));
        sizePanel.add(small);
        sizePanel.add(medium);
        sizePanel.add(large);

        // Initialize radio buttons for crust
        thin = new JRadioButton("Thin");
        pan = new JRadioButton("Pan");
        stuffed = new JRadioButton("Stuffed");

        ButtonGroup crust = new ButtonGroup();
        crust.add(thin);
        crust.add(pan);
        crust.add(stuffed);

        // Crust Panel
        JPanel crustPanel= new JPanel();
        crustPanel.setLayout(new BoxLayout(crustPanel, BoxLayout.Y_AXIS));
        crustPanel.setBackground(Color.yellow);
        crustPanel.setBorder(BorderFactory.createLineBorder(Color.black));        
        crustPanel.add(new JLabel("Select Crust"));
        crustPanel.add(thin);
        crustPanel.add(pan);
        crustPanel.add(stuffed);

        // Meat Panel
        JPanel meatPanel= new JPanel();
        meatPanel.setLayout(new BoxLayout(meatPanel, BoxLayout.Y_AXIS));
        meatPanel.setBackground(Color.yellow);
        meatPanel.setBorder(BorderFactory.createLineBorder(Color.black));        

        meatPanel.add(new JLabel("Select Meat(s)"));
        sausage = new JCheckBox("Sausage");
        peperoni = new JCheckBox("Peperoni");
        bacon = new JCheckBox("Bacon");
        ham = new JCheckBox("Ham");
        meatPanel.add(sausage);
        meatPanel.add(peperoni);
        meatPanel.add(bacon);
        meatPanel.add(ham);

        // Veggie Panel
        JPanel veggiePanel= new JPanel();
        veggiePanel.setLayout(new BoxLayout(veggiePanel, BoxLayout.Y_AXIS));
        veggiePanel.setBackground(Color.yellow);
        veggiePanel.setBorder(BorderFactory.createLineBorder(Color.black));        
        veggiePanel.add(new JLabel("Select Veggie(s)"));

        onions = new JCheckBox("Onions");
        peppers = new JCheckBox("Peppers");
        mushrooms = new JCheckBox("Mushrooms");
        olives = new JCheckBox("Olives");
        veggiePanel.add(onions);
        veggiePanel.add(peppers);
        veggiePanel.add(mushrooms);
        veggiePanel.add(olives);

        // Price Panel
        JPanel pricePanel= new JPanel();
        pricePanel.setLayout(new BoxLayout(pricePanel, BoxLayout.Y_AXIS));
        JLabel priceTitle = new JLabel("Price");
        Font myFont = new Font("serif", Font.BOLD, 20);
        priceTitle.setFont(myFont);
        pricePanel.add(priceTitle);
        priceLabel = new JLabel("$00.00");
        priceLabel.setFont(myFont);

        pricePanel.add(priceLabel);

        // Image Panel
        ImageIcon icon = new ImageIcon("pizza.JPG");
        JLabel imageLabel =new JLabel(icon);

        // instantiate an ActionListener
        ButtonListener listener = new ButtonListener();
        small.addActionListener(listener);
        medium.addActionListener(listener);
        large.addActionListener(listener);
        thin.addActionListener(listener);
        pan.addActionListener(listener);
        stuffed.addActionListener(listener);

        CheckboxItemListener checkboxListener = new CheckboxItemListener();
        sausage.addItemListener(checkboxListener);
        peperoni.addItemListener(checkboxListener);
        bacon.addItemListener(checkboxListener);
        ham.addItemListener(checkboxListener);
        onions.addItemListener(checkboxListener);
        peppers.addItemListener(checkboxListener);
        mushrooms.addItemListener(checkboxListener);
        olives.addItemListener(checkboxListener);
        // Register each component with the new object

        // add the sub panels to the master panel
        setLayout(new FlowLayout());
        add(imageLabel);
        add(sizePanel);
        add(crustPanel);
        add(meatPanel);
        add(veggiePanel);
        add(pricePanel);

        pizzaPrice = 0.0;
        itemPrice = 0.0;
    }

    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            pizzaPrice = 0.0;

            if(small.isSelected())
            {
                pizzaPrice += 6.0;
            }

            if(medium.isSelected())
            {
                pizzaPrice += 8.0;
            }

            if(large.isSelected())
            {
                pizzaPrice += 10.0;
            }

            if(stuffed.isSelected())
            {
                pizzaPrice += 1.0;
            }

            priceLabel.setText("$" + (pizzaPrice + itemPrice));

        }
    }
    
    
    
    
    
    private class CheckboxItemListener implements ItemListener
    {
        public void itemStateChanged(ItemEvent e)
        {
            
            itemPrice = 0.0;

            if(sausage.isSelected())
            {
                itemPrice += 1.0;
            }

            if(peperoni.isSelected())
            {
                itemPrice += 1.0;
            }
            
            if(bacon.isSelected())
            {
                itemPrice += 1.0;
            }
            
            if(ham.isSelected())
            {
                itemPrice += 1.0;
            }

            if(peppers.isSelected())
            {
                itemPrice += 0.50;
            }

            if(onions.isSelected())
            {
                itemPrice += 0.50;
            }
            
            if(mushrooms.isSelected())
            {
                itemPrice += 0.50;
            }
            
            if(olives.isSelected())
            {
                itemPrice += 0.50;
            }
            
            priceLabel.setText("$" + (pizzaPrice + itemPrice));
            
        }
    }
}

