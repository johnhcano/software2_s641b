public class Reader_ {
    
    private String element;
    private Converter_ converter;

    public Reader_(String element, Converter_ converter){
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
