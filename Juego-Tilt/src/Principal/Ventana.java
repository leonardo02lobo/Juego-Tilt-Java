package Principal;

import Panel.Juego;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class Ventana {
    
    public static void main(String[] args) {
        JFrame ventana =  new JFrame();
        Juego game = new Juego();
        ventana.add(game);
        ventana.setSize(410,600);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.setVisible(true);
        while(true){
            if(true){
                
            }
           game.repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
