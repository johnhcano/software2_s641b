public class EjecutarBuilder {
    public static void main(String[] args) {
        
        Converter objASCII = new ASCIIConverter("ASCII");
        Converter objPostScript = new PostScriptConverter("PostScript");
        Converter objPDF = new PDFConverter("PDF");

        Reader objLector1 = new Reader("LINE", objASCII);
        Reader objLector2 = new Reader("TABLE", objASCII);
        Reader objLector3 = new Reader("LINE", objPDF);
        Reader objLector4 = new Reader("LINE", objPostScript);
        Reader objLector5 = new Reader("PARAGRAPH", objASCII);
        Reader objLector6 = new Reader("TABLE", objPDF);
         
        objLector1.parseInput(); //Line -> ASCII
        objLector2.parseInput(); //Table -> ASCII
        objLector3.parseInput(); //Line -> PDF
        objLector4.parseInput(); //Line -> PostScript
        objLector5.parseInput(); //Paragraph -> ASCII
        objLector6.parseInput(); //Table -> PDF

    }
}
