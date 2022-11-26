import java.awt.Color;
import java.awt.Graphics;

public class MyLine extends MyShape{
    
    public MyLine(int x1, int y1, int x2, int y2, Color myColor) {
        super(x1, y1, x2, y2, myColor);
    }

    public void draw(Graphics g){

        g.setColor(getMyColor());
        g.drawLine(getX1(), getY1(), getX2(), getY2());
    }

    public static MyLine GRandom (){
        Color color = new Color(App.gRandom(256), App.gRandom(256), App.gRandom(256));
        return new MyLine(App.gRandomMax(), App.gRandomMax(), App.gRandomMax(), App.gRandomMax(), color);
    }

    @Override //toString
    public String toString() {
        return "Linha: [ " +getX1() +", " +getY1() + " ], [ " + getX2()+ ", "+ getY2()+"], " +getMyColor() + "\n";
    }

}