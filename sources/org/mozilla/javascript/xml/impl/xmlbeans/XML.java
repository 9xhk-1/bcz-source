package org.mozilla.javascript.xml.impl.xmlbeans;

import java.io.Serializable;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.Wrapper;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class XML extends XMLObjectImpl {
    private static final int APPEND_CHILD = 1;
    private static final int PREPEND_CHILD = 2;
    static final long serialVersionUID = -630969919086449092L;
    private XScriptAnnotation _anno;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class NamespaceDeclarations {
        private String _defaultNSURI;
        private int _prefixIdx = 0;
        private StringBuffer _namespaceDecls = new StringBuffer();

        public NamespaceDeclarations(XmlCursor xmlCursor) {
            XML.skipNonElements(xmlCursor);
            this._defaultNSURI = xmlCursor.namespaceForPrefix("");
            if (isAnyDefaultNamespace()) {
                addDecl("", this._defaultNSURI);
            }
        }

        private void addDecl(String str, String str2) {
            String str3;
            StringBuffer stringBuffer = this._namespaceDecls;
            StringBuilder sb2 = new StringBuilder();
            if (str.length() > 0) {
                str3 = "declare namespace " + str;
            } else {
                str3 = "default element namespace";
            }
            sb2.append(str3);
            sb2.append(" = \"");
            sb2.append(str2);
            sb2.append("\"");
            sb2.append("\n");
            stringBuffer.append(sb2.toString());
        }

        public String getDeclarations() {
            return this._namespaceDecls.toString();
        }

        public String getNextPrefix(String str) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NS");
            int i11 = this._prefixIdx;
            this._prefixIdx = i11 + 1;
            sb2.append(i11);
            String sb3 = sb2.toString();
            this._namespaceDecls.append("declare namespace " + sb3 + " = \"" + str + "\"\n");
            return sb3;
        }

        public boolean isAnyDefaultNamespace() {
            String str = this._defaultNSURI;
            return str != null && str.length() > 0;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class XScriptAnnotation extends XmlCursor.XmlBookmark implements Serializable {
        private static final long serialVersionUID = 1;
        javax.xml.namespace.QName _name;
        XML _xScriptXML;

        public XScriptAnnotation(XmlCursor xmlCursor) {
            this._name = xmlCursor.getName();
        }
    }

    private XML(XMLLibImpl xMLLibImpl, XScriptAnnotation xScriptAnnotation) {
        super(xMLLibImpl, xMLLibImpl.xmlPrototype);
        this._anno = xScriptAnnotation;
        xScriptAnnotation._xScriptXML = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
    
        if (r3.getLocalPart().equals(r1.getName().getLocalPart()) == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.mozilla.javascript.xml.impl.xmlbeans.XMLList allChildNodes(java.lang.String r9) {
        /*
            r8 = this;
            org.mozilla.javascript.xml.impl.xmlbeans.XMLList r0 = new org.mozilla.javascript.xml.impl.xmlbeans.XMLList
            org.mozilla.javascript.xml.impl.xmlbeans.XMLLibImpl r1 = r8.lib
            r0.<init>(r1)
            org.apache.xmlbeans.XmlCursor r1 = r8.newCursor()
            org.apache.xmlbeans.XmlCursor$TokenType r2 = r1.currentTokenType()
            javax.xml.namespace.QName r3 = new javax.xml.namespace.QName
            java.lang.String r4 = "*"
            r3.<init>(r9, r4)
            boolean r5 = r2.isStartdoc()
            if (r5 == 0) goto L20
            org.apache.xmlbeans.XmlCursor$TokenType r2 = r1.toFirstContentToken()
        L20:
            boolean r2 = r2.isContainer()
            if (r2 == 0) goto L95
            org.apache.xmlbeans.XmlCursor$TokenType r2 = r1.toFirstContentToken()
        L2a:
            boolean r5 = r2.isEnd()
            if (r5 != 0) goto L95
            boolean r5 = r2.isStart()
            r6 = 0
            if (r5 != 0) goto L40
            org.mozilla.javascript.xml.impl.xmlbeans.XML$XScriptAnnotation r3 = findAnnotation(r1)
            r0.addToList(r3)
        L3e:
            r3 = r6
            goto L87
        L40:
            if (r9 == 0) goto L5c
            int r5 = r9.length()
            if (r5 == 0) goto L5c
            boolean r5 = r9.equals(r4)
            if (r5 != 0) goto L5c
            javax.xml.namespace.QName r5 = r1.getName()
            java.lang.String r5 = r5.getNamespaceURI()
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L87
        L5c:
            org.mozilla.javascript.xml.impl.xmlbeans.XML$XScriptAnnotation r5 = findAnnotation(r1)
            r0.addToList(r5)
            if (r3 == 0) goto L87
            java.lang.String r5 = r3.getLocalPart()
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L74
            javax.xml.namespace.QName r3 = r1.getName()
            goto L87
        L74:
            java.lang.String r5 = r3.getLocalPart()
            javax.xml.namespace.QName r7 = r1.getName()
            java.lang.String r7 = r7.getLocalPart()
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L87
            goto L3e
        L87:
            boolean r2 = r2.isStart()
            if (r2 == 0) goto L90
            r1.toEndToken()
        L90:
            org.apache.xmlbeans.XmlCursor$TokenType r2 = r1.toNextToken()
            goto L2a
        L95:
            r1.dispose()
            r0.setTargets(r8, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.xml.impl.xmlbeans.XML.allChildNodes(java.lang.String):org.mozilla.javascript.xml.impl.xmlbeans.XMLList");
    }

    public static javax.xml.namespace.QName computeQName(Object obj) {
        int indexOf;
        String str = null;
        if (!(obj instanceof String)) {
            return null;
        }
        String str2 = (String) obj;
        if (str2.startsWith("\"") && (indexOf = str2.indexOf(":")) != -1) {
            str = str2.substring(1, indexOf - 1);
            str2 = str2.substring(indexOf + 1);
        }
        return str == null ? new javax.xml.namespace.QName(str2) : new javax.xml.namespace.QName(str, str2);
    }

    private XmlCursor copy(XmlCursor xmlCursor) {
        XmlCursor newCursor;
        XmlObject newInstance = XmlObject.Factory.newInstance();
        if (xmlCursor.currentTokenType().isText()) {
            try {
                newCursor = XmlObject.Factory.parse("<x:fragment xmlns:x=\"http://www.openuri.org/fragment\">" + xmlCursor.getChars() + "</x:fragment>").newCursor();
                if (!xmlCursor.toNextSibling() && xmlCursor.currentTokenType().isText()) {
                    xmlCursor.toNextToken();
                }
            } catch (Exception e11) {
                throw ScriptRuntime.typeError(e11.getMessage());
            }
        } else {
            newCursor = newInstance.newCursor();
            newCursor.toFirstContentToken();
            if (xmlCursor.currentTokenType() == XmlCursor.TokenType.STARTDOC) {
                xmlCursor.toNextToken();
            }
            xmlCursor.copyXml(newCursor);
            if (!xmlCursor.toNextSibling() && xmlCursor.currentTokenType().isText()) {
                xmlCursor.toNextToken();
            }
        }
        newCursor.toStartDoc();
        newCursor.toFirstContentToken();
        return newCursor;
    }

    private XML createAttributeObject(XmlCursor xmlCursor) {
        if (xmlCursor.currentTokenType().isAttr()) {
            return createAttributeXML(this.lib, xmlCursor);
        }
        return null;
    }

    private static XML createAttributeXML(XMLLibImpl xMLLibImpl, XmlCursor xmlCursor) {
        if (!xmlCursor.isAttr()) {
            throw new IllegalArgumentException();
        }
        XScriptAnnotation xScriptAnnotation = new XScriptAnnotation(xmlCursor);
        xmlCursor.setBookmark(xScriptAnnotation);
        return new XML(xMLLibImpl, xScriptAnnotation);
    }

    public static XML createEmptyXML(XMLLibImpl xMLLibImpl) {
        XmlCursor newCursor = XmlObject.Factory.newInstance().newCursor();
        try {
            XScriptAnnotation xScriptAnnotation = new XScriptAnnotation(newCursor);
            newCursor.setBookmark(xScriptAnnotation);
            newCursor.dispose();
            return new XML(xMLLibImpl, xScriptAnnotation);
        } catch (Throwable th2) {
            newCursor.dispose();
            throw th2;
        }
    }

    public static XML createFromJS(XMLLibImpl xMLLibImpl, Object obj) {
        String str;
        boolean z11;
        XmlObject newInstance;
        XmlCursor newCursor;
        boolean z12;
        if (obj == null || obj == Undefined.instance) {
            str = "";
        } else if (obj instanceof XMLObjectImpl) {
            str = ((XMLObjectImpl) obj).toXMLString(0);
        } else {
            if (obj instanceof Wrapper) {
                Object unwrap = ((Wrapper) obj).unwrap();
                if (unwrap instanceof XmlObject) {
                    return createFromXmlObject(xMLLibImpl, (XmlObject) unwrap);
                }
            }
            str = ScriptRuntime.toString(obj);
        }
        if (str.trim().startsWith("<>")) {
            throw ScriptRuntime.typeError("Invalid use of XML object anonymous tags <></>.");
        }
        if (str.indexOf("<") == -1) {
            str = "<textFragment>" + str + "</textFragment>";
            z11 = true;
        } else {
            z11 = false;
        }
        XmlOptions xmlOptions = new XmlOptions();
        if (xMLLibImpl.ignoreComments) {
            xmlOptions.put("LOAD_STRIP_COMMENTS");
        }
        if (xMLLibImpl.ignoreProcessingInstructions) {
            xmlOptions.put("LOAD_STRIP_PROCINSTS");
        }
        if (xMLLibImpl.ignoreWhitespace) {
            xmlOptions.put("LOAD_STRIP_WHITESPACE");
        }
        try {
            newInstance = XmlObject.Factory.parse(str, xmlOptions);
            String defaultNamespaceURI = xMLLibImpl.getDefaultNamespaceURI(Context.getCurrentContext());
            if (defaultNamespaceURI.length() > 0) {
                newCursor = newInstance.newCursor();
                boolean z13 = true;
                while (!newCursor.toNextToken().isEnddoc()) {
                    if (newCursor.isStart()) {
                        newCursor.push();
                        while (true) {
                            if (!newCursor.toNextToken().isAnyAttr()) {
                                z12 = false;
                                break;
                            }
                            if (newCursor.isNamespace() && newCursor.getName().getLocalPart().length() == 0) {
                                z12 = true;
                                break;
                            }
                        }
                        newCursor.pop();
                        if (z12) {
                            newCursor.toEndToken();
                        } else {
                            javax.xml.namespace.QName name = newCursor.getName();
                            if (name.getNamespaceURI().length() == 0) {
                                newCursor.setName(new javax.xml.namespace.QName(defaultNamespaceURI, name.getLocalPart()));
                            }
                            if (z13) {
                                newCursor.push();
                                newCursor.toNextToken();
                                newCursor.insertNamespace("", defaultNamespaceURI);
                                newCursor.pop();
                                z13 = false;
                            }
                        }
                    }
                }
            }
        } catch (XmlException e11) {
            if (!e11.getMessage().equals("error: Unexpected end of file after null")) {
                throw ScriptRuntime.typeError(e11.getMessage());
            }
            newInstance = XmlObject.Factory.newInstance();
        }
        newCursor = newInstance.newCursor();
        if (newCursor.currentTokenType().isStartdoc()) {
            newCursor.toFirstContentToken();
        }
        if (z11) {
            newCursor.toFirstContentToken();
        }
        try {
            XScriptAnnotation xScriptAnnotation = new XScriptAnnotation(newCursor);
            newCursor.setBookmark(xScriptAnnotation);
            newCursor.dispose();
            return new XML(xMLLibImpl, xScriptAnnotation);
        } finally {
            newCursor.dispose();
        }
    }

    public static XML createFromXmlObject(XMLLibImpl xMLLibImpl, XmlObject xmlObject) {
        XmlCursor newCursor = xmlObject.newCursor();
        if (newCursor.currentTokenType().isStartdoc()) {
            newCursor.toFirstContentToken();
        }
        try {
            XScriptAnnotation xScriptAnnotation = new XScriptAnnotation(newCursor);
            newCursor.setBookmark(xScriptAnnotation);
            newCursor.dispose();
            return new XML(xMLLibImpl, xScriptAnnotation);
        } catch (Throwable th2) {
            newCursor.dispose();
            throw th2;
        }
    }

    public static XML createTextElement(XMLLibImpl xMLLibImpl, javax.xml.namespace.QName qName, String str) {
        XmlCursor newCursor = XmlObject.Factory.newInstance().newCursor();
        try {
            newCursor.toNextToken();
            newCursor.beginElement(qName.getLocalPart(), qName.getNamespaceURI());
            newCursor.insertChars(str);
            newCursor.toStartDoc();
            newCursor.toNextToken();
            XScriptAnnotation xScriptAnnotation = new XScriptAnnotation(newCursor);
            newCursor.setBookmark(xScriptAnnotation);
            newCursor.dispose();
            return new XML(xMLLibImpl, xScriptAnnotation);
        } catch (Throwable th2) {
            newCursor.dispose();
            throw th2;
        }
    }

    private static XML createXML(XMLLibImpl xMLLibImpl, XmlCursor xmlCursor) {
        if (xmlCursor.currentTokenType().isStartdoc()) {
            xmlCursor.toFirstContentToken();
        }
        return new XML(xMLLibImpl, findAnnotation(xmlCursor));
    }

    private boolean doPut(XMLName xMLName, XML xml, XMLObjectImpl xMLObjectImpl) {
        XmlCursor newCursor = xml.newCursor();
        try {
            try {
                int length = xMLObjectImpl.length();
                for (int i11 = 0; i11 < length; i11++) {
                    XML item = xMLObjectImpl instanceof XMLList ? ((XMLList) xMLObjectImpl).item(i11) : (XML) xMLObjectImpl;
                    XmlCursor.TokenType tokenType = item.tokenType();
                    if (tokenType == XmlCursor.TokenType.ATTR || tokenType == XmlCursor.TokenType.TEXT) {
                        item = makeXmlFromString(this.lib, xMLName, item.toString());
                    }
                    if (i11 == 0) {
                        replace(newCursor, item);
                    } else {
                        insertChild(newCursor, item);
                    }
                }
                newCursor.dispose();
                return true;
            } catch (Exception e11) {
                e11.printStackTrace();
                throw ScriptRuntime.typeError(e11.getMessage());
            }
        } catch (Throwable th2) {
            newCursor.dispose();
            throw th2;
        }
    }

    private static String dumpNode(XmlCursor xmlCursor, XmlOptions xmlOptions) {
        if (xmlCursor.isText()) {
            return xmlCursor.getChars();
        }
        if (xmlCursor.isFinish()) {
            return "";
        }
        xmlCursor.push();
        boolean z11 = xmlCursor.isStartdoc() && !xmlCursor.toFirstChild();
        xmlCursor.pop();
        return z11 ? xmlCursor.getTextValue() : xmlCursor.xmlText(xmlOptions);
    }

    public static XScriptAnnotation findAnnotation(XmlCursor xmlCursor) {
        XmlCursor.XmlBookmark bookmark = xmlCursor.getBookmark(XScriptAnnotation.class);
        if (bookmark == null) {
            bookmark = new XScriptAnnotation(xmlCursor);
            xmlCursor.setBookmark(bookmark);
        }
        return (XScriptAnnotation) bookmark;
    }

    public static XML getFromAnnotation(XMLLibImpl xMLLibImpl, XScriptAnnotation xScriptAnnotation) {
        if (xScriptAnnotation._xScriptXML == null) {
            xScriptAnnotation._xScriptXML = new XML(xMLLibImpl, xScriptAnnotation);
        }
        return xScriptAnnotation._xScriptXML;
    }

    private XmlOptions getOptions() {
        XmlOptions xmlOptions = new XmlOptions();
        if (this.lib.ignoreComments) {
            xmlOptions.put("LOAD_STRIP_COMMENTS");
        }
        if (this.lib.ignoreProcessingInstructions) {
            xmlOptions.put("LOAD_STRIP_PROCINSTS");
        }
        if (this.lib.ignoreWhitespace) {
            xmlOptions.put("LOAD_STRIP_WHITESPACE");
        }
        if (this.lib.prettyPrinting) {
            xmlOptions.put("SAVE_PRETTY_PRINT", (Object) null);
            xmlOptions.put("SAVE_PRETTY_PRINT_INDENT", new Integer(this.lib.prettyIndent));
        }
        return xmlOptions;
    }

    private void insertChild(XmlCursor xmlCursor, Object obj) {
        if (obj == null || (obj instanceof Undefined)) {
            return;
        }
        if (obj instanceof XmlCursor) {
            moveSrcToDest((XmlCursor) obj, xmlCursor, true);
            return;
        }
        if (obj instanceof XML) {
            XML xml = (XML) obj;
            if (xml.tokenType() == XmlCursor.TokenType.ATTR) {
                insertChild(xmlCursor, xml.toString());
                return;
            }
            XmlCursor newCursor = xml.newCursor();
            moveSrcToDest(newCursor, xmlCursor, true);
            newCursor.dispose();
            return;
        }
        if (obj instanceof XMLList) {
            XMLList xMLList = (XMLList) obj;
            for (int i11 = 0; i11 < xMLList.length(); i11++) {
                insertChild(xmlCursor, xMLList.item(i11));
            }
            return;
        }
        String scriptRuntime = ScriptRuntime.toString(obj);
        XmlCursor newCursor2 = XmlObject.Factory.newInstance().newCursor();
        newCursor2.toNextToken();
        newCursor2.insertChars(scriptRuntime);
        newCursor2.toPrevToken();
        moveSrcToDest(newCursor2, xmlCursor, true);
    }

    private XML makeXmlFromString(XMLLibImpl xMLLibImpl, XMLName xMLName, String str) {
        try {
            return createTextElement(xMLLibImpl, new javax.xml.namespace.QName(xMLName.uri(), xMLName.localName()), str);
        } catch (Exception e11) {
            throw ScriptRuntime.typeError(e11.getMessage());
        }
    }

    private XMLList matchAttributes(XMLName xMLName) {
        XMLList xMLList = new XMLList(this.lib);
        XmlCursor newCursor = newCursor();
        if (newCursor.currentTokenType().isStartdoc()) {
            newCursor.toFirstContentToken();
        }
        if (newCursor.isStart() && newCursor.toFirstAttribute()) {
            do {
                if (qnameMatches(xMLName, newCursor.getName())) {
                    xMLList.addToList(createAttributeObject(newCursor));
                }
            } while (newCursor.toNextAttribute());
        }
        newCursor.dispose();
        return xMLList;
    }

    private XMLList matchChildren(XmlCursor.TokenType tokenType) {
        return matchChildren(tokenType, XMLName.formStar());
    }

    private XMLList matchDescendantAttributes(XMLName xMLName) {
        XMLList xMLList = new XMLList(this.lib);
        XmlCursor newCursor = newCursor();
        XmlCursor.TokenType currentTokenType = newCursor.currentTokenType();
        xMLList.setTargets(this, null);
        if (currentTokenType.isStartdoc()) {
            currentTokenType = newCursor.toFirstContentToken();
        }
        if (currentTokenType.isContainer()) {
            int i11 = 1;
            while (i11 > 0) {
                XmlCursor.TokenType nextToken = newCursor.toNextToken();
                if (nextToken.isAttr() && qnameMatches(xMLName, newCursor.getName())) {
                    xMLList.addToList(findAnnotation(newCursor));
                }
                if (nextToken.isStart()) {
                    i11++;
                } else if (nextToken.isEnd()) {
                    i11--;
                } else if (nextToken.isEnddoc()) {
                    break;
                }
            }
        }
        newCursor.dispose();
        return xMLList;
    }

    private XMLList matchDescendantChildren(XMLName xMLName) {
        XMLList xMLList = new XMLList(this.lib);
        XmlCursor newCursor = newCursor();
        XmlCursor.TokenType currentTokenType = newCursor.currentTokenType();
        xMLList.setTargets(this, null);
        if (currentTokenType.isStartdoc()) {
            currentTokenType = newCursor.toFirstContentToken();
        }
        if (currentTokenType.isContainer()) {
            int i11 = 1;
            while (i11 > 0) {
                XmlCursor.TokenType nextToken = newCursor.toNextToken();
                if (!nextToken.isAttr() && !nextToken.isEnd() && !nextToken.isEnddoc()) {
                    if (nextToken.isStart() || nextToken.isProcinst()) {
                        if (qnameMatches(xMLName, newCursor.getName())) {
                            xMLList.addToList(findAnnotation(newCursor));
                        }
                    } else if (xMLName.localName().equals("*")) {
                        xMLList.addToList(findAnnotation(newCursor));
                    }
                }
                if (nextToken.isStart()) {
                    i11++;
                } else if (nextToken.isEnd()) {
                    i11--;
                } else if (nextToken.isEnddoc()) {
                    break;
                }
            }
        }
        newCursor.dispose();
        return xMLList;
    }

    private boolean moveSrcToDest(XmlCursor xmlCursor, XmlCursor xmlCursor2, boolean z11) {
        XmlCursor.TokenType currentTokenType;
        do {
            if (z11 && xmlCursor.isInSameDocument(xmlCursor2) && xmlCursor.comparePosition(xmlCursor2) == 0) {
                return false;
            }
            if (xmlCursor2.currentTokenType().isStartdoc()) {
                xmlCursor2.toNextToken();
            }
            XmlCursor copy = copy(xmlCursor);
            copy.moveXml(xmlCursor2);
            copy.dispose();
            currentTokenType = xmlCursor.currentTokenType();
            if (currentTokenType.isStart() || currentTokenType.isEnd()) {
                return true;
            }
        } while (!currentTokenType.isEnddoc());
        return true;
    }

    private boolean moveToChild(XmlCursor xmlCursor, long j11, boolean z11, boolean z12) {
        long j12 = 0;
        if (j11 < 0) {
            throw new IllegalArgumentException();
        }
        if (!z12 && xmlCursor.currentTokenType().isStartdoc()) {
            xmlCursor.toFirstContentToken();
        }
        XmlCursor.TokenType firstContentToken = xmlCursor.toFirstContentToken();
        if (firstContentToken.isNone() || firstContentToken.isEnd()) {
            return z11 && j11 == 0;
        }
        while (j11 != j12) {
            XmlCursor.TokenType currentTokenType = xmlCursor.currentTokenType();
            if (currentTokenType.isText()) {
                xmlCursor.toNextToken();
            } else if (currentTokenType.isStart()) {
                xmlCursor.toEndToken();
                xmlCursor.toNextToken();
            } else if (!currentTokenType.isComment() && !currentTokenType.isProcinst()) {
                return false;
            }
            j12++;
        }
        return true;
    }

    private XmlCursor newCursor() {
        XScriptAnnotation xScriptAnnotation = this._anno;
        if (xScriptAnnotation == null) {
            return XmlObject.Factory.newInstance().newCursor();
        }
        XmlCursor createCursor = xScriptAnnotation.createCursor();
        if (createCursor == null) {
            createCursor = XmlObject.Factory.newInstance().newCursor();
            if (this._anno._name != null) {
                createCursor.toNextToken();
                createCursor.insertElement(this._anno._name);
                createCursor.toPrevSibling();
            }
            createCursor.setBookmark(this._anno);
        }
        return createCursor;
    }

    private boolean qnameMatches(XMLName xMLName, javax.xml.namespace.QName qName) {
        if (xMLName.uri() == null || xMLName.uri().equals(qName.getNamespaceURI())) {
            return xMLName.localName().equals("*") || xMLName.localName().equals(qName.getLocalPart());
        }
        return false;
    }

    private void replace(XmlCursor xmlCursor, XML xml) {
        if (xmlCursor.isStartdoc()) {
            xmlCursor.toFirstContentToken();
        }
        removeToken(xmlCursor);
        XmlCursor newCursor = xml.newCursor();
        if (newCursor.currentTokenType().isStartdoc()) {
            newCursor.toFirstContentToken();
        }
        moveSrcToDest(newCursor, xmlCursor, false);
        if (!xmlCursor.toPrevSibling()) {
            xmlCursor.toPrevToken();
        }
        xmlCursor.setBookmark(new XScriptAnnotation(xmlCursor));
        xmlCursor.toEndToken();
        xmlCursor.toNextToken();
        newCursor.dispose();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static XmlCursor.TokenType skipNonElements(XmlCursor xmlCursor) {
        XmlCursor.TokenType currentTokenType = xmlCursor.currentTokenType();
        while (true) {
            if (!currentTokenType.isComment() && !currentTokenType.isProcinst()) {
                return currentTokenType;
            }
            currentTokenType = xmlCursor.toNextToken();
        }
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public XML addNamespace(Namespace namespace) {
        String prefix = namespace.prefix();
        if (prefix == null) {
            return this;
        }
        XmlCursor newCursor = newCursor();
        try {
            if (!newCursor.isContainer()) {
                return this;
            }
            if (newCursor.getName().getNamespaceURI().equals("") && prefix.equals("")) {
                return this;
            }
            String str = (String) NamespaceHelper.getAllNamespaces(this.lib, newCursor).get(prefix);
            if (str != null) {
                if (str.equals(namespace.uri())) {
                    return this;
                }
                newCursor.push();
                while (true) {
                    if (!newCursor.toNextToken().isAnyAttr()) {
                        break;
                    }
                    if (newCursor.isNamespace() && newCursor.getName().getLocalPart().equals(prefix)) {
                        newCursor.removeXml();
                        break;
                    }
                }
                newCursor.pop();
            }
            newCursor.toNextToken();
            newCursor.insertNamespace(prefix, namespace.uri());
            return this;
        } finally {
            newCursor.dispose();
        }
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public XML appendChild(Object obj) {
        XmlCursor newCursor = newCursor();
        if (newCursor.isStartdoc()) {
            newCursor.toFirstContentToken();
        }
        if (newCursor.isStart()) {
            newCursor.toEndToken();
        }
        insertChild(newCursor, obj);
        newCursor.dispose();
        return this;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public XMLList attribute(XMLName xMLName) {
        return matchAttributes(xMLName);
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public XMLList attributes() {
        return matchAttributes(XMLName.formStar());
    }

    public void changeNS(String str, String str2) {
        XmlCursor newCursor = newCursor();
        while (newCursor.toParent()) {
        }
        XmlCursor.TokenType currentTokenType = newCursor.currentTokenType();
        if (currentTokenType.isStartdoc()) {
            currentTokenType = newCursor.toFirstContentToken();
        }
        if (currentTokenType.isStart()) {
            do {
                if (currentTokenType.isStart() || currentTokenType.isAttr() || currentTokenType.isNamespace()) {
                    javax.xml.namespace.QName name = newCursor.getName();
                    if (str.equals(name.getNamespaceURI())) {
                        newCursor.setName(new javax.xml.namespace.QName(str2, name.getLocalPart()));
                    }
                }
                currentTokenType = newCursor.toNextToken();
                if (currentTokenType.isEnddoc()) {
                    break;
                }
            } while (!currentTokenType.isNone());
        }
        newCursor.dispose();
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public XMLList child(long j11) {
        XMLList xMLList = new XMLList(this.lib);
        xMLList.setTargets(this, null);
        xMLList.addToList(getXmlChild(j11));
        return xMLList;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public int childIndex() {
        XmlCursor newCursor = newCursor();
        XmlCursor.TokenType currentTokenType = newCursor.currentTokenType();
        int i11 = 0;
        while (true) {
            if (!currentTokenType.isText()) {
                if (!currentTokenType.isStart()) {
                    if (!currentTokenType.isComment() && !currentTokenType.isProcinst()) {
                        break;
                    }
                    newCursor.toPrevToken();
                    currentTokenType = newCursor.currentTokenType();
                } else {
                    if (!newCursor.toPrevToken().isEnd()) {
                        break;
                    }
                    newCursor.toNextToken();
                    if (!newCursor.toPrevSibling()) {
                        break;
                    }
                    i11++;
                    currentTokenType = newCursor.currentTokenType();
                }
            } else {
                i11++;
                if (!newCursor.toPrevSibling()) {
                    break;
                }
                currentTokenType = newCursor.currentTokenType();
            }
        }
        if (newCursor.currentTokenType().isStartdoc()) {
            i11 = -1;
        }
        newCursor.dispose();
        return i11;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public XMLList children() {
        return allChildNodes(null);
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public XMLList comments() {
        return matchChildren(XmlCursor.TokenType.COMMENT);
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public boolean contains(Object obj) {
        if (obj instanceof XML) {
            return equivalentXml(obj);
        }
        return false;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void delete(int i11) {
        if (i11 == 0) {
            remove();
        }
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public void deleteXMLProperty(XMLName xMLName) {
        if (xMLName.isDescendants() || !xMLName.isAttributeName()) {
            getPropertyList(xMLName).remove();
            return;
        }
        XmlCursor newCursor = newCursor();
        if (!xMLName.localName().equals("*")) {
            newCursor.removeAttribute(new javax.xml.namespace.QName(xMLName.uri(), xMLName.localName()));
        } else if (newCursor.toFirstAttribute()) {
            while (newCursor.currentTokenType().isAttr()) {
                newCursor.removeXml();
            }
        }
        newCursor.dispose();
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public XMLList descendants(XMLName xMLName) {
        return xMLName.isAttributeName() ? matchDescendantAttributes(xMLName) : matchDescendantChildren(xMLName);
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public boolean equivalentXml(Object obj) {
        if (!(obj instanceof XML)) {
            if (obj instanceof XMLList) {
                XMLList xMLList = (XMLList) obj;
                if (xMLList.length() == 1) {
                    return equivalentXml(xMLList.getXmlFromAnnotation(0));
                }
            } else if (hasSimpleContent()) {
                return toString().equals(ScriptRuntime.toString(obj));
            }
            return false;
        }
        XML xml = (XML) obj;
        XmlCursor.TokenType tokenType = tokenType();
        XmlCursor.TokenType tokenType2 = xml.tokenType();
        if (tokenType == XmlCursor.TokenType.ATTR || tokenType2 == XmlCursor.TokenType.ATTR || tokenType == XmlCursor.TokenType.TEXT || tokenType2 == XmlCursor.TokenType.TEXT) {
            return toString().equals(xml.toString());
        }
        XmlCursor newCursor = newCursor();
        XmlCursor newCursor2 = xml.newCursor();
        boolean nodesEqual = LogicalEquality.nodesEqual(newCursor, newCursor2);
        newCursor.dispose();
        newCursor2.dispose();
        return nodesEqual;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object get(int i11, Scriptable scriptable) {
        return i11 == 0 ? this : Scriptable.NOT_FOUND;
    }

    public XScriptAnnotation getAnnotation() {
        return this._anno;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "XML";
    }

    @Override // org.mozilla.javascript.xml.XMLObject
    public Scriptable getExtraMethodSource(Context context) {
        if (hasSimpleContent()) {
            return ScriptRuntime.toObjectOrNull(context, toString());
        }
        return null;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object[] getIds() {
        return this.prototypeFlag ? new Object[0] : new Object[]{new Integer(0)};
    }

    public Object[] getIdsForDebug() {
        return getIds();
    }

    public XMLList getPropertyList(XMLName xMLName) {
        return xMLName.isDescendants() ? descendants(xMLName) : xMLName.isAttributeName() ? attribute(xMLName) : child(xMLName);
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public Object getXMLProperty(XMLName xMLName) {
        return getPropertyList(xMLName);
    }

    public XML getXmlChild(long j11) {
        XmlCursor newCursor = newCursor();
        XML createXML = moveToChild(newCursor, j11, false, true) ? createXML(this.lib, newCursor) : null;
        newCursor.dispose();
        return createXML;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public XmlObject getXmlObject() {
        XmlCursor newCursor = newCursor();
        try {
            return newCursor.getObject();
        } finally {
            newCursor.dispose();
        }
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public boolean has(int i11, Scriptable scriptable) {
        return i11 == 0;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public boolean hasComplexContent() {
        return !hasSimpleContent();
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public boolean hasOwnProperty(XMLName xMLName) {
        return this.prototypeFlag ? findPrototypeId(xMLName.localName()) != 0 : getPropertyList(xMLName).length() > 0;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public boolean hasSimpleContent() {
        XmlCursor newCursor = newCursor();
        if (newCursor.isAttr() || newCursor.isText()) {
            return true;
        }
        if (newCursor.isStartdoc()) {
            newCursor.toFirstContentToken();
        }
        boolean z11 = !newCursor.toFirstChild();
        newCursor.dispose();
        return z11;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public boolean hasXMLProperty(XMLName xMLName) {
        return getPropertyList(xMLName).length() > 0;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public Object[] inScopeNamespaces() {
        XmlCursor newCursor = newCursor();
        Object[] inScopeNamespaces = NamespaceHelper.inScopeNamespaces(this.lib, newCursor);
        newCursor.dispose();
        return inScopeNamespaces;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public XML insertChildAfter(Object obj, Object obj2) {
        if (obj == null) {
            prependChild(obj2);
            return this;
        }
        if (obj instanceof XML) {
            insertChild((XML) obj, obj2, 1);
        }
        return this;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public XML insertChildBefore(Object obj, Object obj2) {
        if (obj == null) {
            appendChild(obj2);
            return this;
        }
        if (obj instanceof XML) {
            insertChild((XML) obj, obj2, 2);
        }
        return this;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public Object jsConstructor(Context context, boolean z11, Object[] objArr) {
        if (objArr.length == 0) {
            return createFromJS(this.lib, "");
        }
        Object obj = objArr[0];
        return (z11 || !(obj instanceof XML)) ? createFromJS(this.lib, obj) : obj;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public int length() {
        return 1;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public String localName() {
        XmlCursor newCursor = newCursor();
        if (newCursor.isStartdoc()) {
            newCursor.toFirstContentToken();
        }
        String localPart = (newCursor.isStart() || newCursor.isAttr() || newCursor.isProcinst()) ? newCursor.getName().getLocalPart() : null;
        newCursor.dispose();
        return localPart;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public QName name() {
        QName qName;
        XmlCursor newCursor = newCursor();
        if (newCursor.isStartdoc()) {
            newCursor.toFirstContentToken();
        }
        if (newCursor.isStart() || newCursor.isAttr() || newCursor.isProcinst()) {
            javax.xml.namespace.QName name = newCursor.getName();
            if (newCursor.isProcinst()) {
                qName = new QName(this.lib, "", name.getLocalPart(), "");
            } else {
                qName = new QName(this.lib, name.getNamespaceURI(), name.getLocalPart(), name.getPrefix());
            }
        } else {
            qName = null;
        }
        newCursor.dispose();
        return qName;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public Object namespace(String str) {
        Object namespace;
        XmlCursor newCursor = newCursor();
        if (newCursor.isStartdoc()) {
            newCursor.toFirstContentToken();
        }
        if (str != null) {
            String str2 = (String) NamespaceHelper.getAllNamespaces(this.lib, newCursor).get(str);
            namespace = str2 == null ? Undefined.instance : new Namespace(this.lib, str, str2);
        } else if (newCursor.isStart() || newCursor.isAttr()) {
            Object[] inScopeNamespaces = NamespaceHelper.inScopeNamespaces(this.lib, newCursor);
            XmlCursor newCursor2 = newCursor();
            if (newCursor2.isStartdoc()) {
                newCursor2.toFirstContentToken();
            }
            namespace = NamespaceHelper.getNamespace(this.lib, newCursor2, inScopeNamespaces);
            newCursor2.dispose();
        } else {
            namespace = null;
        }
        newCursor.dispose();
        return namespace;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public Object[] namespaceDeclarations() {
        XmlCursor newCursor = newCursor();
        Object[] namespaceDeclarations = NamespaceHelper.namespaceDeclarations(this.lib, newCursor);
        newCursor.dispose();
        return namespaceDeclarations;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public Object nodeKind() {
        XmlCursor.TokenType tokenType = tokenType();
        return tokenType == XmlCursor.TokenType.ATTR ? "attribute" : tokenType == XmlCursor.TokenType.TEXT ? "text" : tokenType == XmlCursor.TokenType.COMMENT ? "comment" : tokenType == XmlCursor.TokenType.PROCINST ? "processing-instruction" : tokenType == XmlCursor.TokenType.START ? "element" : "text";
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public void normalize() {
        XmlCursor newCursor = newCursor();
        XmlCursor.TokenType currentTokenType = newCursor.currentTokenType();
        if (currentTokenType.isStartdoc()) {
            currentTokenType = newCursor.toFirstContentToken();
        }
        if (currentTokenType.isContainer()) {
            int i11 = 1;
            String str = null;
            while (i11 > 0) {
                XmlCursor.TokenType nextToken = newCursor.toNextToken();
                if (nextToken == XmlCursor.TokenType.TEXT) {
                    String trim = newCursor.getChars().trim();
                    if (trim.trim().length() == 0) {
                        removeToken(newCursor);
                        newCursor.toPrevToken();
                    } else if (str == null) {
                        str = trim;
                    } else {
                        newCursor.toPrevToken();
                        removeToken(newCursor);
                        removeToken(newCursor);
                        newCursor.insertChars(str + trim);
                    }
                } else {
                    str = null;
                }
                if (nextToken.isStart()) {
                    i11++;
                } else if (nextToken.isEnd()) {
                    i11--;
                } else if (nextToken.isEnddoc()) {
                    break;
                }
            }
        }
        newCursor.dispose();
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public Object parent() {
        XmlCursor newCursor = newCursor();
        Object fromAnnotation = newCursor.isStartdoc() ? Undefined.instance : newCursor.toParent() ? newCursor.isStartdoc() ? Undefined.instance : getFromAnnotation(this.lib, findAnnotation(newCursor)) : Undefined.instance;
        newCursor.dispose();
        return fromAnnotation;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public XML prependChild(Object obj) {
        XmlCursor newCursor = newCursor();
        if (newCursor.isStartdoc()) {
            newCursor.toFirstContentToken();
        }
        newCursor.toFirstContentToken();
        insertChild(newCursor, obj);
        newCursor.dispose();
        return this;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public Object processingInstructions(XMLName xMLName) {
        return matchChildren(XmlCursor.TokenType.PROCINST, xMLName);
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public boolean propertyIsEnumerable(Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        }
        if (!(obj instanceof Number)) {
            return ScriptRuntime.toString(obj).equals("0");
        }
        double doubleValue = ((Number) obj).doubleValue();
        return doubleValue == 0.0d && 1.0d / doubleValue > 0.0d;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void put(int i11, Scriptable scriptable, Object obj) {
        throw ScriptRuntime.typeError("Assignment to indexed XML is not allowed");
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public void putXMLProperty(XMLName xMLName, Object obj) {
        XMLObjectImpl makeXmlFromString;
        if (this.prototypeFlag) {
            return;
        }
        if (obj == null) {
            obj = "null";
        } else if (obj instanceof Undefined) {
            obj = "undefined";
        }
        if (xMLName.isAttributeName()) {
            setAttribute(xMLName, obj);
            return;
        }
        if (xMLName.uri() == null && xMLName.localName().equals("*")) {
            setChildren(obj);
            return;
        }
        if (obj instanceof XMLObjectImpl) {
            makeXmlFromString = (XMLObjectImpl) obj;
            if ((makeXmlFromString instanceof XML) && ((XML) makeXmlFromString).tokenType() == XmlCursor.TokenType.ATTR) {
                makeXmlFromString = makeXmlFromString(this.lib, xMLName, makeXmlFromString.toString());
            }
            if (makeXmlFromString instanceof XMLList) {
                for (int i11 = 0; i11 < makeXmlFromString.length(); i11++) {
                    XMLList xMLList = (XMLList) makeXmlFromString;
                    XML item = xMLList.item(i11);
                    if (item.tokenType() == XmlCursor.TokenType.ATTR) {
                        xMLList.replace(i11, makeXmlFromString(this.lib, xMLName, item.toString()));
                    }
                }
            }
        } else {
            makeXmlFromString = makeXmlFromString(this.lib, xMLName, ScriptRuntime.toString(obj));
        }
        XMLList propertyList = getPropertyList(xMLName);
        if (propertyList.length() == 0) {
            appendChild(makeXmlFromString);
            return;
        }
        for (int i12 = 1; i12 < propertyList.length(); i12++) {
            removeChild(propertyList.item(i12).childIndex());
        }
        doPut(xMLName, propertyList.item(0), makeXmlFromString);
    }

    public void remove() {
        XmlCursor newCursor = newCursor();
        if (newCursor.currentTokenType().isStartdoc()) {
            for (XmlCursor.TokenType firstContentToken = newCursor.toFirstContentToken(); !firstContentToken.isEnd() && !firstContentToken.isEnddoc(); firstContentToken = newCursor.currentTokenType()) {
                removeToken(newCursor);
            }
        } else {
            removeToken(newCursor);
        }
        newCursor.dispose();
    }

    public void removeChild(long j11) {
        XmlCursor newCursor = newCursor();
        if (moveToChild(newCursor, j11, false, false)) {
            removeToken(newCursor);
        }
        newCursor.dispose();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009c, code lost:
    
        r0.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        return r10;
     */
    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.mozilla.javascript.xml.impl.xmlbeans.XML removeNamespace(org.mozilla.javascript.xml.impl.xmlbeans.Namespace r11) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.xml.impl.xmlbeans.XML.removeNamespace(org.mozilla.javascript.xml.impl.xmlbeans.Namespace):org.mozilla.javascript.xml.impl.xmlbeans.XML");
    }

    public void removeToken(XmlCursor xmlCursor) {
        XmlCursor newCursor = XmlObject.Factory.newInstance().newCursor();
        newCursor.toFirstContentToken();
        xmlCursor.moveXml(newCursor);
        newCursor.dispose();
    }

    public void replaceAll(XML xml) {
        XmlCursor newCursor = newCursor();
        replace(newCursor, xml);
        this._anno = xml._anno;
        newCursor.dispose();
    }

    public void setAttribute(XMLName xMLName, Object obj) {
        if (xMLName.uri() == null && xMLName.localName().equals("*")) {
            throw ScriptRuntime.typeError("@* assignment not supported.");
        }
        XmlCursor newCursor = newCursor();
        String scriptRuntime = ScriptRuntime.toString(obj);
        if (newCursor.currentTokenType().isStartdoc()) {
            newCursor.toFirstContentToken();
        }
        try {
            javax.xml.namespace.QName qName = new javax.xml.namespace.QName(xMLName.uri(), xMLName.localName());
            if (!newCursor.setAttributeText(qName, scriptRuntime)) {
                if (newCursor.currentTokenType().isStart()) {
                    newCursor.toNextToken();
                }
                newCursor.insertAttributeWithValue(qName, scriptRuntime);
            }
            newCursor.dispose();
        } catch (Exception e11) {
            throw ScriptRuntime.typeError(e11.getMessage());
        }
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public XML setChildren(Object obj) {
        getPropertyList(XMLName.formStar()).remove();
        appendChild(obj);
        return this;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public void setLocalName(String str) {
        XmlCursor newCursor = newCursor();
        try {
            if (newCursor.isStartdoc()) {
                newCursor.toFirstContentToken();
            }
            if (!newCursor.isText() && !newCursor.isComment()) {
                javax.xml.namespace.QName name = newCursor.getName();
                newCursor.setName(new javax.xml.namespace.QName(name.getNamespaceURI(), str, name.getPrefix()));
                newCursor.dispose();
            }
        } finally {
            newCursor.dispose();
        }
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public void setName(QName qName) {
        XmlCursor newCursor = newCursor();
        try {
            if (newCursor.isStartdoc()) {
                newCursor.toFirstContentToken();
            }
            if (!newCursor.isText() && !newCursor.isComment()) {
                if (newCursor.isProcinst()) {
                    newCursor.setName(new javax.xml.namespace.QName(qName.localName()));
                } else {
                    String prefix = qName.prefix();
                    if (prefix == null) {
                        prefix = "";
                    }
                    newCursor.setName(new javax.xml.namespace.QName(qName.uri(), qName.localName(), prefix));
                }
                newCursor.dispose();
            }
        } finally {
            newCursor.dispose();
        }
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public void setNamespace(Namespace namespace) {
        XmlCursor newCursor = newCursor();
        try {
            if (newCursor.isStartdoc()) {
                newCursor.toFirstContentToken();
            }
            if (!newCursor.isText() && !newCursor.isComment() && !newCursor.isProcinst()) {
                String prefix = namespace.prefix();
                if (prefix == null) {
                    prefix = "";
                }
                newCursor.setName(new javax.xml.namespace.QName(namespace.uri(), localName(), prefix));
                newCursor.dispose();
            }
        } finally {
            newCursor.dispose();
        }
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public XMLList text() {
        return matchChildren(XmlCursor.TokenType.TEXT);
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public String toSource(int i11) {
        return toXMLString(i11);
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public String toString() {
        XmlCursor newCursor = newCursor();
        if (newCursor.isStartdoc()) {
            newCursor.toFirstContentToken();
        }
        return newCursor.isText() ? newCursor.getChars() : (newCursor.isStart() && hasSimpleContent()) ? newCursor.getTextValue() : toXMLString(0);
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public String toXMLString(int i11) {
        String dumpNode;
        XmlCursor newCursor = newCursor();
        if (newCursor.isStartdoc()) {
            newCursor.toFirstContentToken();
        }
        try {
            if (newCursor.isText()) {
                dumpNode = newCursor.getChars();
            } else if (newCursor.isAttr()) {
                dumpNode = newCursor.getTextValue();
            } else {
                if (!newCursor.isComment() && !newCursor.isProcinst()) {
                    dumpNode = dumpNode(newCursor, getOptions());
                }
                dumpNode = dumpNode(newCursor, getOptions());
                if (dumpNode.startsWith("<xml-fragment>")) {
                    dumpNode = dumpNode.substring(14);
                }
                if (dumpNode.endsWith("</xml-fragment>")) {
                    dumpNode = dumpNode.substring(0, dumpNode.length() - 15);
                }
            }
            newCursor.dispose();
            return dumpNode;
        } catch (Throwable th2) {
            newCursor.dispose();
            throw th2;
        }
    }

    public XmlCursor.TokenType tokenType() {
        XmlCursor newCursor = newCursor();
        if (newCursor.isStartdoc()) {
            newCursor.toFirstContentToken();
        }
        XmlCursor.TokenType currentTokenType = newCursor.currentTokenType();
        newCursor.dispose();
        return currentTokenType;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
    
        if (r3.getLocalPart().equals(r1.getName().getLocalPart()) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.mozilla.javascript.xml.impl.xmlbeans.XMLList matchChildren(org.apache.xmlbeans.XmlCursor.TokenType r8, org.mozilla.javascript.xml.impl.xmlbeans.XMLName r9) {
        /*
            r7 = this;
            org.mozilla.javascript.xml.impl.xmlbeans.XMLList r0 = new org.mozilla.javascript.xml.impl.xmlbeans.XMLList
            org.mozilla.javascript.xml.impl.xmlbeans.XMLLibImpl r1 = r7.lib
            r0.<init>(r1)
            org.apache.xmlbeans.XmlCursor r1 = r7.newCursor()
            org.apache.xmlbeans.XmlCursor$TokenType r2 = r1.currentTokenType()
            javax.xml.namespace.QName r3 = new javax.xml.namespace.QName
            java.lang.String r4 = r9.uri()
            java.lang.String r5 = r9.localName()
            r3.<init>(r4, r5)
            boolean r4 = r2.isStartdoc()
            if (r4 == 0) goto L26
            org.apache.xmlbeans.XmlCursor$TokenType r2 = r1.toFirstContentToken()
        L26:
            boolean r2 = r2.isContainer()
            if (r2 == 0) goto L93
            org.apache.xmlbeans.XmlCursor$TokenType r2 = r1.toFirstContentToken()
        L30:
            boolean r4 = r2.isEnd()
            if (r4 != 0) goto L93
            if (r2 != r8) goto L85
            boolean r4 = r2.isStart()
            r5 = 0
            if (r4 != 0) goto L4e
            boolean r4 = r2.isProcinst()
            if (r4 != 0) goto L4e
            org.mozilla.javascript.xml.impl.xmlbeans.XML$XScriptAnnotation r3 = findAnnotation(r1)
            r0.addToList(r3)
        L4c:
            r3 = r5
            goto L85
        L4e:
            javax.xml.namespace.QName r4 = r1.getName()
            boolean r4 = r7.qnameMatches(r9, r4)
            if (r4 == 0) goto L85
            org.mozilla.javascript.xml.impl.xmlbeans.XML$XScriptAnnotation r4 = findAnnotation(r1)
            r0.addToList(r4)
            if (r3 == 0) goto L85
            java.lang.String r4 = r3.getLocalPart()
            java.lang.String r6 = "*"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L72
            javax.xml.namespace.QName r3 = r1.getName()
            goto L85
        L72:
            java.lang.String r4 = r3.getLocalPart()
            javax.xml.namespace.QName r6 = r1.getName()
            java.lang.String r6 = r6.getLocalPart()
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L85
            goto L4c
        L85:
            boolean r2 = r2.isStart()
            if (r2 == 0) goto L8e
            r1.toEndToken()
        L8e:
            org.apache.xmlbeans.XmlCursor$TokenType r2 = r1.toNextToken()
            goto L30
        L93:
            r1.dispose()
            org.apache.xmlbeans.XmlCursor$TokenType r9 = org.apache.xmlbeans.XmlCursor.TokenType.START
            if (r8 != r9) goto L9d
            r0.setTargets(r7, r3)
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.xml.impl.xmlbeans.XML.matchChildren(org.apache.xmlbeans.XmlCursor$TokenType, org.mozilla.javascript.xml.impl.xmlbeans.XMLName):org.mozilla.javascript.xml.impl.xmlbeans.XMLList");
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public XMLList child(XMLName xMLName) {
        if (xMLName == null) {
            return new XMLList(this.lib);
        }
        if (xMLName.localName().equals("*")) {
            return allChildNodes(xMLName.uri());
        }
        return matchChildren(XmlCursor.TokenType.START, xMLName);
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public XML replace(long j11, Object obj) {
        XMLList child = child(j11);
        if (child.length() > 0) {
            insertChildAfter(child.item(0), obj);
            removeChild(j11);
        }
        return this;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public Object copy() {
        XmlCursor newCursor = newCursor();
        if (newCursor.isStartdoc()) {
            newCursor.toFirstContentToken();
        }
        XML createEmptyXML = createEmptyXML(this.lib);
        XmlCursor newCursor2 = createEmptyXML.newCursor();
        newCursor2.toFirstContentToken();
        newCursor.copyXml(newCursor2);
        newCursor2.dispose();
        newCursor.dispose();
        return createEmptyXML;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public XML replace(XMLName xMLName, Object obj) {
        putXMLProperty(xMLName, obj);
        return this;
    }

    private void insertChild(XML xml, Object obj, int i11) {
        XmlCursor newCursor = newCursor();
        XmlCursor.TokenType currentTokenType = newCursor.currentTokenType();
        XmlCursor newCursor2 = xml.newCursor();
        if (currentTokenType.isStartdoc()) {
            currentTokenType = newCursor.toFirstContentToken();
        }
        if (currentTokenType.isContainer()) {
            XmlCursor.TokenType nextToken = newCursor.toNextToken();
            while (true) {
                if (nextToken.isEnd()) {
                    break;
                }
                if (nextToken.isStart() && newCursor.comparePosition(newCursor2) == 0) {
                    if (i11 == 1) {
                        newCursor.toEndToken();
                        newCursor.toNextToken();
                    }
                    insertChild(newCursor, obj);
                } else {
                    if (nextToken.isStart()) {
                        newCursor.toEndToken();
                    }
                    nextToken = newCursor.toNextToken();
                }
            }
        }
        newCursor2.dispose();
        newCursor.dispose();
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public Object valueOf() {
        return this;
    }
}
