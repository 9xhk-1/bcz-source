package qo;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.aa;
import com.google.common.collect.d7;
import com.google.common.collect.g7;
import com.google.common.collect.u6;
import com.huawei.hms.framework.common.ContainerUtils;
import ho.a0;
import ho.b0;
import ho.d0;
import ho.r;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@qo.a
@go.b
@uo.j
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: g, reason: collision with root package name */
    public static final String f82509g = "charset";

    /* renamed from: l, reason: collision with root package name */
    public static final String f82524l = "application";

    /* renamed from: m, reason: collision with root package name */
    public static final String f82527m = "audio";

    /* renamed from: n, reason: collision with root package name */
    public static final String f82530n = "image";

    /* renamed from: o, reason: collision with root package name */
    public static final String f82533o = "text";

    /* renamed from: p, reason: collision with root package name */
    public static final String f82536p = "video";

    /* renamed from: r, reason: collision with root package name */
    public static final String f82542r = "*";

    /* renamed from: a, reason: collision with root package name */
    public final String f82569a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82570b;

    /* renamed from: c, reason: collision with root package name */
    public final ImmutableListMultimap<String, String> f82571c;

    /* renamed from: d, reason: collision with root package name */
    @CheckForNull
    @vo.b
    public String f82572d;

    /* renamed from: e, reason: collision with root package name */
    @vo.b
    public int f82573e;

    /* renamed from: f, reason: collision with root package name */
    @CheckForNull
    @vo.b
    public Optional<Charset> f82574f;

    /* renamed from: h, reason: collision with root package name */
    public static final ImmutableListMultimap<String, String> f82512h = ImmutableListMultimap.of("charset", ho.c.g(StandardCharsets.UTF_8.name()));

    /* renamed from: i, reason: collision with root package name */
    public static final ho.d f82515i = ho.d.f().b(ho.d.v().F()).b(ho.d.s(' ')).b(ho.d.H("()<>@,;:\\\"/[]?="));

    /* renamed from: j, reason: collision with root package name */
    public static final ho.d f82518j = ho.d.f().b(ho.d.H("\"\\\r"));

    /* renamed from: k, reason: collision with root package name */
    public static final ho.d f82521k = ho.d.d(" \t\r\n");

    /* renamed from: s, reason: collision with root package name */
    public static final Map<h, h> f82545s = u6.Y();

    /* renamed from: t, reason: collision with root package name */
    public static final h f82548t = j("*", "*");

    /* renamed from: u, reason: collision with root package name */
    public static final h f82551u = j("text", "*");

    /* renamed from: v, reason: collision with root package name */
    public static final h f82554v = j("image", "*");

    /* renamed from: w, reason: collision with root package name */
    public static final h f82557w = j("audio", "*");

    /* renamed from: x, reason: collision with root package name */
    public static final h f82560x = j("video", "*");

    /* renamed from: y, reason: collision with root package name */
    public static final h f82563y = j("application", "*");

    /* renamed from: q, reason: collision with root package name */
    public static final String f82539q = "font";

    /* renamed from: z, reason: collision with root package name */
    public static final h f82566z = j(f82539q, "*");
    public static final h A = k("text", "cache-manifest");
    public static final h B = k("text", "css");
    public static final h C = k("text", "csv");
    public static final h D = k("text", "html");
    public static final h E = k("text", "calendar");
    public static final h F = k("text", "markdown");
    public static final h G = k("text", "plain");
    public static final h H = k("text", "javascript");
    public static final h I = k("text", "tab-separated-values");
    public static final h J = k("text", "vcard");
    public static final h K = k("text", "vnd.wap.wml");
    public static final h L = k("text", "xml");
    public static final h M = k("text", "vtt");
    public static final h N = j("image", "bmp");
    public static final h O = j("image", "x-canon-crw");
    public static final h P = j("image", "gif");
    public static final h Q = j("image", "vnd.microsoft.icon");
    public static final h R = j("image", "jpeg");
    public static final h S = j("image", "png");
    public static final h T = j("image", "vnd.adobe.photoshop");
    public static final h U = k("image", "svg+xml");
    public static final h V = j("image", "tiff");
    public static final h W = j("image", "webp");
    public static final h X = j("image", "heif");
    public static final h Y = j("image", "jp2");
    public static final h Z = j("audio", "mp4");

    /* renamed from: a0, reason: collision with root package name */
    public static final h f82497a0 = j("audio", "mpeg");

    /* renamed from: b0, reason: collision with root package name */
    public static final h f82499b0 = j("audio", "ogg");

    /* renamed from: c0, reason: collision with root package name */
    public static final h f82501c0 = j("audio", "webm");

    /* renamed from: d0, reason: collision with root package name */
    public static final h f82503d0 = j("audio", "l16");

    /* renamed from: e0, reason: collision with root package name */
    public static final h f82505e0 = j("audio", "l24");

    /* renamed from: f0, reason: collision with root package name */
    public static final h f82507f0 = j("audio", "basic");

    /* renamed from: g0, reason: collision with root package name */
    public static final h f82510g0 = j("audio", "aac");

    /* renamed from: h0, reason: collision with root package name */
    public static final h f82513h0 = j("audio", "vorbis");

    /* renamed from: i0, reason: collision with root package name */
    public static final h f82516i0 = j("audio", "x-ms-wma");

    /* renamed from: j0, reason: collision with root package name */
    public static final h f82519j0 = j("audio", "x-ms-wax");

    /* renamed from: k0, reason: collision with root package name */
    public static final h f82522k0 = j("audio", "vnd.rn-realaudio");

    /* renamed from: l0, reason: collision with root package name */
    public static final h f82525l0 = j("audio", "vnd.wave");

    /* renamed from: m0, reason: collision with root package name */
    public static final h f82528m0 = j("video", "mp4");

    /* renamed from: n0, reason: collision with root package name */
    public static final h f82531n0 = j("video", "mpeg");

    /* renamed from: o0, reason: collision with root package name */
    public static final h f82534o0 = j("video", "ogg");

    /* renamed from: p0, reason: collision with root package name */
    public static final h f82537p0 = j("video", "quicktime");

    /* renamed from: q0, reason: collision with root package name */
    public static final h f82540q0 = j("video", "webm");

    /* renamed from: r0, reason: collision with root package name */
    public static final h f82543r0 = j("video", "x-ms-wmv");

    /* renamed from: s0, reason: collision with root package name */
    public static final h f82546s0 = j("video", "x-flv");

    /* renamed from: t0, reason: collision with root package name */
    public static final h f82549t0 = j("video", "3gpp");

    /* renamed from: u0, reason: collision with root package name */
    public static final h f82552u0 = j("video", "3gpp2");

    /* renamed from: v0, reason: collision with root package name */
    public static final h f82555v0 = k("application", "xml");

    /* renamed from: w0, reason: collision with root package name */
    public static final h f82558w0 = k("application", "atom+xml");

    /* renamed from: x0, reason: collision with root package name */
    public static final h f82561x0 = j("application", "x-bzip2");

    /* renamed from: y0, reason: collision with root package name */
    public static final h f82564y0 = k("application", "dart");

    /* renamed from: z0, reason: collision with root package name */
    public static final h f82567z0 = j("application", "vnd.apple.pkpass");
    public static final h A0 = j("application", "vnd.ms-fontobject");
    public static final h B0 = j("application", "epub+zip");
    public static final h C0 = j("application", "x-www-form-urlencoded");
    public static final h D0 = j("application", "pkcs12");
    public static final h E0 = j("application", "binary");
    public static final h F0 = j("application", "geo+json");
    public static final h G0 = j("application", "x-gzip");
    public static final h H0 = j("application", "hal+json");
    public static final h I0 = k("application", "javascript");
    public static final h J0 = j("application", "jose");
    public static final h K0 = j("application", "jose+json");
    public static final h L0 = k("application", "json");
    public static final h M0 = j("application", "jwt");
    public static final h N0 = k("application", "manifest+json");
    public static final h O0 = j("application", "vnd.google-earth.kml+xml");
    public static final h P0 = j("application", "vnd.google-earth.kmz");
    public static final h Q0 = j("application", "mbox");
    public static final h R0 = j("application", "x-apple-aspen-config");
    public static final h S0 = j("application", "vnd.ms-excel");
    public static final h T0 = j("application", "vnd.ms-outlook");
    public static final h U0 = j("application", "vnd.ms-powerpoint");
    public static final h V0 = j("application", "msword");
    public static final h W0 = j("application", "dash+xml");
    public static final h X0 = j("application", "wasm");
    public static final h Y0 = j("application", "x-nacl");
    public static final h Z0 = j("application", "x-pnacl");

    /* renamed from: a1, reason: collision with root package name */
    public static final h f82498a1 = j("application", "octet-stream");

    /* renamed from: b1, reason: collision with root package name */
    public static final h f82500b1 = j("application", "ogg");

    /* renamed from: c1, reason: collision with root package name */
    public static final h f82502c1 = j("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");

    /* renamed from: d1, reason: collision with root package name */
    public static final h f82504d1 = j("application", "vnd.openxmlformats-officedocument.presentationml.presentation");

    /* renamed from: e1, reason: collision with root package name */
    public static final h f82506e1 = j("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");

    /* renamed from: f1, reason: collision with root package name */
    public static final h f82508f1 = j("application", "vnd.oasis.opendocument.graphics");

    /* renamed from: g1, reason: collision with root package name */
    public static final h f82511g1 = j("application", "vnd.oasis.opendocument.presentation");

    /* renamed from: h1, reason: collision with root package name */
    public static final h f82514h1 = j("application", "vnd.oasis.opendocument.spreadsheet");

    /* renamed from: i1, reason: collision with root package name */
    public static final h f82517i1 = j("application", "vnd.oasis.opendocument.text");

    /* renamed from: j1, reason: collision with root package name */
    public static final h f82520j1 = k("application", "opensearchdescription+xml");

    /* renamed from: k1, reason: collision with root package name */
    public static final h f82523k1 = j("application", "pdf");

    /* renamed from: l1, reason: collision with root package name */
    public static final h f82526l1 = j("application", "postscript");

    /* renamed from: m1, reason: collision with root package name */
    public static final h f82529m1 = j("application", "protobuf");

    /* renamed from: n1, reason: collision with root package name */
    public static final h f82532n1 = k("application", "rdf+xml");

    /* renamed from: o1, reason: collision with root package name */
    public static final h f82535o1 = k("application", "rtf");

    /* renamed from: p1, reason: collision with root package name */
    public static final h f82538p1 = j("application", "font-sfnt");

    /* renamed from: q1, reason: collision with root package name */
    public static final h f82541q1 = j("application", "x-shockwave-flash");

    /* renamed from: r1, reason: collision with root package name */
    public static final h f82544r1 = j("application", "vnd.sketchup.skp");

    /* renamed from: s1, reason: collision with root package name */
    public static final h f82547s1 = k("application", "soap+xml");

    /* renamed from: t1, reason: collision with root package name */
    public static final h f82550t1 = j("application", "x-tar");

    /* renamed from: u1, reason: collision with root package name */
    public static final h f82553u1 = j("application", "font-woff");

    /* renamed from: v1, reason: collision with root package name */
    public static final h f82556v1 = j("application", "font-woff2");

    /* renamed from: w1, reason: collision with root package name */
    public static final h f82559w1 = k("application", "xhtml+xml");

    /* renamed from: x1, reason: collision with root package name */
    public static final h f82562x1 = k("application", "xrd+xml");

    /* renamed from: y1, reason: collision with root package name */
    public static final h f82565y1 = j("application", "zip");

    /* renamed from: z1, reason: collision with root package name */
    public static final h f82568z1 = j(f82539q, "collection");
    public static final h A1 = j(f82539q, "otf");
    public static final h B1 = j(f82539q, "sfnt");
    public static final h C1 = j(f82539q, "ttf");
    public static final h D1 = j(f82539q, "woff");
    public static final h E1 = j(f82539q, "woff2");
    public static final a0.d F1 = a0.p("; ").u(ContainerUtils.KEY_VALUE_DELIMITER);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f82575a;

        /* renamed from: b, reason: collision with root package name */
        public int f82576b = 0;

        public a(String input) {
            this.f82575a = input;
        }

        @uo.a
        public char a(char c11) {
            Preconditions.checkState(e());
            Preconditions.checkState(f() == c11);
            this.f82576b++;
            return c11;
        }

        public char b(ho.d matcher) {
            Preconditions.checkState(e());
            char f11 = f();
            Preconditions.checkState(matcher.B(f11));
            this.f82576b++;
            return f11;
        }

        public String c(ho.d matcher) {
            int i11 = this.f82576b;
            String d11 = d(matcher);
            Preconditions.checkState(this.f82576b != i11);
            return d11;
        }

        @uo.a
        public String d(ho.d matcher) {
            Preconditions.checkState(e());
            int i11 = this.f82576b;
            this.f82576b = matcher.F().o(this.f82575a, i11);
            return e() ? this.f82575a.substring(i11, this.f82576b) : this.f82575a.substring(i11);
        }

        public boolean e() {
            int i11 = this.f82576b;
            return i11 >= 0 && i11 < this.f82575a.length();
        }

        public char f() {
            Preconditions.checkState(e());
            return this.f82575a.charAt(this.f82576b);
        }
    }

    public h(String type, String subtype, ImmutableListMultimap<String, String> parameters) {
        this.f82569a = type;
        this.f82570b = subtype;
        this.f82571c = parameters;
    }

    public static /* synthetic */ String a(String str) {
        return (!f82515i.C(str) || str.isEmpty()) ? p(str) : str;
    }

    public static h b(h mediaType) {
        f82545s.put(mediaType, mediaType);
        return mediaType;
    }

    public static void e(a tokenizer, char c11) {
        ho.d dVar = f82521k;
        tokenizer.d(dVar);
        tokenizer.a(c11);
        tokenizer.d(dVar);
    }

    public static h f(String type, String subtype) {
        h g11 = g(type, subtype, ImmutableListMultimap.of());
        g11.f82574f = Optional.absent();
        return g11;
    }

    public static h g(String type, String subtype, d7<String, String> parameters) {
        Preconditions.checkNotNull(type);
        Preconditions.checkNotNull(subtype);
        Preconditions.checkNotNull(parameters);
        String t11 = t(type);
        String t12 = t(subtype);
        Preconditions.checkArgument(!"*".equals(t11) || "*".equals(t12), "A wildcard type cannot be used with a non-wildcard subtype");
        ImmutableListMultimap.a builder = ImmutableListMultimap.builder();
        for (Map.Entry<String, String> entry : parameters.entries()) {
            String t13 = t(entry.getKey());
            builder.i(t13, s(t13, entry.getValue()));
        }
        h hVar = new h(t11, t12, builder.a());
        return (h) b0.a(f82545s.get(hVar), hVar);
    }

    public static h h(String subtype) {
        return f("application", subtype);
    }

    public static h i(String subtype) {
        return f("audio", subtype);
    }

    public static h j(String type, String subtype) {
        h b11 = b(new h(type, subtype, ImmutableListMultimap.of()));
        b11.f82574f = Optional.absent();
        return b11;
    }

    public static h k(String type, String subtype) {
        h b11 = b(new h(type, subtype, f82512h));
        b11.f82574f = Optional.of(StandardCharsets.UTF_8);
        return b11;
    }

    public static h l(String subtype) {
        return f(f82539q, subtype);
    }

    public static h m(String subtype) {
        return f("image", subtype);
    }

    public static h n(String subtype) {
        return f("text", subtype);
    }

    public static h o(String subtype) {
        return f("video", subtype);
    }

    public static String p(String value) {
        StringBuilder sb2 = new StringBuilder(value.length() + 16);
        sb2.append('\"');
        for (int i11 = 0; i11 < value.length(); i11++) {
            char charAt = value.charAt(i11);
            if (charAt == '\r' || charAt == '\\' || charAt == '\"') {
                sb2.append('\\');
            }
            sb2.append(charAt);
        }
        sb2.append('\"');
        return sb2.toString();
    }

    public static String s(String attribute, String value) {
        Preconditions.checkNotNull(value);
        Preconditions.checkArgument(ho.d.f().C(value), "parameter values must be ASCII: %s", value);
        return "charset".equals(attribute) ? ho.c.g(value) : value;
    }

    public static String t(String token) {
        Preconditions.checkArgument(f82515i.C(token));
        Preconditions.checkArgument(!token.isEmpty());
        return ho.c.g(token);
    }

    @uo.a
    public static h w(String input) {
        String c11;
        Preconditions.checkNotNull(input);
        a aVar = new a(input);
        try {
            ho.d dVar = f82515i;
            String c12 = aVar.c(dVar);
            e(aVar, '/');
            String c13 = aVar.c(dVar);
            ImmutableListMultimap.a builder = ImmutableListMultimap.builder();
            while (aVar.e()) {
                e(aVar, l70.f.f70689d);
                ho.d dVar2 = f82515i;
                String c14 = aVar.c(dVar2);
                e(aVar, '=');
                if ('\"' == aVar.f()) {
                    aVar.a('\"');
                    StringBuilder sb2 = new StringBuilder();
                    while ('\"' != aVar.f()) {
                        if ('\\' == aVar.f()) {
                            aVar.a('\\');
                            sb2.append(aVar.b(ho.d.f()));
                        } else {
                            sb2.append(aVar.c(f82518j));
                        }
                    }
                    c11 = sb2.toString();
                    aVar.a('\"');
                } else {
                    c11 = aVar.c(dVar2);
                }
                builder.i(c14, c11);
            }
            return g(c12, c13, builder.a());
        } catch (IllegalStateException e11) {
            throw new IllegalArgumentException("Could not parse '" + input + "'", e11);
        }
    }

    public h A(String attribute, String value) {
        return C(attribute, ImmutableSet.of(value));
    }

    public h B(d7<String, String> parameters) {
        return g(this.f82569a, this.f82570b, parameters);
    }

    public h C(String attribute, Iterable<String> values) {
        Preconditions.checkNotNull(attribute);
        Preconditions.checkNotNull(values);
        String t11 = t(attribute);
        ImmutableListMultimap.a builder = ImmutableListMultimap.builder();
        aa<Map.Entry<String, String>> it = this.f82571c.entries().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            if (!t11.equals(key)) {
                builder.i(key, next.getValue());
            }
        }
        Iterator<String> it2 = values.iterator();
        while (it2.hasNext()) {
            builder.i(t11, s(t11, it2.next()));
        }
        h hVar = new h(this.f82569a, this.f82570b, builder.a());
        if (!t11.equals("charset")) {
            hVar.f82574f = this.f82574f;
        }
        return (h) b0.a(f82545s.get(hVar), hVar);
    }

    public h D() {
        return this.f82571c.isEmpty() ? this : f(this.f82569a, this.f82570b);
    }

    public Optional<Charset> c() {
        Optional<Charset> optional = this.f82574f;
        if (optional == null) {
            optional = Optional.absent();
            aa<String> it = this.f82571c.get((ImmutableListMultimap<String, String>) "charset").iterator();
            String str = null;
            while (it.hasNext()) {
                String next = it.next();
                if (str == null) {
                    optional = Optional.of(Charset.forName(next));
                    str = next;
                } else if (!str.equals(next)) {
                    throw new IllegalStateException("Multiple charset values defined: " + str + j2.O + next);
                }
            }
            this.f82574f = optional;
        }
        return optional;
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f82569a);
        sb2.append('/');
        sb2.append(this.f82570b);
        if (!this.f82571c.isEmpty()) {
            sb2.append("; ");
            F1.d(sb2, g7.G(this.f82571c, new r() { // from class: qo.f
                @Override // ho.r
                public final Object apply(Object obj) {
                    return h.a((String) obj);
                }
            }).entries());
        }
        return sb2.toString();
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f82569a.equals(hVar.f82569a) && this.f82570b.equals(hVar.f82570b) && v().equals(hVar.v())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.f82573e;
        if (i11 != 0) {
            return i11;
        }
        int b11 = d0.b(this.f82569a, this.f82570b, v());
        this.f82573e = b11;
        return b11;
    }

    public boolean q() {
        return "*".equals(this.f82569a) || "*".equals(this.f82570b);
    }

    public boolean r(h mediaTypeRange) {
        if (mediaTypeRange.f82569a.equals("*") || mediaTypeRange.f82569a.equals(this.f82569a)) {
            return (mediaTypeRange.f82570b.equals("*") || mediaTypeRange.f82570b.equals(this.f82570b)) && this.f82571c.entries().containsAll(mediaTypeRange.f82571c.entries());
        }
        return false;
    }

    public String toString() {
        String str = this.f82572d;
        if (str != null) {
            return str;
        }
        String d11 = d();
        this.f82572d = d11;
        return d11;
    }

    public ImmutableListMultimap<String, String> u() {
        return this.f82571c;
    }

    public final Map<String, ImmutableMultiset<String>> v() {
        return u6.D0(this.f82571c.asMap(), new r() { // from class: qo.g
            @Override // ho.r
            public final Object apply(Object obj) {
                return ImmutableMultiset.copyOf((Collection) obj);
            }
        });
    }

    public String x() {
        return this.f82570b;
    }

    public String y() {
        return this.f82569a;
    }

    public h z(Charset charset) {
        Preconditions.checkNotNull(charset);
        h A2 = A("charset", charset.name());
        A2.f82574f = Optional.of(charset);
        return A2;
    }
}
