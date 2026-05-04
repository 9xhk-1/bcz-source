package com.xiaomi.push;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes8.dex */
public class gt {

    /* renamed from: a, reason: collision with root package name */
    private static gt f45692a;

    /* renamed from: a, reason: collision with other field name */
    private Map<String, Object> f483a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Object> f45693b = new ConcurrentHashMap();

    private gt() {
        m5998a();
    }

    public static synchronized gt a() {
        gt gtVar;
        synchronized (gt.class) {
            try {
                if (f45692a == null) {
                    f45692a = new gt();
                }
                gtVar = f45692a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gtVar;
    }

    /* renamed from: a, reason: collision with other method in class */
    public Object m5997a(String str, String str2) {
        return this.f483a.get(a(str, str2));
    }

    private String a(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<");
        sb2.append(str);
        sb2.append("/>");
        if (str != null) {
            sb2.append("<");
            sb2.append(str2);
            sb2.append("/>");
        }
        return sb2.toString();
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m5998a() {
        InputStream inputStream;
        String a11;
        Map<String, Object> map;
        Object obj;
        try {
            for (ClassLoader classLoader : m5996a()) {
                Enumeration<URL> resources = classLoader.getResources("META-INF/smack.providers");
                while (resources.hasMoreElements()) {
                    try {
                        inputStream = resources.nextElement().openStream();
                        try {
                            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                            newPullParser.setInput(inputStream, "UTF-8");
                            int eventType = newPullParser.getEventType();
                            do {
                                if (eventType == 2) {
                                    if (newPullParser.getName().equals("iqProvider")) {
                                        newPullParser.next();
                                        newPullParser.next();
                                        String nextText = newPullParser.nextText();
                                        newPullParser.next();
                                        newPullParser.next();
                                        String nextText2 = newPullParser.nextText();
                                        newPullParser.next();
                                        newPullParser.next();
                                        String nextText3 = newPullParser.nextText();
                                        a11 = a(nextText, nextText2);
                                        if (!this.f45693b.containsKey(a11)) {
                                            try {
                                                Class<?> cls = Class.forName(nextText3);
                                                if (gr.class.isAssignableFrom(cls)) {
                                                    map = this.f45693b;
                                                    obj = cls.newInstance();
                                                } else if (gk.class.isAssignableFrom(cls)) {
                                                    map = this.f45693b;
                                                    obj = cls;
                                                }
                                            } catch (ClassNotFoundException e11) {
                                                e11.printStackTrace();
                                            }
                                        }
                                    } else if (newPullParser.getName().equals("extensionProvider")) {
                                        newPullParser.next();
                                        newPullParser.next();
                                        String nextText4 = newPullParser.nextText();
                                        newPullParser.next();
                                        newPullParser.next();
                                        String nextText5 = newPullParser.nextText();
                                        newPullParser.next();
                                        newPullParser.next();
                                        String nextText6 = newPullParser.nextText();
                                        a11 = a(nextText4, nextText5);
                                        if (!this.f483a.containsKey(a11)) {
                                            Class<?> cls2 = Class.forName(nextText6);
                                            if (gs.class.isAssignableFrom(cls2)) {
                                                map = this.f483a;
                                                obj = cls2.newInstance();
                                            } else if (gn.class.isAssignableFrom(cls2)) {
                                                map = this.f483a;
                                                obj = cls2;
                                            }
                                        }
                                    }
                                    map.put(a11, obj);
                                }
                                eventType = newPullParser.next();
                            } while (eventType != 1);
                            inputStream.close();
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                inputStream.close();
                            } catch (Exception unused) {
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream = null;
                    }
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    public void a(String str, String str2, Object obj) {
        if (!(obj instanceof gs) && !(obj instanceof Class)) {
            throw new IllegalArgumentException("Provider must be a PacketExtensionProvider or a Class instance.");
        }
        this.f483a.put(a(str, str2), obj);
    }

    /* renamed from: a, reason: collision with other method in class */
    private ClassLoader[] m5996a() {
        ClassLoader[] classLoaderArr = {gt.class.getClassLoader(), Thread.currentThread().getContextClassLoader()};
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
