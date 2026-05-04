package com.xiaomi.push;

import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.tencent.connect.common.Constants;
import com.xiaomi.push.gk;
import com.xiaomi.push.go;
import com.xiaomi.push.gq;
import com.xiaomi.push.service.bg;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes8.dex */
public class gu {

    /* renamed from: a, reason: collision with root package name */
    private static XmlPullParser f45694a;

    public static gj a(String str, String str2, XmlPullParser xmlPullParser) {
        Object m5997a = gt.a().m5997a(TtmlNode.COMBINE_ALL, "xm:chat");
        if (m5997a == null || !(m5997a instanceof com.xiaomi.push.service.k)) {
            return null;
        }
        return ((com.xiaomi.push.service.k) m5997a).b(xmlPullParser);
    }

    private static String b(XmlPullParser xmlPullParser) {
        for (int i11 = 0; i11 < xmlPullParser.getAttributeCount(); i11++) {
            String attributeName = xmlPullParser.getAttributeName(i11);
            if ("xml:lang".equals(attributeName) || (CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL.equals(attributeName) && "xml".equals(xmlPullParser.getAttributePrefix(i11)))) {
                return xmlPullParser.getAttributeValue(i11);
            }
        }
        return null;
    }

    public static gk a(XmlPullParser xmlPullParser, fv fvVar) {
        String attributeValue = xmlPullParser.getAttributeValue("", "id");
        String attributeValue2 = xmlPullParser.getAttributeValue("", "to");
        String attributeValue3 = xmlPullParser.getAttributeValue("", "from");
        String attributeValue4 = xmlPullParser.getAttributeValue("", "chid");
        gk.a a11 = gk.a.a(xmlPullParser.getAttributeValue("", "type"));
        HashMap hashMap = new HashMap();
        boolean z11 = false;
        for (int i11 = 0; i11 < xmlPullParser.getAttributeCount(); i11++) {
            String attributeName = xmlPullParser.getAttributeName(i11);
            hashMap.put(attributeName, xmlPullParser.getAttributeValue("", attributeName));
        }
        gk gkVar = null;
        gq gqVar = null;
        while (!z11) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (name.equals("error")) {
                    gqVar = m6001a(xmlPullParser);
                } else {
                    gkVar = new gk();
                    gkVar.a(a(name, namespace, xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("iq")) {
                z11 = true;
            }
        }
        if (gkVar == null) {
            if (gk.a.f45622a == a11 || gk.a.f45623b == a11) {
                gv gvVar = new gv();
                gvVar.k(attributeValue);
                gvVar.m(attributeValue3);
                gvVar.n(attributeValue2);
                gvVar.a(gk.a.f45625d);
                gvVar.l(attributeValue4);
                gvVar.a(new gq(gq.a.f45672e));
                fvVar.a(gvVar);
                com.xiaomi.channel.commonutils.logger.b.d("iq usage error. send packet in packet parser.");
                return null;
            }
            gkVar = new gw();
        }
        gkVar.k(attributeValue);
        gkVar.m(attributeValue2);
        gkVar.l(attributeValue4);
        gkVar.n(attributeValue3);
        gkVar.a(a11);
        gkVar.a(gqVar);
        gkVar.a(hashMap);
        return gkVar;
    }

    public static gm a(XmlPullParser xmlPullParser) {
        String str;
        boolean z11 = false;
        String str2 = null;
        if ("1".equals(xmlPullParser.getAttributeValue("", "s"))) {
            String attributeValue = xmlPullParser.getAttributeValue("", "chid");
            String attributeValue2 = xmlPullParser.getAttributeValue("", "id");
            String attributeValue3 = xmlPullParser.getAttributeValue("", "from");
            String attributeValue4 = xmlPullParser.getAttributeValue("", "to");
            String attributeValue5 = xmlPullParser.getAttributeValue("", "type");
            bg.b a11 = com.xiaomi.push.service.bg.a().a(attributeValue, attributeValue4);
            if (a11 == null) {
                a11 = com.xiaomi.push.service.bg.a().a(attributeValue, attributeValue3);
            }
            if (a11 == null) {
                throw new gg("the channel id is wrong while receiving a encrypted message");
            }
            gm gmVar = null;
            while (!z11) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if (!"s".equals(xmlPullParser.getName())) {
                        throw new gg("error while receiving a encrypted message with wrong format");
                    }
                    if (xmlPullParser.next() != 4) {
                        throw new gg("error while receiving a encrypted message with wrong format");
                    }
                    String text = xmlPullParser.getText();
                    if ("5".equals(attributeValue) || Constants.VIA_SHARE_TYPE_INFO.equals(attributeValue)) {
                        gl glVar = new gl();
                        glVar.l(attributeValue);
                        glVar.b(true);
                        glVar.n(attributeValue3);
                        glVar.m(attributeValue4);
                        glVar.k(attributeValue2);
                        glVar.f(attributeValue5);
                        gj gjVar = new gj("s", null, null, null);
                        gjVar.m5988a(text);
                        glVar.a(gjVar);
                        return glVar;
                    }
                    a(com.xiaomi.push.service.bp.a(com.xiaomi.push.service.bp.a(a11.f46287h, attributeValue2), text));
                    f45694a.next();
                    gmVar = a(f45694a);
                } else if (next == 3 && xmlPullParser.getName().equals("message")) {
                    z11 = true;
                }
            }
            if (gmVar != null) {
                return gmVar;
            }
            throw new gg("error while receiving a encrypted message with wrong format");
        }
        gl glVar2 = new gl();
        String attributeValue6 = xmlPullParser.getAttributeValue("", "id");
        if (attributeValue6 == null) {
            attributeValue6 = "ID_NOT_AVAILABLE";
        }
        glVar2.k(attributeValue6);
        glVar2.m(xmlPullParser.getAttributeValue("", "to"));
        glVar2.n(xmlPullParser.getAttributeValue("", "from"));
        glVar2.l(xmlPullParser.getAttributeValue("", "chid"));
        glVar2.a(xmlPullParser.getAttributeValue("", "appid"));
        try {
            str = xmlPullParser.getAttributeValue("", "transient");
        } catch (Exception unused) {
            str = null;
        }
        try {
            String attributeValue7 = xmlPullParser.getAttributeValue("", ma.b.f72887a);
            if (!TextUtils.isEmpty(attributeValue7)) {
                glVar2.b(attributeValue7);
            }
        } catch (Exception unused2) {
        }
        try {
            String attributeValue8 = xmlPullParser.getAttributeValue("", "mseq");
            if (!TextUtils.isEmpty(attributeValue8)) {
                glVar2.c(attributeValue8);
            }
        } catch (Exception unused3) {
        }
        try {
            String attributeValue9 = xmlPullParser.getAttributeValue("", "fseq");
            if (!TextUtils.isEmpty(attributeValue9)) {
                glVar2.d(attributeValue9);
            }
        } catch (Exception unused4) {
        }
        try {
            String attributeValue10 = xmlPullParser.getAttributeValue("", "status");
            if (!TextUtils.isEmpty(attributeValue10)) {
                glVar2.e(attributeValue10);
            }
        } catch (Exception unused5) {
        }
        glVar2.a(!TextUtils.isEmpty(str) && str.equalsIgnoreCase(n6.m.f74525c));
        glVar2.f(xmlPullParser.getAttributeValue("", "type"));
        String b11 = b(xmlPullParser);
        if (b11 == null || "".equals(b11.trim())) {
            gm.q();
        } else {
            glVar2.j(b11);
        }
        while (!z11) {
            int next2 = xmlPullParser.next();
            if (next2 == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (TextUtils.isEmpty(namespace)) {
                    namespace = "xm";
                }
                if (name.equals("subject")) {
                    b(xmlPullParser);
                    glVar2.g(m6002a(xmlPullParser));
                } else if (name.equals(TtmlNode.TAG_BODY)) {
                    String attributeValue11 = xmlPullParser.getAttributeValue("", "encode");
                    String m6002a = m6002a(xmlPullParser);
                    if (TextUtils.isEmpty(attributeValue11)) {
                        glVar2.h(m6002a);
                    } else {
                        glVar2.a(m6002a, attributeValue11);
                    }
                } else if (name.equals("thread")) {
                    if (str2 == null) {
                        str2 = xmlPullParser.nextText();
                    }
                } else if (name.equals("error")) {
                    glVar2.a(m6001a(xmlPullParser));
                } else {
                    glVar2.a(a(name, namespace, xmlPullParser));
                }
            } else if (next2 == 3 && xmlPullParser.getName().equals("message")) {
                z11 = true;
            }
        }
        glVar2.i(str2);
        return glVar2;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static go m5999a(XmlPullParser xmlPullParser) {
        go.b bVar = go.b.available;
        String attributeValue = xmlPullParser.getAttributeValue("", "type");
        if (attributeValue != null && !attributeValue.equals("")) {
            try {
                bVar = go.b.valueOf(attributeValue);
            } catch (IllegalArgumentException unused) {
                System.err.println("Found invalid presence type " + attributeValue);
            }
        }
        go goVar = new go(bVar);
        goVar.m(xmlPullParser.getAttributeValue("", "to"));
        goVar.n(xmlPullParser.getAttributeValue("", "from"));
        goVar.l(xmlPullParser.getAttributeValue("", "chid"));
        String attributeValue2 = xmlPullParser.getAttributeValue("", "id");
        if (attributeValue2 == null) {
            attributeValue2 = "ID_NOT_AVAILABLE";
        }
        goVar.k(attributeValue2);
        boolean z11 = false;
        while (!z11) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (name.equals("status")) {
                    goVar.a(xmlPullParser.nextText());
                } else if (name.equals("priority")) {
                    try {
                        goVar.a(Integer.parseInt(xmlPullParser.nextText()));
                    } catch (NumberFormatException unused2) {
                    } catch (IllegalArgumentException unused3) {
                        goVar.a(0);
                    }
                } else if (name.equals(ma.v.f73050u)) {
                    String nextText = xmlPullParser.nextText();
                    try {
                        goVar.a(go.a.valueOf(nextText));
                    } catch (IllegalArgumentException unused4) {
                        System.err.println("Found invalid presence mode " + nextText);
                    }
                } else if (name.equals("error")) {
                    goVar.a(m6001a(xmlPullParser));
                } else {
                    goVar.a(a(name, namespace, xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("presence")) {
                z11 = true;
            }
        }
        return goVar;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static gp m6000a(XmlPullParser xmlPullParser) {
        gp gpVar = null;
        boolean z11 = false;
        while (!z11) {
            int next = xmlPullParser.next();
            if (next == 2) {
                gpVar = new gp(xmlPullParser.getName());
            } else if (next == 3 && xmlPullParser.getName().equals("error")) {
                z11 = true;
            }
        }
        return gpVar;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static gq m6001a(XmlPullParser xmlPullParser) {
        ArrayList arrayList = new ArrayList();
        String str = "-1";
        String str2 = null;
        boolean z11 = false;
        String str3 = null;
        String str4 = null;
        for (int i11 = 0; i11 < xmlPullParser.getAttributeCount(); i11++) {
            if (xmlPullParser.getAttributeName(i11).equals("code")) {
                str = xmlPullParser.getAttributeValue("", "code");
            }
            if (xmlPullParser.getAttributeName(i11).equals("type")) {
                str3 = xmlPullParser.getAttributeValue("", "type");
            }
            if (xmlPullParser.getAttributeName(i11).equals("reason")) {
                str4 = xmlPullParser.getAttributeValue("", "reason");
            }
        }
        String str5 = str4;
        String str6 = null;
        while (!z11) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("text")) {
                    str6 = xmlPullParser.nextText();
                } else {
                    String name = xmlPullParser.getName();
                    String namespace = xmlPullParser.getNamespace();
                    if ("urn:ietf:params:xml:ns:xmpp-stanzas".equals(namespace)) {
                        str2 = name;
                    } else {
                        arrayList.add(a(name, namespace, xmlPullParser));
                    }
                }
            } else if (next == 3) {
                if (xmlPullParser.getName().equals("error")) {
                    z11 = true;
                }
            } else if (next == 4) {
                str6 = xmlPullParser.getText();
            }
        }
        if (str3 == null) {
            str3 = "cancel";
        }
        return new gq(Integer.parseInt(str), str3, str5, str2, str6, arrayList);
    }

    /* renamed from: a, reason: collision with other method in class */
    private static String m6002a(XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        String str = "";
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getDepth() == depth) {
                return str;
            }
            str = str + xmlPullParser.getText();
        }
    }

    private static void a(byte[] bArr) {
        if (f45694a == null) {
            try {
                XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                f45694a = newPullParser;
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            } catch (XmlPullParserException e11) {
                e11.printStackTrace();
            }
        }
        f45694a.setInput(new InputStreamReader(new ByteArrayInputStream(bArr)));
    }
}
