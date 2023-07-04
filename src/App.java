import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        Object[] options = { "Convertir Divisas", "Convertir Temperatura", "Salir" };
        int elige = JOptionPane.showOptionDialog(null, "Que quieres hacer?", "Concersor", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        if (elige == 2) {
            JOptionPane.showMessageDialog(null, "Programa cerrado");
            System.exit(0);
        }

        if (elige == 0) {
            DecimalFormat formateoDivisa = new DecimalFormat("#.##");
            boolean continuarPrograma = true;

            while (continuarPrograma) {
                String[] opciones = { "Pesos a Dolares", "Pesos a Euros", "Pesos a Yeanes", "Pesos a Reales" };
                String cambio = (String) JOptionPane.showInputDialog(null, "Elija una Opcion", "Conversor de Monedas",
                        JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

                String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad de Pesos");
                double pesos;

                try {
                    pesos = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no valido");
                }

            }
        }
    }
}
