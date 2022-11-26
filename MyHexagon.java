import java.awt.Color;
import java.awt.Graphics;

public class MyHexagon extends MyShape{
    private boolean fill;
    //Contructors
    public MyHexagon(int x1, int y1, int x2, int y2, Color myColor) {
        super( myColor);
        if(x1>x2){int temp=x1; x1=x2; x2=temp;}
        if(y1>y2){int temp=y1; y1=y2; y2=temp;}
        super.setX1(x1); super.setX2(x2);
        super.setY1(y1); super.setY2(y2);

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
        int px, py1, py2;
    
        px =(getX2()-getX1())/2+getX1();
        
        py1 =(getY2()-getY1())/4+getY1();
        py2 =(getY2()-getY1())/4*3+getY1();
        
        
        g.drawLine(px, getY1(), getX2(), py1);
        g.drawLine(getX2(), py2, getX2(), py1);
        g.drawLine(px, getY2(), getX2(), py2);
        g.drawLine(px, getY2(), getX1(), py2);
        g.drawLine(getX1(), py2, getX1(), py1);
        g.drawLine(px, getY1(), getX1(), py1);
        
        
    }

    public static MyHexagon GRandom (){
        Color color = new Color(App.gRandom(256), App.gRandom(256), App.gRandom(256));
        return new MyHexagon(App.gRandomMax(), App.gRandomMax(), App.gRandomMax(), App.gRandomMax(), color);
    }

    @Override //toString
    public String toString() {
        return "Triangulo Isoceles: [ " +getX1() +", " +getY1() + " ], [ " + getX2()+ ", "+ getY2()+"], " +getColorToString()+", Preenchido: "+fill + "\n";
    }

}