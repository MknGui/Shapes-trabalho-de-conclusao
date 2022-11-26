import java.awt.Color;
import java.util.ArrayList;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
    private static ArrayList<MyShape>shapeList = new ArrayList<MyShape>(1);
    public static ArrayList<MyShape> getShapelist(){ return shapeList;};

    public DrawPanel() {
        setBackground(Color.WHITE);

        /*
        int grid = 50;
        int x=0;
        for (int i=0; i<App.getH()/grid; i++){
            x=x+grid;
            shapeList.add(new MyLine(x, 0, x, App.getH(), Color.BLACK));
            shapeList.add(new MyLine(0, x, App.getH(), x, Color.BLACK));
        } */

        for (int i = 0; i < (5+App.gRandom(5)); i++) {
            shapeList.add(MyLine.GRandom());
        } 

        for (int i = 0; i < (5+App.gRandom(5)); i++) {
            shapeList.add(MyOval.GRandom());
        } 

        for (int i = 0; i < (5+App.gRandom(5)); i++) {
            shapeList.add(MyRectangle.GRandom());
        }
        for (int i = 0; i < (5+App.gRandom(5)); i++) {
            shapeList.add(MyTriangle.GRandom());
        }

        for (int i = 0; i < (5+App.gRandom(5)); i++) {
            shapeList.add(MyTriangleIso.GRandom());
        }

        for (int i = 0; i < (5+App.gRandom(5)); i++) {
            shapeList.add(MyHexagon.GRandom());
        }
    }

    
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        for (MyShape shape : shapeList) {
            shape.draw(g);
        }

    }
}