/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fauzi.project.swingResource;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

/**
 *
 * @author fauzi
 */
public class Flabel extends JLabel{
    private Font arabic;
    
    public Flabel(){
        this.setOpaque(false);
        this.setForeground(Color.BLACK);
        arabic=new Font("Traditional Arabic", Font.BOLD, 18);
        this.setFont(arabic);
    }
    
    
}
