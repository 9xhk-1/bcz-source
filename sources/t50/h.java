package t50;

import a00.h0;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.text.Regex;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import u30.f0;
import u30.k0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final b f89592j = new b(null);

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f89593k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f89594l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f89595m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f89596n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f89597a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f89598b;

    /* renamed from: c, reason: collision with root package name */
    public final long f89599c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f89600d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f89601e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f89602f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f89603g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f89604h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f89605i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nCookie.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cookie.kt\nokhttp3/Cookie$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,614:1\n1#2:615\n*E\n"})
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f89606a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f89607b;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f89609d;

        /* renamed from: f, reason: collision with root package name */
        public boolean f89611f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f89612g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f89613h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f89614i;

        /* renamed from: c, reason: collision with root package name */
        public long f89608c = a60.c.f1997a;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public String f89610e = "/";

        @m80.k
        public final h a() {
            String str = this.f89606a;
            if (str == null) {
                throw new NullPointerException("builder.name == null");
            }
            String str2 = this.f89607b;
            if (str2 == null) {
                throw new NullPointerException("builder.value == null");
            }
            long j11 = this.f89608c;
            String str3 = this.f89609d;
            if (str3 != null) {
                return new h(str, str2, j11, str3, this.f89610e, this.f89611f, this.f89612g, this.f89613h, this.f89614i, null);
            }
            throw new NullPointerException("builder.domain == null");
        }

        @m80.k
        public final a b(@m80.k String domain) {
            g0.p(domain, "domain");
            return c(domain, false);
        }

        public final a c(String str, boolean z11) {
            String e11 = u50.a.e(str);
            if (e11 != null) {
                this.f89609d = e11;
                this.f89614i = z11;
                return this;
            }
            throw new IllegalArgumentException("unexpected domain: " + str);
        }

        @m80.k
        public final a d(long j11) {
            if (j11 <= 0) {
                j11 = Long.MIN_VALUE;
            }
            if (j11 > a60.c.f1997a) {
                j11 = 253402300799999L;
            }
            this.f89608c = j11;
            this.f89613h = true;
            return this;
        }

        @m80.k
        public final a e(@m80.k String domain) {
            g0.p(domain, "domain");
            return c(domain, true);
        }

        @m80.k
        public final a f() {
            this.f89612g = true;
            return this;
        }

        @m80.k
        public final a g(@m80.k String name) {
            g0.p(name, "name");
            if (!g0.g(k0.b6(name).toString(), name)) {
                throw new IllegalArgumentException("name is not trimmed");
            }
            this.f89606a = name;
            return this;
        }

        @m80.k
        public final a h(@m80.k String path) {
            g0.p(path, "path");
            if (!f0.J2(path, "/", false, 2, null)) {
                throw new IllegalArgumentException("path must start with '/'");
            }
            this.f89610e = path;
            return this;
        }

        @m80.k
        public final a i() {
            this.f89611f = true;
            return this;
        }

        @m80.k
        public final a j(@m80.k String value) {
            g0.p(value, "value");
            if (!g0.g(k0.b6(value).toString(), value)) {
                throw new IllegalArgumentException("value is not trimmed");
            }
            this.f89607b = value;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public final int c(String str, int i11, int i12, boolean z11) {
            while (i11 < i12) {
                char charAt = str.charAt(i11);
                if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z11)) {
                    return i11;
                }
                i11++;
            }
            return i12;
        }

        public final boolean d(String str, String str2) {
            if (g0.g(str, str2)) {
                return true;
            }
            return f0.b2(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !u50.f.k(str);
        }

        @m80.l
        @w00.o
        public final h e(@m80.k okhttp3.i url, @m80.k String setCookie) {
            g0.p(url, "url");
            g0.p(setCookie, "setCookie");
            return f(System.currentTimeMillis(), url, setCookie);
        }

        @m80.l
        public final h f(long j11, @m80.k okhttp3.i url, @m80.k String setCookie) {
            long j12;
            g0.p(url, "url");
            g0.p(setCookie, "setCookie");
            int u11 = u50.f.u(setCookie, l70.f.f70689d, 0, 0, 6, null);
            int u12 = u50.f.u(setCookie, '=', 0, u11, 2, null);
            h hVar = null;
            if (u12 == u11) {
                return null;
            }
            String m02 = u50.f.m0(setCookie, 0, u12, 1, null);
            if (m02.length() == 0 || u50.f.E(m02) != -1) {
                return null;
            }
            String l02 = u50.f.l0(setCookie, u12 + 1, u11);
            if (u50.f.E(l02) != -1) {
                return null;
            }
            int i11 = u11 + 1;
            int length = setCookie.length();
            String str = null;
            String str2 = null;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = true;
            long j13 = -1;
            long j14 = a60.c.f1997a;
            while (i11 < length) {
                int s11 = u50.f.s(setCookie, l70.f.f70689d, i11, length);
                int s12 = u50.f.s(setCookie, '=', i11, s11);
                String l03 = u50.f.l0(setCookie, i11, s12);
                String l04 = s12 < s11 ? u50.f.l0(setCookie, s12 + 1, s11) : "";
                h hVar2 = hVar;
                if (f0.c2(l03, "expires", true)) {
                    try {
                        j14 = i(l04, 0, l04.length());
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (f0.c2(l03, fx.d.f52395b, true)) {
                    j13 = j(l04);
                } else {
                    if (f0.c2(l03, "domain", true)) {
                        str = h(l04);
                        z14 = false;
                    } else if (f0.c2(l03, "path", true)) {
                        str2 = l04;
                    } else if (f0.c2(l03, "secure", true)) {
                        z13 = true;
                    } else if (f0.c2(l03, "httponly", true)) {
                        z11 = true;
                    }
                    i11 = s11 + 1;
                    hVar = hVar2;
                }
                z12 = true;
                i11 = s11 + 1;
                hVar = hVar2;
            }
            h hVar3 = hVar;
            if (j13 == Long.MIN_VALUE) {
                j12 = Long.MIN_VALUE;
            } else if (j13 != -1) {
                long j15 = j11 + (j13 <= 9223372036854775L ? j13 * 1000 : Long.MAX_VALUE);
                j12 = (j15 < j11 || j15 > a60.c.f1997a) ? 253402300799999L : j15;
            } else {
                j12 = j14;
            }
            String F = url.F();
            if (str == null) {
                str = F;
            } else if (!d(F, str)) {
                return hVar3;
            }
            if (F.length() != str.length() && PublicSuffixDatabase.f77437e.c().c(str) == null) {
                return hVar3;
            }
            String str3 = "/";
            if (str2 == null || !f0.J2(str2, "/", false, 2, hVar3)) {
                String x11 = url.x();
                int X3 = k0.X3(x11, '/', 0, false, 6, null);
                if (X3 != 0) {
                    str3 = x11.substring(0, X3);
                    g0.o(str3, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                str2 = str3;
            }
            return new h(m02, l02, j12, str, str2, z13, z11, z12, z14, null);
        }

        @w00.o
        @m80.k
        public final List<h> g(@m80.k okhttp3.i url, @m80.k okhttp3.h headers) {
            g0.p(url, "url");
            g0.p(headers, "headers");
            List<String> p11 = headers.p("Set-Cookie");
            int size = p11.size();
            ArrayList arrayList = null;
            for (int i11 = 0; i11 < size; i11++) {
                h e11 = e(url, p11.get(i11));
                if (e11 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(e11);
                }
            }
            if (arrayList == null) {
                return h0.J();
            }
            List<h> unmodifiableList = Collections.unmodifiableList(arrayList);
            g0.o(unmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return unmodifiableList;
        }

        public final String h(String str) {
            if (f0.b2(str, ".", false, 2, null)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String e11 = u50.a.e(k0.x4(str, "."));
            if (e11 != null) {
                return e11;
            }
            throw new IllegalArgumentException();
        }

        public final long i(String str, int i11, int i12) {
            int c11 = c(str, i11, i12, false);
            Matcher matcher = h.f89596n.matcher(str);
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            while (c11 < i12) {
                int c12 = c(str, c11 + 1, i12, true);
                matcher.region(c11, c12);
                if (i14 == -1 && matcher.usePattern(h.f89596n).matches()) {
                    String group = matcher.group(1);
                    g0.o(group, "matcher.group(1)");
                    i14 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    g0.o(group2, "matcher.group(2)");
                    i17 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    g0.o(group3, "matcher.group(3)");
                    i18 = Integer.parseInt(group3);
                } else if (i15 == -1 && matcher.usePattern(h.f89595m).matches()) {
                    String group4 = matcher.group(1);
                    g0.o(group4, "matcher.group(1)");
                    i15 = Integer.parseInt(group4);
                } else if (i16 == -1 && matcher.usePattern(h.f89594l).matches()) {
                    String group5 = matcher.group(1);
                    g0.o(group5, "matcher.group(1)");
                    Locale US = Locale.US;
                    g0.o(US, "US");
                    String lowerCase = group5.toLowerCase(US);
                    g0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String pattern = h.f89594l.pattern();
                    g0.o(pattern, "MONTH_PATTERN.pattern()");
                    i16 = k0.J3(pattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i13 == -1 && matcher.usePattern(h.f89593k).matches()) {
                    String group6 = matcher.group(1);
                    g0.o(group6, "matcher.group(1)");
                    i13 = Integer.parseInt(group6);
                }
                c11 = c(str, c12 + 1, i12, false);
            }
            if (70 <= i13 && i13 < 100) {
                i13 += 1900;
            }
            if (i13 >= 0 && i13 < 70) {
                i13 += 2000;
            }
            if (i13 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i16 == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i15 || i15 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i14 < 0 || i14 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i17 < 0 || i17 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i18 < 0 || i18 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(u50.f.f91851f);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i13);
            gregorianCalendar.set(2, i16 - 1);
            gregorianCalendar.set(5, i15);
            gregorianCalendar.set(11, i14);
            gregorianCalendar.set(12, i17);
            gregorianCalendar.set(13, i18);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        public final long j(String str) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e11) {
                if (new Regex("-?\\d+").matches(str)) {
                    return f0.J2(str, Constants.ACCEPT_TIME_SEPARATOR_SERVER, false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e11;
            }
        }

        public final boolean k(okhttp3.i iVar, String str) {
            String x11 = iVar.x();
            if (g0.g(x11, str)) {
                return true;
            }
            return f0.J2(x11, str, false, 2, null) && (f0.b2(str, "/", false, 2, null) || x11.charAt(str.length()) == '/');
        }

        public b() {
        }
    }

    public /* synthetic */ h(String str, String str2, long j11, String str3, String str4, boolean z11, boolean z12, boolean z13, boolean z14, v vVar) {
        this(str, str2, j11, str3, str4, z11, z12, z13, z14);
    }

    @m80.l
    @w00.o
    public static final h t(@m80.k okhttp3.i iVar, @m80.k String str) {
        return f89592j.e(iVar, str);
    }

    @w00.o
    @m80.k
    public static final List<h> u(@m80.k okhttp3.i iVar, @m80.k okhttp3.h hVar) {
        return f89592j.g(iVar, hVar);
    }

    @w00.j(name = "-deprecated_domain")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "domain", imports = {}))
    @m80.k
    public final String a() {
        return this.f89600d;
    }

    @w00.j(name = "-deprecated_expiresAt")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "expiresAt", imports = {}))
    public final long b() {
        return this.f89599c;
    }

    @w00.j(name = "-deprecated_hostOnly")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "hostOnly", imports = {}))
    public final boolean c() {
        return this.f89605i;
    }

    @w00.j(name = "-deprecated_httpOnly")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "httpOnly", imports = {}))
    public final boolean d() {
        return this.f89603g;
    }

    @w00.j(name = "-deprecated_name")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "name", imports = {}))
    @m80.k
    public final String e() {
        return this.f89597a;
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return g0.g(hVar.f89597a, this.f89597a) && g0.g(hVar.f89598b, this.f89598b) && hVar.f89599c == this.f89599c && g0.g(hVar.f89600d, this.f89600d) && g0.g(hVar.f89601e, this.f89601e) && hVar.f89602f == this.f89602f && hVar.f89603g == this.f89603g && hVar.f89604h == this.f89604h && hVar.f89605i == this.f89605i;
    }

    @w00.j(name = "-deprecated_path")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "path", imports = {}))
    @m80.k
    public final String f() {
        return this.f89601e;
    }

    @w00.j(name = "-deprecated_persistent")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "persistent", imports = {}))
    public final boolean g() {
        return this.f89604h;
    }

    @w00.j(name = "-deprecated_secure")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "secure", imports = {}))
    public final boolean h() {
        return this.f89602f;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return ((((((((((((((((527 + this.f89597a.hashCode()) * 31) + this.f89598b.hashCode()) * 31) + Long.hashCode(this.f89599c)) * 31) + this.f89600d.hashCode()) * 31) + this.f89601e.hashCode()) * 31) + Boolean.hashCode(this.f89602f)) * 31) + Boolean.hashCode(this.f89603g)) * 31) + Boolean.hashCode(this.f89604h)) * 31) + Boolean.hashCode(this.f89605i);
    }

    @w00.j(name = "-deprecated_value")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "value", imports = {}))
    @m80.k
    public final String i() {
        return this.f89598b;
    }

    @w00.j(name = "domain")
    @m80.k
    public final String n() {
        return this.f89600d;
    }

    @w00.j(name = "expiresAt")
    public final long o() {
        return this.f89599c;
    }

    @w00.j(name = "hostOnly")
    public final boolean p() {
        return this.f89605i;
    }

    @w00.j(name = "httpOnly")
    public final boolean q() {
        return this.f89603g;
    }

    public final boolean r(@m80.k okhttp3.i url) {
        g0.p(url, "url");
        if ((this.f89605i ? g0.g(url.F(), this.f89600d) : f89592j.d(url.F(), this.f89600d)) && f89592j.k(url, this.f89601e)) {
            return !this.f89602f || url.G();
        }
        return false;
    }

    @w00.j(name = "name")
    @m80.k
    public final String s() {
        return this.f89597a;
    }

    @m80.k
    public String toString() {
        return y(false);
    }

    @w00.j(name = "path")
    @m80.k
    public final String v() {
        return this.f89601e;
    }

    @w00.j(name = "persistent")
    public final boolean w() {
        return this.f89604h;
    }

    @w00.j(name = "secure")
    public final boolean x() {
        return this.f89602f;
    }

    @m80.k
    public final String y(boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f89597a);
        sb2.append('=');
        sb2.append(this.f89598b);
        if (this.f89604h) {
            if (this.f89599c == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(a60.c.b(new Date(this.f89599c)));
            }
        }
        if (!this.f89605i) {
            sb2.append("; domain=");
            if (z11) {
                sb2.append(".");
            }
            sb2.append(this.f89600d);
        }
        sb2.append("; path=");
        sb2.append(this.f89601e);
        if (this.f89602f) {
            sb2.append("; secure");
        }
        if (this.f89603g) {
            sb2.append("; httponly");
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString()");
        return sb3;
    }

    @w00.j(name = "value")
    @m80.k
    public final String z() {
        return this.f89598b;
    }

    public h(String str, String str2, long j11, String str3, String str4, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f89597a = str;
        this.f89598b = str2;
        this.f89599c = j11;
        this.f89600d = str3;
        this.f89601e = str4;
        this.f89602f = z11;
        this.f89603g = z12;
        this.f89604h = z13;
        this.f89605i = z14;
    }
}
