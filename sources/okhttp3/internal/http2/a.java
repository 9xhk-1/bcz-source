package okhttp3.internal.http2;

import a00.q;
import a00.r0;
import c60.e;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kc.u;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import l60.g1;
import l60.m;
import m80.k;
import okio.ByteString;
import u50.f;
import w00.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f77317a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f77318b = 15;

    /* renamed from: c, reason: collision with root package name */
    public static final int f77319c = 31;

    /* renamed from: d, reason: collision with root package name */
    public static final int f77320d = 63;

    /* renamed from: e, reason: collision with root package name */
    public static final int f77321e = 127;

    /* renamed from: f, reason: collision with root package name */
    public static final int f77322f = 4096;

    /* renamed from: g, reason: collision with root package name */
    public static final int f77323g = 16384;

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final c60.a[] f77324h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final Map<ByteString, Integer> f77325i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: okhttp3.internal.http2.a$a, reason: collision with other inner class name */
    public static final class C0949a {

        /* renamed from: a, reason: collision with root package name */
        public final int f77326a;

        /* renamed from: b, reason: collision with root package name */
        public int f77327b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<c60.a> f77328c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final m f77329d;

        /* renamed from: e, reason: collision with root package name */
        @g
        @k
        public c60.a[] f77330e;

        /* renamed from: f, reason: collision with root package name */
        public int f77331f;

        /* renamed from: g, reason: collision with root package name */
        @g
        public int f77332g;

        /* renamed from: h, reason: collision with root package name */
        @g
        public int f77333h;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @w00.k
        public C0949a(@k g1 source, int i11) {
            this(source, i11, 0, 4, null);
            g0.p(source, "source");
        }

        public final void a() {
            int i11 = this.f77327b;
            int i12 = this.f77333h;
            if (i11 < i12) {
                if (i11 == 0) {
                    b();
                } else {
                    d(i12 - i11);
                }
            }
        }

        public final void b() {
            q.V1(this.f77330e, null, 0, 0, 6, null);
            this.f77331f = this.f77330e.length - 1;
            this.f77332g = 0;
            this.f77333h = 0;
        }

        public final int c(int i11) {
            return this.f77331f + 1 + i11;
        }

        public final int d(int i11) {
            int i12;
            int i13 = 0;
            if (i11 > 0) {
                int length = this.f77330e.length;
                while (true) {
                    length--;
                    i12 = this.f77331f;
                    if (length < i12 || i11 <= 0) {
                        break;
                    }
                    c60.a aVar = this.f77330e[length];
                    g0.m(aVar);
                    int i14 = aVar.f8137c;
                    i11 -= i14;
                    this.f77333h -= i14;
                    this.f77332g--;
                    i13++;
                }
                c60.a[] aVarArr = this.f77330e;
                System.arraycopy(aVarArr, i12 + 1, aVarArr, i12 + 1 + i13, this.f77332g);
                this.f77331f += i13;
            }
            return i13;
        }

        @k
        public final List<c60.a> e() {
            List<c60.a> a62 = r0.a6(this.f77328c);
            this.f77328c.clear();
            return a62;
        }

        public final ByteString f(int i11) throws IOException {
            if (h(i11)) {
                return a.f77317a.c()[i11].f8135a;
            }
            int c11 = c(i11 - a.f77317a.c().length);
            if (c11 >= 0) {
                c60.a[] aVarArr = this.f77330e;
                if (c11 < aVarArr.length) {
                    c60.a aVar = aVarArr[c11];
                    g0.m(aVar);
                    return aVar.f8135a;
                }
            }
            throw new IOException("Header index too large " + (i11 + 1));
        }

        public final void g(int i11, c60.a aVar) {
            this.f77328c.add(aVar);
            int i12 = aVar.f8137c;
            if (i11 != -1) {
                c60.a aVar2 = this.f77330e[c(i11)];
                g0.m(aVar2);
                i12 -= aVar2.f8137c;
            }
            int i13 = this.f77327b;
            if (i12 > i13) {
                b();
                return;
            }
            int d11 = d((this.f77333h + i12) - i13);
            if (i11 == -1) {
                int i14 = this.f77332g + 1;
                c60.a[] aVarArr = this.f77330e;
                if (i14 > aVarArr.length) {
                    c60.a[] aVarArr2 = new c60.a[aVarArr.length * 2];
                    System.arraycopy(aVarArr, 0, aVarArr2, aVarArr.length, aVarArr.length);
                    this.f77331f = this.f77330e.length - 1;
                    this.f77330e = aVarArr2;
                }
                int i15 = this.f77331f;
                this.f77331f = i15 - 1;
                this.f77330e[i15] = aVar;
                this.f77332g++;
            } else {
                this.f77330e[i11 + c(i11) + d11] = aVar;
            }
            this.f77333h += i12;
        }

        public final boolean h(int i11) {
            return i11 >= 0 && i11 <= a.f77317a.c().length - 1;
        }

        public final int i() {
            return this.f77327b;
        }

        public final int j() throws IOException {
            return f.d(this.f77329d.readByte(), 255);
        }

        @k
        public final ByteString k() throws IOException {
            int j11 = j();
            boolean z11 = (j11 & 128) == 128;
            long n11 = n(j11, 127);
            if (!z11) {
                return this.f77329d.h2(n11);
            }
            l60.k kVar = new l60.k();
            e.f8208a.b(this.f77329d, n11, kVar);
            return kVar.q3();
        }

        public final void l() throws IOException {
            while (!this.f77329d.J()) {
                int d11 = f.d(this.f77329d.readByte(), 255);
                if (d11 == 128) {
                    throw new IOException("index == 0");
                }
                if ((d11 & 128) == 128) {
                    m(n(d11, 127) - 1);
                } else if (d11 == 64) {
                    p();
                } else if ((d11 & 64) == 64) {
                    o(n(d11, 63) - 1);
                } else if ((d11 & 32) == 32) {
                    int n11 = n(d11, 31);
                    this.f77327b = n11;
                    if (n11 < 0 || n11 > this.f77326a) {
                        throw new IOException("Invalid dynamic table size update " + this.f77327b);
                    }
                    a();
                } else if (d11 == 16 || d11 == 0) {
                    r();
                } else {
                    q(n(d11, 15) - 1);
                }
            }
        }

        public final void m(int i11) throws IOException {
            if (h(i11)) {
                this.f77328c.add(a.f77317a.c()[i11]);
                return;
            }
            int c11 = c(i11 - a.f77317a.c().length);
            if (c11 >= 0) {
                c60.a[] aVarArr = this.f77330e;
                if (c11 < aVarArr.length) {
                    List<c60.a> list = this.f77328c;
                    c60.a aVar = aVarArr[c11];
                    g0.m(aVar);
                    list.add(aVar);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i11 + 1));
        }

        public final int n(int i11, int i12) throws IOException {
            int i13 = i11 & i12;
            if (i13 < i12) {
                return i13;
            }
            int i14 = 0;
            while (true) {
                int j11 = j();
                if ((j11 & 128) == 0) {
                    return i12 + (j11 << i14);
                }
                i12 += (j11 & 127) << i14;
                i14 += 7;
            }
        }

        public final void o(int i11) throws IOException {
            g(-1, new c60.a(f(i11), k()));
        }

        public final void p() throws IOException {
            g(-1, new c60.a(a.f77317a.a(k()), k()));
        }

        public final void q(int i11) throws IOException {
            this.f77328c.add(new c60.a(f(i11), k()));
        }

        public final void r() throws IOException {
            this.f77328c.add(new c60.a(a.f77317a.a(k()), k()));
        }

        @w00.k
        public C0949a(@k g1 source, int i11, int i12) {
            g0.p(source, "source");
            this.f77326a = i11;
            this.f77327b = i12;
            this.f77328c = new ArrayList();
            this.f77329d = l60.r0.e(source);
            this.f77330e = new c60.a[8];
            this.f77331f = r2.length - 1;
        }

        public /* synthetic */ C0949a(g1 g1Var, int i11, int i12, int i13, v vVar) {
            this(g1Var, i11, (i13 & 4) != 0 ? i11 : i12);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @g
        public int f77334a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f77335b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final l60.k f77336c;

        /* renamed from: d, reason: collision with root package name */
        public int f77337d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f77338e;

        /* renamed from: f, reason: collision with root package name */
        @g
        public int f77339f;

        /* renamed from: g, reason: collision with root package name */
        @g
        @k
        public c60.a[] f77340g;

        /* renamed from: h, reason: collision with root package name */
        public int f77341h;

        /* renamed from: i, reason: collision with root package name */
        @g
        public int f77342i;

        /* renamed from: j, reason: collision with root package name */
        @g
        public int f77343j;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @w00.k
        public b(int i11, @k l60.k out) {
            this(i11, false, out, 2, null);
            g0.p(out, "out");
        }

        public final void a() {
            int i11 = this.f77339f;
            int i12 = this.f77343j;
            if (i11 < i12) {
                if (i11 == 0) {
                    b();
                } else {
                    c(i12 - i11);
                }
            }
        }

        public final void b() {
            q.V1(this.f77340g, null, 0, 0, 6, null);
            this.f77341h = this.f77340g.length - 1;
            this.f77342i = 0;
            this.f77343j = 0;
        }

        public final int c(int i11) {
            int i12;
            int i13 = 0;
            if (i11 > 0) {
                int length = this.f77340g.length;
                while (true) {
                    length--;
                    i12 = this.f77341h;
                    if (length < i12 || i11 <= 0) {
                        break;
                    }
                    c60.a aVar = this.f77340g[length];
                    g0.m(aVar);
                    i11 -= aVar.f8137c;
                    int i14 = this.f77343j;
                    c60.a aVar2 = this.f77340g[length];
                    g0.m(aVar2);
                    this.f77343j = i14 - aVar2.f8137c;
                    this.f77342i--;
                    i13++;
                }
                c60.a[] aVarArr = this.f77340g;
                System.arraycopy(aVarArr, i12 + 1, aVarArr, i12 + 1 + i13, this.f77342i);
                c60.a[] aVarArr2 = this.f77340g;
                int i15 = this.f77341h;
                Arrays.fill(aVarArr2, i15 + 1, i15 + 1 + i13, (Object) null);
                this.f77341h += i13;
            }
            return i13;
        }

        public final void d(c60.a aVar) {
            int i11 = aVar.f8137c;
            int i12 = this.f77339f;
            if (i11 > i12) {
                b();
                return;
            }
            c((this.f77343j + i11) - i12);
            int i13 = this.f77342i + 1;
            c60.a[] aVarArr = this.f77340g;
            if (i13 > aVarArr.length) {
                c60.a[] aVarArr2 = new c60.a[aVarArr.length * 2];
                System.arraycopy(aVarArr, 0, aVarArr2, aVarArr.length, aVarArr.length);
                this.f77341h = this.f77340g.length - 1;
                this.f77340g = aVarArr2;
            }
            int i14 = this.f77341h;
            this.f77341h = i14 - 1;
            this.f77340g[i14] = aVar;
            this.f77342i++;
            this.f77343j += i11;
        }

        public final void e(int i11) {
            this.f77334a = i11;
            int min = Math.min(i11, 16384);
            int i12 = this.f77339f;
            if (i12 == min) {
                return;
            }
            if (min < i12) {
                this.f77337d = Math.min(this.f77337d, min);
            }
            this.f77338e = true;
            this.f77339f = min;
            a();
        }

        public final void f(@k ByteString data) throws IOException {
            g0.p(data, "data");
            if (this.f77335b) {
                e eVar = e.f8208a;
                if (eVar.d(data) < data.size()) {
                    l60.k kVar = new l60.k();
                    eVar.c(data, kVar);
                    ByteString q32 = kVar.q3();
                    h(q32.size(), 127, 128);
                    this.f77336c.X3(q32);
                    return;
                }
            }
            h(data.size(), 127, 0);
            this.f77336c.X3(data);
        }

        public final void g(@k List<c60.a> headerBlock) throws IOException {
            int i11;
            int i12;
            g0.p(headerBlock, "headerBlock");
            if (this.f77338e) {
                int i13 = this.f77337d;
                if (i13 < this.f77339f) {
                    h(i13, 31, 32);
                }
                this.f77338e = false;
                this.f77337d = Integer.MAX_VALUE;
                h(this.f77339f, 31, 32);
            }
            int size = headerBlock.size();
            for (int i14 = 0; i14 < size; i14++) {
                c60.a aVar = headerBlock.get(i14);
                ByteString asciiLowercase = aVar.f8135a.toAsciiLowercase();
                ByteString byteString = aVar.f8136b;
                a aVar2 = a.f77317a;
                Integer num = aVar2.b().get(asciiLowercase);
                if (num != null) {
                    int intValue = num.intValue();
                    i12 = intValue + 1;
                    if (2 <= i12 && i12 < 8) {
                        if (g0.g(aVar2.c()[intValue].f8136b, byteString)) {
                            i11 = i12;
                        } else if (g0.g(aVar2.c()[i12].f8136b, byteString)) {
                            i11 = i12;
                            i12 = intValue + 2;
                        }
                    }
                    i11 = i12;
                    i12 = -1;
                } else {
                    i11 = -1;
                    i12 = -1;
                }
                if (i12 == -1) {
                    int i15 = this.f77341h + 1;
                    int length = this.f77340g.length;
                    while (true) {
                        if (i15 >= length) {
                            break;
                        }
                        c60.a aVar3 = this.f77340g[i15];
                        g0.m(aVar3);
                        if (g0.g(aVar3.f8135a, asciiLowercase)) {
                            c60.a aVar4 = this.f77340g[i15];
                            g0.m(aVar4);
                            if (g0.g(aVar4.f8136b, byteString)) {
                                i12 = a.f77317a.c().length + (i15 - this.f77341h);
                                break;
                            } else if (i11 == -1) {
                                i11 = (i15 - this.f77341h) + a.f77317a.c().length;
                            }
                        }
                        i15++;
                    }
                }
                if (i12 != -1) {
                    h(i12, 127, 128);
                } else if (i11 == -1) {
                    this.f77336c.writeByte(64);
                    f(asciiLowercase);
                    f(byteString);
                    d(aVar);
                } else if (!asciiLowercase.startsWith(c60.a.f8124e) || g0.g(c60.a.f8134o, asciiLowercase)) {
                    h(i11, 63, 64);
                    f(byteString);
                    d(aVar);
                } else {
                    h(i11, 15, 0);
                    f(byteString);
                }
            }
        }

        public final void h(int i11, int i12, int i13) {
            if (i11 < i12) {
                this.f77336c.writeByte(i11 | i13);
                return;
            }
            this.f77336c.writeByte(i13 | i12);
            int i14 = i11 - i12;
            while (i14 >= 128) {
                this.f77336c.writeByte(128 | (i14 & 127));
                i14 >>>= 7;
            }
            this.f77336c.writeByte(i14);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @w00.k
        public b(@k l60.k out) {
            this(0, false, out, 3, null);
            g0.p(out, "out");
        }

        @w00.k
        public b(int i11, boolean z11, @k l60.k out) {
            g0.p(out, "out");
            this.f77334a = i11;
            this.f77335b = z11;
            this.f77336c = out;
            this.f77337d = Integer.MAX_VALUE;
            this.f77339f = i11;
            this.f77340g = new c60.a[8];
            this.f77341h = r2.length - 1;
        }

        public /* synthetic */ b(int i11, boolean z11, l60.k kVar, int i12, v vVar) {
            this((i12 & 1) != 0 ? 4096 : i11, (i12 & 2) != 0 ? true : z11, kVar);
        }
    }

    static {
        a aVar = new a();
        f77317a = aVar;
        c60.a aVar2 = new c60.a(c60.a.f8134o, "");
        ByteString byteString = c60.a.f8131l;
        c60.a aVar3 = new c60.a(byteString, "GET");
        c60.a aVar4 = new c60.a(byteString, "POST");
        ByteString byteString2 = c60.a.f8132m;
        c60.a aVar5 = new c60.a(byteString2, "/");
        c60.a aVar6 = new c60.a(byteString2, "/index.html");
        ByteString byteString3 = c60.a.f8133n;
        c60.a aVar7 = new c60.a(byteString3, "http");
        c60.a aVar8 = new c60.a(byteString3, "https");
        ByteString byteString4 = c60.a.f8130k;
        f77324h = new c60.a[]{aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, new c60.a(byteString4, BasicPushStatus.SUCCESS_CODE), new c60.a(byteString4, "204"), new c60.a(byteString4, "206"), new c60.a(byteString4, "304"), new c60.a(byteString4, "400"), new c60.a(byteString4, "404"), new c60.a(byteString4, "500"), new c60.a("accept-charset", ""), new c60.a("accept-encoding", "gzip, deflate"), new c60.a("accept-language", ""), new c60.a("accept-ranges", ""), new c60.a("accept", ""), new c60.a("access-control-allow-origin", ""), new c60.a("age", ""), new c60.a("allow", ""), new c60.a("authorization", ""), new c60.a("cache-control", ""), new c60.a("content-disposition", ""), new c60.a("content-encoding", ""), new c60.a("content-language", ""), new c60.a("content-length", ""), new c60.a("content-location", ""), new c60.a("content-range", ""), new c60.a(com.alipay.sdk.m.p.e.f10902f, ""), new c60.a("cookie", ""), new c60.a("date", ""), new c60.a("etag", ""), new c60.a("expect", ""), new c60.a("expires", ""), new c60.a("from", ""), new c60.a("host", ""), new c60.a("if-match", ""), new c60.a("if-modified-since", ""), new c60.a("if-none-match", ""), new c60.a("if-range", ""), new c60.a("if-unmodified-since", ""), new c60.a("last-modified", ""), new c60.a(y9.b.f99687c, ""), new c60.a(u.S, ""), new c60.a("max-forwards", ""), new c60.a("proxy-authenticate", ""), new c60.a("proxy-authorization", ""), new c60.a("range", ""), new c60.a("referer", ""), new c60.a(com.alipay.sdk.m.x.d.f11177w, ""), new c60.a("retry-after", ""), new c60.a("server", ""), new c60.a("set-cookie", ""), new c60.a("strict-transport-security", ""), new c60.a(c60.c.f8167n, ""), new c60.a("user-agent", ""), new c60.a("vary", ""), new c60.a("via", ""), new c60.a("www-authenticate", "")};
        f77325i = aVar.d();
    }

    @k
    public final ByteString a(@k ByteString name) throws IOException {
        g0.p(name, "name");
        int size = name.size();
        for (int i11 = 0; i11 < size; i11++) {
            byte b11 = name.getByte(i11);
            if (65 <= b11 && b11 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.utf8());
            }
        }
        return name;
    }

    @k
    public final Map<ByteString, Integer> b() {
        return f77325i;
    }

    @k
    public final c60.a[] c() {
        return f77324h;
    }

    public final Map<ByteString, Integer> d() {
        c60.a[] aVarArr = f77324h;
        LinkedHashMap linkedHashMap = new LinkedHashMap(aVarArr.length);
        int length = aVarArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            c60.a[] aVarArr2 = f77324h;
            if (!linkedHashMap.containsKey(aVarArr2[i11].f8135a)) {
                linkedHashMap.put(aVarArr2[i11].f8135a, Integer.valueOf(i11));
            }
        }
        Map<ByteString, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        g0.o(unmodifiableMap, "unmodifiableMap(result)");
        return unmodifiableMap;
    }
}
