    import javax.swing.*;  
    import java.awt.*;  
      
    public class Teste extends JFrame {  
      
     public Teste() {  
     setSize(1000, 1000); //tamanho da janela  
     getContentPane().setLayout(null); // Define layout manager como sendo nulo  
     }  
      
     public void paint(Graphics g) {  
     g.drawLine(20, 30, 700, 800);  
     }  
      
     public static void main(String arguments[]) {  
     Teste teste = new Teste();  
     teste.setVisible(true); // torna a janela visivel  
     }  
    }  