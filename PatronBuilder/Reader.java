public class Reader {
    
    private String element;
    private Converter converter;

    public Reader(String element, Converter converter){
        this.element = element;
        this.converter = converter;
    }

    public void parseInput(){
        switch(element){
            case "LINE" -> converter.makeLine();
            case "PARAGRAPH" -> converter.makeParagraph();
            case "TABLE" -> converter.makeTable();
            default -> System.out.println("Opción no válida");
        }
    }

}
