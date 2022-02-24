package les.main;

import les.parser.domParser.domParser;
import les.parser.saxParser.saxParser;
import les.properties.Property;

public class runner {
    public static void main(String[] args) {

        Property property = new Property();
        property.getProperties();

        String xmlPath = property.getXMLPath();

        if (property.getParseType() == 1){
            saxParser saxParser = new saxParser();
            System.out.println("SAX");
            saxParser.process(xmlPath);
        } else if (property.getParseType() == 2){
            domParser domParser = new domParser();
            System.out.println("DOM");
            domParser.process(xmlPath);
        } else {
            System.out.println("Неизвестный параметр parseType");
        }

    }

}
