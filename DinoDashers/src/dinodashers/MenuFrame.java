/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinodashers;

import javax.swing.JFrame;

/**
 *
 * @author elizabethkohler
 */
public class MenuFrame extends JFrame {
 
    MainPanel mainPanel;
    
    
    MenuFrame(){
       
        mainPanel = new MainPanel();
        this.add(mainPanel);
        setVisible(true);
        setSize(700,500);
        setLocationRelativeTo(null);

        
    }
}
