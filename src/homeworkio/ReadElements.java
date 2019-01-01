/*
 * Read elements from xml
 */
package homeworkio;

import java.io.File;
import java.io.IOException;
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
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Marian Platonov
 */
public class ReadElements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(new File("src/homeworkio/users.xml"));
            document.getDocumentElement().normalize();

            System.out.println("Root element :" + document.getDocumentElement().getNodeName());

            NodeList nodeList = document.getElementsByTagName("user");

            System.out.println("----------------------------");

            int length = nodeList.getLength();

            System.out.println("XML number of elements = " + length);

            for (int temp = 0; temp < length; temp++) {
                Node userNode = nodeList.item(temp);
                if (userNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) userNode;
                    System.out.println("Username : "
                            + eElement.getElementsByTagName("username")
                                    .item(0)
                                    .getTextContent());
                    System.out.println("Password : "
                            + eElement
                                    .getElementsByTagName("password")
                                    .item(0)
                                    .getTextContent());
                }
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
