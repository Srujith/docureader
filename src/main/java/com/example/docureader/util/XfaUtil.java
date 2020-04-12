package com.example.docureader.util;

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
import java.io.StringWriter;

@Component
public class XfaUtil {

	public void convertToI9Form(PdfDocument pdfDocument) throws TransformerException {

		PdfAcroForm form = PdfAcroForm.getAcroForm(pdfDocument, true);
		XfaForm xfa = form.getXfaForm();
		// Get XFA data under datasets/data.
		Node node = xfa.getDatasetsNode();
		String docAsXml = convertNodeToString(node);
		System.out.println(docAsXml);
	}

	public String convertNodeToString(Node node) throws TransformerException {

		StringWriter stringWriter = new StringWriter();
		NodeList list = node.getChildNodes();
		for (int i = 0; i < list.getLength(); i++) {
			if ("data".equals(list.item(i).getLocalName())) {
				node = list.item(i);
				break;
			}
		}

		Transformer transformer = TransformerFactory.newInstance().newTransformer();
		transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.transform(new DOMSource(node), new StreamResult(stringWriter));
		return stringWriter.toString();

	}
}
