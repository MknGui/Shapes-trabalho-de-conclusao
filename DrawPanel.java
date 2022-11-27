import java.awt.Color;
import java.util.ArrayList;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
    private static ArrayList<MyShape>shapeList = new ArrayList<MyShape>(1);
    public static ArrayList<MyShape> getShapelist(){ return shapeList;};

    
    //varíaveis pro scanner
    private static int qntdL,qntdC,qntdR,qntdT,qntdTiSo,qntdH;

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

        for (int i = 0; i < (qntdL); i++) {
            shapeList.add(MyLine.GRandom());
        } 
        for (int i = 0; i < (qntdC); i++) {
            shapeList.add(MyOval.GRandom());
        } 
        for (int i = 0; i < (qntdT); i++) {
            shapeList.add(MyRectangle.GRandom());
        } 
        for (int i = 0; i < (qntdT); i++) {
            shapeList.add(MyTriangle.GRandom());
        } 
        for (int i = 0; i < (qntdTiSo); i++) {
            shapeList.add(MyTriangleIso.GRandom());
        } 
        for (int i = 0; i < (qntdH); i++) {
            shapeList.add(MyHexagon.GRandom());
        } 
        
    }

    
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        for (MyShape shape : shapeList) {
            shape.draw(g);
        }

    }


    public static void setShapeList(ArrayList<MyShape> shapeList) {
        DrawPanel.shapeList = shapeList;
    }


    public static void setQntdL(int a) {
        qntdL = qntdL+a;
    }


    public static void setQntdC(int a) {
        DrawPanel.qntdC = qntdC+a;
    }


    public static void setQntdR(int a) {
        DrawPanel.qntdR = qntdR+a;
    }


    public static void setQntdT(int a) {
        DrawPanel.qntdT = qntdT+a;
    }


    public static void setQntdTiSo(int a) {
        DrawPanel.qntdTiSo = qntdTiSo+a;
    }


    public static void setQntdH(int a) {
        DrawPanel.qntdH = qntdH+a;
    }

}