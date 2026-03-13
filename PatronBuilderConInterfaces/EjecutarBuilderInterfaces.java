public class EjecutarBuilderInterfaces {
    public static void main(String[] args) {
        
        Converter objASCII = new ASCIIConverter();
        Converter objPostScript = new PostScriptConverter();
        Converter objPDF = new PDFConverter();
        Converter objPPT = new PPTConverter();

        Reader objLector1 = new Reader("LINE", objASCII);
        Reader objLector2 = new Reader("TABLE", objPPT);
        Reader objLector3 = new Reader("LINE", objPDF);
        Reader objLector4 = new Reader("LINE", objPostScript);
        Reader objLector5 = new Reader("PARAGRAPH", objASCII);
        Reader objLector6 = new Reader("TABLE", objPDF);
         
        objLector1.parseInput(); //Line -> ASCII
        objLector2.parseInput(); //Table -> PPT
        objLector3.parseInput(); //Line -> PDF
        objLector4.parseInput(); //Line -> PostScript
        objLector5.parseInput(); //Paragraph -> ASCII
        objLector6.parseInput(); //Table -> PDF

    }
}
