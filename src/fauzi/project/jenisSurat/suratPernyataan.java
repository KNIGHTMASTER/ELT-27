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
public class suratPernyataan {
    String nama="", waris="", alamat="", job="", ttd="";
    String tanggal = "00-00-0000";
public suratPernyataan(){
buat();
}
public void buat(){
        IDocument myDoc = new Document2004();

        myDoc.addEle(Paragraph.withPieces(
                ParagraphPiece.with("\t\t\t\t\t").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").create(),
                ParagraphPiece.with("SURAT PERNYATAAN").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").underline().create()
        ));

        myDoc.addEle(BreakLine.times(1));

        myDoc.addEle(Paragraph.withPieces(
                ParagraphPiece.with("").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").create(),
                ParagraphPiece.with("Yang bertanda tangan di bawah ini :").withStyle().font(Font.TIMES_NEW_ROMAN).fontSize("12").create()
        ));

        /*
         * Sepanjang pengetahuan kami dan selama berada di daerah kami serta beralamat di atas, orang tersebut berkelakuan baik dan  belum pernah tersangkut perkara polisi dan surat keterangan ini diberikan kepada yang bersangkutan untuk surat pengantar pengajuan SKKB.
         */
        myDoc.addEle(BreakLine.times(1));
        myDoc.addEle(Paragraph.with("\t\tNama\t\t\t\t:"+nama).create());
        myDoc.addEle(Paragraph.with("\t\tAhli Waris Dari\t\t:"+waris).create());
        myDoc.addEle(Paragraph.with("\t\tAlamat\t\t\t:"+alamat).create());
        myDoc.addEle(Paragraph.with("\t\tPekerjaan\t\t\t:"+job).create());


        myDoc.addEle(BreakLine.times(1));

        myDoc.addEle(Paragraph.withPieces(
                ParagraphPiece.with("\t").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").create(),
                ParagraphPiece.with("Menyatakan bahwa uang santunan kematian diterima utuh dari Dinas Sosial, Tenaga Kerja dan Transmigrasi Kabupaten Pamekasan sebesar Rp. 250.000,- (Dua Ratus Lima Puluh Ribu Rupiah)").withStyle().font(Font.TIMES_NEW_ROMAN).fontSize("12").create()
        ));

        myDoc.addEle(BreakLine.times(1));

        myDoc.addEle(Paragraph.withPieces(
                ParagraphPiece.with("\t").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").create(),
                ParagraphPiece.with("Demikian Surat Pernyataan ini kami buat dengan sebenarnya tanpa paksaan dari pihak manapun.").withStyle().font(Font.TIMES_NEW_ROMAN).fontSize("12").create()
        ));

        myDoc.addEle(BreakLine.times(2));
        myDoc.addEle(Paragraph.with("Pamekasan, "+tanggal).withStyle().align(Align.RIGHT).create());
        myDoc.addEle(BreakLine.times(1));
        myDoc.addEle(Paragraph.with("Yang menerima/menyatakan").withStyle().align(Align.RIGHT).create());
        myDoc.addEle(BreakLine.times(3));

        myDoc.addEle(Paragraph.withPieces(
                ParagraphPiece.with("\t\t\t\t\t\t\t\t\t\t....................").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").create(),
                ParagraphPiece.with(ttd).withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").underline().create()
        ));

         File fileObj = new File("E:\\Surat Pernyataan.doc");

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(fileObj);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String myWord = myDoc.getContent();

        writer.println(myWord);
        writer.close();
        JOptionPane.showMessageDialog(null, "Surat berhasil dibuat di E dengan nama Surat Pernyataan.doc");
        }
}
