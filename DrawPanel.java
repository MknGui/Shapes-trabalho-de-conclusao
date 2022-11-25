import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
    private MyLine[] lines;

    public DrawPanel() {
        setBackground(Color.WHITE);

        lines = new MyLine[5+App.gRandom(5)];

        for (int i = 0; i < lines.length; i++) {
            Color color = new Color(App.gRandom(256), App.gRandom(256), App.gRandom(256));

            lines[i]=new MyLine(App.gRandom(300), App.gRandom(300), App.gRandom(300), App.gRandom(300), color);
        }
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        for (MyLine line : lines) {
            line.draw(g);
        }
    }
}
