package bs;

import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c {
    public static XmlPullParser a() throws XmlPullParserException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
        newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        return newPullParser;
    }
}
