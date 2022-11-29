import java.awt.Color;
import java.awt.Graphics;

public class MyOval extends MyShape {
    private boolean fill = true;

    public boolean getFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public MyOval(int x1, int y1, int x2, int y2, Color myColor) {
        super(myColor);
        this.fill = false;
        if(x1>x2){
            int temp; temp=x1; x1=x2; x2=temp; 
        }
        if(y1>y2){
            int temp; temp=y1; y1=y2; y2=temp; 
        }
        
        super.setX1(x1); super.setX2(x2-x1);;
        super.setY1(y1); super.setY2(y2-y1);
        
    }
    public MyOval(int x1, int y1, int x2, int y2, Color myColor, boolean fill) {
        super(myColor);
        if(x1>x2){
            int temp; temp=x1; x1=x2; x2=temp; 
        }
        if(y1>y2){
            int temp; temp=y1; y1=y2; y2=temp; 
        }
        
        super.setX1(x1); super.setX2(x2-x1);;
        super.setY1(y1); super.setY2(y2-y1);
        
        this.fill = fill;
    }

    public void draw(Graphics g){
        g.setColor(getMyColor());
        if (fill==false){
            g.drawOval(getX1(), getY1(), getX2(), getY2());
        } else { 
            g.fillOval(getX1(), getY1(), getX2(), getX1());
        }
    }

    public static MyOval GRandom (){
        Color color = new Color(App.gRandom(256), App.gRandom(256), App.gRandom(256));
        return new MyOval(App.gRandomMax(), App.gRandomMax(), App.gRandomMax(), App.gRandomMax(), color);
    }
    public static MyOval GRandomFill (){
        Color color = new Color(App.gRandom(256), App.gRandom(256), App.gRandom(256));
        return new MyOval(App.gRandomMax(), App.gRandomMax(), App.gRandomMax(), App.gRandomMax(), color, true);
    }

    @Override //toString
    public String toString() {
        return "Oval: [ " +getX1() +", " +getY1() + " ], [ " + getX2()+ ", "+ getY2()+"], " +getColorToString()+", Preenchido: "+fill+ "\n";
    }
}