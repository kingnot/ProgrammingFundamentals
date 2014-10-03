
package drawingpanel;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author MichaelWang
 */
public class DrawingPanel extends JPanel{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame myWindow = new JFrame("Playing with drawing tools");
        DrawingPanel myPanel = new DrawingPanel();
        
        myWindow.setSize(450, 450);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.add(myPanel);
        myWindow.setVisible(true);
    }
    
    /**
     * this method will override the paintComponent method of JPanel
     * and create a custom graphic on our panel
     */
    public void paintComponent (Graphics myPen) {
        super.paintComponent(myPen);
        int startX=0, startY=0, finishX=0, finishY=0;
        int space =10;
        //drawLine (startX, startY, finishX, finishY)
        startY = this.getHeight();
        while(startY >= 0 || finishX <= this.getWidth()) {            
            myPen.drawLine(startX, startY, finishX, finishY);
            startY-=space;
            finishX+=space;
        }//end of while loop
        
        startX = 0; startY = 0; finishX = this.getWidth(); finishY = 0;
        //drawLine (startX, startY, finishX, finishY)
        while(startX <= this.getWidth() || finishY <= this.getHeight()) {            
            myPen.drawLine(startX, startY, finishX, finishY);
            startX+=space;
            finishY+=space;
        }//end of while loop
        
        startX = 0; startY = this.getHeight(); finishX = this.getWidth(); finishY = this.getHeight();
        //drawLine (startX, startY, finishX, finishY)
        while(startX <= this.getWidth() || finishY >= 0) {            
            myPen.drawLine(startX, startY, finishX, finishY);
            startX+=space;
            finishY-=space;
        }//end of while loop
        
        startX = 0; startY = 0; finishX = 0; finishY = this.getHeight();
        //drawLine (startX, startY, finishX, finishY)
        while(startY <= this.getHeight() || finishX <= this.getWidth()) {            
            myPen.drawLine(startX, startY, finishX, finishY);
            startY+=space;
            finishX+=space;
        }//end of while loop
    }//end of main method
}//end of class
