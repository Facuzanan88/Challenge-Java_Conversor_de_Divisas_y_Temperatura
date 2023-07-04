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
    }
}
