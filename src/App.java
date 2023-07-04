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
                String[] opciones = { "Pesos a Dolares", "Pesos a Euros", "Pesos a Yuanes", "Pesos a Reales" };
                String cambio = (String) JOptionPane.showInputDialog(null, "Elija una Opcion", "Conversor de Monedas",
                        JOptionPane.QUESTION_MESSAGE, null, opciones, options[0]);

                String input = JOptionPane.showInputDialog(null, "Ingrese cantidad de Pesos");
                double pesos = 0.00;

                try {
                    pesos = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no valido");
                    continue;
                }

                if (cambio.equals("Pesos a Dolares")) {
                    double dolares = pesos / 495;
                    JOptionPane.showMessageDialog(null,
                            pesos + " Pesos Argentinos son " + formateoDivisa.format(dolares) + " Dolares.");
                }

                if (cambio.equals("Pesos a Euros")) {
                    double dolares = pesos / 536;
                    JOptionPane.showMessageDialog(null,
                            pesos + " Pesos Argentinos son " + formateoDivisa.format(dolares) + " Euros.");
                }

                if (cambio.equals("Pesos a Yuanes")) {
                    double dolares = pesos / 35.91;
                    JOptionPane.showMessageDialog(null,
                            pesos + " Pesos Argentinos son " + formateoDivisa.format(dolares) + " Yuanes.");
                }

                if (cambio.equals("Pesos a Reales")) {
                    double dolares = pesos / 101.31;
                    JOptionPane.showMessageDialog(null,
                            pesos + " Pesos Argentinos son " + formateoDivisa.format(dolares) + " Reales.");
                }

                int confirma = JOptionPane.showConfirmDialog(null, "Desea continuar usando el programa?", "Confirmar",
                        JOptionPane.YES_NO_CANCEL_OPTION);

                if (confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION) {
                    continuarPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                }

            }
        }
    }
}
