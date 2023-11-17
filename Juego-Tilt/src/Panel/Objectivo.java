package Panel;

import java.awt.Color;
import java.awt.Graphics;

public class Objectivo {
    
    public static int x = 325;
    public static int y = 325;
    private final int ancho = 30;
    private final int alto = 30;
    
    public void paint(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(x, y, alto, ancho);
        g.drawRect(x, y, alto, ancho);
    }
}
