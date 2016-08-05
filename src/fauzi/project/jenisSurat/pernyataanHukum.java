/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package docgen;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
public class pernyataanHukum {
String nama1="", jbt1="", nama2="", jbt2="", alamat="", rt="", rw="", dusun="", desa="", kec="", waris="", kades="", tanggal="";
    public pernyataanHukum(){
    buat();
    }
    public void buat(){
        IDocument myDoc = new Document2004();     
        
        myDoc.addEle(Paragraph.withPieces(
                ParagraphPiece.with("\t\t").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("13").create(),
                ParagraphPiece.with("SURAT PERNYATAAN DITUNTUT SECARA HUKUM").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("15").underline().create()
        ));
        
        myDoc.addEle(BreakLine.times(2));
        
        myDoc.addEle(Paragraph.withPieces(
                ParagraphPiece.with("\t").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").create(),
                ParagraphPiece.with("Yang bertanda tangan di bawah ini :").withStyle().font(Font.TIMES_NEW_ROMAN).fontSize("12").create()
        ));       
                
        
        myDoc.addEle(BreakLine.times(1));               
        myDoc.addEle(Paragraph.with("1. \tNama\t\t:"+nama1).create());
        myDoc.addEle(Paragraph.with("\tJabatan\t:"+jbt1).create());
                
        myDoc.addEle(BreakLine.times(1));        
        myDoc.addEle(Paragraph.with("2. \tNama\t\t:"+nama2).create());
        myDoc.addEle(Paragraph.with("\tJabatan\t:"+jbt2).create());
        myDoc.addEle(Paragraph.with("\tAlamat\t: RT.."+rt+"/RW..."+rw+" Dusun..."+dusun+" Desa/Kelurahan..."+desa+" Kecamatan..."+kec+" \t\t\t\t\t\tKabupaten Pamekasan").create());
                   
              
        myDoc.addEle(BreakLine.times(1));
        myDoc.addEle(Paragraph.withPieces(
                ParagraphPiece.with("\t").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").create(),
                ParagraphPiece.with("Dengan ini menyatakan bahwa jika kami memberikan keterangan palsu tentang kematian yang menyangkut tanggal meninggal dan persyartan lainnya, kami bersedia dituntut secara hukum berdasarkan pasal 263 KUHP tentang pemalsuan surat-surat.").withStyle().font(Font.TIMES_NEW_ROMAN).fontSize("12").create()
        ));               

        myDoc.addEle(BreakLine.times(3));
        myDoc.addEle(Paragraph.with("\t\t\t\t\t\t\t\t\tPamekasan,").withStyle().align(Align.LEFT).create());
               
        myDoc.addEle(BreakLine.times(2));
        myDoc.addEle(Paragraph.with("Kepala Desa/Lurah..."+kades+" \t\t\t\t\t\tAHLI WARIS,\t\t\t").withStyle().align(Align.RIGHT).create());

        myDoc.addEle(BreakLine.times(3));

        myDoc.addEle(Paragraph.withPieces(
        ParagraphPiece.with("......................\t\t\t\t\t\t\t\t\t ").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").create(),
        ParagraphPiece.with(kades).withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").underline().create(),
        ParagraphPiece.with("\t\t\t\t\t\t\t\t\t\t\t\t......................").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").create(),
        ParagraphPiece.with(waris).withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").underline().create()

        ));
        myDoc.addEle(Paragraph.withPieces(
                ParagraphPiece.with("\t\t\t\t\t\t\t\t\t\t").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").create(),
                ParagraphPiece.with(waris).withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").underline().create()
        ));               
        //myDoc.getFooter().addEle(Paragraph.with("Footer Check").create());
                
        File fileObj = new File("E:\\Surat Pernyataan Dituntut Secara Hukum.doc");
                
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(fileObj);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String myWord = myDoc.getContent();

        writer.println(myWord);
        writer.close();                   
        JOptionPane.showMessageDialog(null, "Surat berhasil dibuat di E dengan nama Surat Pernytaaan Secara Hukum.doc");
        }

}
