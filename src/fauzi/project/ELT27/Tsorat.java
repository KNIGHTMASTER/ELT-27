/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fauzi.project.ELT27;

import com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel;
import docgen.permohonanSantunan;
import fauzi.project.jenisSurat.suratKeteranganKelakuanBaik;
import fauzi.project.jenisSurat.suratNikah;
import fauzi.project.jenisSurat.suratkettidakijazah;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author fauzi
 */
public class Tsorat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
try {
UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
} catch (Exception e) {

}

SplashScreen FormSplash = new SplashScreen();
//--End variable the contains forms
Thread ThFormSplash = new Thread(FormSplash);
//End the form container variable
ThFormSplash.start();
while(!FormSplash.isShowing()){
try{
//Display the FormSplash for 7 seconds
Thread.sleep(4000);
//Thread.sleep(100);
}catch(InterruptedException e){}
}

FormSplash.dispose();
        try{
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "terjadi kesalahan pada look and feel manager");
        }

mainFrame formlogin= new mainFrame();
formlogin.setVisible(true);        
    }
}