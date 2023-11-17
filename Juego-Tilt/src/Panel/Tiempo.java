package Panel;

import java.awt.Font;
import java.awt.Graphics;

public class Tiempo {
    
    public static int milisegundos;
    public static int segundos;
    public static int minutos;

    public void paint(Graphics g) {
        g.setFont(new Font("Calibri", 0, 20));
        g.drawString(Integer.toString(minutos) + ":" + Integer.toString(segundos), 40, 450);
        milisegundos++;
        if (milisegundos == 60) {
            segundos++;
            milisegundos = 0;
        }
        if(segundos == 60){
            minutos++;
            segundos = 0;
        }
    }
}
