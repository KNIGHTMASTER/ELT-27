/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fauzi.project.jenisSurat;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import word.api.interfaces.IDocument;
import word.w2004.Document2004;
import word.w2004.elements.BreakLine;
import word.w2004.elements.Image;
import word.w2004.elements.Paragraph;
import word.w2004.elements.ParagraphPiece;
import word.w2004.style.Font;
import word.w2004.style.ParagraphStyle.Align;

/**
 *
 * @author dell
 */
public class suratketSIMdanKTP {
    String kode="", nama="", tempatLahir="", tanggalLahir="", jk="", agama="", job="", alamat="", kades="", tahun="";    
    String tanggal = "00-00-0000";
    
    public suratketSIMdanKTP(String kode, String nama, String tempatLahir, String tanggalLahir, String jk, String agama, String job, String alamat, String kades, String tahun, String tanggal){
        this.kode = kode;
        this.nama = nama;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.jk = jk;
        this.agama = agama;
        this.job = job;
        this.alamat = alamat;
        this.kades = kades;
        this.tahun = tahun;
        this.tanggal = tanggal;
        buat();
    }    
    
    public void buat(){
        IDocument myDoc = new Document2004();
        
        //header                        
        myDoc.getHeader().addEle(Image.from_CLASSPATH("/image/header.PNG").setHeight("120").setWidth("500").create());
        myDoc.getHeader().addEle(Paragraph.with(" ").create());        
        myDoc.addEle(BreakLine.times(1));        
        
        myDoc.addEle(Paragraph.withPieces(
                ParagraphPiece.with("\t\t\t\t").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("15").create(),
                ParagraphPiece.with("SURAT KETERANGAN").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("15").underline().create()
        ));
        myDoc.addEle(Paragraph.withPieces(
                ParagraphPiece.with("\t\t\t\t").withStyle().font(Font.TIMES_NEW_ROMAN).fontSize("15").create(),
                ParagraphPiece.with("Nomor : 474/"+kode+"/432.501.18/"+tahun+"").withStyle().font(Font.TIMES_NEW_ROMAN).fontSize("15").create()
        ));

        myDoc.addEle(BreakLine.times(2));
        
        myDoc.addEle(Paragraph.withPieces(
                ParagraphPiece.with("\t").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").create(),
                ParagraphPiece.with("Yang bertanda tangan di bawah ini Kepala Desa Toronan Kecamatan Pamekasan Kabupaten Pamekasan menerangkan bahwa :").withStyle().font(Font.TIMES_NEW_ROMAN).fontSize("12").create()
        ));       
                

        /*
         * Sepanjang pengetahuan kami dan selama berada di daerah kami serta beralamat di atas, orang tersebut berkelakuan baik dan  belum pernah tersangkut perkara polisi dan surat keterangan ini diberikan kepada yang bersangkutan untuk surat pengantar pengajuan SKKB.
         */
        myDoc.addEle(BreakLine.times(2));               
        myDoc.addEle(Paragraph.with("\t\tNama\t\t\t\t:"+nama).create());
        myDoc.addEle(Paragraph.with("\t\tTempat Tanggal Lahir\t:"+tempatLahir+", "+tanggalLahir).create());
        myDoc.addEle(Paragraph.with("\t\tJenis Kelamin\t\t\t:"+jk).create());
        myDoc.addEle(Paragraph.with("\t\tAgama\t\t\t\t:"+agama).create());
        myDoc.addEle(Paragraph.with("\t\tPekerjaan\t\t\t:"+job).create());
        myDoc.addEle(Paragraph.with("\t\tAlamat\t\t\t:"+alamat).create());
        
        myDoc.addEle(BreakLine.times(2));        
        
        myDoc.addEle(Paragraph.withPieces(
                ParagraphPiece.with("\t").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").create(),
                ParagraphPiece.with("Adalah benar - benar Penduduk Desa Toronan Kecamatan Pamekasan Kabupaten Pamekasan yang belum memenuhi syarat pengambilan Kartu Tanda Penduduk (K T P).").withStyle().font(Font.TIMES_NEW_ROMAN).fontSize("12").create()
        ));               
        //content main
        
        myDoc.addEle(BreakLine.times(1));
        myDoc.addEle(Paragraph.withPieces(
                ParagraphPiece.with("\t").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").create(),
                ParagraphPiece.with("Demikian surat keterangan ini dibuat dengan sebenarnya dan dapat dipergunakan untuk mengambil Surat Ijin Mengemudi (SIM) C.").withStyle().font(Font.TIMES_NEW_ROMAN).fontSize("12").create()
        ));               
        
        myDoc.addEle(BreakLine.times(2));        
        myDoc.addEle(Paragraph.with("Pamekasan,   "+tanggal).withStyle().align(Align.RIGHT).create());
        myDoc.addEle(BreakLine.times(1));
        myDoc.addEle(Paragraph.with("KEPALA DESA TORONAN").withStyle().align(Align.RIGHT).create());
        myDoc.addEle(BreakLine.times(3));
        
        myDoc.addEle(Paragraph.withPieces(
                ParagraphPiece.with("\t\t\t\t\t\t\t\t\t\t").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").create(),
                ParagraphPiece.with(kades).withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").underline().create()
        ));               
        //myDoc.getFooter().addEle(Paragraph.with("Footer Check").create());
                
        JFileChooser buka = new JFileChooser();
        int option = buka.showSaveDialog(buka);
        if(option == JFileChooser.APPROVE_OPTION){
            String path = buka.getSelectedFile().getPath();
            File fileObj = new File(path);
            PrintWriter writer = null;
            try{
                writer = new PrintWriter(fileObj);
                //BufferedWriter bw = new BufferedWriter(new FileWriter(buka.getSelectedFile().getPath()));
                String myWord = myDoc.getContent();
                writer.println(myWord);
                writer.close();                                   
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error membuat surat karena "+e);
            }
        }                                        
        JOptionPane.showMessageDialog(null, "Surat Berhasil Dibuat");
    }
}
