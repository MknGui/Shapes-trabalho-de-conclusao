import java.awt.Color;
import java.awt.Graphics;
public abstract class MyShape {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private Color myColor;
    
    

    public MyShape(int x1, int y1, int x2, int y2, Color myColor) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.myColor = myColor;
    }
    public MyShape(Color myColor) {
        this.myColor = myColor;
    }
    //setter and getters
    public int getX1() {
        return x1;
    }
    public void setX1(int x1) {
        this.x1 = x1;
    }
    public int getY1() {
        return y1;
    }
    public void setY1(int y1) {
        this.y1 = y1;
    }
    public int getX2() {
        return x2;
    }
    public void setX2(int x2) {
        this.x2 = x2;
    }
    public int getY2() {
        return y2;
    }
    public void setY2(int y2) {
        this.y2 = y2;
    }
    public Color getMyColor() {
        return myColor;
    }
    public void setMyColor(Color myColor) {
        this.myColor = myColor;
    }
    //methods
    public String getColorToString(){
        return "Color[ R: " +myColor.getRed() + ", G: " + myColor.getGreen()+", B:" + myColor.getBlue()+ " ]";
    }
    //abstract methods 
    abstract public void draw(Graphics g);


}