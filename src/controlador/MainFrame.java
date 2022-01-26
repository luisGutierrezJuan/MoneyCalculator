package controlador;

import GUI.ImageDisplay;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MainFrame extends JFrame {
    
    private ImageDisplay imageDisplay = new ImageDisplay();
    
    public MainFrame(){
        this.setTitle("Money Calculator");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(600, 300);
        this.setLocationRelativeTo(null);
        this.getContentPane().add(this.imageDisplay);
        this.setVisible(true);
    }    
}
