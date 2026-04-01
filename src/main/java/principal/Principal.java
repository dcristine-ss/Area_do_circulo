package principal;

import javax.swing.JOptionPane;
import model.Circulo;

public class Principal {

    public static void main(String[] args) {
//Declara e instância o objeto
        Circulo cir1 = new Circulo();
//Entrada
        cir1.setRaio(Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do círculo")));
//Saída
        JOptionPane.showMessageDialog(null, "A área do círculo é " + cir1.getArea());
    }
}
