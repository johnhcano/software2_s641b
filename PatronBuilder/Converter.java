public class Converter {

    private String document;

    public Converter(String document){
        this.document = document;
    }

    public String getDocument(){
        return document;
    }

    public void setDcocument(String document){
        this.document = document;
    }

    public void makeLine(){
        System.out.println("Line Converter");
    }

    public void makeParagraph(){
        System.out.println("Paragraph Converter");
    }

    public void makeTable(){
        System.out.println("Table Converter");
    }
    
}