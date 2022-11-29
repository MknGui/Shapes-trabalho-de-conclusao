import java.awt.Color;
import java.awt.Graphics;

public class MyRectangle extends MyShape{
    private boolean fill;
    //Contructors
    public MyRectangle(int x1, int y1, int x2, int y2, Color myColor, boolean fill) {
        super(myColor);
        this.fill = fill;
        if(x1>x2){
            int temp; temp=x1; x1=x2; x2=temp; 
        }
        if(y1>y2){
            int temp; temp=y1; y1=y2; y2=temp; 
        }
        
        super.setX1(x1); super.setX2(x2-x1);;
        super.setY1(y1); super.setY2(y2-y1);
      
    }
    
    public MyRectangle(int x1, int y1, int x2, int y2, Color myColor) {
        super(myColor);
        if(x1>x2){
            int temp; temp=x1; x1=x2; x2=temp; 
        }
        if(y1>y2){
            int temp; temp=y1; y1=y2; y2=temp; 
        }
        
        super.setX1(x1); super.setX2(x2-x1);;
        super.setY1(y1); super.setY2(y2-y1);
        
        this.fill = false;
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
        if (fill==false)
            g.drawRect(getX1(), getY1(), getX2(), getY2());
        else {
            g.fillRect(getX1(), getY1(), getX2(), getY2());
        }
    }

    public static MyRectangle GRandom (){
        Color color = new Color(App.gRandom(256), App.gRandom(256), App.gRandom(256));
        return new MyRectangle(App.gRandomMax(), App.gRandomMax(), App.gRandomMax(), App.gRandomMax(), color);
    }
    public static MyRectangle GRandomFill (){
        Color color = new Color(App.gRandom(256), App.gRandom(256), App.gRandom(256));
        return new MyRectangle(App.gRandomMax(), App.gRandomMax(), App.gRandomMax(), App.gRandomMax(), color, true);
    }

    @Override //toString
    public String toString() {
        return "Retangulo: [ " +getX1() +", " +getY1() + " ], [ " + getX2()+ ", "+ getY2()+"], " +getColorToString()+", Preenchido: "+fill + "\n";
    }
}