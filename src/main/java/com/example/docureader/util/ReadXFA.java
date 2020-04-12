package com.example.docureader.util;

public class ReadXFA {

	/*public static final String DEST = "./target/xml/xfa_example.xml";

	public static final String SRC = "./src/test/resources/i-9.pdf";

	public static void main(String[] args) throws Exception {
		File file = new File(DEST);
		file.getParentFile().mkdirs();

		new ReadXFA().manipulatePdf(DEST);
	}

	protected void manipulatePdf(String dest) throws Exception {
		PdfDocument pdfDoc = new PdfDocument(new PdfReader(SRC));
		PdfAcroForm form = PdfAcroForm.getAcroForm(pdfDoc, true);
		XfaForm xfa = form.getXfaForm();

		// Get XFA data under datasets/data.
		Node node = xfa.getDatasetsNode();
		NodeList list = node.getChildNodes();
		for (int i = 0; i < list.getLength(); i++) {
			if ("data".equals(list.item(i).getLocalName())) {
				node = list.item(i);
				break;
			}
		}

		try (FileOutputStream os = new FileOutputStream(dest)) {
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.transform(new DOMSource(node), new StreamResult(os));
		}

		pdfDoc.close();
	}*/
}
