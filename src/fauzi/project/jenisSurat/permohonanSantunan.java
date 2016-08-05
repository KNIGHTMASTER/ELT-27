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
public class permohonanSantunan {
String nama="", ttl="", jk="", agama="", job="",  alamat="", kades="", nama1="", nik="", ttl1="", jk1="", agama1="", job1="", alamat1="", hari="", sebab="", namakades="", namacamat="";
String pemohon="", camat="" , nip="";

public permohonanSantunan(){
buat();
}

public void buat(){
        IDocument myDoc = new Document2004();
        
        myDoc.addEle(Paragraph.withPieces(
                ParagraphPiece.with("").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").create(),
                ParagraphPiece.with("Perihal :").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").create(),
                ParagraphPiece.with("Permohonan Santunan Kematian").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").underline().create()
        ));
        
        myDoc.addEle(BreakLine.times(1));

        myDoc.addEle(Paragraph.withPieces(
                ParagraphPiece.with("\t\t").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").create(),
                ParagraphPiece.with("Yang bertanda tangan di bawah ini :").withStyle().font(Font.TIMES_NEW_ROMAN).fontSize("12").create()
        ));


        /*
         * Sepanjang pengetahuan kami dan selama berada di daerah kami serta beralamat di atas, orang tersebut berkelakuan baik dan  belum pernah tersangkut perkara polisi dan surat keterangan ini diberikan kepada yang bersangkutan untuk surat pengantar pengajuan SKKB.
         */
        myDoc.addEle(Paragraph.with("\tNama\t\t\t\t:"+nama).create());
        myDoc.addEle(Paragraph.with("\tTempat Tanggal Lahir\t:"+ttl).create());
        myDoc.addEle(Paragraph.with("\tJenis Kelamin\t\t\t:"+jk).create());
        myDoc.addEle(Paragraph.with("\tAgama\t\t\t\t:"+agama).create());
        myDoc.addEle(Paragraph.with("\tPekerjaan\t\t\t:"+job).create());
        myDoc.addEle(Paragraph.with("\tAlamat\t\t\t:"+alamat).create());
        
        myDoc.addEle(Paragraph.withPieces(
                ParagraphPiece.with("\t\t").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").create(),
                ParagraphPiece.with("Bersama ini kami selaku ahli waris mengajukan santunan kematian:").withStyle().font(Font.TIMES_NEW_ROMAN).fontSize("12").create()
        ));

      
        myDoc.addEle(Paragraph.with("\tNama\t\t\t\t:"+nama1).create());
        myDoc.addEle(Paragraph.with("\tNIK\t\t\t\t:"+nik).create());
        myDoc.addEle(Paragraph.with("\tTempat, Tanggal Lahir\t:"+ttl1).create());
        myDoc.addEle(Paragraph.with("\tJenis Kelamin\t\t\t:"+jk1).create());
        myDoc.addEle(Paragraph.with("\tAgama\t\t\t\t:"+agama1).create());
        myDoc.addEle(Paragraph.with("\tPekerjaan\t\t\t:"+job1).create());
        myDoc.addEle(Paragraph.with("\tAlamat\t\t\t:"+alamat1).create());

        myDoc.addEle(Paragraph.withPieces(
                ParagraphPiece.with("\t").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").create(),
                ParagraphPiece.with("Telah Meninggal Dunia,").withStyle().font(Font.TIMES_NEW_ROMAN).fontSize("12").create()
        ));

        myDoc.addEle(BreakLine.times(1));
        myDoc.addEle(Paragraph.with("\tHari/Tanggal\t\t\t:"+hari).create());
        myDoc.addEle(Paragraph.with("\tPenyebab Kematian\t\t:"+sebab).create());


        myDoc.addEle(BreakLine.times(1));
        //content main

        myDoc.addEle(Paragraph.withPieces(
          ParagraphPiece.with("\t").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").create(),
          ParagraphPiece.with("Untuk melengkapi permohonan ini kami sertakan:").withStyle().font(Font.TIMES_NEW_ROMAN).fontSize("12").create(),
          ParagraphPiece.with("\t").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").create(),
          ParagraphPiece.with("\t\t\t\t\ta. Fotocopy KTP atau Surat Keterangan Pengganti KTP (F2) dan atau SK yang \t\t\tmeninggal\t\t\t\t\t\t\t\t").withStyle().font(Font.TIMES_NEW_ROMAN).fontSize("12").create(),
          ParagraphPiece.with("\t").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").create(),
          ParagraphPiece.with("\t\tb. Fotocopy KTP dan atau KSK ahli waris (pemohon)\t\t\t").withStyle().font(Font.TIMES_NEW_ROMAN).fontSize("12").create(),
          ParagraphPiece.with("\t").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").create(),
          ParagraphPiece.with("\t\tc. Surat Pernyataan Bersedia dituntut secara hukum diatas materai (F3)\t\t\t").withStyle().font(Font.TIMES_NEW_ROMAN).fontSize("12").create(),
          ParagraphPiece.with("\t").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").create(),
          ParagraphPiece.with("d. Akta Kematian").withStyle().font(Font.TIMES_NEW_ROMAN).fontSize("12").create()
        ));

        myDoc.addEle(Paragraph.with("Pemohon,\t\t").withStyle().align(Align.RIGHT).create());
        myDoc.addEle(BreakLine.times(3));
        myDoc.addEle(Paragraph.withPieces(
        ParagraphPiece.with("\t\t\t\t\t\t\t\t\t\t...............").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").create(),
        ParagraphPiece.with(pemohon).withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").underline().create()
        ));
        myDoc.addEle(BreakLine.times(1));
        myDoc.addEle(Paragraph.with("Mengetahui,").withStyle().align(Align.CENTER).create());
        myDoc.addEle(Paragraph.with("Camat..."+camat+" \t\t\t\t\t\t\t\t\tKepala Desa/Lurah..."+kades+"").withStyle().align(Align.LEFT).create());
        myDoc.addEle(BreakLine.times(3));

        myDoc.addEle(Paragraph.withPieces(
        ParagraphPiece.with("......................\t\t\t\t\t\t\t\t\t ").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").create(),
        ParagraphPiece.with(namacamat).withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").underline().create(),
        ParagraphPiece.with("........\t\t").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").create(),
        ParagraphPiece.with("NIP.............").withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").create(),
        ParagraphPiece.with(nip).withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").underline().create(),
        ParagraphPiece.with(namakades).withStyle().font(Font.TIMES_NEW_ROMAN_BOLD).fontSize("12").underline().create()

        ));

         File fileObj = new File("E:\\Permohonan Santunan Kematian.doc");

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(fileObj);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String myWord = myDoc.getContent();

        writer.println(myWord);
        writer.close();
        JOptionPane.showMessageDialog(null, "Surat berhasil dibuat di E dengan nama Permohonan Santunan Kematian.doc");
        }
}