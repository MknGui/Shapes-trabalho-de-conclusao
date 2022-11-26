import java.util.Random;
import javax.swing.JFrame;

public class App {
    static private int h=500, w=h;
    
    static private Random genRandom = new Random();
    static int gRandom(int range){
        return (genRandom.nextInt(range));
    }
    static int gRandomMax(){
        return (genRandom.nextInt(h));
    }
    static int getH(){
        return h;
    }

    public static void main(String[] args) {
        
        DrawPanel panel = new DrawPanel();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setLocationRelativeTo(null);
        application.setSize(w, h);
        application.setVisible(true);
        System.out.println(DrawPanel.getShapelist());
    }
    
}