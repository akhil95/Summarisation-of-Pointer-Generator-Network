
import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

 class DocReader {

    public static void readDocFile(String fileName) {

        try {
            File file = new File(fileName);
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());

            HWPFDocument doc = new HWPFDocument(fis);
            WordExtractor we = new WordExtractor(doc);
            String[] paragraphs = we.getParagraphText();            
            System.out.println("Total no of paragraph "+paragraphs.length);
            for (String para : paragraphs)
            {
               // System.out.println(para.toString());
            }
            fis.close();
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public static void readDocxFile(String fileName)
    {

        try
        {
            File file = new File(fileName);
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
            XWPFDocument document = new XWPFDocument(fis);
            List<XWPFParagraph> paragraphs = document.getParagraphs();            
            System.out.println("Total no of paragraph "+paragraphs.size());
            for (XWPFParagraph para : paragraphs)
            {
            	String par=para.getText();
                System.out.println(par);
            }
            fis.close();
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readDocxFile("Twitter data analytics on various areas.docx");
       // readDocFile("C:\\Users\\knowx\\Documents\\hi.doc");
        System.out.println("success");
        //readDocFile("C:\\Test.doc");
    }
}