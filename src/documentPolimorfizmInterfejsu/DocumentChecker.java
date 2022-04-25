package documentPolimorfizmInterfejsu;

public class DocumentChecker {
    //musimy podac metode main
    public static void main(String[] args){
        Document pdfDocument = new PdfDocument();
        Document excelDocument = new ExcelDocument();

        pdfDocument.getDescription();
        excelDocument.getDescription();
    }
}
