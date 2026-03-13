public class PostScriptConverter extends Converter{
    
    public PostScriptConverter(String document){
        super(document);
    }

    public void makeLine(){
        System.out.println("Line -> PostScript");
    }

    public void makeParagraph(){
        System.out.println("Paragraph -> PostScript");
    }

    public void makeTable(){
        System.out.println("Table -> PostScript");
    }
}
