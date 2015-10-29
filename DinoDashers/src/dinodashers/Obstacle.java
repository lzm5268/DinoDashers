/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinodashers;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.JButton;

/**
 *
 * @author elizabethkohler
 */
public class Obstacle extends JButton{
    
    public void moveObstacle(Graphics g)
    {
        
        
        int xCoor = 900;
        int yCoor = 900;
        Rectangle obstacle = new Rectangle(xCoor, yCoor, 15, 15);
     
        Point startPoint = new Point(xCoor, yCoor);
        obstacle.setLocation(startPoint);

        
        xCoor = xCoor - 1;
        startPoint.move(xCoor, yCoor);
        obstacle.setLocation(startPoint);
        
        
    }
    
}
