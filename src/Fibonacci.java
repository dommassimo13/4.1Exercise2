import javax.swing.*;

/**
 * Created by dominicmassimo on 3/30/17.
 */
public class Fibonacci {
    public static void main(String[]args){
        int n= Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number"));
        int [] fibonacci = new int[n];
        fibonacci[0]=0;
        fibonacci[1]=1;

        for(int i=2; i<fibonacci.length;i++){
            fibonacci[1]=fibonacci[i-1]+fibonacci[i-2];

        }
        for(int x:fibonacci){
            String output="";
            output+=String.valueOf(x)+",";

        }
        String output="";
        JOptionPane.showMessageDialog(null,output);
    }
}
