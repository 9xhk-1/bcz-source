package org.mozilla.javascript.xml.impl.xmlbeans;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import org.apache.xmlbeans.XmlCursor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class LogicalEquality {
    private static boolean attributeListsEqual(XmlCursor xmlCursor, XmlCursor xmlCursor2) {
        TreeMap loadAttributeMap = loadAttributeMap(xmlCursor);
        TreeMap loadAttributeMap2 = loadAttributeMap(xmlCursor2);
        if (loadAttributeMap.size() != loadAttributeMap2.size()) {
            return false;
        }
        Set keySet = loadAttributeMap.keySet();
        Set keySet2 = loadAttributeMap2.keySet();
        Iterator it = keySet.iterator();
        Iterator it2 = keySet2.iterator();
        boolean z11 = true;
        while (z11 && it.hasNext()) {
            String str = (String) it.next();
            String str2 = (String) it2.next();
            if (!str.equals(str2) || !qnamesEqual((javax.xml.namespace.QName) loadAttributeMap.get(str), (javax.xml.namespace.QName) loadAttributeMap2.get(str2))) {
                z11 = false;
            }
        }
        return z11;
    }

    private static boolean attributesEqual(XmlCursor xmlCursor, XmlCursor xmlCursor2) {
        return xmlCursor.isAttr() && xmlCursor2.isAttr() && qnamesEqual(xmlCursor.getName(), xmlCursor2.getName()) && xmlCursor.getTextValue().equals(xmlCursor2.getTextValue());
    }

    private static boolean commentsEqual(XmlCursor xmlCursor, XmlCursor xmlCursor2) {
        return xmlCursor.isComment() && xmlCursor2.isComment() && xmlCursor.getTextValue().equals(xmlCursor2.getTextValue());
    }

    private static boolean elementsEqual(XmlCursor xmlCursor, XmlCursor xmlCursor2) {
        if (!qnamesEqual(xmlCursor.getName(), xmlCursor2.getName())) {
            return false;
        }
        nextToken(xmlCursor);
        nextToken(xmlCursor2);
        boolean z11 = true;
        while (xmlCursor.currentTokenType() == xmlCursor2.currentTokenType()) {
            if (xmlCursor.isEnd() || xmlCursor.isEnddoc()) {
                return z11;
            }
            if (xmlCursor.isAttr()) {
                z11 = attributeListsEqual(xmlCursor, xmlCursor2);
            } else {
                if (xmlCursor.isText()) {
                    z11 = textNodesEqual(xmlCursor, xmlCursor2);
                } else if (xmlCursor.isComment()) {
                    z11 = commentsEqual(xmlCursor, xmlCursor2);
                } else if (xmlCursor.isProcinst()) {
                    z11 = processingInstructionsEqual(xmlCursor, xmlCursor2);
                } else if (xmlCursor.isStart()) {
                    z11 = elementsEqual(xmlCursor, xmlCursor2);
                }
                nextToken(xmlCursor);
                nextToken(xmlCursor2);
            }
            if (!z11) {
                return z11;
            }
        }
        return false;
    }

    private static TreeMap loadAttributeMap(XmlCursor xmlCursor) {
        TreeMap treeMap = new TreeMap();
        while (xmlCursor.isAttr()) {
            treeMap.put(xmlCursor.getTextValue(), xmlCursor.getName());
            nextToken(xmlCursor);
        }
        return treeMap;
    }

    private static void nextToken(XmlCursor xmlCursor) {
        do {
            xmlCursor.toNextToken();
            if (!xmlCursor.isText()) {
                return;
            }
        } while (xmlCursor.getChars().trim().length() <= 0);
    }

    public static boolean nodesEqual(XmlCursor xmlCursor, XmlCursor xmlCursor2) {
        if (xmlCursor.isStartdoc()) {
            xmlCursor.toFirstContentToken();
        }
        if (xmlCursor2.isStartdoc()) {
            xmlCursor2.toFirstContentToken();
        }
        if (xmlCursor.currentTokenType() != xmlCursor2.currentTokenType()) {
            return false;
        }
        if (xmlCursor.isEnddoc()) {
            return true;
        }
        if (xmlCursor.isAttr()) {
            return attributesEqual(xmlCursor, xmlCursor2);
        }
        if (xmlCursor.isText()) {
            return textNodesEqual(xmlCursor, xmlCursor2);
        }
        if (xmlCursor.isComment()) {
            return commentsEqual(xmlCursor, xmlCursor2);
        }
        if (xmlCursor.isProcinst()) {
            return processingInstructionsEqual(xmlCursor, xmlCursor2);
        }
        if (xmlCursor.isStart()) {
            return elementsEqual(xmlCursor, xmlCursor2);
        }
        return false;
    }

    private static boolean processingInstructionsEqual(XmlCursor xmlCursor, XmlCursor xmlCursor2) {
        return xmlCursor.isProcinst() && xmlCursor2.isProcinst() && qnamesEqual(xmlCursor.getName(), xmlCursor2.getName()) && xmlCursor.getTextValue().equals(xmlCursor2.getTextValue());
    }

    private static boolean qnamesEqual(javax.xml.namespace.QName qName, javax.xml.namespace.QName qName2) {
        return qName.getNamespaceURI().equals(qName2.getNamespaceURI()) && qName.getLocalPart().equals(qName2.getLocalPart());
    }

    private static boolean textNodesEqual(XmlCursor xmlCursor, XmlCursor xmlCursor2) {
        return xmlCursor.isText() && xmlCursor2.isText() && xmlCursor.getChars().equals(xmlCursor2.getChars());
    }
}
