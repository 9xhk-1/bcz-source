package jx;

import a00.h0;
import a00.k1;
import a00.l1;
import a00.r0;
import com.tencent.connect.common.Constants;
import io.ktor.http.auth.HeaderValueEncoding;
import io.ktor.http.parsing.ParseException;
import ix.f;
import ix.n0;
import ix.p0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jx.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.text.Regex;
import m80.k;
import m80.l;
import org.junit.jupiter.api.j2;
import u30.f0;
import xy.b0;
import xy.s0;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f64691b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f64692a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public static /* synthetic */ b c(a aVar, String str, String str2, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str2 = null;
            }
            return aVar.b(str, str2);
        }

        public static /* synthetic */ C0744b e(a aVar, String str, String str2, List list, String str3, Boolean bool, String str4, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str2 = b0.e();
            }
            String str5 = str2;
            if ((i11 & 4) != 0) {
                list = h0.J();
            }
            List list2 = list;
            String str6 = (i11 & 8) != 0 ? null : str3;
            Boolean bool2 = (i11 & 16) != 0 ? null : bool;
            if ((i11 & 32) != 0) {
                str4 = "MD5";
            }
            return aVar.d(str, str5, list2, str6, bool2, str4);
        }

        @k
        public final C0744b a(@k String realm, @l Charset charset) {
            g0.p(realm, "realm");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(c.f64697b, realm);
            if (charset != null) {
                linkedHashMap.put("charset", iz.a.l(charset));
            }
            return new C0744b(jx.a.f64686b, linkedHashMap, (HeaderValueEncoding) null, 4, (v) null);
        }

        @k
        public final b b(@k String scheme, @l String str) {
            g0.p(scheme, "scheme");
            return new C0744b(scheme, str == null ? l1.z() : k1.k(h1.a(c.f64697b, str)), (HeaderValueEncoding) null, 4, (v) null);
        }

        @k
        public final C0744b d(@k String realm, @k String nonce, @k List<String> domain, @l String str, @l Boolean bool, @k String algorithm) {
            g0.p(realm, "realm");
            g0.p(nonce, "nonce");
            g0.p(domain, "domain");
            g0.p(algorithm, "algorithm");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(c.f64697b, p0.g(realm));
            linkedHashMap.put(Constants.NONCE, p0.g(nonce));
            if (!domain.isEmpty()) {
                linkedHashMap.put("domain", p0.g(r0.r3(domain, " ", null, null, 0, null, null, 62, null)));
            }
            if (str != null) {
                linkedHashMap.put("opaque", p0.g(str));
            }
            if (bool != null) {
                linkedHashMap.put("stale", bool.toString());
            }
            linkedHashMap.put("algorithm", algorithm);
            return new C0744b(jx.a.f64687c, linkedHashMap, HeaderValueEncoding.QUOTED_WHEN_REQUIRED);
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f64696a = new c();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final String f64697b = "realm";

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final String f64698c = "charset";

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final String f64699d = "oauth_callback";

        /* renamed from: e, reason: collision with root package name */
        @k
        public static final String f64700e = "oauth_consumer_key";

        /* renamed from: f, reason: collision with root package name */
        @k
        public static final String f64701f = "oauth_nonce";

        /* renamed from: g, reason: collision with root package name */
        @k
        public static final String f64702g = "oauth_token";

        /* renamed from: h, reason: collision with root package name */
        @k
        public static final String f64703h = "oauth_token_secret";

        /* renamed from: i, reason: collision with root package name */
        @k
        public static final String f64704i = "oauth_verifier";

        /* renamed from: j, reason: collision with root package name */
        @k
        public static final String f64705j = "oauth_signature_method";

        /* renamed from: k, reason: collision with root package name */
        @k
        public static final String f64706k = "oauth_timestamp";

        /* renamed from: l, reason: collision with root package name */
        @k
        public static final String f64707l = "oauth_version";

        /* renamed from: m, reason: collision with root package name */
        @k
        public static final String f64708m = "oauth_signature";

        /* renamed from: n, reason: collision with root package name */
        @k
        public static final String f64709n = "oauth_callback_confirmed";
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends b {

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f64710c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@k String authScheme, @k String blob) {
            super(authScheme, null);
            Regex regex;
            g0.p(authScheme, "authScheme");
            g0.p(blob, "blob");
            this.f64710c = blob;
            regex = e.f64715c;
            if (!regex.matches(blob)) {
                throw new ParseException("Invalid blob value: it should be token68", null, 2, null);
            }
        }

        @Override // jx.b
        @k
        public String b() {
            return a() + ' ' + this.f64710c;
        }

        @Override // jx.b
        @k
        public String c(@k HeaderValueEncoding encoding) {
            g0.p(encoding, "encoding");
            return b();
        }

        @k
        public final String d() {
            return this.f64710c;
        }

        public boolean equals(@l Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return f0.c2(dVar.a(), a(), true) && f0.c2(dVar.f64710c, this.f64710c, true);
        }

        public int hashCode() {
            s0 s0Var = s0.f98648a;
            String a11 = a();
            Locale locale = Locale.ROOT;
            String lowerCase = a11.toLowerCase(locale);
            g0.o(lowerCase, "toLowerCase(...)");
            String lowerCase2 = this.f64710c.toLowerCase(locale);
            g0.o(lowerCase2, "toLowerCase(...)");
            return s0Var.a(lowerCase, lowerCase2);
        }
    }

    public /* synthetic */ b(String str, v vVar) {
        this(str);
    }

    @k
    public final String a() {
        return this.f64692a;
    }

    @k
    public abstract String b();

    @k
    public abstract String c(@k HeaderValueEncoding headerValueEncoding);

    @k
    public String toString() {
        return b();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nHttpAuthHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpAuthHeader.kt\nio/ktor/http/auth/HttpAuthHeader$Parameterized\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,464:1\n1863#2,2:465\n1557#2:467\n1628#2,3:468\n360#2,7:471\n1611#2,9:478\n1863#2:487\n1864#2:489\n1620#2:490\n295#2,2:491\n1#3:488\n*S KotlinDebug\n*F\n+ 1 HttpAuthHeader.kt\nio/ktor/http/auth/HttpAuthHeader$Parameterized\n*L\n279#1:465,2\n276#1:467\n276#1:468,3\n299#1:471,7\n303#1:478,9\n303#1:487\n303#1:489\n303#1:490\n326#1:491,2\n303#1:488\n*E\n"})
    /* renamed from: jx.b$b, reason: collision with other inner class name */
    public static final class C0744b extends b {

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<n0> f64693c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final HeaderValueEncoding f64694d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: jx.b$b$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f64695a;

            static {
                int[] iArr = new int[HeaderValueEncoding.values().length];
                try {
                    iArr[HeaderValueEncoding.QUOTED_WHEN_REQUIRED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[HeaderValueEncoding.QUOTED_ALWAYS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[HeaderValueEncoding.URI_ENCODE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f64695a = iArr;
            }
        }

        public /* synthetic */ C0744b(String str, List list, HeaderValueEncoding headerValueEncoding, int i11, v vVar) {
            this(str, (List<n0>) list, (i11 & 4) != 0 ? HeaderValueEncoding.QUOTED_WHEN_REQUIRED : headerValueEncoding);
        }

        public static final CharSequence i(C0744b c0744b, HeaderValueEncoding headerValueEncoding, n0 it) {
            g0.p(it, "it");
            return it.g() + '=' + c0744b.e(it.h(), headerValueEncoding);
        }

        @Override // jx.b
        @k
        public String b() {
            return c(this.f64694d);
        }

        @Override // jx.b
        @k
        public String c(@k final HeaderValueEncoding encoding) {
            g0.p(encoding, "encoding");
            if (this.f64693c.isEmpty()) {
                return a();
            }
            return r0.r3(this.f64693c, j2.O, a() + ' ', null, 0, null, new x00.l() { // from class: jx.c
                @Override // x00.l
                public final Object invoke(Object obj) {
                    CharSequence i11;
                    i11 = b.C0744b.i(b.C0744b.this, encoding, (n0) obj);
                    return i11;
                }
            }, 28, null);
        }

        public final String e(String str, HeaderValueEncoding headerValueEncoding) {
            int i11 = a.f64695a[headerValueEncoding.ordinal()];
            if (i11 == 1) {
                return p0.c(str);
            }
            if (i11 == 2) {
                return p0.g(str);
            }
            if (i11 == 3) {
                return f.n(str, false, 1, null);
            }
            throw new NoWhenBranchMatchedException();
        }

        public boolean equals(@l Object obj) {
            if (!(obj instanceof C0744b)) {
                return false;
            }
            C0744b c0744b = (C0744b) obj;
            return f0.c2(c0744b.a(), a(), true) && g0.g(c0744b.f64693c, this.f64693c);
        }

        @k
        public final HeaderValueEncoding f() {
            return this.f64694d;
        }

        @k
        public final List<n0> g() {
            return this.f64693c;
        }

        @l
        public final String h(@k String name) {
            Object obj;
            g0.p(name, "name");
            Iterator<T> it = this.f64693c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (g0.g(((n0) obj).g(), name)) {
                    break;
                }
            }
            n0 n0Var = (n0) obj;
            if (n0Var != null) {
                return n0Var.h();
            }
            return null;
        }

        public int hashCode() {
            s0 s0Var = s0.f98648a;
            String lowerCase = a().toLowerCase(Locale.ROOT);
            g0.o(lowerCase, "toLowerCase(...)");
            return s0Var.a(lowerCase, this.f64693c);
        }

        @k
        public final C0744b j(@k String name, @k String value) {
            g0.p(name, "name");
            g0.p(value, "value");
            return new C0744b(a(), (List<n0>) r0.J4(this.f64693c, new n0(name, value)), this.f64694d);
        }

        @k
        public final C0744b k(@k String name, @k String value) {
            g0.p(name, "name");
            g0.p(value, "value");
            Iterator<n0> it = this.f64693c.iterator();
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                }
                if (g0.g(it.next().g(), name)) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return j(name, value);
            }
            List<n0> list = this.f64693c;
            ArrayList arrayList = new ArrayList();
            for (n0 n0Var : list) {
                if (g0.g(n0Var.g(), name)) {
                    if (z11) {
                        n0Var = null;
                    } else {
                        n0Var = new n0(name, value);
                        z11 = true;
                    }
                }
                if (n0Var != null) {
                    arrayList.add(n0Var);
                }
            }
            return new C0744b(a(), arrayList, this.f64694d);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0744b(@k String authScheme, @k List<n0> parameters, @k HeaderValueEncoding encoding) {
            super(authScheme, null);
            Regex regex;
            g0.p(authScheme, "authScheme");
            g0.p(parameters, "parameters");
            g0.p(encoding, "encoding");
            this.f64693c = parameters;
            this.f64694d = encoding;
            Iterator<T> it = parameters.iterator();
            while (it.hasNext()) {
                String g11 = ((n0) it.next()).g();
                regex = e.f64715c;
                if (!regex.matches(g11)) {
                    throw new ParseException("Parameter name should be a token", null, 2, null);
                }
            }
        }

        public /* synthetic */ C0744b(String str, Map map, HeaderValueEncoding headerValueEncoding, int i11, v vVar) {
            this(str, (Map<String, String>) map, (i11 & 4) != 0 ? HeaderValueEncoding.QUOTED_WHEN_REQUIRED : headerValueEncoding);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public C0744b(@m80.k java.lang.String r5, @m80.k java.util.Map<java.lang.String, java.lang.String> r6, @m80.k io.ktor.http.auth.HeaderValueEncoding r7) {
            /*
                r4 = this;
                java.lang.String r0 = "authScheme"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "parameters"
                kotlin.jvm.internal.g0.p(r6, r0)
                java.lang.String r0 = "encoding"
                kotlin.jvm.internal.g0.p(r7, r0)
                java.util.Set r6 = r6.entrySet()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 10
                int r1 = a00.i0.d0(r6, r1)
                r0.<init>(r1)
                java.util.Iterator r6 = r6.iterator()
            L24:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L45
                java.lang.Object r1 = r6.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                ix.n0 r2 = new ix.n0
                java.lang.Object r3 = r1.getKey()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                r2.<init>(r3, r1)
                r0.add(r2)
                goto L24
            L45:
                r4.<init>(r5, r0, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: jx.b.C0744b.<init>(java.lang.String, java.util.Map, io.ktor.http.auth.HeaderValueEncoding):void");
        }
    }

    public b(String str) {
        Regex regex;
        this.f64692a = str;
        regex = e.f64715c;
        if (regex.matches(str)) {
            return;
        }
        throw new ParseException("Invalid authScheme value: it should be token, but instead it is " + str, null, 2, null);
    }
}
