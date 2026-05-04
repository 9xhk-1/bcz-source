package com.xiaomi.push;

import com.vivo.push.PushClientConstants;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes8.dex */
public final class gb {

    /* renamed from: a, reason: collision with root package name */
    private static int f45600a = 5000;

    /* renamed from: a, reason: collision with other field name */
    private static Vector<String> f457a = new Vector<>();

    /* renamed from: b, reason: collision with root package name */
    private static int f45601b = 330000;

    /* renamed from: c, reason: collision with root package name */
    private static int f45602c = 600000;

    /* renamed from: d, reason: collision with root package name */
    private static int f45603d = 330000;

    static {
        try {
            for (ClassLoader classLoader : m5984a()) {
                Enumeration<URL> resources = classLoader.getResources("META-INF/smack-config.xml");
                while (resources.hasMoreElements()) {
                    InputStream inputStream = null;
                    try {
                        try {
                            inputStream = resources.nextElement().openStream();
                            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                            newPullParser.setInput(inputStream, "UTF-8");
                            int eventType = newPullParser.getEventType();
                            do {
                                if (eventType == 2) {
                                    if (newPullParser.getName().equals(PushClientConstants.TAG_CLASS_NAME)) {
                                        a(newPullParser);
                                    } else if (newPullParser.getName().equals("packetReplyTimeout")) {
                                        f45600a = a(newPullParser, f45600a);
                                    } else if (newPullParser.getName().equals("keepAliveInterval")) {
                                        f45601b = a(newPullParser, f45601b);
                                    } else if (newPullParser.getName().equals("mechName")) {
                                        f457a.add(newPullParser.nextText());
                                    }
                                }
                                eventType = newPullParser.next();
                            } while (eventType != 1);
                        } catch (Throwable th2) {
                            try {
                                inputStream.close();
                            } catch (Exception unused) {
                            }
                            throw th2;
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                    try {
                        inputStream.close();
                    } catch (Exception unused2) {
                    }
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    private gb() {
    }

    public static int a() {
        return f45601b;
    }

    public static int b() {
        return f45602c;
    }

    private static int a(XmlPullParser xmlPullParser, int i11) {
        try {
            return Integer.parseInt(xmlPullParser.nextText());
        } catch (NumberFormatException e11) {
            e11.printStackTrace();
            return i11;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static String m5983a() {
        return "3.1.0";
    }

    private static void a(XmlPullParser xmlPullParser) {
        String nextText = xmlPullParser.nextText();
        try {
            Class.forName(nextText);
        } catch (ClassNotFoundException unused) {
            System.err.println("Error! A startup class specified in smack-config.xml could not be loaded: " + nextText);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private static ClassLoader[] m5984a() {
        ClassLoader[] classLoaderArr = {gb.class.getClassLoader(), Thread.currentThread().getContextClassLoader()};
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < 2; i11++) {
            ClassLoader classLoader = classLoaderArr[i11];
            if (classLoader != null) {
                arrayList.add(classLoader);
            }
        }
        return (ClassLoader[]) arrayList.toArray(new ClassLoader[arrayList.size()]);
    }
}
