public class ExcelFactory extends DocumentFactory{
    public Document CreateDocument(){
        return new ExcelDocument();
    }
}