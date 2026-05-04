package org.mozilla.javascript.xmlimpl;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import ma.b;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ScriptRuntime;
import org.w3c.dom.Attr;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import yr.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class XmlProcessor implements Serializable {
    private static final long serialVersionUID = 6903514433204808713L;
    private transient LinkedBlockingDeque<DocumentBuilder> documentBuilderPool;
    private transient DocumentBuilderFactory dom;
    private RhinoSAXErrorHandler errorHandler = new RhinoSAXErrorHandler();
    private boolean ignoreComments;
    private boolean ignoreProcessingInstructions;
    private boolean ignoreWhitespace;
    private int prettyIndent;
    private boolean prettyPrint;
    private transient TransformerFactory xform;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RhinoSAXErrorHandler implements ErrorHandler, Serializable {
        private static final long serialVersionUID = 6918417235413084055L;

        private RhinoSAXErrorHandler() {
        }

        private void throwError(SAXParseException sAXParseException) {
            throw ScriptRuntime.constructError("TypeError", sAXParseException.getMessage(), sAXParseException.getLineNumber() - 1);
        }

        @Override // org.xml.sax.ErrorHandler
        public void error(SAXParseException sAXParseException) {
            throwError(sAXParseException);
        }

        @Override // org.xml.sax.ErrorHandler
        public void fatalError(SAXParseException sAXParseException) {
            throwError(sAXParseException);
        }

        @Override // org.xml.sax.ErrorHandler
        public void warning(SAXParseException sAXParseException) {
            Context.reportWarning(sAXParseException.getMessage());
        }
    }

    public XmlProcessor() {
        setDefault();
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        this.dom = newInstance;
        newInstance.setNamespaceAware(true);
        this.dom.setIgnoringComments(false);
        this.xform = TransformerFactory.newInstance();
        this.documentBuilderPool = new LinkedBlockingDeque<>(Runtime.getRuntime().availableProcessors() * 2);
    }

    private void addCommentsTo(List<Node> list, Node node) {
        if (node instanceof Comment) {
            list.add(node);
        }
        if (node.getChildNodes() != null) {
            for (int i11 = 0; i11 < node.getChildNodes().getLength(); i11++) {
                addProcessingInstructionsTo(list, node.getChildNodes().item(i11));
            }
        }
    }

    private void addProcessingInstructionsTo(List<Node> list, Node node) {
        if (node instanceof ProcessingInstruction) {
            list.add(node);
        }
        if (node.getChildNodes() != null) {
            for (int i11 = 0; i11 < node.getChildNodes().getLength(); i11++) {
                addProcessingInstructionsTo(list, node.getChildNodes().item(i11));
            }
        }
    }

    private void addTextNodesToRemoveAndTrim(List<Node> list, Node node) {
        if (node instanceof Text) {
            Text text = (Text) node;
            text.setData(text.getData().trim());
            if (text.getData().length() == 0) {
                list.add(node);
            }
        }
        if (node.getChildNodes() != null) {
            for (int i11 = 0; i11 < node.getChildNodes().getLength(); i11++) {
                addTextNodesToRemoveAndTrim(list, node.getChildNodes().item(i11));
            }
        }
    }

    private void beautifyElement(Element element, int i11) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('\n');
        for (int i12 = 0; i12 < i11; i12++) {
            stringBuffer.append(' ');
        }
        String stringBuffer2 = stringBuffer.toString();
        for (int i13 = 0; i13 < this.prettyIndent; i13++) {
            stringBuffer.append(' ');
        }
        String stringBuffer3 = stringBuffer.toString();
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        for (int i14 = 0; i14 < element.getChildNodes().getLength(); i14++) {
            if (i14 == 1) {
                z11 = true;
            }
            if (element.getChildNodes().item(i14) instanceof Text) {
                arrayList.add(element.getChildNodes().item(i14));
            } else {
                arrayList.add(element.getChildNodes().item(i14));
                z11 = true;
            }
        }
        if (z11) {
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                element.insertBefore(element.getOwnerDocument().createTextNode(stringBuffer3), (Node) arrayList.get(i15));
            }
        }
        NodeList childNodes = element.getChildNodes();
        ArrayList arrayList2 = new ArrayList();
        for (int i16 = 0; i16 < childNodes.getLength(); i16++) {
            if (childNodes.item(i16) instanceof Element) {
                arrayList2.add((Element) childNodes.item(i16));
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            beautifyElement((Element) it.next(), this.prettyIndent + i11);
        }
        if (z11) {
            element.appendChild(element.getOwnerDocument().createTextNode(stringBuffer2));
        }
    }

    private String elementToXmlString(Element element) {
        Element element2 = (Element) element.cloneNode(true);
        if (this.prettyPrint) {
            beautifyElement(element2, 0);
        }
        return toString(element2);
    }

    private String escapeElementValue(String str) {
        return escapeTextValue(str);
    }

    private DocumentBuilder getDocumentBuilderFromPool() throws ParserConfigurationException {
        DocumentBuilder pollFirst = this.documentBuilderPool.pollFirst();
        if (pollFirst == null) {
            pollFirst = getDomFactory().newDocumentBuilder();
        }
        pollFirst.setErrorHandler(this.errorHandler);
        return pollFirst;
    }

    private DocumentBuilderFactory getDomFactory() {
        return this.dom;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        this.dom = newInstance;
        newInstance.setNamespaceAware(true);
        this.dom.setIgnoringComments(false);
        this.xform = TransformerFactory.newInstance();
        this.documentBuilderPool = new LinkedBlockingDeque<>(Runtime.getRuntime().availableProcessors() * 2);
    }

    private void returnDocumentBuilderToPool(DocumentBuilder documentBuilder) {
        try {
            documentBuilder.reset();
            this.documentBuilderPool.offerFirst(documentBuilder);
        } catch (UnsupportedOperationException unused) {
        }
    }

    private String toString(Node node) {
        DOMSource dOMSource = new DOMSource(node);
        StringWriter stringWriter = new StringWriter();
        StreamResult streamResult = new StreamResult(stringWriter);
        try {
            Transformer newTransformer = this.xform.newTransformer();
            newTransformer.setOutputProperty("omit-xml-declaration", b.H0);
            newTransformer.setOutputProperty("indent", b.I0);
            newTransformer.setOutputProperty("method", "xml");
            newTransformer.transform(dOMSource, streamResult);
            return toXmlNewlines(stringWriter.toString());
        } catch (TransformerConfigurationException e11) {
            throw new RuntimeException(e11);
        } catch (TransformerException e12) {
            throw new RuntimeException(e12);
        }
    }

    private String toXmlNewlines(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (str.charAt(i11) != '\r') {
                stringBuffer.append(str.charAt(i11));
            } else if (str.charAt(i11 + 1) != '\n') {
                stringBuffer.append('\n');
            }
        }
        return stringBuffer.toString();
    }

    public final String ecmaToXmlString(Node node) {
        StringBuffer stringBuffer = new StringBuffer();
        if (node instanceof Text) {
            String data = ((Text) node).getData();
            if (this.prettyPrint) {
                data = data.trim();
            }
            stringBuffer.append(escapeElementValue(data));
            return stringBuffer.toString();
        }
        if (node instanceof Attr) {
            stringBuffer.append(escapeAttributeValue(((Attr) node).getValue()));
            return stringBuffer.toString();
        }
        if (node instanceof Comment) {
            stringBuffer.append("<!--" + ((Comment) node).getNodeValue() + "-->");
            return stringBuffer.toString();
        }
        if (!(node instanceof ProcessingInstruction)) {
            stringBuffer.append(elementToXmlString((Element) node));
            return stringBuffer.toString();
        }
        ProcessingInstruction processingInstruction = (ProcessingInstruction) node;
        stringBuffer.append("<?" + processingInstruction.getTarget() + " " + processingInstruction.getData() + "?>");
        return stringBuffer.toString();
    }

    public String escapeAttributeValue(Object obj) {
        String scriptRuntime = ScriptRuntime.toString(obj);
        if (scriptRuntime.length() == 0) {
            return "";
        }
        Element createElement = newDocument().createElement("a");
        createElement.setAttribute(e.f100279a, scriptRuntime);
        String xmlProcessor = toString(createElement);
        return xmlProcessor.substring(xmlProcessor.indexOf(34) + 1, xmlProcessor.lastIndexOf(34));
    }

    public String escapeTextValue(Object obj) {
        if (obj instanceof XMLObjectImpl) {
            return ((XMLObjectImpl) obj).toXMLString();
        }
        String scriptRuntime = ScriptRuntime.toString(obj);
        if (scriptRuntime.length() == 0) {
            return scriptRuntime;
        }
        Element createElement = newDocument().createElement("a");
        createElement.setTextContent(scriptRuntime);
        String xmlProcessor = toString(createElement);
        int indexOf = xmlProcessor.indexOf(62) + 1;
        int lastIndexOf = xmlProcessor.lastIndexOf(60);
        return indexOf < lastIndexOf ? xmlProcessor.substring(indexOf, lastIndexOf) : "";
    }

    public final int getPrettyIndent() {
        return this.prettyIndent;
    }

    public final boolean isIgnoreComments() {
        return this.ignoreComments;
    }

    public final boolean isIgnoreProcessingInstructions() {
        return this.ignoreProcessingInstructions;
    }

    public final boolean isIgnoreWhitespace() {
        return this.ignoreWhitespace;
    }

    public final boolean isPrettyPrinting() {
        return this.prettyPrint;
    }

    public Document newDocument() {
        DocumentBuilder documentBuilder = null;
        try {
            try {
                documentBuilder = getDocumentBuilderFromPool();
                Document newDocument = documentBuilder.newDocument();
                returnDocumentBuilderToPool(documentBuilder);
                return newDocument;
            } catch (ParserConfigurationException e11) {
                throw new RuntimeException(e11);
            }
        } catch (Throwable th2) {
            if (documentBuilder != null) {
                returnDocumentBuilderToPool(documentBuilder);
            }
            throw th2;
        }
    }

    public final void setDefault() {
        setIgnoreComments(true);
        setIgnoreProcessingInstructions(true);
        setIgnoreWhitespace(true);
        setPrettyPrinting(true);
        setPrettyIndent(2);
    }

    public final void setIgnoreComments(boolean z11) {
        this.ignoreComments = z11;
    }

    public final void setIgnoreProcessingInstructions(boolean z11) {
        this.ignoreProcessingInstructions = z11;
    }

    public final void setIgnoreWhitespace(boolean z11) {
        this.ignoreWhitespace = z11;
    }

    public final void setPrettyIndent(int i11) {
        this.prettyIndent = i11;
    }

    public final void setPrettyPrinting(boolean z11) {
        this.prettyPrint = z11;
    }

    public final Node toXml(String str, String str2) throws SAXException {
        try {
            try {
                try {
                    DocumentBuilder documentBuilderFromPool = getDocumentBuilderFromPool();
                    Document parse = documentBuilderFromPool.parse(new InputSource(new StringReader("<parent xmlns=\"" + str + "\">" + str2 + "</parent>")));
                    if (this.ignoreProcessingInstructions) {
                        ArrayList arrayList = new ArrayList();
                        addProcessingInstructionsTo(arrayList, parse);
                        for (Node node : arrayList) {
                            node.getParentNode().removeChild(node);
                        }
                    }
                    if (this.ignoreComments) {
                        ArrayList arrayList2 = new ArrayList();
                        addCommentsTo(arrayList2, parse);
                        for (Node node2 : arrayList2) {
                            node2.getParentNode().removeChild(node2);
                        }
                    }
                    if (this.ignoreWhitespace) {
                        ArrayList arrayList3 = new ArrayList();
                        addTextNodesToRemoveAndTrim(arrayList3, parse);
                        for (Node node3 : arrayList3) {
                            node3.getParentNode().removeChild(node3);
                        }
                    }
                    NodeList childNodes = parse.getDocumentElement().getChildNodes();
                    if (childNodes.getLength() > 1) {
                        throw ScriptRuntime.constructError("SyntaxError", "XML objects may contain at most one node.");
                    }
                    if (childNodes.getLength() == 0) {
                        Text createTextNode = parse.createTextNode("");
                        returnDocumentBuilderToPool(documentBuilderFromPool);
                        return createTextNode;
                    }
                    Node item = childNodes.item(0);
                    parse.getDocumentElement().removeChild(item);
                    returnDocumentBuilderToPool(documentBuilderFromPool);
                    return item;
                } catch (ParserConfigurationException e11) {
                    throw new RuntimeException(e11);
                }
            } catch (IOException unused) {
                throw new RuntimeException("Unreachable.");
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                returnDocumentBuilderToPool(null);
            }
            throw th2;
        }
    }
}
