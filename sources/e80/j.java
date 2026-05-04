package e80;

import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class j {

    /* renamed from: f, reason: collision with root package name */
    public static final String f49590f = "UNAVAILABLE";

    /* renamed from: g, reason: collision with root package name */
    public static final String f49591g = "version.properties";

    /* renamed from: h, reason: collision with root package name */
    public static final String f49592h = "info.module";

    /* renamed from: i, reason: collision with root package name */
    public static final String f49593i = "info.release";

    /* renamed from: j, reason: collision with root package name */
    public static final String f49594j = "info.timestamp";

    /* renamed from: a, reason: collision with root package name */
    public final String f49595a;

    /* renamed from: b, reason: collision with root package name */
    public final String f49596b;

    /* renamed from: c, reason: collision with root package name */
    public final String f49597c;

    /* renamed from: d, reason: collision with root package name */
    public final String f49598d;

    /* renamed from: e, reason: collision with root package name */
    public final String f49599e;

    public j(String str, String str2, String str3, String str4, String str5) {
        a.j(str, "Package identifier");
        this.f49595a = str;
        this.f49596b = str2 == null ? f49590f : str2;
        this.f49597c = str3 == null ? f49590f : str3;
        this.f49598d = str4 == null ? f49590f : str4;
        this.f49599e = str5 == null ? f49590f : str5;
    }

    public static j a(String str, Map<?, ?> map, ClassLoader classLoader) {
        String str2;
        String str3;
        String str4;
        a.j(str, "Package identifier");
        if (map != null) {
            String str5 = (String) map.get(f49592h);
            if (str5 != null && str5.length() < 1) {
                str5 = null;
            }
            String str6 = (String) map.get(f49593i);
            if (str6 != null && (str6.length() < 1 || str6.equals("${pom.version}"))) {
                str6 = null;
            }
            String str7 = (String) map.get(f49594j);
            str4 = (str7 == null || (str7.length() >= 1 && !str7.equals("${mvn.timestamp}"))) ? str7 : null;
            str2 = str5;
            str3 = str6;
        } else {
            str2 = null;
            str3 = null;
            str4 = null;
        }
        return new j(str, str2, str3, str4, classLoader != null ? classLoader.toString() : null);
    }

    public static String g(String str, String str2, Class<?> cls) {
        j h11 = h(str2, cls.getClassLoader());
        return String.format("%s/%s (Java/%s)", str, h11 != null ? h11.e() : f49590f, System.getProperty("java.version"));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static e80.j h(java.lang.String r4, java.lang.ClassLoader r5) {
        /*
            java.lang.String r0 = "Package identifier"
            e80.a.j(r4, r0)
            if (r5 == 0) goto L8
            goto L10
        L8:
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r5 = r5.getContextClassLoader()
        L10:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L46
            r1.<init>()     // Catch: java.io.IOException -> L46
            r2 = 46
            r3 = 47
            java.lang.String r2 = r4.replace(r2, r3)     // Catch: java.io.IOException -> L46
            r1.append(r2)     // Catch: java.io.IOException -> L46
            java.lang.String r2 = "/"
            r1.append(r2)     // Catch: java.io.IOException -> L46
            java.lang.String r2 = "version.properties"
            r1.append(r2)     // Catch: java.io.IOException -> L46
            java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> L46
            java.io.InputStream r1 = r5.getResourceAsStream(r1)     // Catch: java.io.IOException -> L46
            if (r1 == 0) goto L46
            java.util.Properties r2 = new java.util.Properties     // Catch: java.lang.Throwable -> L41
            r2.<init>()     // Catch: java.lang.Throwable -> L41
            r2.load(r1)     // Catch: java.lang.Throwable -> L41
            r1.close()     // Catch: java.io.IOException -> L47
            goto L47
        L41:
            r2 = move-exception
            r1.close()     // Catch: java.io.IOException -> L46
            throw r2     // Catch: java.io.IOException -> L46
        L46:
            r2 = r0
        L47:
            if (r2 == 0) goto L4d
            e80.j r0 = a(r4, r2, r5)
        L4d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e80.j.h(java.lang.String, java.lang.ClassLoader):e80.j");
    }

    public static j[] i(String[] strArr, ClassLoader classLoader) {
        a.j(strArr, "Package identifier array");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            j h11 = h(str, classLoader);
            if (h11 != null) {
                arrayList.add(h11);
            }
        }
        return (j[]) arrayList.toArray(new j[arrayList.size()]);
    }

    public final String b() {
        return this.f49599e;
    }

    public final String c() {
        return this.f49596b;
    }

    public final String d() {
        return this.f49595a;
    }

    public final String e() {
        return this.f49597c;
    }

    public final String f() {
        return this.f49598d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(this.f49595a.length() + 20 + this.f49596b.length() + this.f49597c.length() + this.f49598d.length() + this.f49599e.length());
        sb2.append("VersionInfo(");
        sb2.append(this.f49595a);
        sb2.append(':');
        sb2.append(this.f49596b);
        if (!f49590f.equals(this.f49597c)) {
            sb2.append(':');
            sb2.append(this.f49597c);
        }
        if (!f49590f.equals(this.f49598d)) {
            sb2.append(':');
            sb2.append(this.f49598d);
        }
        sb2.append(')');
        if (!f49590f.equals(this.f49599e)) {
            sb2.append('@');
            sb2.append(this.f49599e);
        }
        return sb2.toString();
    }
}
