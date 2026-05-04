package okhttp3;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import u30.f0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final String f77448f = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final String f77449g = "\"([^\"]*)\"";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f77452a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f77453b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f77454c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String[] f77455d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final a f77447e = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f77450h = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f77451i = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nMediaType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaType.kt\nokhttp3/MediaType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,181:1\n1#2:182\n37#3,2:183\n*S KotlinDebug\n*F\n+ 1 MediaType.kt\nokhttp3/MediaType$Companion\n*L\n148#1:183,2\n*E\n"})
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @w00.j(name = "-deprecated_get")
        @yz.n(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @w0(expression = "mediaType.toMediaType()", imports = {"okhttp3.MediaType.Companion.toMediaType"}))
        @m80.k
        public final j a(@m80.k String mediaType) {
            g0.p(mediaType, "mediaType");
            return c(mediaType);
        }

        @m80.l
        @w00.j(name = "-deprecated_parse")
        @yz.n(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @w0(expression = "mediaType.toMediaTypeOrNull()", imports = {"okhttp3.MediaType.Companion.toMediaTypeOrNull"}))
        public final j b(@m80.k String mediaType) {
            g0.p(mediaType, "mediaType");
            return d(mediaType);
        }

        @w00.j(name = ct.d.f46852f)
        @w00.o
        @m80.k
        public final j c(@m80.k String str) {
            g0.p(str, "<this>");
            Matcher matcher = j.f77450h.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
            }
            String group = matcher.group(1);
            g0.o(group, "typeSubtype.group(1)");
            Locale US = Locale.US;
            g0.o(US, "US");
            String lowerCase = group.toLowerCase(US);
            g0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String group2 = matcher.group(2);
            g0.o(group2, "typeSubtype.group(2)");
            g0.o(US, "US");
            String lowerCase2 = group2.toLowerCase(US);
            g0.o(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = j.f77451i.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Parameter is not formatted correctly: \"");
                    String substring = str.substring(end);
                    g0.o(substring, "this as java.lang.String).substring(startIndex)");
                    sb2.append(substring);
                    sb2.append("\" for: \"");
                    sb2.append(str);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
                String group3 = matcher2.group(1);
                if (group3 == null) {
                    end = matcher2.end();
                } else {
                    String group4 = matcher2.group(2);
                    if (group4 == null) {
                        group4 = matcher2.group(3);
                    } else if (f0.J2(group4, "'", false, 2, null) && f0.b2(group4, "'", false, 2, null) && group4.length() > 2) {
                        group4 = group4.substring(1, group4.length() - 1);
                        g0.o(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    arrayList.add(group3);
                    arrayList.add(group4);
                    end = matcher2.end();
                }
            }
            return new j(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]), null);
        }

        @m80.l
        @w00.j(name = "parse")
        @w00.o
        public final j d(@m80.k String str) {
            g0.p(str, "<this>");
            try {
                return c(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public a() {
        }
    }

    public /* synthetic */ j(String str, String str2, String str3, String[] strArr, v vVar) {
        this(str, str2, str3, strArr);
    }

    public static /* synthetic */ Charset g(j jVar, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = null;
        }
        return jVar.f(charset);
    }

    @w00.j(name = ct.d.f46852f)
    @w00.o
    @m80.k
    public static final j h(@m80.k String str) {
        return f77447e.c(str);
    }

    @m80.l
    @w00.j(name = "parse")
    @w00.o
    public static final j j(@m80.k String str) {
        return f77447e.d(str);
    }

    @w00.j(name = "-deprecated_subtype")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "subtype", imports = {}))
    @m80.k
    public final String a() {
        return this.f77454c;
    }

    @w00.j(name = "-deprecated_type")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "type", imports = {}))
    @m80.k
    public final String b() {
        return this.f77453b;
    }

    @m80.l
    @w00.k
    public final Charset e() {
        return g(this, null, 1, null);
    }

    public boolean equals(@m80.l Object obj) {
        return (obj instanceof j) && g0.g(((j) obj).f77452a, this.f77452a);
    }

    @m80.l
    @w00.k
    public final Charset f(@m80.l Charset charset) {
        String i11 = i("charset");
        if (i11 == null) {
            return charset;
        }
        try {
            return Charset.forName(i11);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public int hashCode() {
        return this.f77452a.hashCode();
    }

    @m80.l
    public final String i(@m80.k String name) {
        g0.p(name, "name");
        int i11 = 0;
        int c11 = o00.o.c(0, this.f77455d.length - 1, 2);
        if (c11 < 0) {
            return null;
        }
        while (!f0.c2(this.f77455d[i11], name, true)) {
            if (i11 == c11) {
                return null;
            }
            i11 += 2;
        }
        return this.f77455d[i11 + 1];
    }

    @w00.j(name = "subtype")
    @m80.k
    public final String k() {
        return this.f77454c;
    }

    @w00.j(name = "type")
    @m80.k
    public final String l() {
        return this.f77453b;
    }

    @m80.k
    public String toString() {
        return this.f77452a;
    }

    public j(String str, String str2, String str3, String[] strArr) {
        this.f77452a = str;
        this.f77453b = str2;
        this.f77454c = str3;
        this.f77455d = strArr;
    }
}
