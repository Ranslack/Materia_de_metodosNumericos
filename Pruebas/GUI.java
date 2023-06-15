package metnum.utilidades;

import javax.swing.*;
import java.awt.*;

/**
 * Utilidades visuales para elementos de java swing
 */
public class GUI {

    /**
     * Utilidades visuales para elementos de tipo JTextField
     */
    public class InputField {

        /**
         * Establece un color al elemento, el color indica su estatus
         * @param field elemnto al cual aplicarle el estatus
         * @param status color del estatus (rojo: no valido, verde: valido)
         */
        public static void setStatus(JTextField field, Color status) {
            field.setBackground(status);
        }

        /**
         * Establece el color verde al elemento, lo cual indica que es valido
         * @param field elemento al cual aplicarle el color
         */
        public static void setValidStatus(JTextField field) {
            field.setBackground(VALID);
        }

        /**
         * Establece el color rojo al elemento, lo cual indica que no es valido
         * @param field elemento al cual aplicarle el color
         */
        public static void setInvalidStatus(JTextField field) {
            field.setBackground(INVALID);
        }

        /**
         * Establece el color amarillo al elemento, lo cual indica una advertencia
         * @param field elemento al cual aplicarle el color
         */
        public static void setWarningStatus(JTextField field) {
            field.setBackground(WARNING);
        }
    }

    /**
     * Utilidades visuales de tipo Dialog
     */
    public static class PopUps {

        /**
         * Lanza message dialog que indica que alguno de los campos de entrada no es valido
         * @param parent padre del dialog
         */
        public static void showCampoInvalidoWarning(Component parent) {
            JOptionPane.showMessageDialog(parent, "Uno o mas campos no validos", "Advertencia",
                    JOptionPane.WARNING_MESSAGE);
        }

        /**
         * Lanza message dialog que indica que el problema no se puede resolver con los valores de entrada actuales
         * @param parent padre del dialog
         */
        public static void showSinSolucionWarning(Component parent) {
            JOptionPane.showMessageDialog(parent, "Sin solucion a la ecuacion con los datos de" +
                    "\sentrada actuales\nFavor de intentar con otros valores", "Sin solucion", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static final Color WARNING = new Color(224, 214, 37);
    public static final Color VALID = new Color(149,255,137);
    public static final Color INVALID = new Color(255,139,139);
}
