import java.util.Random;

import javax.swing.JFrame;

public class App {
    static private Random genRandom = new Random();
    static int gRandom(int range){
        return (genRandom.nextInt(range));
    }

    //panel
    static private int w=300, h=300;
    public static void main(String[] args) {
        
        DrawPanel panel = new DrawPanel();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(w, h);
        application.setVisible(true);
    }
    
}