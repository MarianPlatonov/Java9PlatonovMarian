/*
 * Add element to xml
 */
package homeworkio;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
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
public class AddElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            Map<String, String> usersList = new LinkedHashMap<>();
            usersList.put("Gheorghe", "parola123");
            usersList.put("A-sti", "parola456");

            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            documentBuilderFactory.setIgnoringElementContentWhitespace(true);
            Document document = documentBuilderFactory.newDocumentBuilder().parse(new File("src/homeworkio/users.xml"));
            document.getDocumentElement().normalize();

            Element root = document.getDocumentElement();

            NodeList nodeList = document.getElementsByTagName("user");

            usersList.forEach((t, u) -> {

                boolean contain = false;

                for (int i = 0; i < nodeList.getLength(); i++) {

                    if (t.equals(root.getElementsByTagName("username").item(i).getTextContent())) {
                        contain = true;
                    }
                }

                if (!contain && t != "" && t != null) {

                    Element user = document.createElement("user");
                    root.appendChild(user);

                    Element username = document.createElement("username");
                    username.appendChild(document.createTextNode(t));
                    user.appendChild(username);

                    Element password = document.createElement("password");
                    password.appendChild(document.createTextNode(u));
                    user.appendChild(password);

                    System.out.println("User: " + t + " successfully added!");

                } else {

                    System.out.println("User: " + t + " allready exist or you try to add an empty value or null!");

                }

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

        } catch (IOException | IllegalArgumentException | ParserConfigurationException | TransformerException | DOMException | SAXException e) {
            e.getStackTrace();
        }
    }

}
