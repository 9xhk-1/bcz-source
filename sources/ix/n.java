package ix;

import bz.b;
import io.ktor.http.CookieEncoding;
import j50.d3;
import j50.p0;
import j50.x2;
import java.util.Map;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes8.dex */
public final class n {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: k, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final f50.i<Object>[] f62943k;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f62944a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f62945b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final CookieEncoding f62946c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final Integer f62947d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final bz.b f62948e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final String f62949f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public final String f62950g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f62951h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f62952i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final Map<String, String> f62953j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public /* synthetic */ class a implements j50.p0<n> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f62954a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f62954a = aVar;
            j50.l2 l2Var = new j50.l2("io.ktor.http.Cookie", aVar, 10);
            l2Var.q("name", false);
            l2Var.q("value", false);
            l2Var.q(c60.c.f8169p, true);
            l2Var.q("maxAge", true);
            l2Var.q("expires", true);
            l2Var.q("domain", true);
            l2Var.q("path", true);
            l2Var.q("secure", true);
            l2Var.q("httpOnly", true);
            l2Var.q("extensions", true);
            descriptor = l2Var;
        }

        @Override // f50.i, f50.b0, f50.e
        @m80.k
        public final h50.f a() {
            return descriptor;
        }

        @Override // j50.p0
        @m80.k
        public f50.i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            f50.i<?>[] iVarArr = n.f62943k;
            d3 d3Var = d3.f63348a;
            f50.i<?> iVar = iVarArr[2];
            f50.i<?> v11 = g50.a.v(j50.z0.f63517a);
            f50.i<?> v12 = g50.a.v(b.a.f7438a);
            f50.i<?> v13 = g50.a.v(d3Var);
            f50.i<?> v14 = g50.a.v(d3Var);
            f50.i<?> iVar2 = iVarArr[9];
            j50.i iVar3 = j50.i.f63378a;
            return new f50.i[]{d3Var, d3Var, iVar, v11, v12, v13, v14, iVar3, iVar3, iVar2};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final n e(@m80.k i50.f decoder) {
            boolean z11;
            Map map;
            String str;
            String str2;
            bz.b bVar;
            Integer num;
            CookieEncoding cookieEncoding;
            boolean z12;
            int i11;
            String str3;
            String str4;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            f50.i[] iVarArr = n.f62943k;
            int i12 = 7;
            if (beginStructure.decodeSequentially()) {
                String decodeStringElement = beginStructure.decodeStringElement(fVar, 0);
                String decodeStringElement2 = beginStructure.decodeStringElement(fVar, 1);
                CookieEncoding cookieEncoding2 = (CookieEncoding) beginStructure.decodeSerializableElement(fVar, 2, iVarArr[2], null);
                Integer num2 = (Integer) beginStructure.decodeNullableSerializableElement(fVar, 3, j50.z0.f63517a, null);
                bz.b bVar2 = (bz.b) beginStructure.decodeNullableSerializableElement(fVar, 4, b.a.f7438a, null);
                d3 d3Var = d3.f63348a;
                String str5 = (String) beginStructure.decodeNullableSerializableElement(fVar, 5, d3Var, null);
                String str6 = (String) beginStructure.decodeNullableSerializableElement(fVar, 6, d3Var, null);
                boolean decodeBooleanElement = beginStructure.decodeBooleanElement(fVar, 7);
                boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(fVar, 8);
                map = (Map) beginStructure.decodeSerializableElement(fVar, 9, iVarArr[9], null);
                str3 = decodeStringElement;
                z11 = decodeBooleanElement;
                str2 = str6;
                str = str5;
                num = num2;
                z12 = decodeBooleanElement2;
                bVar = bVar2;
                i11 = 1023;
                cookieEncoding = cookieEncoding2;
                str4 = decodeStringElement2;
            } else {
                int i13 = 2;
                boolean z13 = true;
                boolean z14 = false;
                int i14 = 0;
                Map map2 = null;
                String str7 = null;
                String str8 = null;
                bz.b bVar3 = null;
                Integer num3 = null;
                String str9 = null;
                String str10 = null;
                boolean z15 = false;
                CookieEncoding cookieEncoding3 = null;
                while (z13) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    switch (decodeElementIndex) {
                        case -1:
                            z13 = false;
                            i12 = 7;
                            i13 = 2;
                        case 0:
                            str9 = beginStructure.decodeStringElement(fVar, 0);
                            i14 |= 1;
                            i12 = 7;
                            i13 = 2;
                        case 1:
                            str10 = beginStructure.decodeStringElement(fVar, 1);
                            i14 |= 2;
                            i12 = 7;
                        case 2:
                            cookieEncoding3 = (CookieEncoding) beginStructure.decodeSerializableElement(fVar, i13, iVarArr[i13], cookieEncoding3);
                            i14 |= 4;
                            i12 = 7;
                        case 3:
                            num3 = (Integer) beginStructure.decodeNullableSerializableElement(fVar, 3, j50.z0.f63517a, num3);
                            i14 |= 8;
                            i12 = 7;
                        case 4:
                            bVar3 = (bz.b) beginStructure.decodeNullableSerializableElement(fVar, 4, b.a.f7438a, bVar3);
                            i14 |= 16;
                            i12 = 7;
                        case 5:
                            str7 = (String) beginStructure.decodeNullableSerializableElement(fVar, 5, d3.f63348a, str7);
                            i14 |= 32;
                            i12 = 7;
                        case 6:
                            str8 = (String) beginStructure.decodeNullableSerializableElement(fVar, 6, d3.f63348a, str8);
                            i14 |= 64;
                            i12 = 7;
                        case 7:
                            z14 = beginStructure.decodeBooleanElement(fVar, i12);
                            i14 |= 128;
                        case 8:
                            z15 = beginStructure.decodeBooleanElement(fVar, 8);
                            i14 |= 256;
                        case 9:
                            map2 = (Map) beginStructure.decodeSerializableElement(fVar, 9, iVarArr[9], map2);
                            i14 |= 512;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                z11 = z14;
                map = map2;
                str = str7;
                str2 = str8;
                bVar = bVar3;
                num = num3;
                cookieEncoding = cookieEncoding3;
                z12 = z15;
                i11 = i14;
                str3 = str9;
                str4 = str10;
            }
            beginStructure.endStructure(fVar);
            return new n(i11, str3, str4, cookieEncoding, num, bVar, str, str2, z11, z12, map, (x2) null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k n value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            n.x(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public b() {
        }

        @m80.k
        public final f50.i<n> serializer() {
            return a.f62954a;
        }

        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }
    }

    static {
        f50.i<Object> c11 = j50.l0.c("io.ktor.http.CookieEncoding", CookieEncoding.values());
        d3 d3Var = d3.f63348a;
        f62943k = new f50.i[]{null, null, c11, null, null, null, null, null, null, new j50.f1(d3Var, g50.a.v(d3Var))};
    }

    public /* synthetic */ n(int i11, String str, String str2, CookieEncoding cookieEncoding, Integer num, bz.b bVar, String str3, String str4, boolean z11, boolean z12, Map map, x2 x2Var) {
        if (3 != (i11 & 3)) {
            j50.h2.b(i11, 3, a.f62954a.a());
        }
        this.f62944a = str;
        this.f62945b = str2;
        if ((i11 & 4) == 0) {
            this.f62946c = CookieEncoding.URI_ENCODING;
        } else {
            this.f62946c = cookieEncoding;
        }
        if ((i11 & 8) == 0) {
            this.f62947d = null;
        } else {
            this.f62947d = num;
        }
        if ((i11 & 16) == 0) {
            this.f62948e = null;
        } else {
            this.f62948e = bVar;
        }
        if ((i11 & 32) == 0) {
            this.f62949f = null;
        } else {
            this.f62949f = str3;
        }
        if ((i11 & 64) == 0) {
            this.f62950g = null;
        } else {
            this.f62950g = str4;
        }
        if ((i11 & 128) == 0) {
            this.f62951h = false;
        } else {
            this.f62951h = z11;
        }
        if ((i11 & 256) == 0) {
            this.f62952i = false;
        } else {
            this.f62952i = z12;
        }
        if ((i11 & 512) == 0) {
            this.f62953j = a00.l1.z();
        } else {
            this.f62953j = map;
        }
    }

    public static /* synthetic */ n m(n nVar, String str, String str2, CookieEncoding cookieEncoding, Integer num, bz.b bVar, String str3, String str4, boolean z11, boolean z12, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = nVar.f62944a;
        }
        if ((i11 & 2) != 0) {
            str2 = nVar.f62945b;
        }
        if ((i11 & 4) != 0) {
            cookieEncoding = nVar.f62946c;
        }
        if ((i11 & 8) != 0) {
            num = nVar.f62947d;
        }
        if ((i11 & 16) != 0) {
            bVar = nVar.f62948e;
        }
        if ((i11 & 32) != 0) {
            str3 = nVar.f62949f;
        }
        if ((i11 & 64) != 0) {
            str4 = nVar.f62950g;
        }
        if ((i11 & 128) != 0) {
            z11 = nVar.f62951h;
        }
        if ((i11 & 256) != 0) {
            z12 = nVar.f62952i;
        }
        if ((i11 & 512) != 0) {
            map = nVar.f62953j;
        }
        boolean z13 = z12;
        Map map2 = map;
        String str5 = str4;
        boolean z14 = z11;
        bz.b bVar2 = bVar;
        String str6 = str3;
        return nVar.l(str, str2, cookieEncoding, num, bVar2, str6, str5, z14, z13, map2);
    }

    @w00.o
    public static final /* synthetic */ void x(n nVar, i50.e eVar, h50.f fVar) {
        f50.i<Object>[] iVarArr = f62943k;
        eVar.encodeStringElement(fVar, 0, nVar.f62944a);
        eVar.encodeStringElement(fVar, 1, nVar.f62945b);
        if (eVar.shouldEncodeElementDefault(fVar, 2) || nVar.f62946c != CookieEncoding.URI_ENCODING) {
            eVar.encodeSerializableElement(fVar, 2, iVarArr[2], nVar.f62946c);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 3) || nVar.f62947d != null) {
            eVar.encodeNullableSerializableElement(fVar, 3, j50.z0.f63517a, nVar.f62947d);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 4) || nVar.f62948e != null) {
            eVar.encodeNullableSerializableElement(fVar, 4, b.a.f7438a, nVar.f62948e);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 5) || nVar.f62949f != null) {
            eVar.encodeNullableSerializableElement(fVar, 5, d3.f63348a, nVar.f62949f);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 6) || nVar.f62950g != null) {
            eVar.encodeNullableSerializableElement(fVar, 6, d3.f63348a, nVar.f62950g);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 7) || nVar.f62951h) {
            eVar.encodeBooleanElement(fVar, 7, nVar.f62951h);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 8) || nVar.f62952i) {
            eVar.encodeBooleanElement(fVar, 8, nVar.f62952i);
        }
        if (!eVar.shouldEncodeElementDefault(fVar, 9) && kotlin.jvm.internal.g0.g(nVar.f62953j, a00.l1.z())) {
            return;
        }
        eVar.encodeSerializableElement(fVar, 9, iVarArr[9], nVar.f62953j);
    }

    @m80.k
    public final String b() {
        return this.f62944a;
    }

    @m80.k
    public final Map<String, String> c() {
        return this.f62953j;
    }

    @m80.k
    public final String d() {
        return this.f62945b;
    }

    @m80.k
    public final CookieEncoding e() {
        return this.f62946c;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.g0.g(this.f62944a, nVar.f62944a) && kotlin.jvm.internal.g0.g(this.f62945b, nVar.f62945b) && this.f62946c == nVar.f62946c && kotlin.jvm.internal.g0.g(this.f62947d, nVar.f62947d) && kotlin.jvm.internal.g0.g(this.f62948e, nVar.f62948e) && kotlin.jvm.internal.g0.g(this.f62949f, nVar.f62949f) && kotlin.jvm.internal.g0.g(this.f62950g, nVar.f62950g) && this.f62951h == nVar.f62951h && this.f62952i == nVar.f62952i && kotlin.jvm.internal.g0.g(this.f62953j, nVar.f62953j);
    }

    @m80.l
    public final Integer f() {
        return this.f62947d;
    }

    @m80.l
    public final bz.b g() {
        return this.f62948e;
    }

    @m80.l
    public final String h() {
        return this.f62949f;
    }

    public int hashCode() {
        int hashCode = ((((this.f62944a.hashCode() * 31) + this.f62945b.hashCode()) * 31) + this.f62946c.hashCode()) * 31;
        Integer num = this.f62947d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        bz.b bVar = this.f62948e;
        int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.f62949f;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f62950g;
        return ((((((hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.f62951h)) * 31) + Boolean.hashCode(this.f62952i)) * 31) + this.f62953j.hashCode();
    }

    @m80.l
    public final String i() {
        return this.f62950g;
    }

    public final boolean j() {
        return this.f62951h;
    }

    public final boolean k() {
        return this.f62952i;
    }

    @m80.k
    public final n l(@m80.k String name, @m80.k String value, @m80.k CookieEncoding encoding, @m80.l Integer num, @m80.l bz.b bVar, @m80.l String str, @m80.l String str2, boolean z11, boolean z12, @m80.k Map<String, String> extensions) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(value, "value");
        kotlin.jvm.internal.g0.p(encoding, "encoding");
        kotlin.jvm.internal.g0.p(extensions, "extensions");
        return new n(name, value, encoding, num, bVar, str, str2, z11, z12, extensions);
    }

    @m80.l
    public final String n() {
        return this.f62949f;
    }

    @m80.k
    public final CookieEncoding o() {
        return this.f62946c;
    }

    @m80.l
    public final bz.b p() {
        return this.f62948e;
    }

    @m80.k
    public final Map<String, String> q() {
        return this.f62953j;
    }

    public final boolean r() {
        return this.f62952i;
    }

    @m80.l
    @w00.j(name = "getMaxAgeInt")
    public final Integer s() {
        return this.f62947d;
    }

    @m80.k
    public final String t() {
        return this.f62944a;
    }

    @m80.k
    public String toString() {
        return "Cookie(name=" + this.f62944a + ", value=" + this.f62945b + ", encoding=" + this.f62946c + ", maxAge=" + this.f62947d + ", expires=" + this.f62948e + ", domain=" + this.f62949f + ", path=" + this.f62950g + ", secure=" + this.f62951h + ", httpOnly=" + this.f62952i + ", extensions=" + this.f62953j + ')';
    }

    @m80.l
    public final String u() {
        return this.f62950g;
    }

    public final boolean v() {
        return this.f62951h;
    }

    @m80.k
    public final String w() {
        return this.f62945b;
    }

    public n(@m80.k String name, @m80.k String value, @m80.k CookieEncoding encoding, @m80.l Integer num, @m80.l bz.b bVar, @m80.l String str, @m80.l String str2, boolean z11, boolean z12, @m80.k Map<String, String> extensions) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(value, "value");
        kotlin.jvm.internal.g0.p(encoding, "encoding");
        kotlin.jvm.internal.g0.p(extensions, "extensions");
        this.f62944a = name;
        this.f62945b = value;
        this.f62946c = encoding;
        this.f62947d = num;
        this.f62948e = bVar;
        this.f62949f = str;
        this.f62950g = str2;
        this.f62951h = z11;
        this.f62952i = z12;
        this.f62953j = extensions;
    }

    public /* synthetic */ n(String str, String str2, CookieEncoding cookieEncoding, Integer num, bz.b bVar, String str3, String str4, boolean z11, boolean z12, Map map, int i11, kotlin.jvm.internal.v vVar) {
        this(str, str2, (i11 & 4) != 0 ? CookieEncoding.URI_ENCODING : cookieEncoding, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : bVar, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : str4, (i11 & 128) != 0 ? false : z11, (i11 & 256) != 0 ? false : z12, (i11 & 512) != 0 ? a00.l1.z() : map);
    }
}
