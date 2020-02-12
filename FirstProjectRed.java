package firstprojectred;
import javax.swing.JOptionPane;
public class FirstProjectRed {
    public static void main(String[] args) {
        String primeiroNumero = 
                JOptionPane.showInputDialog("Coloque o primeiro inteiro ");
        String segundoNumero =
                JOptionPane.showInputDialog("Coloque o segundo inteiro ");
        
        int numero1 = Integer.parseInt (primeiroNumero);
        int numero2 = Integer.parseInt (segundoNumero);
        
        int soma = numero1 + numero2;
        
        JOptionPane.showMessageDialog (null, "A soma é igual a " + soma,
                "A soma dos inteiros", JOptionPane.PLAIN_MESSAGE );
    }
    
}