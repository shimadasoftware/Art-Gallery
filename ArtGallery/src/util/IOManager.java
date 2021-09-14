package util;

import javax.swing.JOptionPane;

/**
 *
 * @author Juana
 */
public class IOManager {

    public static void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public static int getInt(String message) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, message, JOptionPane.DEFAULT_OPTION));
    }

    public static String getString(String message) {
        return JOptionPane.showInputDialog(null, message);
    }

    public static float getFloat(String message) {
        return new Float(JOptionPane.showInputDialog(null, message));
    }
    
    public static int showCustomMenu(String menu, String tittle) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, menu, tittle, JOptionPane.QUESTION_MESSAGE));
    }

    public static Object getObjectFromVector(String tittle, String message, Object[] vector) {
        return JOptionPane.showInputDialog(null, message, tittle, JOptionPane.QUESTION_MESSAGE, null, vector, null);
    }
}
