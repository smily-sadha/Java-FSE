
public class FactoryTest {
    public static void main(String[] args) {
        DocumentFactory wf = new WordFactory();
        Document wordDoc = wf.CreateDocument();
        wordDoc.open();

        DocumentFactory pdff = new PDFFactory();
        Document pdfDoc = pdff.CreateDocument();
        pdfDoc.open();

        DocumentFactory excelf = new ExcelFactory();
        Document excelDoc = excelf.CreateDocument();
        excelDoc.open();
    }
}
