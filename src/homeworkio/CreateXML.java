/*
 * Create XML file for users persistence
 */
package homeworkio;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;


/**
 *
 * @author Marian Platonov
 */
public class CreateXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Map<String, String> usersMap = new LinkedHashMap<>();
        usersMap.put("Bordeianu", "bordeainul");
        usersMap.put("Gigi", "gigigelu");
        usersMap.put("Radu", "raducelu");

        try {

            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            documentBuilderFactory.setIgnoringElementContentWhitespace(true);
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

            Document document = documentBuilder.newDocument();

            Element users = document.createElement("users");
            document.appendChild(users);

            usersMap.forEach((t, u) -> {
                Element user = document.createElement("user");
                users.appendChild(user);

                Element username = document.createElement("username");
                username.appendChild(document.createTextNode(t));
                user.appendChild(username);

                Element password = document.createElement("password");
                password.appendChild(document.createTextNode(u));
                user.appendChild(password);
            });

            DOMImplementation domImpl = document.getImplementation();
            DocumentType doctype = domImpl.createDocumentType("doctype", "-//Marian//DTD ROM Management Datafile//EN", "users.dtd");
            DOMSource source = new DOMSource(document);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            transformerFactory.setAttribute("indent-number", 2);

            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM, doctype.getSystemId());
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "5");

            StreamResult streamResult = new StreamResult(new File("src/homeworkio/users.xml"));
            transformer.transform(source, streamResult);

            System.out.println("Xml was successfully created!");

        } catch (IllegalArgumentException | ParserConfigurationException | TransformerException | DOMException e) {
            e.getStackTrace();
        }
    }

}
