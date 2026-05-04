package bs;

import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class d {
    public static XmlPullParserFactory a() throws XmlPullParserException {
        XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
        newInstance.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        newInstance.setFeature("http://xmlpull.org/v1/doc/features.html#report-namespace-prefixes", false);
        newInstance.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
        newInstance.setFeature("http://xmlpull.org/v1/doc/features.html#validation", false);
        return newInstance;
    }
}
