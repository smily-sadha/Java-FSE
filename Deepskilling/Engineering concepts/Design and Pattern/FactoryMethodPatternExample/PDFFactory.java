public class PDFFactory extends DocumentFactory{
    public Document CreateDocument(){
        return new PDFDocument();
    }
}