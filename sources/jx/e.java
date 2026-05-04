package jx;

import a00.h0;
import a00.w1;
import g10.u;
import io.ktor.http.auth.HeaderValueEncoding;
import io.ktor.http.parsing.ParseException;
import io.ktor.utils.io.b0;
import ix.d0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jx.b;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import kotlin.text.Regex;
import m80.k;
import m80.l;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import u30.k0;
import u30.o;
import u30.r0;
import u30.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final Set<Character> f64713a = w1.u(Character.valueOf(PublicSuffixDatabase.f77441i), '#', '$', '%', Character.valueOf(u0.f91708d), '\'', '*', '+', '-', '.', '^', '_', '`', '|', '~');

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final Set<Character> f64714b = w1.u('-', '.', '_', '~', '+', '/');

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final Regex f64715c = new Regex("[a-zA-Z0-9\\-._~+/]+=*");

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final Regex f64716d = new Regex("\\\\.");

    public static final boolean c(char c11) {
        if ('a' > c11 || c11 >= '{') {
            return ('A' <= c11 && c11 < '[') || d0.c(c11) || f64713a.contains(Character.valueOf(c11));
        }
        return true;
    }

    public static final boolean d(char c11) {
        if ('a' > c11 || c11 >= '{') {
            return ('A' <= c11 && c11 < '[') || d0.c(c11) || f64714b.contains(Character.valueOf(c11));
        }
        return true;
    }

    public static final int e(String str, int i11, Map<String, String> map) {
        int i12;
        int m11 = m(str, i11);
        int i13 = m11;
        while (i13 < str.length() && c(str.charAt(i13))) {
            i13++;
        }
        String H5 = k0.H5(str, u.W1(m11, i13));
        int m12 = m(str, i13);
        if (m12 == str.length() || str.charAt(m12) != '=') {
            return i11;
        }
        int m13 = m(str, m12 + 1);
        boolean z11 = false;
        if (str.charAt(m13) == '\"') {
            m13++;
            i12 = m13;
            boolean z12 = false;
            while (i12 < str.length() && (str.charAt(i12) != '\"' || z12)) {
                z12 = !z12 && str.charAt(i12) == '\\';
                i12++;
            }
            if (i12 == str.length()) {
                throw new ParseException("Expected closing quote'\"' in parameter", null, 2, null);
            }
            z11 = true;
        } else {
            i12 = m13;
            while (i12 < str.length() && str.charAt(i12) != ' ' && str.charAt(i12) != ',') {
                i12++;
            }
        }
        String H52 = k0.H5(str, u.W1(m13, i12));
        if (z11) {
            H52 = n(H52);
        }
        map.put(H5, H52);
        return z11 ? i12 + 1 : i12;
    }

    public static final int f(String str, int i11, Map<String, String> map) {
        while (i11 > 0 && i11 < str.length()) {
            int e11 = e(str, i11, map);
            if (e11 == i11) {
                break;
            }
            i11 = l(str, e11, ',');
        }
        return i11;
    }

    public static final int g(String str, int i11) {
        int m11 = m(str, i11);
        while (m11 < str.length() && d(str.charAt(m11))) {
            m11++;
        }
        while (m11 < str.length() && str.charAt(m11) == '=') {
            m11++;
        }
        return m(str, m11);
    }

    public static final Integer h(List<b> list, b bVar, int i11, String str) {
        if (i11 != str.length() && str.charAt(i11) != ',') {
            return null;
        }
        list.add(bVar);
        if (i11 == str.length()) {
            return -1;
        }
        if (str.charAt(i11) == ',') {
            return Integer.valueOf(i11 + 1);
        }
        throw new IllegalStateException("");
    }

    public static final int i(String str, int i11, List<b> list) {
        Integer h11;
        int m11 = m(str, i11);
        int i12 = m11;
        while (i12 < str.length() && c(str.charAt(i12))) {
            i12++;
        }
        String H5 = k0.H5(str, u.W1(m11, i12));
        if (k0.O3(H5)) {
            throw new ParseException("Invalid authScheme value: it should be token, can't be blank", null, 2, null);
        }
        int m12 = m(str, i12);
        Integer h12 = h(list, new b.C0744b(H5, h0.J(), (HeaderValueEncoding) null, 4, (v) null), m12, str);
        if (h12 != null) {
            return h12.intValue();
        }
        int g11 = g(str, m12);
        String obj = k0.b6(k0.H5(str, u.W1(m12, g11))).toString();
        if (obj.length() > 0 && (h11 = h(list, new b.d(H5, obj), g11, str)) != null) {
            return h11.intValue();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int f11 = f(str, m12, linkedHashMap);
        list.add(new b.C0744b(H5, linkedHashMap, (HeaderValueEncoding) null, 4, (v) null));
        return f11;
    }

    @l
    public static final b j(@k String headerValue) {
        g0.p(headerValue, "headerValue");
        int m11 = m(headerValue, 0);
        int i11 = m11;
        while (i11 < headerValue.length() && c(headerValue.charAt(i11))) {
            i11++;
        }
        String H5 = k0.H5(headerValue, u.W1(m11, i11));
        int m12 = m(headerValue, i11);
        if (k0.O3(H5)) {
            return null;
        }
        if (headerValue.length() == m12) {
            return new b.C0744b(H5, h0.J(), (HeaderValueEncoding) null, 4, (v) null);
        }
        int g11 = g(headerValue, m12);
        String obj = k0.b6(k0.H5(headerValue, u.W1(m12, g11))).toString();
        if (obj.length() > 0 && g11 == headerValue.length()) {
            return new b.d(H5, obj);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (f(headerValue, m12, linkedHashMap) != -1) {
            throw new ParseException("Function parseAuthorizationHeader can parse only one header", null, 2, null);
        }
        return new b.C0744b(H5, linkedHashMap, (HeaderValueEncoding) null, 4, (v) null);
    }

    @b0
    @k
    public static final List<b> k(@k String headerValue) {
        g0.p(headerValue, "headerValue");
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 != -1) {
            i11 = i(headerValue, i11, arrayList);
        }
        return arrayList;
    }

    public static final int l(String str, int i11, char c11) {
        int m11 = m(str, i11);
        if (m11 == str.length()) {
            return -1;
        }
        if (str.charAt(m11) == c11) {
            return m(str, m11 + 1);
        }
        throw new ParseException("Expected delimiter " + c11 + " at position " + m11, null, 2, null);
    }

    public static final int m(String str, int i11) {
        while (i11 < str.length() && str.charAt(i11) == ' ') {
            i11++;
        }
        return i11;
    }

    public static final String n(String str) {
        return f64716d.replace(str, new x00.l() { // from class: jx.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                CharSequence o11;
                o11 = e.o((o) obj);
                return o11;
            }
        });
    }

    public static final CharSequence o(o it) {
        g0.p(it, "it");
        return r0.C9(it.getValue(), 1);
    }
}
