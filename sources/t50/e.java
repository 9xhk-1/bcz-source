package t50;

import a00.l1;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import jx.b;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f89589a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Map<String, String> f89590b;

    public e(@m80.k String scheme, @m80.k Map<String, String> authParams) {
        String str;
        g0.p(scheme, "scheme");
        g0.p(authParams, "authParams");
        this.f89589a = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : authParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale US = Locale.US;
                g0.o(US, "US");
                str = key.toLowerCase(US);
                g0.o(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            linkedHashMap.put(str, value);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        g0.o(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f89590b = unmodifiableMap;
    }

    @w00.j(name = "-deprecated_authParams")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "authParams", imports = {}))
    @m80.k
    public final Map<String, String> a() {
        return this.f89590b;
    }

    @w00.j(name = "-deprecated_charset")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "charset", imports = {}))
    @m80.k
    public final Charset b() {
        return f();
    }

    @m80.l
    @w00.j(name = "-deprecated_realm")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = b.c.f64697b, imports = {}))
    public final String c() {
        return g();
    }

    @w00.j(name = "-deprecated_scheme")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "scheme", imports = {}))
    @m80.k
    public final String d() {
        return this.f89589a;
    }

    @w00.j(name = "authParams")
    @m80.k
    public final Map<String, String> e() {
        return this.f89590b;
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return g0.g(eVar.f89589a, this.f89589a) && g0.g(eVar.f89590b, this.f89590b);
    }

    @w00.j(name = "charset")
    @m80.k
    public final Charset f() {
        String str = this.f89590b.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                g0.o(forName, "forName(charset)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        g0.o(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    @m80.l
    @w00.j(name = b.c.f64697b)
    public final String g() {
        return this.f89590b.get(b.c.f64697b);
    }

    @w00.j(name = "scheme")
    @m80.k
    public final String h() {
        return this.f89589a;
    }

    public int hashCode() {
        return ((899 + this.f89589a.hashCode()) * 31) + this.f89590b.hashCode();
    }

    @m80.k
    public final e i(@m80.k Charset charset) {
        g0.p(charset, "charset");
        Map J0 = l1.J0(this.f89590b);
        String name = charset.name();
        g0.o(name, "charset.name()");
        J0.put("charset", name);
        return new e(this.f89589a, (Map<String, String>) J0);
    }

    @m80.k
    public String toString() {
        return this.f89589a + " authParams=" + this.f89590b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(@m80.k java.lang.String r2, @m80.k java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "scheme"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "realm"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r0 = "singletonMap(\"realm\", realm)"
            kotlin.jvm.internal.g0.o(r3, r0)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t50.e.<init>(java.lang.String, java.lang.String):void");
    }
}
