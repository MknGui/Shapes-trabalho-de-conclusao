import java.awt.Color;
import java.awt.Graphics;

public class MyTriangleIso extends MyShape{
    private boolean fill;
    //Contructors
    public MyTriangleIso(int x1, int y1, int x2, int y2, Color myColor) {
        super(x1, y1, x2, y2, myColor);
    }

    //Setters Gettters
    public boolean getFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    //Methods
    public void draw(Graphics g){
        int p;
        if (getX1()>getX2()) {
            p =(getX1()-getX2())/2+getX2();
        } else {
            p =(getX2()-getX1())/2+getX1();
        }
        g.setColor(getMyColor());
        g.drawLine(getX1(), getY1(), getX2(), getY1());
        g.drawLine(getX1(), getY1(), p, getY2());
        g.drawLine(p, getY2(), getX2(), getY1());
    }

    public static MyTriangleIso GRandom (){
        Color color = new Color(App.gRandom(256), App.gRandom(256), App.gRandom(256));
        return new MyTriangleIso(App.gRandomMax(), App.gRandomMax(), App.gRandomMax(), App.gRandomMax(), color);
    }

    @Override //toString
    public String toString() {
        return "Triangulo Isoceles: [ " +getX1() +", " +getY1() + " ], [ " + getX2()+ ", "+ getY2()+"], " +getMyColor()+fill + "\n";
    }

}