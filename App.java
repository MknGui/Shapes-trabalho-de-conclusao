
import java.util.Random;
import javax.swing.JFrame;
import java.util.Scanner;

public class App extends DrawPanel {
    static private int h=500, w=h;
    static private int option=-1;
    
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
    
    public static void main(String[] args) throws InterruptedException{
        try (Scanner input = new Scanner(System.in)) {
            while (option!=0){
                System.out.println("Quais formas voce deseja: \n[1] Linha:\n[2] Oval:\n[3] Retangulo:\n[4] Triangulo:\n[5] Triangulo Isoceles:\n[6] Hexagono:\n[0] Pronto:");
                option=input.nextInt();
                switch(option){
                    case 0:
                        clear();
                        System.out.println("Executando: ");;
                        break;
                    case 1: 
                        clear();
                        System.out.println("Qntd. de linhas: ");
                        DrawPanel.setQntdL(input.nextInt());
                        clear();
                        break;
            
                    
                    case 2:
                        int i=3;
                        while (i!=1 && i!=0){
                            clear();
                            System.out.println("Preenchido: [0] Não [1] Sim ");
                            i=input.nextInt();
                        }
                        clear();
                        System.out.println("Qntd. de Oval: ");
                        if (i==0)
                            DrawPanel.setQntdC(input.nextInt());
                        else
                            DrawPanel.setQntdCF(input.nextInt());
                        clear();
                        break;
                    
                    
                    case 3:
                            i=3;
                            while (i!=1 && i!=0){
                                clear();
                                System.out.println("Preenchido: [0] Não [1] Sim ");
                                i=input.nextInt();
                            }
                        clear();
                        System.out.println("Qntd. de retangulos: ");
                        if (i==0)
                            DrawPanel.setQntdR(input.nextInt());
                        else
                            DrawPanel.setQntdRF(input.nextInt());
                        clear();
                        break;
                    
                    
                    case 4:
                        clear();
                        System.out.println("Qntd. de Triangulos: ");
                        DrawPanel.setQntdT(input.nextInt());
                        clear();
                        break;
                    
                    
                    case 5:
                        clear();
                        System.out.println("Qntd. de Triangulos Isosceles: ");
                        DrawPanel.setQntdTiSo(input.nextInt());
                        clear();
                        break;
                        
                    
                    case 6:
                        clear();
                        System.out.println("Qntd. de Hexagono: ");
                        DrawPanel.setQntdH(input.nextInt());
                        clear();
                        break;

                    
                    
                    default:
                        clear();
                        System.out.print("Invalido!!");
                        Thread.sleep(600);
                        System.out.print("!");
                        Thread.sleep(600);
                        System.out.print("!");
                        Thread.sleep(600);
                        clear();
                        break;
                        
            }
        }
    }
    
    
        DrawPanel panel = new DrawPanel();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setLocationRelativeTo(null);
        application.setSize(w, h);
        application.setVisible(true);
        System.out.println(DrawPanel.getShapelist());
    }
    
    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
}
}