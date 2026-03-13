public class EjecutarBuilder {
    public static void main(String[] args) {
        
        Converter_ objASCII = new ASCIIConverter_("ASCII");
        Converter_ objPostScript = new PostScriptConverter_("PostScript");
        Converter_ objPDF = new PDFConverter_("PDF");

        Reader_ objLector1 = new Reader_("LINE", objASCII);
        Reader_ objLector2 = new Reader_("TABLE", objASCII);
        Reader_ objLector3 = new Reader_("LINE", objPDF);
        Reader_ objLector4 = new Reader_("LINE", objPostScript);
        Reader_ objLector5 = new Reader_("PARAGRAPH", objASCII);
        Reader_ objLector6 = new Reader_("TABLE", objPDF);
         
        objLector1.parseInput(); //Line -> ASCII
        objLector2.parseInput(); //Table -> ASCII
        objLector3.parseInput(); //Line -> PDF
        objLector4.parseInput(); //Line -> PostScript
        objLector5.parseInput(); //Paragraph -> ASCII
        objLector6.parseInput(); //Table -> PDF

    }
}
