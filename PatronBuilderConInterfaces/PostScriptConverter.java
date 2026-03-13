public class PostScriptConverter implements Converter{

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
