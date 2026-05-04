package com.xiaomi.push.service;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.xiaomi.push.gj;
import com.xiaomi.push.gs;
import com.xiaomi.push.gt;
import com.xiaomi.push.gx;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes8.dex */
public class k implements gs {
    public static gj a(XmlPullParser xmlPullParser) {
        String[] strArr;
        String[] strArr2;
        String str;
        ArrayList arrayList;
        if (xmlPullParser.getEventType() != 2) {
            return null;
        }
        String name = xmlPullParser.getName();
        String namespace = xmlPullParser.getNamespace();
        if (xmlPullParser.getAttributeCount() > 0) {
            String[] strArr3 = new String[xmlPullParser.getAttributeCount()];
            String[] strArr4 = new String[xmlPullParser.getAttributeCount()];
            for (int i11 = 0; i11 < xmlPullParser.getAttributeCount(); i11++) {
                strArr3[i11] = xmlPullParser.getAttributeName(i11);
                strArr4[i11] = gx.b(xmlPullParser.getAttributeValue(i11));
            }
            strArr = strArr3;
            str = null;
            arrayList = null;
            strArr2 = strArr4;
        } else {
            strArr = null;
            strArr2 = null;
            str = null;
            arrayList = null;
        }
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3) {
                return new gj(name, namespace, strArr, strArr2, str, arrayList);
            }
            if (next == 4) {
                str = xmlPullParser.getText().trim();
            } else if (next == 2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                gj a11 = a(xmlPullParser);
                if (a11 != null) {
                    arrayList.add(a11);
                }
            }
        }
    }

    public gj b(XmlPullParser xmlPullParser) {
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1 && eventType != 2) {
            eventType = xmlPullParser.next();
        }
        if (eventType == 2) {
            return a(xmlPullParser);
        }
        return null;
    }

    public void a() {
        gt.a().a(TtmlNode.COMBINE_ALL, "xm:chat", this);
    }
}
