package lb;

import ba0.j1;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.jar.JarFile;
import qb.c;
import qb.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static a f70842c = new a();

    /* renamed from: a, reason: collision with root package name */
    public Map<String, Properties> f70843a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public String f70844b;

    public a() {
        o();
    }

    public static a i() {
        return f70842c;
    }

    public final void a(Properties ps2) throws Exception {
        for (String str : ps2.stringPropertyNames()) {
            String property = ps2.getProperty(str);
            if (property != null) {
                ps2.setProperty(str, new String(property.getBytes("ISO-8859-1"), "utf-8").trim());
            }
        }
    }

    public boolean b(String namespace, String key) {
        return c(namespace, key, false);
    }

    public boolean c(String namespace, String key, boolean defaultValue) {
        String m11 = m(namespace, key, "" + defaultValue);
        try {
            boolean parseBoolean = Boolean.parseBoolean(m11);
            if (!parseBoolean && !m11.equals("false")) {
                throw new IllegalArgumentException("It's not a legal boolean value.");
            }
            return parseBoolean;
        } catch (Exception e11) {
            if (d.b()) {
                c.p("", String.format("parse (%s:%s) in %s to boolean error", key, m11, namespace), e11);
            }
            return defaultValue;
        }
    }

    public final String d() throws Exception {
        String property;
        String str = this.f70844b;
        if (str != null) {
            return str;
        }
        Properties n11 = n("config/system.conf");
        if (n11 == null || (property = n11.getProperty("mod")) == null || "".equals(property.trim())) {
            return "config/conf";
        }
        return "config/conf_" + property;
    }

    public double e(String namespace, String key) {
        return f(namespace, key, 0.0d);
    }

    public double f(String namespace, String key, double defaultValue) {
        String m11 = m(namespace, key, "" + defaultValue);
        try {
            return Double.parseDouble(m11);
        } catch (Exception e11) {
            if (d.b()) {
                c.p("", String.format("parse (%s:%s) in %s to double error", key, m11, namespace), e11);
            }
            return defaultValue;
        }
    }

    public final Properties g(String filePath) throws Exception {
        Throwable th2;
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(new File(filePath));
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                a(properties);
                fileInputStream.close();
                return properties;
            } catch (Throwable th3) {
                th2 = th3;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            fileInputStream = null;
        }
    }

    public final Properties h(String str, String str2) throws Exception {
        JarFile jarFile;
        JarFile jarFile2 = null;
        InputStream inputStream = null;
        try {
            jarFile = new JarFile(str);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            try {
                inputStream = jarFile.getInputStream(jarFile.getJarEntry(str2));
                Properties properties = new Properties();
                properties.load(inputStream);
                a(properties);
                jarFile.close();
                return properties;
            } finally {
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        } catch (Throwable th3) {
            th = th3;
            jarFile2 = jarFile;
            if (jarFile2 != null) {
                jarFile2.close();
            }
            throw th;
        }
    }

    public int j(String namespace, String key) {
        return k(namespace, key, 0);
    }

    public int k(String namespace, String key, int defaultValue) {
        String m11 = m(namespace, key, "" + defaultValue);
        try {
            return Integer.parseInt(m11);
        } catch (Exception e11) {
            if (d.b()) {
                c.p("", String.format("parse (%s:%s) in %s to int error", key, m11, namespace), e11);
            }
            return defaultValue;
        }
    }

    public String l(String namespace, String key) {
        return m(namespace, key, null);
    }

    public String m(String namespace, String key, String defaultValue) {
        Properties properties = this.f70843a.get(namespace);
        if (properties != null) {
            return properties.getProperty(key, defaultValue);
        }
        try {
            Properties n11 = n(this.f70844b + "/" + namespace);
            this.f70843a.put(namespace, n11);
            return n11.getProperty(key, defaultValue);
        } catch (Exception e11) {
            e11.printStackTrace();
            return defaultValue;
        }
    }

    public final Properties n(String name) throws Exception {
        URL resource = getClass().getClassLoader().getResource(name);
        if (resource == null) {
            return null;
        }
        if (!j1.f6558e.equals(resource.getProtocol())) {
            return g(resource.getPath());
        }
        String path = resource.getPath();
        int indexOf = path.indexOf("file:");
        if (indexOf < 0) {
            return null;
        }
        int i11 = indexOf + 5;
        int lastIndexOf = path.lastIndexOf("!");
        if (lastIndexOf < 0 || lastIndexOf >= path.length() - 1) {
            return null;
        }
        String substring = path.substring(lastIndexOf + 1);
        if (substring.startsWith("/")) {
            substring = substring.substring(1);
        }
        return h(path.substring(i11, lastIndexOf), substring);
    }

    public final void o() {
        try {
            this.f70844b = d();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
