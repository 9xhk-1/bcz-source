package com.badlogic.gdx.utils;

import a3.x0;
import a3.y0;
import a3.z0;
import com.badlogic.gdx.utils.l;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: e, reason: collision with root package name */
    public static final String f13211e = "UTF-8";

    /* renamed from: f, reason: collision with root package name */
    public static final Locale f13212f = new Locale("", "", "");

    /* renamed from: g, reason: collision with root package name */
    public static boolean f13213g = false;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f13214h = true;

    /* renamed from: a, reason: collision with root package name */
    public c f13215a;

    /* renamed from: b, reason: collision with root package name */
    public Locale f13216b;

    /* renamed from: c, reason: collision with root package name */
    public l<String, String> f13217c;

    /* renamed from: d, reason: collision with root package name */
    public z0 f13218d;

    public static boolean a(v1.a aVar) {
        try {
            aVar.F().close();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static c b(v1.a aVar) {
        return f(aVar, Locale.getDefault(), "UTF-8");
    }

    public static c c(v1.a aVar, String str) {
        return f(aVar, Locale.getDefault(), str);
    }

    public static c d(v1.a aVar, Locale locale) {
        return f(aVar, locale, "UTF-8");
    }

    public static c e(v1.a aVar, Locale locale, String str) {
        return f(aVar, locale, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
    
        throw new java.util.MissingResourceException("Can't find bundle for base file handle " + r9.C() + ", locale " + r10, r9 + "_" + r10, "");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.badlogic.gdx.utils.c f(v1.a r9, java.util.Locale r10, java.lang.String r11) {
        /*
            r0 = 0
            if (r9 == 0) goto L82
            if (r10 == 0) goto L82
            if (r11 == 0) goto L82
            r1 = r10
        L8:
            java.util.List r2 = j(r1)
            r3 = 0
            com.badlogic.gdx.utils.c r4 = r(r9, r11, r2, r3, r0)
            if (r4 == 0) goto L3d
            java.util.Locale r5 = r4.m()
            java.util.Locale r6 = com.badlogic.gdx.utils.c.f13212f
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L43
            boolean r7 = r5.equals(r10)
            if (r7 == 0) goto L26
            goto L43
        L26:
            int r7 = r2.size()
            r8 = 1
            if (r7 != r8) goto L38
            java.lang.Object r2 = r2.get(r3)
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L38
            goto L43
        L38:
            if (r6 == 0) goto L3d
            if (r0 != 0) goto L3d
            r0 = r4
        L3d:
            java.util.Locale r1 = l(r1)
            if (r1 != 0) goto L8
        L43:
            if (r4 != 0) goto L81
            if (r0 == 0) goto L48
            return r0
        L48:
            java.util.MissingResourceException r11 = new java.util.MissingResourceException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Can't find bundle for base file handle "
            r0.append(r1)
            java.lang.String r1 = r9.C()
            r0.append(r1)
            java.lang.String r1 = ", locale "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            java.lang.String r9 = "_"
            r1.append(r9)
            r1.append(r10)
            java.lang.String r9 = r1.toString()
            java.lang.String r10 = ""
            r11.<init>(r0, r9, r10)
            throw r11
        L81:
            return r4
        L82:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.c.f(v1.a, java.util.Locale, java.lang.String):com.badlogic.gdx.utils.c");
    }

    public static List<Locale> j(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        String variant = locale.getVariant();
        ArrayList arrayList = new ArrayList(4);
        if (variant.length() > 0) {
            arrayList.add(locale);
        }
        if (country.length() > 0) {
            arrayList.add(arrayList.isEmpty() ? locale : new Locale(language, country));
        }
        if (language.length() > 0) {
            if (!arrayList.isEmpty()) {
                locale = new Locale(language);
            }
            arrayList.add(locale);
        }
        arrayList.add(f13212f);
        return arrayList;
    }

    public static boolean k() {
        return f13214h;
    }

    public static Locale l(Locale locale) {
        Locale locale2 = Locale.getDefault();
        if (locale.equals(locale2)) {
            return null;
        }
        return locale2;
    }

    public static boolean n() {
        return f13213g;
    }

    public static c q(v1.a aVar, String str, Locale locale) {
        c cVar;
        Reader reader = null;
        try {
            try {
                v1.a v11 = v(aVar, locale);
                if (a(v11)) {
                    cVar = new c();
                    reader = v11.N(str);
                    cVar.p(reader);
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    cVar.t(locale);
                }
                return cVar;
            } catch (IOException e11) {
                throw new GdxRuntimeException(e11);
            }
        } finally {
            x0.a(reader);
        }
    }

    public static c r(v1.a aVar, String str, List<Locale> list, int i11, c cVar) {
        c cVar2;
        Locale locale = list.get(i11);
        if (i11 != list.size() - 1) {
            cVar2 = r(aVar, str, list, i11 + 1, cVar);
        } else {
            if (cVar != null && locale.equals(f13212f)) {
                return cVar;
            }
            cVar2 = null;
        }
        c q11 = q(aVar, str, locale);
        if (q11 == null) {
            return cVar2;
        }
        q11.f13215a = cVar2;
        return q11;
    }

    public static void s(boolean z11) {
        f13214h = z11;
    }

    public static void u(boolean z11) {
        f13213g = z11;
    }

    public static v1.a v(v1.a aVar, Locale locale) {
        y0 y0Var = new y0(aVar.z());
        if (!locale.equals(f13212f)) {
            String language = locale.getLanguage();
            String country = locale.getCountry();
            String variant = locale.getVariant();
            boolean equals = "".equals(language);
            boolean equals2 = "".equals(country);
            boolean equals3 = "".equals(variant);
            if (!equals || !equals2 || !equals3) {
                y0Var.append('_');
                if (!equals3) {
                    y0Var.O(language).append('_').O(country).append('_').O(variant);
                } else if (equals2) {
                    y0Var.O(language);
                } else {
                    y0Var.O(language).append('_').O(country);
                }
            }
        }
        return aVar.O(y0Var.O(".properties").toString());
    }

    public void g(String str) {
        l.c<String> n11 = this.f13217c.n();
        if (n11 == null) {
            return;
        }
        l.c<String> it = n11.iterator();
        while (it.hasNext()) {
            this.f13217c.r(it.next(), str);
        }
    }

    public String h(String str, Object... objArr) {
        return this.f13218d.a(i(str), objArr);
    }

    public String i(String str) {
        String k11 = this.f13217c.k(str);
        if (k11 == null) {
            c cVar = this.f13215a;
            if (cVar != null) {
                k11 = cVar.i(str);
            }
            if (k11 == null) {
                if (f13214h) {
                    throw new MissingResourceException("Can't find bundle key " + str, getClass().getName(), str);
                }
                return "???" + str + "???";
            }
        }
        return k11;
    }

    public Locale m() {
        return this.f13216b;
    }

    public Set<String> o() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        l.c<String> n11 = this.f13217c.n();
        if (n11 != null) {
            l.c<String> it = n11.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(it.next());
            }
        }
        return linkedHashSet;
    }

    public void p(Reader reader) throws IOException {
        l<String, String> lVar = new l<>();
        this.f13217c = lVar;
        q.b(lVar, reader);
    }

    public final void t(Locale locale) {
        this.f13216b = locale;
        this.f13218d = new z0(locale, !f13213g);
    }
}
