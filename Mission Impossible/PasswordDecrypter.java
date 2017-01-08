import javax.swing.*;
public class PasswordDecrypter
{
    public static void main(String[] args)
    {
        String phrase = JOptionPane.showInputDialog(null, "What is the encrypted phrase?");
        String password = "";

        int rows = (int)Math.sqrt (phrase.length());
        phrase = phrase.substring(0, rows * rows);

        //         int [][] table = new int table[size][size];

        for(int i = 0; i < rows; i++)

            for(int j = 0; j < phrase.length(); j+=rows)
            {
                char c = phrase.charAt(i+j);
                if (Character.isUpperCase(c))
                    password += "";
                password += c;

        }

        JOptionPane.showMessageDialog(null, "Password: " + password);
    }
}