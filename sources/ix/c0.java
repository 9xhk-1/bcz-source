package ix;

import androidx.collection.SieveCacheKt;
import io.ktor.http.CookieEncoding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.text.Regex;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCookie.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cookie.kt\nio/ktor/http/CookieKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 6 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,230:1\n215#1:247\n219#1:248\n219#1:249\n215#1:250\n215#1:251\n223#1:252\n223#1:253\n227#1:257\n223#1:258\n215#1:259\n227#1:261\n223#1:262\n215#1:263\n223#1:273\n215#1:274\n230#2,2:231\n1246#2,4:236\n774#2:264\n865#2,2:265\n1#3:233\n477#4:234\n423#4:235\n487#4,7:240\n126#5:254\n153#5,2:255\n155#5:260\n1088#6,2:267\n1088#6,2:269\n1088#6,2:271\n*S KotlinDebug\n*F\n+ 1 Cookie.kt\nio/ktor/http/CookieKt\n*L\n154#1:247\n155#1:248\n156#1:249\n157#1:250\n158#1:251\n160#1:252\n161#1:253\n162#1:257\n162#1:258\n162#1:259\n163#1:261\n163#1:262\n163#1:263\n227#1:273\n227#1:274\n74#1:231,2\n76#1:236,4\n164#1:264\n164#1:265,2\n76#1:234\n76#1:235\n88#1:240,7\n162#1:254\n162#1:255,2\n162#1:260\n172#1:267,2\n184#1:269,2\n205#1:271,2\n*E\n"})
/* loaded from: classes8.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final Set<String> f62726a = a00.w1.u(fx.d.f52395b, "expires", "domain", "path", "secure", "httponly", "$x-enc");

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final Regex f62727b = new Regex("(^|;)\\s*([^;=\\{\\}\\s]+)\\s*(=\\s*(\"[^\"]*\"|[^;]*))?");

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final Set<Character> f62728c = a00.w1.u(Character.valueOf(l70.f.f70689d), ',', '\"');

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f62729a;

        static {
            int[] iArr = new int[CookieEncoding.values().length];
            try {
                iArr[CookieEncoding.RAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CookieEncoding.DQUOTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CookieEncoding.BASE64_ENCODING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CookieEncoding.URI_ENCODING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f62729a = iArr;
        }
    }

    public static final String d(String str) {
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (u(str.charAt(i11))) {
                throw new IllegalArgumentException("Cookie name is not valid: " + str);
            }
        }
        return str;
    }

    public static final String e(String str, Object obj, CookieEncoding cookieEncoding) {
        if (obj == null) {
            return "";
        }
        return str + '=' + j(obj.toString(), cookieEncoding);
    }

    public static final String f(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        return str + '=' + j(str2.toString(), CookieEncoding.RAW);
    }

    public static final String g(String str, boolean z11) {
        return z11 ? str : "";
    }

    public static final String h(String str, Object obj) {
        if (obj == null) {
            return "";
        }
        return str + '=' + obj;
    }

    @m80.k
    public static final String i(@m80.k String encodedValue, @m80.k CookieEncoding encoding) {
        kotlin.jvm.internal.g0.p(encodedValue, "encodedValue");
        kotlin.jvm.internal.g0.p(encoding, "encoding");
        int i11 = a.f62729a[encoding.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return (u30.f0.J2(u30.k0.n6(encodedValue).toString(), "\"", false, 2, null) && u30.f0.b2(u30.k0.h6(encodedValue).toString(), "\"", false, 2, null)) ? u30.k0.G4(u30.k0.b6(encodedValue).toString(), "\"") : encodedValue;
        }
        if (i11 == 3) {
            return xy.f.d(encodedValue);
        }
        if (i11 == 4) {
            return f.k(encodedValue, 0, 0, true, null, 11, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    @m80.k
    public static final String j(@m80.k String value, @m80.k CookieEncoding encoding) {
        kotlin.jvm.internal.g0.p(value, "value");
        kotlin.jvm.internal.g0.p(encoding, "encoding");
        int i11 = a.f62729a[encoding.ordinal()];
        int i12 = 0;
        if (i11 == 1) {
            while (i12 < value.length()) {
                if (u(value.charAt(i12))) {
                    throw new IllegalArgumentException("The cookie value contains characters that cannot be encoded in RAW format.  Consider URL_ENCODING mode");
                }
                i12++;
            }
            return value;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                return xy.f.e(value);
            }
            if (i11 == 4) {
                return f.m(value, true);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (u30.k0.m3(value, '\"', false, 2, null)) {
            throw new IllegalArgumentException("The cookie value contains characters that cannot be encoded in DQUOTES format. Consider URL_ENCODING mode");
        }
        while (i12 < value.length()) {
            if (u(value.charAt(i12))) {
                return '\"' + value + '\"';
            }
            i12++;
        }
        return value;
    }

    @m80.k
    public static final Map<String, String> k(@m80.k String cookiesHeader, final boolean z11) {
        kotlin.jvm.internal.g0.p(cookiesHeader, "cookiesHeader");
        return a00.l1.F0(q30.k0.N1(q30.k0.P0(q30.k0.N1(Regex.findAll$default(f62727b, cookiesHeader, 0, 2, null), new x00.l() { // from class: ix.z
            @Override // x00.l
            public final Object invoke(Object obj) {
                Pair m11;
                m11 = c0.m((u30.o) obj);
                return m11;
            }
        }), new x00.l() { // from class: ix.a0
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean n11;
                n11 = c0.n(z11, (Pair) obj);
                return Boolean.valueOf(n11);
            }
        }), new x00.l() { // from class: ix.b0
            @Override // x00.l
            public final Object invoke(Object obj) {
                Pair o11;
                o11 = c0.o((Pair) obj);
                return o11;
            }
        }));
    }

    public static /* synthetic */ Map l(String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return k(str, z11);
    }

    public static final Pair m(u30.o it) {
        String str;
        String f11;
        kotlin.jvm.internal.g0.p(it, "it");
        u30.l lVar = it.c().get(2);
        String str2 = "";
        if (lVar == null || (str = lVar.f()) == null) {
            str = "";
        }
        u30.l lVar2 = it.c().get(4);
        if (lVar2 != null && (f11 = lVar2.f()) != null) {
            str2 = f11;
        }
        return yz.h1.a(str, str2);
    }

    public static final boolean n(boolean z11, Pair it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return (z11 && u30.f0.J2((String) it.getFirst(), "$", false, 2, null)) ? false : true;
    }

    public static final Pair o(Pair cookie) {
        kotlin.jvm.internal.g0.p(cookie, "cookie");
        return (u30.f0.J2((String) cookie.getSecond(), "\"", false, 2, null) && u30.f0.b2((String) cookie.getSecond(), "\"", false, 2, null)) ? Pair.copy$default(cookie, null, u30.k0.G4((String) cookie.getSecond(), "\""), 1, null) : cookie;
    }

    @m80.k
    public static final n p(@m80.k String cookiesHeader) {
        CookieEncoding cookieEncoding;
        kotlin.jvm.internal.g0.p(cookiesHeader, "cookiesHeader");
        Map<String, String> k11 = k(cookiesHeader, false);
        Iterator<T> it = k11.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!u30.f0.J2((String) entry.getKey(), "$", false, 2, null)) {
                String str = k11.get("$x-enc");
                if (str == null || (cookieEncoding = CookieEncoding.valueOf(str)) == null) {
                    cookieEncoding = CookieEncoding.RAW;
                }
                CookieEncoding cookieEncoding2 = cookieEncoding;
                LinkedHashMap linkedHashMap = new LinkedHashMap(a00.k1.j(k11.size()));
                Iterator<T> it2 = k11.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    linkedHashMap.put(xy.e2.e((String) entry2.getKey()), entry2.getValue());
                }
                String str2 = (String) entry.getKey();
                String i11 = i((String) entry.getValue(), cookieEncoding2);
                String str3 = (String) linkedHashMap.get(fx.d.f52395b);
                Integer valueOf = str3 != null ? Integer.valueOf(v(str3)) : null;
                String str4 = (String) linkedHashMap.get("expires");
                bz.b a11 = str4 != null ? e0.a(str4) : null;
                String str5 = (String) linkedHashMap.get("domain");
                String str6 = (String) linkedHashMap.get("path");
                boolean containsKey = linkedHashMap.containsKey("secure");
                boolean containsKey2 = linkedHashMap.containsKey("httponly");
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<String, String> entry3 : k11.entrySet()) {
                    String key = entry3.getKey();
                    if (!f62726a.contains(xy.e2.e(key)) && !kotlin.jvm.internal.g0.g(key, entry.getKey())) {
                        linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                    }
                }
                return new n(str2, i11, cookieEncoding2, valueOf, a11, str5, str6, containsKey, containsKey2, linkedHashMap2);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @m80.k
    public static final String q(@m80.k n cookie) {
        kotlin.jvm.internal.g0.p(cookie, "cookie");
        return cookie.t() + '=' + j(cookie.w(), cookie.o());
    }

    @m80.k
    public static final String r(@m80.k n cookie) {
        kotlin.jvm.internal.g0.p(cookie, "cookie");
        return t(cookie.t(), cookie.w(), cookie.o(), cookie.s(), cookie.p(), cookie.n(), cookie.u(), cookie.v(), cookie.r(), cookie.q(), false, 1024, null);
    }

    @m80.k
    public static final String s(@m80.k String name, @m80.k String value, @m80.k CookieEncoding encoding, @m80.l Integer num, @m80.l bz.b bVar, @m80.l String str, @m80.l String str2, boolean z11, boolean z12, @m80.k Map<String, String> extensions, boolean z13) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(value, "value");
        kotlin.jvm.internal.g0.p(encoding, "encoding");
        kotlin.jvm.internal.g0.p(extensions, "extensions");
        String str3 = d(name) + '=' + j(value.toString(), encoding);
        String str4 = "";
        String str5 = num != null ? "Max-Age=" + num : "";
        String d11 = bVar != null ? e0.d(bVar) : null;
        String str6 = d11 != null ? "Expires=" + ((Object) d11) : "";
        CookieEncoding cookieEncoding = CookieEncoding.RAW;
        List Q = a00.h0.Q(str3, str5, str6, str != null ? "Domain=" + j(str.toString(), cookieEncoding) : "", str2 != null ? "Path=" + j(str2.toString(), cookieEncoding) : "", z11 ? "Secure" : "", z12 ? "HttpOnly" : "");
        ArrayList arrayList = new ArrayList(extensions.size());
        for (Map.Entry<String, String> entry : extensions.entrySet()) {
            String d12 = d(entry.getKey());
            String value2 = entry.getValue();
            if (value2 != null) {
                d12 = d12 + '=' + j(value2.toString(), CookieEncoding.RAW);
            }
            arrayList.add(d12);
        }
        List I4 = a00.r0.I4(Q, arrayList);
        if (z13) {
            String name2 = encoding.name();
            str4 = name2 == null ? "$x-enc" : "$x-enc=" + j(name2.toString(), CookieEncoding.RAW);
        }
        List J4 = a00.r0.J4(I4, str4);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : J4) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return a00.r0.r3(arrayList2, "; ", null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ String t(String str, String str2, CookieEncoding cookieEncoding, Integer num, bz.b bVar, String str3, String str4, boolean z11, boolean z12, Map map, boolean z13, int i11, Object obj) {
        return s(str, str2, (i11 & 4) != 0 ? CookieEncoding.URI_ENCODING : cookieEncoding, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : bVar, (i11 & 32) != 0 ? null : str3, (i11 & 64) == 0 ? str4 : null, (i11 & 128) != 0 ? false : z11, (i11 & 256) == 0 ? z12 : false, (i11 & 512) != 0 ? a00.l1.z() : map, (i11 & 1024) != 0 ? true : z13);
    }

    public static final boolean u(char c11) {
        return kotlin.text.a.r(c11) || kotlin.jvm.internal.g0.t(c11, 32) < 0 || f62728c.contains(Character.valueOf(c11));
    }

    public static final int v(String str) {
        return (int) g10.u.K(Long.parseLong(str), 0L, SieveCacheKt.NodeLinkMask);
    }
}
