package practica4_diu;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;


public class Lienzo extends JPanel{
    List<Integer> x = new ArrayList<Integer>();
    List<Integer> y = new ArrayList<Integer>();; 
    public String color = "";
    
        
    public void setCoordenadas(List x, List y){
        Graphics g=getGraphics();
        this.x = x;
        this.y = y; 
        paintComponent(g);
    }
    
    public void setColores(String color){
        this.color = color;
    }
        
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        switch(color){
            case "Cian":
                g.setColor(Color.CYAN);
                break;
                
            case "Lila":
                g.setColor(Color.MAGENTA);
                break;
                
            case "Naranja":
                g.setColor(Color.ORANGE);
                break;
        } 
        
        if(x != null){
            for(int i=0; i<x.size();i++){
                g.fillOval(x.get(i),y.get(i),10,10);
            }
        }
        
        
        
    }
}
