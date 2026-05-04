package okhttp3;

import a00.h0;
import a00.i0;
import a00.w1;
import androidx.autofill.HintConstants;
import com.huawei.hms.actions.SearchIntents;
import com.jiongji.andriod.card.R;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import da0.v1;
import g10.u;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.text.Regex;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import u30.f0;
import u30.k0;
import u30.r0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i {

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final b f77284k = new b(null);

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public static final char[] f77285l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public static final String f77286m = " \"':;<=>@[]^`{}|/\\?#";

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public static final String f77287n = " \"':;<=>@[]^`{}|/\\?#";

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public static final String f77288o = " \"<>^`{}|/\\?#";

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public static final String f77289p = "[]";

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public static final String f77290q = " \"'<>#";

    /* renamed from: r, reason: collision with root package name */
    @m80.k
    public static final String f77291r = " \"'<>#&=";

    /* renamed from: s, reason: collision with root package name */
    @m80.k
    public static final String f77292s = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";

    /* renamed from: t, reason: collision with root package name */
    @m80.k
    public static final String f77293t = "\\^`{|}";

    /* renamed from: u, reason: collision with root package name */
    @m80.k
    public static final String f77294u = " \"':;<=>@[]^`{}|/\\?#&!$(),~";

    /* renamed from: v, reason: collision with root package name */
    @m80.k
    public static final String f77295v = "";

    /* renamed from: w, reason: collision with root package name */
    @m80.k
    public static final String f77296w = " \"#<>\\^`{|}";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f77297a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f77298b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f77299c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f77300d;

    /* renamed from: e, reason: collision with root package name */
    public final int f77301e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final List<String> f77302f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public final List<String> f77303g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    public final String f77304h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final String f77305i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f77306j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nHttpUrl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpUrl.kt\nokhttp3/HttpUrl$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1869:1\n1#2:1870\n1549#3:1871\n1620#3,3:1872\n1549#3:1875\n1620#3,3:1876\n*S KotlinDebug\n*F\n+ 1 HttpUrl.kt\nokhttp3/HttpUrl$Builder\n*L\n1180#1:1871\n1180#1:1872,3\n1181#1:1875\n1181#1:1876,3\n*E\n"})
    public static final class a {

        /* renamed from: i, reason: collision with root package name */
        @m80.k
        public static final C0948a f77307i = new C0948a(null);

        /* renamed from: j, reason: collision with root package name */
        @m80.k
        public static final String f77308j = "Invalid URL host";

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f77309a;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f77312d;

        /* renamed from: f, reason: collision with root package name */
        @m80.k
        public final List<String> f77314f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public List<String> f77315g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public String f77316h;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public String f77310b = "";

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public String f77311c = "";

        /* renamed from: e, reason: collision with root package name */
        public int f77313e = -1;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: okhttp3.i$a$a, reason: collision with other inner class name */
        public static final class C0948a {
            public /* synthetic */ C0948a(v vVar) {
                this();
            }

            public final int e(String str, int i11, int i12) {
                int parseInt;
                try {
                    parseInt = Integer.parseInt(b.f(i.f77284k, str, i11, i12, "", false, false, false, false, null, R.styleable.Theme_drawable_walk_sound4, null));
                } catch (NumberFormatException unused) {
                }
                if (1 > parseInt || parseInt >= 65536) {
                    return -1;
                }
                return parseInt;
            }

            public final int f(String str, int i11, int i12) {
                while (i11 < i12) {
                    char charAt = str.charAt(i11);
                    if (charAt == '[') {
                        do {
                            i11++;
                            if (i11 < i12) {
                            }
                        } while (str.charAt(i11) != ']');
                    } else if (charAt == ':') {
                        return i11;
                    }
                    i11++;
                }
                return i12;
            }

            public final int g(String str, int i11, int i12) {
                if (i12 - i11 < 2) {
                    return -1;
                }
                char charAt = str.charAt(i11);
                if ((g0.t(charAt, 97) >= 0 && g0.t(charAt, 122) <= 0) || (g0.t(charAt, 65) >= 0 && g0.t(charAt, 90) <= 0)) {
                    while (true) {
                        i11++;
                        if (i11 >= i12) {
                            break;
                        }
                        char charAt2 = str.charAt(i11);
                        if ('a' > charAt2 || charAt2 >= '{') {
                            if ('A' > charAt2 || charAt2 >= '[') {
                                if ('0' > charAt2 || charAt2 >= ':') {
                                    if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                        if (charAt2 == ':') {
                                            return i11;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return -1;
            }

            public final int h(String str, int i11, int i12) {
                int i13 = 0;
                while (i11 < i12) {
                    char charAt = str.charAt(i11);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i13++;
                    i11++;
                }
                return i13;
            }

            public C0948a() {
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f77314f = arrayList;
            arrayList.add("");
        }

        @m80.k
        public final a A(@m80.l i iVar, @m80.k String str) {
            String str2;
            int t11;
            int i11;
            String str3;
            int i12;
            String str4;
            boolean z11;
            char c11;
            int i13;
            int i14;
            char c12;
            int i15;
            String input = str;
            g0.p(input, "input");
            int G = u50.f.G(input, 0, 0, 3, null);
            int I = u50.f.I(input, G, 0, 2, null);
            C0948a c0948a = f77307i;
            int g11 = c0948a.g(input, G, I);
            String str5 = "this as java.lang.String…ing(startIndex, endIndex)";
            boolean z12 = true;
            char c13 = 65535;
            if (g11 != -1) {
                if (f0.G2(input, "https:", G, true)) {
                    this.f77309a = "https";
                    G += 6;
                } else {
                    if (!f0.G2(input, "http:", G, true)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected URL scheme 'http' or 'https' but was '");
                        String substring = input.substring(0, g11);
                        g0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb2.append(substring);
                        sb2.append('\'');
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    this.f77309a = "http";
                    G += 5;
                }
            } else {
                if (iVar == null) {
                    if (input.length() > 6) {
                        str2 = r0.A9(input, 6) + "...";
                    } else {
                        str2 = input;
                    }
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + str2);
                }
                this.f77309a = iVar.X();
            }
            int h11 = c0948a.h(input, G, I);
            char c14 = s60.d.f88057a;
            char c15 = '#';
            if (h11 >= 2 || iVar == null || !g0.g(iVar.X(), this.f77309a)) {
                int i16 = G + h11;
                boolean z13 = false;
                boolean z14 = false;
                while (true) {
                    t11 = u50.f.t(input, "@/\\?#", i16, I);
                    char charAt = t11 != I ? input.charAt(t11) : c13;
                    if (charAt == c13 || charAt == c15 || charAt == '/' || charAt == '\\' || charAt == c14) {
                        break;
                    }
                    if (charAt == '@') {
                        if (z13) {
                            i12 = I;
                            str4 = str5;
                            z11 = z12;
                            c11 = c13;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.f77311c);
                            sb3.append("%40");
                            input = str;
                            i13 = t11;
                            sb3.append(b.f(i.f77284k, input, i16, t11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.f77311c = sb3.toString();
                        } else {
                            int s11 = u50.f.s(input, ':', i16, t11);
                            b bVar = i.f77284k;
                            str4 = str5;
                            c11 = c13;
                            i12 = I;
                            z11 = z12;
                            String f11 = b.f(bVar, input, i16, s11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z14) {
                                f11 = this.f77310b + "%40" + f11;
                            }
                            this.f77310b = f11;
                            if (s11 != t11) {
                                i14 = t11;
                                this.f77311c = b.f(bVar, str, s11 + 1, i14, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z13 = z11;
                            } else {
                                i14 = t11;
                            }
                            input = str;
                            i13 = i14;
                            z14 = z11;
                        }
                        i16 = i13 + 1;
                        c13 = c11;
                        I = i12;
                        str5 = str4;
                        z12 = z11;
                        c14 = s60.d.f88057a;
                        c15 = '#';
                    }
                }
                i11 = I;
                String str6 = str5;
                char c16 = c13;
                C0948a c0948a2 = f77307i;
                int f12 = c0948a2.f(input, i16, t11);
                int i17 = f12 + 1;
                if (i17 < t11) {
                    this.f77312d = u50.a.e(b.n(i.f77284k, input, i16, f12, false, 4, null));
                    int e11 = c0948a2.e(input, i17, t11);
                    this.f77313e = e11;
                    if (e11 == c16) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String substring2 = input.substring(i17, t11);
                        g0.o(substring2, str6);
                        sb4.append(substring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                    str3 = str6;
                } else {
                    str3 = str6;
                    b bVar2 = i.f77284k;
                    this.f77312d = u50.a.e(b.n(bVar2, input, i16, f12, false, 4, null));
                    String str7 = this.f77309a;
                    g0.m(str7);
                    this.f77313e = bVar2.g(str7);
                }
                if (this.f77312d == null) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String substring3 = input.substring(i16, f12);
                    g0.o(substring3, str3);
                    sb5.append(substring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                G = t11;
            } else {
                this.f77310b = iVar.A();
                this.f77311c = iVar.w();
                this.f77312d = iVar.F();
                this.f77313e = iVar.N();
                this.f77314f.clear();
                this.f77314f.addAll(iVar.y());
                if (G == I || input.charAt(G) == '#') {
                    m(iVar.z());
                }
                i11 = I;
            }
            int i18 = i11;
            int t12 = u50.f.t(input, "?#", G, i18);
            L(input, G, t12);
            if (t12 >= i18 || input.charAt(t12) != '?') {
                c12 = '#';
                i15 = t12;
            } else {
                c12 = '#';
                int s12 = u50.f.s(input, '#', t12, i18);
                b bVar3 = i.f77284k;
                this.f77315g = bVar3.p(b.f(bVar3, input, t12 + 1, s12, i.f77290q, true, false, true, false, null, 208, null));
                i15 = s12;
            }
            if (i15 < i18 && input.charAt(i15) == c12) {
                this.f77316h = b.f(i.f77284k, input, i15 + 1, i18, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        @m80.k
        public final a B(@m80.k String password) {
            g0.p(password, "password");
            this.f77311c = b.f(i.f77284k, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, R.styleable.Theme_drawable_wiki_sound, null);
            return this;
        }

        public final void C() {
            if (this.f77314f.remove(r0.size() - 1).length() != 0 || this.f77314f.isEmpty()) {
                this.f77314f.add("");
            } else {
                this.f77314f.set(r0.size() - 1, "");
            }
        }

        @m80.k
        public final a D(int i11) {
            if (1 <= i11 && i11 < 65536) {
                this.f77313e = i11;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i11).toString());
        }

        public final void E(String str, int i11, int i12, boolean z11, boolean z12) {
            String f11 = b.f(i.f77284k, str, i11, i12, i.f77288o, z12, false, false, false, null, 240, null);
            if (y(f11)) {
                return;
            }
            if (z(f11)) {
                C();
                return;
            }
            if (this.f77314f.get(r14.size() - 1).length() == 0) {
                this.f77314f.set(r14.size() - 1, f11);
            } else {
                this.f77314f.add(f11);
            }
            if (z11) {
                this.f77314f.add("");
            }
        }

        @m80.k
        public final a F(@m80.l String str) {
            b bVar;
            String f11;
            this.f77315g = (str == null || (f11 = b.f((bVar = i.f77284k), str, 0, 0, i.f77290q, false, false, true, false, null, R.styleable.Theme_drawable_searchwords, null)) == null) ? null : bVar.p(f11);
            return this;
        }

        @m80.k
        public final a G() {
            String str = this.f77312d;
            this.f77312d = str != null ? new Regex("[\"<>^`{|}]").replace(str, "") : null;
            int size = this.f77314f.size();
            for (int i11 = 0; i11 < size; i11++) {
                List<String> list = this.f77314f;
                list.set(i11, b.f(i.f77284k, list.get(i11), 0, 0, i.f77289p, true, true, false, false, null, R.styleable.Theme_drawable_syncview, null));
            }
            List<String> list2 = this.f77315g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    String str2 = list2.get(i12);
                    list2.set(i12, str2 != null ? b.f(i.f77284k, str2, 0, 0, i.f77293t, true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.f77316h;
            this.f77316h = str3 != null ? b.f(i.f77284k, str3, 0, 0, i.f77296w, true, true, false, true, null, 163, null) : null;
            return this;
        }

        public final void H(String str) {
            List<String> list = this.f77315g;
            g0.m(list);
            int size = list.size() - 2;
            int c11 = o00.o.c(size, 0, -2);
            if (c11 > size) {
                return;
            }
            while (true) {
                List<String> list2 = this.f77315g;
                g0.m(list2);
                if (g0.g(str, list2.get(size))) {
                    List<String> list3 = this.f77315g;
                    g0.m(list3);
                    list3.remove(size + 1);
                    List<String> list4 = this.f77315g;
                    g0.m(list4);
                    list4.remove(size);
                    List<String> list5 = this.f77315g;
                    g0.m(list5);
                    if (list5.isEmpty()) {
                        this.f77315g = null;
                        return;
                    }
                }
                if (size == c11) {
                    return;
                } else {
                    size -= 2;
                }
            }
        }

        @m80.k
        public final a I(@m80.k String encodedName) {
            g0.p(encodedName, "encodedName");
            if (this.f77315g == null) {
                return this;
            }
            H(b.f(i.f77284k, encodedName, 0, 0, i.f77291r, true, false, true, false, null, 211, null));
            return this;
        }

        @m80.k
        public final a J(@m80.k String name) {
            g0.p(name, "name");
            if (this.f77315g == null) {
                return this;
            }
            H(b.f(i.f77284k, name, 0, 0, i.f77292s, false, false, true, false, null, R.styleable.Theme_drawable_searchwords, null));
            return this;
        }

        @m80.k
        public final a K(int i11) {
            this.f77314f.remove(i11);
            if (this.f77314f.isEmpty()) {
                this.f77314f.add("");
            }
            return this;
        }

        public final void L(String str, int i11, int i12) {
            if (i11 == i12) {
                return;
            }
            char charAt = str.charAt(i11);
            if (charAt == '/' || charAt == '\\') {
                this.f77314f.clear();
                this.f77314f.add("");
                i11++;
            } else {
                List<String> list = this.f77314f;
                list.set(list.size() - 1, "");
            }
            int i13 = i11;
            while (i13 < i12) {
                int t11 = u50.f.t(str, "/\\", i13, i12);
                boolean z11 = t11 < i12;
                String str2 = str;
                E(str2, i13, t11, z11, true);
                if (z11) {
                    i13 = t11 + 1;
                    str = str2;
                } else {
                    str = str2;
                    i13 = t11;
                }
            }
        }

        @m80.k
        public final a M(@m80.k String scheme) {
            g0.p(scheme, "scheme");
            if (f0.c2(scheme, "http", true)) {
                this.f77309a = "http";
                return this;
            }
            if (f0.c2(scheme, "https", true)) {
                this.f77309a = "https";
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: " + scheme);
        }

        public final void N(@m80.l String str) {
            this.f77316h = str;
        }

        public final void O(@m80.k String str) {
            g0.p(str, "<set-?>");
            this.f77311c = str;
        }

        @m80.k
        public final a P(int i11, @m80.k String encodedPathSegment) {
            g0.p(encodedPathSegment, "encodedPathSegment");
            String f11 = b.f(i.f77284k, encodedPathSegment, 0, 0, i.f77288o, true, false, false, false, null, 243, null);
            this.f77314f.set(i11, f11);
            if (!y(f11) && !z(f11)) {
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + encodedPathSegment).toString());
        }

        public final void Q(@m80.l List<String> list) {
            this.f77315g = list;
        }

        @m80.k
        public final a R(@m80.k String encodedName, @m80.l String str) {
            g0.p(encodedName, "encodedName");
            I(encodedName);
            c(encodedName, str);
            return this;
        }

        public final void S(@m80.k String str) {
            g0.p(str, "<set-?>");
            this.f77310b = str;
        }

        public final void T(@m80.l String str) {
            this.f77312d = str;
        }

        @m80.k
        public final a U(int i11, @m80.k String pathSegment) {
            g0.p(pathSegment, "pathSegment");
            String f11 = b.f(i.f77284k, pathSegment, 0, 0, i.f77288o, false, false, false, false, null, R.styleable.Theme_drawable_wiki_sound, null);
            if (!y(f11) && !z(f11)) {
                this.f77314f.set(i11, f11);
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + pathSegment).toString());
        }

        public final void V(int i11) {
            this.f77313e = i11;
        }

        @m80.k
        public final a W(@m80.k String name, @m80.l String str) {
            g0.p(name, "name");
            J(name);
            g(name, str);
            return this;
        }

        public final void X(@m80.l String str) {
            this.f77309a = str;
        }

        @m80.k
        public final a Y(@m80.k String username) {
            g0.p(username, "username");
            this.f77310b = b.f(i.f77284k, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, R.styleable.Theme_drawable_wiki_sound, null);
            return this;
        }

        @m80.k
        public final a a(@m80.k String encodedPathSegment) {
            g0.p(encodedPathSegment, "encodedPathSegment");
            E(encodedPathSegment, 0, encodedPathSegment.length(), false, true);
            return this;
        }

        @m80.k
        public final a b(@m80.k String encodedPathSegments) {
            g0.p(encodedPathSegments, "encodedPathSegments");
            return f(encodedPathSegments, true);
        }

        @m80.k
        public final a c(@m80.k String encodedName, @m80.l String str) {
            g0.p(encodedName, "encodedName");
            if (this.f77315g == null) {
                this.f77315g = new ArrayList();
            }
            List<String> list = this.f77315g;
            g0.m(list);
            b bVar = i.f77284k;
            list.add(b.f(bVar, encodedName, 0, 0, i.f77291r, true, false, true, false, null, 211, null));
            List<String> list2 = this.f77315g;
            g0.m(list2);
            list2.add(str != null ? b.f(bVar, str, 0, 0, i.f77291r, true, false, true, false, null, 211, null) : null);
            return this;
        }

        @m80.k
        public final a d(@m80.k String pathSegment) {
            g0.p(pathSegment, "pathSegment");
            E(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        @m80.k
        public final a e(@m80.k String pathSegments) {
            g0.p(pathSegments, "pathSegments");
            return f(pathSegments, false);
        }

        public final a f(String str, boolean z11) {
            boolean z12;
            a aVar;
            String str2;
            boolean z13;
            int i11 = 0;
            while (true) {
                int t11 = u50.f.t(str, "/\\", i11, str.length());
                if (t11 < str.length()) {
                    z12 = true;
                    str2 = str;
                    z13 = z11;
                    aVar = this;
                } else {
                    z12 = false;
                    aVar = this;
                    str2 = str;
                    z13 = z11;
                }
                aVar.E(str2, i11, t11, z12, z13);
                i11 = t11 + 1;
                if (i11 > str2.length()) {
                    return aVar;
                }
                str = str2;
                z11 = z13;
            }
        }

        @m80.k
        public final a g(@m80.k String name, @m80.l String str) {
            g0.p(name, "name");
            if (this.f77315g == null) {
                this.f77315g = new ArrayList();
            }
            List<String> list = this.f77315g;
            g0.m(list);
            b bVar = i.f77284k;
            list.add(b.f(bVar, name, 0, 0, i.f77292s, false, false, true, false, null, R.styleable.Theme_drawable_searchwords, null));
            List<String> list2 = this.f77315g;
            g0.m(list2);
            list2.add(str != null ? b.f(bVar, str, 0, 0, i.f77292s, false, false, true, false, null, R.styleable.Theme_drawable_searchwords, null) : null);
            return this;
        }

        @m80.k
        public final i h() {
            ArrayList arrayList;
            String str = this.f77309a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            b bVar = i.f77284k;
            String n11 = b.n(bVar, this.f77310b, 0, 0, false, 7, null);
            String n12 = b.n(bVar, this.f77311c, 0, 0, false, 7, null);
            String str2 = this.f77312d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int i11 = i();
            List<String> list = this.f77314f;
            ArrayList arrayList2 = new ArrayList(i0.d0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(b.n(i.f77284k, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.f77315g;
            if (list2 != null) {
                List<String> list3 = list2;
                ArrayList arrayList3 = new ArrayList(i0.d0(list3, 10));
                for (String str3 : list3) {
                    arrayList3.add(str3 != null ? b.n(i.f77284k, str3, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            String str4 = this.f77316h;
            return new i(str, n11, n12, str2, i11, arrayList2, arrayList, str4 != null ? b.n(i.f77284k, str4, 0, 0, false, 7, null) : null, toString());
        }

        public final int i() {
            int i11 = this.f77313e;
            if (i11 != -1) {
                return i11;
            }
            b bVar = i.f77284k;
            String str = this.f77309a;
            g0.m(str);
            return bVar.g(str);
        }

        @m80.k
        public final a j(@m80.l String str) {
            this.f77316h = str != null ? b.f(i.f77284k, str, 0, 0, "", true, false, false, true, null, 179, null) : null;
            return this;
        }

        @m80.k
        public final a k(@m80.k String encodedPassword) {
            g0.p(encodedPassword, "encodedPassword");
            this.f77311c = b.f(i.f77284k, encodedPassword, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        @m80.k
        public final a l(@m80.k String encodedPath) {
            g0.p(encodedPath, "encodedPath");
            if (f0.J2(encodedPath, "/", false, 2, null)) {
                L(encodedPath, 0, encodedPath.length());
                return this;
            }
            throw new IllegalArgumentException(("unexpected encodedPath: " + encodedPath).toString());
        }

        @m80.k
        public final a m(@m80.l String str) {
            b bVar;
            String f11;
            this.f77315g = (str == null || (f11 = b.f((bVar = i.f77284k), str, 0, 0, i.f77290q, true, false, true, false, null, 211, null)) == null) ? null : bVar.p(f11);
            return this;
        }

        @m80.k
        public final a n(@m80.k String encodedUsername) {
            g0.p(encodedUsername, "encodedUsername");
            this.f77310b = b.f(i.f77284k, encodedUsername, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        @m80.k
        public final a o(@m80.l String str) {
            this.f77316h = str != null ? b.f(i.f77284k, str, 0, 0, "", false, false, false, true, null, 187, null) : null;
            return this;
        }

        @m80.l
        public final String p() {
            return this.f77316h;
        }

        @m80.k
        public final String q() {
            return this.f77311c;
        }

        @m80.k
        public final List<String> r() {
            return this.f77314f;
        }

        @m80.l
        public final List<String> s() {
            return this.f77315g;
        }

        @m80.k
        public final String t() {
            return this.f77310b;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
        
            if (r1 != r4.g(r3)) goto L29;
         */
        @m80.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.f77309a
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r6.f77310b
                int r1 = r1.length()
                r2 = 58
                if (r1 <= 0) goto L22
                goto L2a
            L22:
                java.lang.String r1 = r6.f77311c
                int r1 = r1.length()
                if (r1 <= 0) goto L44
            L2a:
                java.lang.String r1 = r6.f77310b
                r0.append(r1)
                java.lang.String r1 = r6.f77311c
                int r1 = r1.length()
                if (r1 <= 0) goto L3f
                r0.append(r2)
                java.lang.String r1 = r6.f77311c
                r0.append(r1)
            L3f:
                r1 = 64
                r0.append(r1)
            L44:
                java.lang.String r1 = r6.f77312d
                if (r1 == 0) goto L69
                kotlin.jvm.internal.g0.m(r1)
                r3 = 2
                r4 = 0
                r5 = 0
                boolean r1 = u30.k0.m3(r1, r2, r5, r3, r4)
                if (r1 == 0) goto L64
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.f77312d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L69
            L64:
                java.lang.String r1 = r6.f77312d
                r0.append(r1)
            L69:
                int r1 = r6.f77313e
                r3 = -1
                if (r1 != r3) goto L72
                java.lang.String r1 = r6.f77309a
                if (r1 == 0) goto L8b
            L72:
                int r1 = r6.i()
                java.lang.String r3 = r6.f77309a
                if (r3 == 0) goto L85
                okhttp3.i$b r4 = okhttp3.i.f77284k
                kotlin.jvm.internal.g0.m(r3)
                int r3 = r4.g(r3)
                if (r1 == r3) goto L8b
            L85:
                r0.append(r2)
                r0.append(r1)
            L8b:
                okhttp3.i$b r1 = okhttp3.i.f77284k
                java.util.List<java.lang.String> r2 = r6.f77314f
                r1.o(r2, r0)
                java.util.List<java.lang.String> r2 = r6.f77315g
                if (r2 == 0) goto La3
                r2 = 63
                r0.append(r2)
                java.util.List<java.lang.String> r2 = r6.f77315g
                kotlin.jvm.internal.g0.m(r2)
                r1.q(r2, r0)
            La3:
                java.lang.String r1 = r6.f77316h
                if (r1 == 0) goto Lb1
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.f77316h
                r0.append(r1)
            Lb1:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.g0.o(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.i.a.toString():java.lang.String");
        }

        @m80.l
        public final String u() {
            return this.f77312d;
        }

        public final int v() {
            return this.f77313e;
        }

        @m80.l
        public final String w() {
            return this.f77309a;
        }

        @m80.k
        public final a x(@m80.k String host) {
            g0.p(host, "host");
            String e11 = u50.a.e(b.n(i.f77284k, host, 0, 0, false, 7, null));
            if (e11 != null) {
                this.f77312d = e11;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        public final boolean y(String str) {
            return g0.g(str, ".") || f0.c2(str, "%2e", true);
        }

        public final boolean z(String str) {
            return g0.g(str, zr.m.f102856e) || f0.c2(str, "%2e.", true) || f0.c2(str, ".%2e", true) || f0.c2(str, "%2e%2e", true);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public static /* synthetic */ String f(b bVar, String str, int i11, int i12, String str2, boolean z11, boolean z12, boolean z13, boolean z14, Charset charset, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = 0;
            }
            if ((i13 & 2) != 0) {
                i12 = str.length();
            }
            if ((i13 & 8) != 0) {
                z11 = false;
            }
            if ((i13 & 16) != 0) {
                z12 = false;
            }
            if ((i13 & 32) != 0) {
                z13 = false;
            }
            if ((i13 & 64) != 0) {
                z14 = false;
            }
            if ((i13 & 128) != 0) {
                charset = null;
            }
            return bVar.e(str, i11, i12, str2, z11, z12, z13, z14, charset);
        }

        public static /* synthetic */ String n(b bVar, String str, int i11, int i12, boolean z11, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = 0;
            }
            if ((i13 & 2) != 0) {
                i12 = str.length();
            }
            if ((i13 & 4) != 0) {
                z11 = false;
            }
            return bVar.m(str, i11, i12, z11);
        }

        @w00.j(name = "-deprecated_get")
        @yz.n(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @w0(expression = "url.toHttpUrl()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrl"}))
        @m80.k
        public final i a(@m80.k String url) {
            g0.p(url, "url");
            return h(url);
        }

        @m80.l
        @w00.j(name = "-deprecated_get")
        @yz.n(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @w0(expression = "uri.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        public final i b(@m80.k URI uri) {
            g0.p(uri, "uri");
            return i(uri);
        }

        @m80.l
        @w00.j(name = "-deprecated_get")
        @yz.n(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @w0(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        public final i c(@m80.k URL url) {
            g0.p(url, "url");
            return j(url);
        }

        @m80.l
        @w00.j(name = "-deprecated_parse")
        @yz.n(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @w0(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        public final i d(@m80.k String url) {
            g0.p(url, "url");
            return l(url);
        }

        @m80.k
        public final String e(@m80.k String str, int i11, int i12, @m80.k String encodeSet, boolean z11, boolean z12, boolean z13, boolean z14, @m80.l Charset charset) {
            g0.p(str, "<this>");
            g0.p(encodeSet, "encodeSet");
            int i13 = i11;
            while (i13 < i12) {
                int codePointAt = str.codePointAt(i13);
                if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z14) || k0.m3(encodeSet, (char) codePointAt, false, 2, null) || ((codePointAt == 37 && (!z11 || (z12 && !k(str, i13, i12)))) || (codePointAt == 43 && z13)))) {
                    l60.k kVar = new l60.k();
                    kVar.M0(str, i11, i13);
                    r(kVar, str, i13, i12, encodeSet, z11, z12, z13, z14, charset);
                    return kVar.R3();
                }
                i13 += Character.charCount(codePointAt);
            }
            String substring = str.substring(i11, i12);
            g0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        @w00.o
        public final int g(@m80.k String scheme) {
            g0.p(scheme, "scheme");
            if (g0.g(scheme, "http")) {
                return 80;
            }
            return g0.g(scheme, "https") ? 443 : -1;
        }

        @w00.j(name = ct.d.f46852f)
        @w00.o
        @m80.k
        public final i h(@m80.k String str) {
            g0.p(str, "<this>");
            return new a().A(null, str).h();
        }

        @m80.l
        @w00.j(name = ct.d.f46852f)
        @w00.o
        public final i i(@m80.k URI uri) {
            g0.p(uri, "<this>");
            String uri2 = uri.toString();
            g0.o(uri2, "toString()");
            return l(uri2);
        }

        @m80.l
        @w00.j(name = ct.d.f46852f)
        @w00.o
        public final i j(@m80.k URL url) {
            g0.p(url, "<this>");
            String url2 = url.toString();
            g0.o(url2, "toString()");
            return l(url2);
        }

        public final boolean k(String str, int i11, int i12) {
            int i13 = i11 + 2;
            return i13 < i12 && str.charAt(i11) == '%' && u50.f.R(str.charAt(i11 + 1)) != -1 && u50.f.R(str.charAt(i13)) != -1;
        }

        @m80.l
        @w00.j(name = "parse")
        @w00.o
        public final i l(@m80.k String str) {
            g0.p(str, "<this>");
            try {
                return h(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @m80.k
        public final String m(@m80.k String str, int i11, int i12, boolean z11) {
            g0.p(str, "<this>");
            for (int i13 = i11; i13 < i12; i13++) {
                char charAt = str.charAt(i13);
                if (charAt == '%' || (charAt == '+' && z11)) {
                    l60.k kVar = new l60.k();
                    kVar.M0(str, i11, i13);
                    s(kVar, str, i13, i12, z11);
                    return kVar.R3();
                }
            }
            String substring = str.substring(i11, i12);
            g0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public final void o(@m80.k List<String> list, @m80.k StringBuilder out) {
            g0.p(list, "<this>");
            g0.p(out, "out");
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                out.append('/');
                out.append(list.get(i11));
            }
        }

        @m80.k
        public final List<String> p(@m80.k String str) {
            g0.p(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            while (i11 <= str.length()) {
                String str2 = str;
                int I3 = k0.I3(str2, u30.u0.f91708d, i11, false, 4, null);
                if (I3 == -1) {
                    I3 = str2.length();
                }
                int I32 = k0.I3(str2, '=', i11, false, 4, null);
                if (I32 == -1 || I32 > I3) {
                    String substring = str2.substring(i11, I3);
                    g0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    arrayList.add(null);
                } else {
                    String substring2 = str2.substring(i11, I32);
                    g0.o(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    String substring3 = str2.substring(I32 + 1, I3);
                    g0.o(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                }
                i11 = I3 + 1;
                str = str2;
            }
            return arrayList;
        }

        public final void q(@m80.k List<String> list, @m80.k StringBuilder out) {
            g0.p(list, "<this>");
            g0.p(out, "out");
            g10.j B1 = u.B1(u.W1(0, list.size()), 2);
            int d11 = B1.d();
            int f11 = B1.f();
            int g11 = B1.g();
            if ((g11 <= 0 || d11 > f11) && (g11 >= 0 || f11 > d11)) {
                return;
            }
            while (true) {
                String str = list.get(d11);
                String str2 = list.get(d11 + 1);
                if (d11 > 0) {
                    out.append(u30.u0.f91708d);
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (d11 == f11) {
                    return;
                } else {
                    d11 += g11;
                }
            }
        }

        public final void r(l60.k kVar, String str, int i11, int i12, String str2, boolean z11, boolean z12, boolean z13, boolean z14, Charset charset) {
            int i13 = i11;
            l60.k kVar2 = null;
            while (i13 < i12) {
                int codePointAt = str.codePointAt(i13);
                if (!z11 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                    if (codePointAt == 43 && z13) {
                        kVar.n5(z11 ? "+" : "%2B");
                    } else {
                        if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || z14)) {
                            if (!k0.m3(str2, (char) codePointAt, false, 2, null) && (codePointAt != 37 || (z11 && (!z12 || k(str, i13, i12))))) {
                                kVar.x4(codePointAt);
                                i13 += Character.charCount(codePointAt);
                            }
                        }
                        if (kVar2 == null) {
                            kVar2 = new l60.k();
                        }
                        if (charset == null || g0.g(charset, StandardCharsets.UTF_8)) {
                            kVar2.x4(codePointAt);
                        } else {
                            kVar2.N1(str, i13, Character.charCount(codePointAt) + i13, charset);
                        }
                        while (!kVar2.J()) {
                            byte readByte = kVar2.readByte();
                            kVar.writeByte(37);
                            kVar.writeByte(i.f77285l[((readByte & 255) >> 4) & 15]);
                            kVar.writeByte(i.f77285l[readByte & 15]);
                        }
                        i13 += Character.charCount(codePointAt);
                    }
                }
                i13 += Character.charCount(codePointAt);
            }
        }

        public final void s(l60.k kVar, String str, int i11, int i12, boolean z11) {
            int i13;
            while (i11 < i12) {
                int codePointAt = str.codePointAt(i11);
                if (codePointAt != 37 || (i13 = i11 + 2) >= i12) {
                    if (codePointAt == 43 && z11) {
                        kVar.writeByte(32);
                        i11++;
                    }
                    kVar.x4(codePointAt);
                    i11 += Character.charCount(codePointAt);
                } else {
                    int R = u50.f.R(str.charAt(i11 + 1));
                    int R2 = u50.f.R(str.charAt(i13));
                    if (R != -1 && R2 != -1) {
                        kVar.writeByte((R << 4) + R2);
                        i11 = Character.charCount(codePointAt) + i13;
                    }
                    kVar.x4(codePointAt);
                    i11 += Character.charCount(codePointAt);
                }
            }
        }

        public b() {
        }
    }

    public i(@m80.k String scheme, @m80.k String username, @m80.k String password, @m80.k String host, int i11, @m80.k List<String> pathSegments, @m80.l List<String> list, @m80.l String str, @m80.k String url) {
        g0.p(scheme, "scheme");
        g0.p(username, "username");
        g0.p(password, "password");
        g0.p(host, "host");
        g0.p(pathSegments, "pathSegments");
        g0.p(url, "url");
        this.f77297a = scheme;
        this.f77298b = username;
        this.f77299c = password;
        this.f77300d = host;
        this.f77301e = i11;
        this.f77302f = pathSegments;
        this.f77303g = list;
        this.f77304h = str;
        this.f77305i = url;
        this.f77306j = g0.g(scheme, "https");
    }

    @w00.j(name = ct.d.f46852f)
    @w00.o
    @m80.k
    public static final i C(@m80.k String str) {
        return f77284k.h(str);
    }

    @m80.l
    @w00.j(name = ct.d.f46852f)
    @w00.o
    public static final i D(@m80.k URI uri) {
        return f77284k.i(uri);
    }

    @m80.l
    @w00.j(name = ct.d.f46852f)
    @w00.o
    public static final i E(@m80.k URL url) {
        return f77284k.j(url);
    }

    @m80.l
    @w00.j(name = "parse")
    @w00.o
    public static final i J(@m80.k String str) {
        return f77284k.l(str);
    }

    @w00.o
    public static final int u(@m80.k String str) {
        return f77284k.g(str);
    }

    @w00.j(name = "encodedUsername")
    @m80.k
    public final String A() {
        if (this.f77298b.length() == 0) {
            return "";
        }
        int length = this.f77297a.length() + 3;
        String str = this.f77305i;
        String substring = this.f77305i.substring(length, u50.f.t(str, ":@", length, str.length()));
        g0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @m80.l
    @w00.j(name = "fragment")
    public final String B() {
        return this.f77304h;
    }

    @w00.j(name = "host")
    @m80.k
    public final String F() {
        return this.f77300d;
    }

    public final boolean G() {
        return this.f77306j;
    }

    @m80.k
    public final a H() {
        a aVar = new a();
        aVar.X(this.f77297a);
        aVar.S(A());
        aVar.O(w());
        aVar.T(this.f77300d);
        aVar.V(this.f77301e != f77284k.g(this.f77297a) ? this.f77301e : -1);
        aVar.r().clear();
        aVar.r().addAll(y());
        aVar.m(z());
        aVar.N(v());
        return aVar;
    }

    @m80.l
    public final a I(@m80.k String link) {
        g0.p(link, "link");
        try {
            return new a().A(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @w00.j(name = HintConstants.AUTOFILL_HINT_PASSWORD)
    @m80.k
    public final String K() {
        return this.f77299c;
    }

    @w00.j(name = "pathSegments")
    @m80.k
    public final List<String> L() {
        return this.f77302f;
    }

    @w00.j(name = "pathSize")
    public final int M() {
        return this.f77302f.size();
    }

    @w00.j(name = IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT)
    public final int N() {
        return this.f77301e;
    }

    @m80.l
    @w00.j(name = SearchIntents.EXTRA_QUERY)
    public final String O() {
        if (this.f77303g == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        f77284k.q(this.f77303g, sb2);
        return sb2.toString();
    }

    @m80.l
    public final String P(@m80.k String name) {
        g0.p(name, "name");
        List<String> list = this.f77303g;
        if (list == null) {
            return null;
        }
        g10.j B1 = u.B1(u.W1(0, list.size()), 2);
        int d11 = B1.d();
        int f11 = B1.f();
        int g11 = B1.g();
        if ((g11 > 0 && d11 <= f11) || (g11 < 0 && f11 <= d11)) {
            while (!g0.g(name, this.f77303g.get(d11))) {
                if (d11 != f11) {
                    d11 += g11;
                }
            }
            return this.f77303g.get(d11 + 1);
        }
        return null;
    }

    @m80.k
    public final String Q(int i11) {
        List<String> list = this.f77303g;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        String str = list.get(i11 * 2);
        g0.m(str);
        return str;
    }

    @w00.j(name = "queryParameterNames")
    @m80.k
    public final Set<String> R() {
        if (this.f77303g == null) {
            return w1.k();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        g10.j B1 = u.B1(u.W1(0, this.f77303g.size()), 2);
        int d11 = B1.d();
        int f11 = B1.f();
        int g11 = B1.g();
        if ((g11 > 0 && d11 <= f11) || (g11 < 0 && f11 <= d11)) {
            while (true) {
                String str = this.f77303g.get(d11);
                g0.m(str);
                linkedHashSet.add(str);
                if (d11 == f11) {
                    break;
                }
                d11 += g11;
            }
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        g0.o(unmodifiableSet, "unmodifiableSet(result)");
        return unmodifiableSet;
    }

    @m80.l
    public final String S(int i11) {
        List<String> list = this.f77303g;
        if (list != null) {
            return list.get((i11 * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    @m80.k
    public final List<String> T(@m80.k String name) {
        g0.p(name, "name");
        if (this.f77303g == null) {
            return h0.J();
        }
        ArrayList arrayList = new ArrayList();
        g10.j B1 = u.B1(u.W1(0, this.f77303g.size()), 2);
        int d11 = B1.d();
        int f11 = B1.f();
        int g11 = B1.g();
        if ((g11 > 0 && d11 <= f11) || (g11 < 0 && f11 <= d11)) {
            while (true) {
                if (g0.g(name, this.f77303g.get(d11))) {
                    arrayList.add(this.f77303g.get(d11 + 1));
                }
                if (d11 == f11) {
                    break;
                }
                d11 += g11;
            }
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        g0.o(unmodifiableList, "unmodifiableList(result)");
        return unmodifiableList;
    }

    @w00.j(name = "querySize")
    public final int U() {
        List<String> list = this.f77303g;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    @m80.k
    public final String V() {
        a I = I("/...");
        g0.m(I);
        return I.Y("").B("").h().toString();
    }

    @m80.l
    public final i W(@m80.k String link) {
        g0.p(link, "link");
        a I = I(link);
        if (I != null) {
            return I.h();
        }
        return null;
    }

    @w00.j(name = "scheme")
    @m80.k
    public final String X() {
        return this.f77297a;
    }

    @m80.l
    public final String Y() {
        if (u50.f.k(this.f77300d)) {
            return null;
        }
        return PublicSuffixDatabase.f77437e.c().c(this.f77300d);
    }

    @w00.j(name = v1.a.f47590a)
    @m80.k
    public final URI Z() {
        String aVar = H().G().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e11) {
            try {
                URI create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(aVar, ""));
                g0.o(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e11);
            }
        }
    }

    @m80.l
    @w00.j(name = "-deprecated_encodedFragment")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "encodedFragment", imports = {}))
    public final String a() {
        return v();
    }

    @w00.j(name = "url")
    @m80.k
    public final URL a0() {
        try {
            return new URL(this.f77305i);
        } catch (MalformedURLException e11) {
            throw new RuntimeException(e11);
        }
    }

    @w00.j(name = "-deprecated_encodedPassword")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "encodedPassword", imports = {}))
    @m80.k
    public final String b() {
        return w();
    }

    @w00.j(name = HintConstants.AUTOFILL_HINT_USERNAME)
    @m80.k
    public final String b0() {
        return this.f77298b;
    }

    @w00.j(name = "-deprecated_encodedPath")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "encodedPath", imports = {}))
    @m80.k
    public final String c() {
        return x();
    }

    @w00.j(name = "-deprecated_encodedPathSegments")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "encodedPathSegments", imports = {}))
    @m80.k
    public final List<String> d() {
        return y();
    }

    @m80.l
    @w00.j(name = "-deprecated_encodedQuery")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "encodedQuery", imports = {}))
    public final String e() {
        return z();
    }

    public boolean equals(@m80.l Object obj) {
        return (obj instanceof i) && g0.g(((i) obj).f77305i, this.f77305i);
    }

    @w00.j(name = "-deprecated_encodedUsername")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "encodedUsername", imports = {}))
    @m80.k
    public final String f() {
        return A();
    }

    @m80.l
    @w00.j(name = "-deprecated_fragment")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "fragment", imports = {}))
    public final String g() {
        return this.f77304h;
    }

    @w00.j(name = "-deprecated_host")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "host", imports = {}))
    @m80.k
    public final String h() {
        return this.f77300d;
    }

    public int hashCode() {
        return this.f77305i.hashCode();
    }

    @w00.j(name = "-deprecated_password")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = HintConstants.AUTOFILL_HINT_PASSWORD, imports = {}))
    @m80.k
    public final String i() {
        return this.f77299c;
    }

    @w00.j(name = "-deprecated_pathSegments")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "pathSegments", imports = {}))
    @m80.k
    public final List<String> j() {
        return this.f77302f;
    }

    @w00.j(name = "-deprecated_pathSize")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "pathSize", imports = {}))
    public final int k() {
        return M();
    }

    @w00.j(name = "-deprecated_port")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, imports = {}))
    public final int l() {
        return this.f77301e;
    }

    @m80.l
    @w00.j(name = "-deprecated_query")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = SearchIntents.EXTRA_QUERY, imports = {}))
    public final String m() {
        return O();
    }

    @w00.j(name = "-deprecated_queryParameterNames")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "queryParameterNames", imports = {}))
    @m80.k
    public final Set<String> n() {
        return R();
    }

    @w00.j(name = "-deprecated_querySize")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "querySize", imports = {}))
    public final int o() {
        return U();
    }

    @w00.j(name = "-deprecated_scheme")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "scheme", imports = {}))
    @m80.k
    public final String p() {
        return this.f77297a;
    }

    @w00.j(name = "-deprecated_uri")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to toUri()", replaceWith = @w0(expression = "toUri()", imports = {}))
    @m80.k
    public final URI q() {
        return Z();
    }

    @w00.j(name = "-deprecated_url")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to toUrl()", replaceWith = @w0(expression = "toUrl()", imports = {}))
    @m80.k
    public final URL r() {
        return a0();
    }

    @w00.j(name = "-deprecated_username")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = HintConstants.AUTOFILL_HINT_USERNAME, imports = {}))
    @m80.k
    public final String s() {
        return this.f77298b;
    }

    @m80.k
    public String toString() {
        return this.f77305i;
    }

    @m80.l
    @w00.j(name = "encodedFragment")
    public final String v() {
        if (this.f77304h == null) {
            return null;
        }
        String substring = this.f77305i.substring(k0.I3(this.f77305i, '#', 0, false, 6, null) + 1);
        g0.o(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    @w00.j(name = "encodedPassword")
    @m80.k
    public final String w() {
        if (this.f77299c.length() == 0) {
            return "";
        }
        String substring = this.f77305i.substring(k0.I3(this.f77305i, ':', this.f77297a.length() + 3, false, 4, null) + 1, k0.I3(this.f77305i, '@', 0, false, 6, null));
        g0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @w00.j(name = "encodedPath")
    @m80.k
    public final String x() {
        int I3 = k0.I3(this.f77305i, '/', this.f77297a.length() + 3, false, 4, null);
        String str = this.f77305i;
        String substring = this.f77305i.substring(I3, u50.f.t(str, "?#", I3, str.length()));
        g0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @w00.j(name = "encodedPathSegments")
    @m80.k
    public final List<String> y() {
        int I3 = k0.I3(this.f77305i, '/', this.f77297a.length() + 3, false, 4, null);
        String str = this.f77305i;
        int t11 = u50.f.t(str, "?#", I3, str.length());
        ArrayList arrayList = new ArrayList();
        while (I3 < t11) {
            int i11 = I3 + 1;
            int s11 = u50.f.s(this.f77305i, '/', i11, t11);
            String substring = this.f77305i.substring(i11, s11);
            g0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            I3 = s11;
        }
        return arrayList;
    }

    @m80.l
    @w00.j(name = "encodedQuery")
    public final String z() {
        if (this.f77303g == null) {
            return null;
        }
        int I3 = k0.I3(this.f77305i, s60.d.f88057a, 0, false, 6, null) + 1;
        String str = this.f77305i;
        String substring = this.f77305i.substring(I3, u50.f.s(str, '#', I3, str.length()));
        g0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
