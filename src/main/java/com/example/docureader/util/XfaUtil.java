package com.example.docureader.util;

import com.example.docureader.model.I9.I9Form;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.forms.xfa.XfaForm;
import com.itextpdf.kernel.pdf.PdfDocument;
import org.springframework.stereotype.Component;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.IOException;
import java.io.StringWriter;

@Component
public class XfaUtil {

    public I9Form convertToI9Form(PdfDocument pdfDocument) throws TransformerException, IOException {

        PdfAcroForm form = PdfAcroForm.getAcroForm(pdfDocument, true);
        XfaForm xfa = form.getXfaForm();
        // Get XFA data under datasets/data.
        Node node = xfa.getDatasetsNode();
        String docAsXml = convertNodeToString(node);
        System.out.println("*** Converting XML to JSON ***");
        I9Form form1 = convertXmltoI9Form(docAsXml);

        return form1;
    }

    public String convertNodeToString(Node node) throws TransformerException {

        StringWriter stringWriter = new StringWriter();
        Node dataNode = getNodeBasedOnCondition(node, "data");
        Node form1Node = getNodeBasedOnCondition(dataNode, "form1");

        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.transform(new DOMSource(form1Node), new StreamResult(stringWriter));
        return stringWriter.toString();

    }

    private Node getNodeBasedOnCondition(Node node, String conditionString) {
        NodeList nodeList = node.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (conditionString.equals(nodeList.item(i).getLocalName())) {
                node = nodeList.item(i);
                break;
            }
        }
        return node;
    }

    private I9Form convertXmltoI9Form(String xmlString) throws IOException {

        XmlMapper xmlMapper = new XmlMapper();
        JsonNode jsonNode = xmlMapper.readTree(xmlString.getBytes());
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonValue = objectMapper.writeValueAsString(jsonNode);
        I9Form i9Form = objectMapper.readValue(jsonValue, I9Form.class);
        return i9Form;
    }
}
