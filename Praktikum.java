package praktikum;
import java.awt.*;
public class Praktikum extends Panel {  
    Praktikum(){
        setBackground(Color.WHITE);
    }
    public void paint(Graphics g){
        g.setColor(Color.cyan);
        g.fillRect(100,200, 400, 200);
        g.fillRect(500, 290, 140, 110);
        g.setColor(Color.red);
        g.fillRoundRect(200, 360, 100, 100,100,100);
        g.fillRoundRect(400, 360, 100, 100,100,100);
        g.setColor(Color.cyan);
        g.drawRoundRect(200, 360, 100, 100,100,100);
        g.drawRoundRect(400, 360, 100, 100,100,100);
        g.drawRoundRect(199, 359, 102, 102,102,102);
        g.drawRoundRect(399, 359, 102, 102,102,102);
        g.drawRoundRect(198, 358, 104, 104,104,104);
        g.drawRoundRect(398, 358, 104, 104,104,104);
        
        g.setColor(Color.black);
        Font f = new Font("Arial", Font.BOLD,30);
        FontMetrics fm = getFontMetrics(f);
        g.setFont(f);

        String S = "ini mobil dan nama saya muh widi";
       
        g.drawString(S, 110, 500);     
    }
    public static void main(String[] args) {
        Frame f = new Frame("Testing graphics panel");
        Praktikum gp = new Praktikum();
        f.add(gp);
        f.setSize(800,730);
        f.setVisible(true);
    }
}