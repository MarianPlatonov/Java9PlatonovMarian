/*
 * Update element from xml
 */
package homeworkio;

import java.io.File;
import java.io.IOException;
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
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Marian Platonov
 */
public class UpdateUserName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String oldUser = "Brebu";
            String newUser = "Brebulescu";
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            documentBuilderFactory.setIgnoringElementContentWhitespace(true);
            Document document = documentBuilderFactory.newDocumentBuilder().parse(new File("src/homeworkio/users.xml"));
            document.getDocumentElement().normalize();

            Element root = document.getDocumentElement();

            NodeList nodeList = document.getElementsByTagName("user");

            boolean contain = false;

            for (int i = 0; i < nodeList.getLength(); i++) {

                if (oldUser.equals(root.getElementsByTagName("username").item(i).getTextContent())) {
                    contain = true;
                    root.getElementsByTagName("username").item(i).setTextContent(newUser);
                }
            }

            if (contain) {

                System.out.println("Username " + oldUser + " was changed with " + newUser);

            } else {

                System.out.println("An user with name : " + newUser + " allready exist!");
            }

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

        } catch (IOException | IllegalArgumentException | ParserConfigurationException | TransformerException | DOMException | SAXException e) {
            e.getStackTrace();
        }
    }

}