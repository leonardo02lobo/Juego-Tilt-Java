package Panel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Personaje {

    public static boolean llegada = false;
    private int x = 40;
    private int y = 40;
    private final int ancho = 40;
    private final int alto = 40;
    private final int movimiento = 40;

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(x, y, alto, ancho);
        g.drawOval(x, y, alto, ancho);
    }

    public void MoverPieza(KeyEvent e) {
        int[][] Laberinto = laberinto.laberinto;
        if (e.getKeyCode() == 37) {//Izquierda
            if (Laberinto[y / 40][x / 40 - 1] != 1) {
                x = x - movimiento;
            }

        }
        if (e.getKeyCode() == 39) {//Derecha
            if (Laberinto[y / 40][x / 40 + 1] != 1) {
                x = x + movimiento;
            }
        }
        if (e.getKeyCode() == 38) {//Arriba
            if (Laberinto[y / 40 - 1][x / 40] != 1) {
                y = y - movimiento;
            }
        }
        if (e.getKeyCode() == 40) {//abajo
            if (Laberinto[y / 40 + 1][x / 40] != 1) {
                y = y + movimiento;

            }
        }
        if ((x == 320 && y == 320)) {
            JOptionPane.showMessageDialog(null, "has Ganado!!!");
            int reinciaJuego = JOptionPane.showConfirmDialog(null, "Haz perdido, "
                    + "¿Quieres reiniciar el Jugeo?", "Perdiste!!!", JOptionPane.YES_OPTION);
            if (reinciaJuego == 0) {
                reiniciaValores();
            } else if (reinciaJuego == 1) {
                System.exit(0);
            }
        }
    }

    public void reiniciaValores() {
        x = 40;
        y = 40;
        Tiempo.milisegundos = 0;
        Tiempo.minutos = 0;
        Tiempo.segundos = 0;
    }
}
