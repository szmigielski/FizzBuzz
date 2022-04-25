package documentPolimorfizmKlas;

public class DocumentChecker {
    //musimy utworzyc metode main
    public static void main(String[] args){
        //dokument excela możemy zadeklarować na 2 sposoby
        ExcelDocument document = new ExcelDocument();

        //odnosimy się do klasy bazowej
        //dokument excela jest jedną z postaci naszego dokumentu
        Document excelDocument = new ExcelDocument();

        PdfDocument pdfDocument = new PdfDocument();

        excelDocument.getDescription();
        pdfDocument.getDescription();
    }
}
