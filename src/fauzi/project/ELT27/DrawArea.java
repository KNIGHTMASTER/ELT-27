/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fauzi.project.ELT27;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;

/**
 *
 * @author fauzi
 */
public class DrawArea extends JTextArea{
    private Image image;
    
    public DrawArea(){
        image = new ImageIcon(getClass().getResource("/image/backArea.jpg")).getImage();
/*        this.setText("Electronic Letter Application [ELT 27] adalah aplikasi administrasi
surat menyurat yang dibuat khusus untuk desa Toronan Kecamatan Pamekasan
Kabupaten Pamekasan.

Aplikasi ini dibuat oleh KKN UTM 2012 Kelompok 27, sebagai salah satu 
bentuk program kerja. 

Copyright © 2012 KKN UTM KELOMPOK 27
");*/
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D gd = (Graphics2D) g.create();
        gd.drawImage(image, 0, 0, null);
        gd.dispose();
        super.paintComponent(g);
    }
    
    
    
}
