import java.awt.Color;

public class MyOval extends MyShape {
    private boolean fill;

    public MyOval(int x1, int y1, int x2, int y2, Color myColor, boolean fill) {
        super(x1, y1, x2, y2, myColor);
        this.fill = fill;
    }
}
