import java.awt.Color;
import java.awt.Graphics;

public class MyLine extends MyShape {
   
    public void draw( Graphics g){
        g.setColor(getMyColor());
        g.drawLine(getX1(), getY1(), getX2(), getY2());
    }

    public MyLine(int x1, int y1, int x2, int y2, Color myColor) {
        super(x1, y1, x2, y2, myColor);
    }
}
