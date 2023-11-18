package Objectos_Juego;

import Panel.laberinto;
import java.awt.Color;
import java.awt.Graphics;

public class Tablero {

    private int fila = 0;
    private int columna = 0;
    private final int anchoBloque = 40;
    private final int largoBloque = 40;

    public void paint(Graphics g) {
        int[][] tablero = laberinto.laberinto;

        for (fila = 0; fila < tablero.length; fila++) {
            for (columna = 0; columna < tablero[fila].length; columna++) {
                if (tablero[fila][columna] == 1) {
                    g.setColor(Color.black);
                    g.fillRect(columna * 40, fila * 40, anchoBloque, largoBloque);
                    g.setColor(Color.white);
                    g.drawRect(columna * 40, fila * 40, anchoBloque, largoBloque);         
                }
            }
        }
    }
}
