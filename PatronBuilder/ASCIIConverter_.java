public class ASCIIConverter_ extends Converter_{
    
    public ASCIIConverter_(String document){
        super(document);
    }

    public void makeLine(){
        System.out.println("Line -> ASCII");
    }

    public void makeParagraph(){
        System.out.println("Paragraph -> ASCII");
    }

    public void makeTable(){
        System.out.println("Table -> ASCII");
    }

}
