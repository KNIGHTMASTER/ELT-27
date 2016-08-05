/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fauzi.project.jenisSurat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
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
 * @author ITA
 */
public class suratNikah {
String kode="", nama1="", jk1="", alamat1="", umur1="", agama1="", nama2="", jk2="", alamat2="", umur2="", agama2="", kades="";
String tanggalNikah = "00-00-0000", tanggalbuat = "00-00-0000", sebab="", saksi1="", job1="",alamat3="",umur3="", agama3="", saksi2="", job2="", alamat4="", umur4="", agama4="";
    public suratNikah(String kode, String nama1, String jk1, String alamat1, String umur1, String agama1, String nama2, String jk2, String alamat2, String umur2, String agama2,
    String kades, String tanggalNikah, String tanggalbuat, String sebab, String saksi1, String job1, String alamat3, String umur3, String agama3, String saksi2, String job2, String alamat4, String umur4, String agama4){
    this.kode = kode;
    this.nama1 = nama1;
    this.jk1 = jk1;
    this.alamat1 = alamat1;
    this.umur1 = umur1;
    this.agama1 = agama1;
    this.nama2 = nama2;
    this.jk2 = jk2;
    this.alamat2 = alamat2;
    this.umur2 = umur2;
    this.agama2 = agama2;
    this.kades = kades;
    this.tanggalNikah = tanggalNikah;
    this.tanggalbuat = tanggalbuat;
    this.sebab = sebab;
    this.saksi1 = saksi1;
    this.job1 = job1;
    this.alamat3 = alamat3;
    this.umur3 = umur3;
    this.agama3 = agama3;
    this.saksi2 = saksi2;
    this.job2 = job2;
    this.alamat4 = alamat4;
    this.umur4 = umur4;
    this.agama4 = agama4;
    
    buat();
    }

    public void buat(){
        IDocument myDoc = new Document2004();

        //header
        myDoc.getHeader().addEle(Image.from_CLASSPATH("/image/header.PNG").setHeight("120").setWidth("500").create());
        myDoc.getHeader().addEle(Paragraph.with(" ").create());
        

        myDoc.addEle(Paragraph.withPieces(
                ParagraphPiece.with("\t\t\t").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("15").create(),
                ParagraphPiece.with("SURAT KETERANGAN PERNAH NIKAH").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("15").underline().create()
        ));
        myDoc.addEle(Paragraph.withPieces(
                ParagraphPiece.with("\t\t\t\t").withStyle().font(Font.TIMES_NEW_ROMAN).fontSize("15").create(),
                ParagraphPiece.with("Nomor : 474/"+kode+"/432.501/18/2012").withStyle().font(Font.TIMES_NEW_ROMAN).fontSize("15").create()
        ));

        myDoc.addEle(BreakLine.times(2));

        myDoc.addEle(Paragraph.withPieces(
                ParagraphPiece.with("\t").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").create(),
                ParagraphPiece.with("Yang bertanda tangan di bawah ini kami Kepala Desa Toronan Kecamatan Pamekasan Kabupaten Pamekasan menerangkan dengan sebenarnya bahwa :").withStyle().font(Font.TIMES_NEW_ROMAN).fontSize("12").create()
        ));


        /*
         * Sepanjang pengetahuan kami dan selama berada di daerah kami serta beralamat di atas, orang tersebut berkelakuan baik dan  belum pernah tersangkut perkara polisi dan surat keterangan ini diberikan kepada yang bersangkutan untuk surat pengantar pengajuan SKKB.
         */

        myDoc.addEle(Paragraph.with("1. \tNama\t\t:"+nama1+" \t\t\t\tUmur\t:"+umur1+"").create());
        myDoc.addEle(Paragraph.with("\tJenis Kelamin:"+jk1+" \t\t\t\tAgama\t:"+agama1+"").create());
        myDoc.addEle(Paragraph.with("\tAlamat\t:"+alamat1).create());
        myDoc.addEle(Paragraph.with("2. \tNama\t\t:"+nama2+" \t\t\t\tUmur\t:"+umur2+"").create());
        myDoc.addEle(Paragraph.with("\tJenis Kelamin:"+jk2+" \t\t\t\tAgama\t:"+agama2+"").create());
        myDoc.addEle(Paragraph.with("\tAlamat\t:"+alamat2).create());


        myDoc.addEle(BreakLine.times(1));

        myDoc.addEle(Paragraph.withPieces(
                ParagraphPiece.with("\t").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").create(),
                ParagraphPiece.with("Adalah pasangan Suami Istri atas dasar perkawinan yang sah yang dilaksanakan pada tanggal"+tanggalNikah+" dan perkawianan Suami Istri tersebut diatas saat ini masih/ berlangsung / terputus karena"+sebab+" serta perkawinan suami istri diatas tidak tercantum di nomor Regester Desa Toronan.").withStyle().font(Font.TIMES_NEW_ROMAN).fontSize("12").create()
        ));

        myDoc.addEle(Paragraph.withPieces(
                ParagraphPiece.with("\t").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").create(),
                ParagraphPiece.with("Bahwa surat keterangan ini diperkuat dengan kesaksian dari:").withStyle().font(Font.TIMES_NEW_ROMAN).fontSize("12").create()
        ));

        myDoc.addEle(Paragraph.with("SAKSI I \t\tNama\t\t:"+saksi1+" \t\t\tUmur\t\t:"+umur3+"").create());
        myDoc.addEle(Paragraph.with("\t\t\tPekerjaan\t:"+job1+" \t\t\tAgama\t\t:"+agama3+"").create());
        myDoc.addEle(Paragraph.with("\t\t\tAlamat\t:"+alamat3).create());
        myDoc.addEle(Paragraph.with("SAKSI II \t\tNama\t\t:"+saksi2+" \t\t\tUmur\t\t:"+umur4+"").create());
        myDoc.addEle(Paragraph.with("\t\t\tPekerjaan\t:"+job2+" \t\t\tAgama\t\t:"+agama4+"").create());
        myDoc.addEle(Paragraph.with("\t\t\tAlamat\t:"+alamat4).create());
        //content main

        myDoc.addEle(BreakLine.times(1));
        myDoc.addEle(Paragraph.withPieces(
                ParagraphPiece.with("\t").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").create(),
                ParagraphPiece.with("Demikian keterangan ini kami baut dengan sebenarnya dan dapat dipergunakan sebagaimana mestinya.").withStyle().font(Font.TIMES_NEW_ROMAN).fontSize("12").create()
        ));

        myDoc.addEle(BreakLine.times(2));
        myDoc.addEle(Paragraph.with("Pamekasan,   "+tanggalbuat).withStyle().align(Align.RIGHT).create());
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
