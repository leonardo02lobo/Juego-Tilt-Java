package Panel;

import Objectos_Juego.Tablero;
import Objectos_Juego.Tiempo;
import Objectos_Juego.Personaje;
import Objectos_Juego.Objectivo;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

public class Juego extends JPanel {

    Tablero tablero = new Tablero();
    Personaje personaje = new Personaje();
    Objectivo objectivo = new Objectivo();
    Tiempo tiempo = new Tiempo();

    public Juego() {
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                personaje.MoverPieza(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        setFocusable(true);
    }

    @Override
    public void paint(Graphics g) {
        tablero.paint(g);
        personaje.paint(g);
        objectivo.paint(g);
        tiempo.paint(g);
        setOpaque(false);
    }

}
