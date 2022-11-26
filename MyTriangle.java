import java.awt.Color;
import java.awt.Graphics;

public class MyTriangle extends MyShape{
    private boolean fill;
    //Contructors
    public MyTriangle(int x1, int y1, int x2, int y2, Color myColor) {
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

        g.setColor(getMyColor());
        g.drawLine(getX1(), getY1(), getX2(), getY2());
        g.drawLine(getX1(), getY2(), getX2(), getY2());
        g.drawLine(getX1(), getY1(), getX1(), getY2());
    }

    public static MyTriangle GRandom (){
        Color color = new Color(App.gRandom(256), App.gRandom(256), App.gRandom(256));
        return new MyTriangle(App.gRandomMax(), App.gRandomMax(), App.gRandomMax(), App.gRandomMax(), color);
    }

    @Override //toString
    public String toString() {
        return "Triangulo: [ " +getX1() +", " +getY1() + " ], [ " + getX2()+ ", "+ getY2()+"], " +getColorToString()+", Preenchido: "+fill + "\n";
    }

}
