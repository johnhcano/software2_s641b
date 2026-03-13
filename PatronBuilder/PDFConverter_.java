public class PDFConverter_ extends Converter_{
    
    public PDFConverter_(String document){
        super(document);
    }

    public void makeLine(){
        System.out.println("Line -> PDF");
    }

    public void makeParagraph(){
        System.out.println("Paragraph -> PDF");
    }

    public void makeTable(){
        System.out.println("Table -> PDF");
    }
}
