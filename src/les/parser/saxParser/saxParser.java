package les.parser.saxParser;

import les.model.Sonnet;
import les.parser.IParser;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class saxParser implements IParser {

    @Override
    public void process(String file) {

        try{
            File inputFile = new File(file);
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            SonnetH sonnetHandler = new SonnetH();
            saxParser.parse(inputFile, sonnetHandler);

        } catch (IOException | ParserConfigurationException | SAXException e) {
            e.printStackTrace();
        }

    }

}
