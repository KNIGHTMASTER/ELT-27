/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fauzi.project.ELT27;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;

/**
 *
 * @author fauzi
 */
public class SplashScreen extends JWindow implements Runnable{

    @Override
    public void run() {
        JLabel SplashLabel = new JLabel(new ImageIcon(getClass().getResource("/image/splash.png")));
        SplashLabel.setToolTipText("Tampilan Images Splash Screen");
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();


        getContentPane().add(SplashLabel,BorderLayout.CENTER);
    //pane.add(SplashLabel,BorderLayout.CENTER);
    //ProgressBar pbar= new JProgressBar(0,15000);
    //pane.add(pbar);
        setSize(600,430);
        setLocation((screen.width - 728)/2,((screen.height-387)/2));
        show();
    }
    
}
