package com.xiaomi.push;

import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes8.dex */
public class fp {

    /* renamed from: a, reason: collision with root package name */
    private XmlPullParser f45577a;

    public fp() {
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            this.f45577a = newPullParser;
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        } catch (XmlPullParserException unused) {
        }
    }

    public gm a(byte[] bArr, fv fvVar) {
        String name;
        String str;
        this.f45577a.setInput(new InputStreamReader(new ByteArrayInputStream(bArr)));
        this.f45577a.next();
        int eventType = this.f45577a.getEventType();
        String name2 = this.f45577a.getName();
        if (eventType != 2) {
            return null;
        }
        if (name2.equals("message")) {
            return gu.a(this.f45577a);
        }
        if (name2.equals("iq")) {
            return gu.a(this.f45577a, fvVar);
        }
        if (name2.equals("presence")) {
            return gu.m5999a(this.f45577a);
        }
        if (this.f45577a.getName().equals("stream")) {
            return null;
        }
        if (this.f45577a.getName().equals("error")) {
            throw new gg(gu.m6000a(this.f45577a));
        }
        if (this.f45577a.getName().equals("warning")) {
            this.f45577a.next();
            name = this.f45577a.getName();
            str = "multi-login";
        } else {
            name = this.f45577a.getName();
            str = "bind";
        }
        name.equals(str);
        return null;
    }
}
