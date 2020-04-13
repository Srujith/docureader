package com.example.docureader.util;

import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.forms.xfa.XfaForm;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileOutputStream;

public class ReadXFA {

    public static final String DEST = "./target/xml/xfa_example.xml";

    public static final String SRC = "./src/main/resources/i9/i-9.pdf";

    public static void main(String[] args) throws Exception {
        File file = new File(DEST);
        file.getParentFile().mkdirs();

        new ReadXFA().manipulatePdf(DEST);
    }

    protected void manipulatePdf(String dest) throws Exception {
        PdfDocument pdfDoc = new PdfDocument(new PdfReader(SRC));
        PdfAcroForm form = PdfAcroForm.getAcroForm(pdfDoc, true);
        XfaForm xfa = form.getXfaForm();

        // Get XFA data under datasets/data/form1.
        Node node = xfa.getDatasetsNode();
        Node dataNode = getNodeBasedOnCondition(node, "data");
        Node form1Node = getNodeBasedOnCondition(dataNode, "form1");

        try (FileOutputStream os = new FileOutputStream(dest)) {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.transform(new DOMSource(form1Node), new StreamResult(os));
        }

        pdfDoc.close();
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
}
