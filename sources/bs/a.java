package bs;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {
    public static DocumentBuilderFactory a() throws ParserConfigurationException, NullPointerException {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setFeature("http://xml.org/sax/features/namespaces", true);
        newInstance.setFeature("http://xml.org/sax/features/validation", false);
        newInstance.setExpandEntityReferences(false);
        return newInstance;
    }
}
