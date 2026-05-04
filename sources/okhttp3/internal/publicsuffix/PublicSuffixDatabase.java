package okhttp3.internal.publicsuffix;

import a00.g0;
import a00.h0;
import a00.r0;
import e60.j;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.v;
import l60.m;
import l60.z;
import m80.k;
import m80.l;
import r00.b;
import u30.k0;
import u50.f;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class PublicSuffixDatabase {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final String f77438f = "publicsuffixes.gz";

    /* renamed from: i, reason: collision with root package name */
    public static final char f77441i = '!';

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AtomicBoolean f77443a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CountDownLatch f77444b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public byte[] f77445c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f77446d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f77437e = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final byte[] f77439g = {42};

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final List<String> f77440h = g0.l("*");

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final PublicSuffixDatabase f77442j = new PublicSuffixDatabase();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public final String b(byte[] bArr, byte[][] bArr2, int i11) {
            int i12;
            int d11;
            boolean z11;
            int d12;
            int length = bArr.length;
            int i13 = 0;
            while (i13 < length) {
                int i14 = (i13 + length) / 2;
                while (i14 > -1 && bArr[i14] != 10) {
                    i14--;
                }
                int i15 = i14 + 1;
                int i16 = 1;
                while (true) {
                    i12 = i15 + i16;
                    if (bArr[i12] == 10) {
                        break;
                    }
                    i16++;
                }
                int i17 = i12 - i15;
                int i18 = i11;
                boolean z12 = false;
                int i19 = 0;
                int i21 = 0;
                while (true) {
                    if (z12) {
                        d11 = 46;
                        z11 = false;
                    } else {
                        boolean z13 = z12;
                        d11 = f.d(bArr2[i18][i19], 255);
                        z11 = z13;
                    }
                    d12 = d11 - f.d(bArr[i15 + i21], 255);
                    if (d12 != 0) {
                        break;
                    }
                    i21++;
                    i19++;
                    if (i21 == i17) {
                        break;
                    }
                    if (bArr2[i18].length != i19) {
                        z12 = z11;
                    } else {
                        if (i18 == bArr2.length - 1) {
                            break;
                        }
                        i18++;
                        z12 = true;
                        i19 = -1;
                    }
                }
                if (d12 >= 0) {
                    if (d12 <= 0) {
                        int i22 = i17 - i21;
                        int length2 = bArr2[i18].length - i19;
                        int length3 = bArr2.length;
                        for (int i23 = i18 + 1; i23 < length3; i23++) {
                            length2 += bArr2[i23].length;
                        }
                        if (length2 >= i22) {
                            if (length2 <= i22) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                kotlin.jvm.internal.g0.o(UTF_8, "UTF_8");
                                return new String(bArr, i15, i17, UTF_8);
                            }
                        }
                    }
                    i13 = i12 + 1;
                }
                length = i14;
            }
            return null;
        }

        @k
        public final PublicSuffixDatabase c() {
            return PublicSuffixDatabase.f77442j;
        }

        public a() {
        }
    }

    public final List<String> b(List<String> list) {
        String str;
        String str2;
        String str3;
        List<String> J;
        List<String> J2;
        if (this.f77443a.get() || !this.f77443a.compareAndSet(false, true)) {
            try {
                this.f77444b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            e();
        }
        if (this.f77445c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = list.size();
        byte[][] bArr = new byte[size][];
        for (int i11 = 0; i11 < size; i11++) {
            String str4 = list.get(i11);
            Charset UTF_8 = StandardCharsets.UTF_8;
            kotlin.jvm.internal.g0.o(UTF_8, "UTF_8");
            byte[] bytes = str4.getBytes(UTF_8);
            kotlin.jvm.internal.g0.o(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i11] = bytes;
        }
        int i12 = 0;
        while (true) {
            str = null;
            if (i12 >= size) {
                str2 = null;
                break;
            }
            a aVar = f77437e;
            byte[] bArr2 = this.f77445c;
            if (bArr2 == null) {
                kotlin.jvm.internal.g0.S("publicSuffixListBytes");
                bArr2 = null;
            }
            str2 = aVar.b(bArr2, bArr, i12);
            if (str2 != null) {
                break;
            }
            i12++;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i13 = 0; i13 < length; i13++) {
                bArr3[i13] = f77439g;
                a aVar2 = f77437e;
                byte[] bArr4 = this.f77445c;
                if (bArr4 == null) {
                    kotlin.jvm.internal.g0.S("publicSuffixListBytes");
                    bArr4 = null;
                }
                String b11 = aVar2.b(bArr4, bArr3, i13);
                if (b11 != null) {
                    str3 = b11;
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            int i14 = size - 1;
            int i15 = 0;
            while (true) {
                if (i15 >= i14) {
                    break;
                }
                a aVar3 = f77437e;
                byte[] bArr5 = this.f77446d;
                if (bArr5 == null) {
                    kotlin.jvm.internal.g0.S("publicSuffixExceptionListBytes");
                    bArr5 = null;
                }
                String b12 = aVar3.b(bArr5, bArr, i15);
                if (b12 != null) {
                    str = b12;
                    break;
                }
                i15++;
            }
        }
        if (str != null) {
            return k0.n5(f77441i + str, new char[]{'.'}, false, 0, 6, null);
        }
        if (str2 == null && str3 == null) {
            return f77440h;
        }
        if (str2 == null || (J = k0.n5(str2, new char[]{'.'}, false, 0, 6, null)) == null) {
            J = h0.J();
        }
        if (str3 == null || (J2 = k0.n5(str3, new char[]{'.'}, false, 0, 6, null)) == null) {
            J2 = h0.J();
        }
        return J.size() > J2.size() ? J : J2;
    }

    @l
    public final String c(@k String domain) {
        int size;
        int size2;
        kotlin.jvm.internal.g0.p(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        kotlin.jvm.internal.g0.o(unicodeDomain, "unicodeDomain");
        List<String> g11 = g(unicodeDomain);
        List<String> b11 = b(g11);
        if (g11.size() == b11.size() && b11.get(0).charAt(0) != '!') {
            return null;
        }
        if (b11.get(0).charAt(0) == '!') {
            size = g11.size();
            size2 = b11.size();
        } else {
            size = g11.size();
            size2 = b11.size() + 1;
        }
        return q30.k0.H1(q30.k0.J0(r0.E1(g(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, byte[]] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, byte[]] */
    public final void d() throws IOException {
        try {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(f77438f);
            if (resourceAsStream != null) {
                m e11 = l60.r0.e(new z(l60.r0.v(resourceAsStream)));
                try {
                    objectRef.element = e11.P5(e11.readInt());
                    objectRef2.element = e11.P5(e11.readInt());
                    g2 g2Var = g2.f100423a;
                    b.a(e11, null);
                    synchronized (this) {
                        T t11 = objectRef.element;
                        kotlin.jvm.internal.g0.m(t11);
                        this.f77445c = (byte[]) t11;
                        T t12 = objectRef2.element;
                        kotlin.jvm.internal.g0.m(t12);
                        this.f77446d = (byte[]) t12;
                    }
                } finally {
                }
            }
        } finally {
            this.f77444b.countDown();
        }
    }

    public final void e() {
        boolean z11 = false;
        while (true) {
            try {
                try {
                    d();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z11 = true;
                } catch (IOException e11) {
                    j.f49490a.g().m("Failed to read public suffix list", 5, e11);
                    if (!z11) {
                        return;
                    }
                }
            } finally {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public final void f(@k byte[] publicSuffixListBytes, @k byte[] publicSuffixExceptionListBytes) {
        kotlin.jvm.internal.g0.p(publicSuffixListBytes, "publicSuffixListBytes");
        kotlin.jvm.internal.g0.p(publicSuffixExceptionListBytes, "publicSuffixExceptionListBytes");
        this.f77445c = publicSuffixListBytes;
        this.f77446d = publicSuffixExceptionListBytes;
        this.f77443a.set(true);
        this.f77444b.countDown();
    }

    public final List<String> g(String str) {
        List<String> n52 = k0.n5(str, new char[]{'.'}, false, 0, 6, null);
        return kotlin.jvm.internal.g0.g(r0.u3(n52), "") ? r0.h2(n52, 1) : n52;
    }
}
