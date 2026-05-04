package no;

import com.google.common.base.Preconditions;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.Checksum;
import javax.annotation.CheckForNull;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@no.i
/* loaded from: classes7.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final int f75342a = (int) System.currentTimeMillis();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @uo.j
    public static abstract class b implements t<Checksum> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f75343b = new a("CRC_32", 0, "Hashing.crc32()");

        /* renamed from: c, reason: collision with root package name */
        public static final b f75344c = new C0917b("ADLER_32", 1, "Hashing.adler32()");

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ b[] f75345d = a();

        /* renamed from: a, reason: collision with root package name */
        public final n f75346a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum a extends b {
            public a(String $enum$name, int $enum$ordinal, String toString) {
                super($enum$name, $enum$ordinal, toString);
            }

            @Override // ho.p0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Checksum get() {
                return new CRC32();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: no.p$b$b, reason: collision with other inner class name */
        public enum C0917b extends b {
            public C0917b(String $enum$name, int $enum$ordinal, String toString) {
                super($enum$name, $enum$ordinal, toString);
            }

            @Override // ho.p0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Checksum get() {
                return new Adler32();
            }
        }

        public static /* synthetic */ b[] a() {
            return new b[]{f75343b, f75344c};
        }

        public static b valueOf(String name) {
            return (b) Enum.valueOf(b.class, name);
        }

        public static b[] values() {
            return (b[]) f75345d.clone();
        }

        public b(String $enum$name, int $enum$ordinal, String toString) {
            this.f75346a = new no.g(this, 32, toString);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends no.b {
        public boolean equals(@CheckForNull Object object) {
            if (object instanceof c) {
                return Arrays.equals(this.f75222a, ((c) object).f75222a);
            }
            return false;
        }

        @Override // no.n
        public int h() {
            int i11 = 0;
            for (n nVar : this.f75222a) {
                i11 += nVar.h();
            }
            return i11;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f75222a);
        }

        @Override // no.b
        public m m(o[] hashers) {
            byte[] bArr = new byte[h() / 8];
            int i11 = 0;
            for (o oVar : hashers) {
                m h11 = oVar.h();
                i11 += h11.n(bArr, i11, h11.d() / 8);
            }
            return m.h(bArr);
        }

        public c(n... functions) {
            super(functions);
            for (n nVar : functions) {
                Preconditions.checkArgument(nVar.h() % 8 == 0, "the number of bits (%s) in hashFunction (%s) must be divisible by 8", nVar.h(), (Object) nVar);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public long f75347a;

        public d(long seed) {
            this.f75347a = seed;
        }

        public double a() {
            this.f75347a = (this.f75347a * 2862933555777941757L) + 1;
            return (((int) (r2 >>> 33)) + 1) / 2.147483648E9d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public static final n f75348a = new b0("MD5", "Hashing.md5()");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public static final n f75349a = new b0("SHA-1", "Hashing.sha1()");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public static final n f75350a = new b0("SHA-256", "Hashing.sha256()");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class h {

        /* renamed from: a, reason: collision with root package name */
        public static final n f75351a = new b0("SHA-384", "Hashing.sha384()");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class i {

        /* renamed from: a, reason: collision with root package name */
        public static final n f75352a = new b0("SHA-512", "Hashing.sha512()");
    }

    @Deprecated
    public static n A(int seed) {
        return new d0(seed, false);
    }

    public static n B() {
        return d0.f75245d;
    }

    public static n C(int seed) {
        return new d0(seed, true);
    }

    @Deprecated
    public static n D() {
        return f.f75349a;
    }

    public static n E() {
        return g.f75350a;
    }

    public static n F() {
        return h.f75351a;
    }

    public static n G() {
        return i.f75352a;
    }

    public static n H() {
        return g0.f75267e;
    }

    public static n I(long k02, long k12) {
        return new g0(2, 4, k02, k12);
    }

    public static n a() {
        return b.f75344c.f75346a;
    }

    public static int b(int bits) {
        Preconditions.checkArgument(bits > 0, "Number of bits must be positive");
        return (bits + 31) & (-32);
    }

    public static m c(Iterable<m> hashCodes) {
        Iterator<m> it = hashCodes.iterator();
        Preconditions.checkArgument(it.hasNext(), "Must be at least 1 hash code to combine.");
        int d11 = it.next().d() / 8;
        byte[] bArr = new byte[d11];
        Iterator<m> it2 = hashCodes.iterator();
        while (it2.hasNext()) {
            byte[] a11 = it2.next().a();
            Preconditions.checkArgument(a11.length == d11, "All hashcodes must have the same bit length.");
            for (int i11 = 0; i11 < a11.length; i11++) {
                bArr[i11] = (byte) ((bArr[i11] * s60.e.f88061c) ^ a11[i11]);
            }
        }
        return m.h(bArr);
    }

    public static m d(Iterable<m> hashCodes) {
        Iterator<m> it = hashCodes.iterator();
        Preconditions.checkArgument(it.hasNext(), "Must be at least 1 hash code to combine.");
        int d11 = it.next().d() / 8;
        byte[] bArr = new byte[d11];
        Iterator<m> it2 = hashCodes.iterator();
        while (it2.hasNext()) {
            byte[] a11 = it2.next().a();
            Preconditions.checkArgument(a11.length == d11, "All hashcodes must have the same bit length.");
            for (int i11 = 0; i11 < a11.length; i11++) {
                bArr[i11] = (byte) (bArr[i11] + a11[i11]);
            }
        }
        return m.h(bArr);
    }

    public static n e(Iterable<n> hashFunctions) {
        Preconditions.checkNotNull(hashFunctions);
        ArrayList arrayList = new ArrayList();
        Iterator<n> it = hashFunctions.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        Preconditions.checkArgument(!arrayList.isEmpty(), "number of hash functions (%s) must be > 0", arrayList.size());
        return new c((n[]) arrayList.toArray(new n[0]));
    }

    public static n f(n first, n second, n... rest) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(first);
        arrayList.add(second);
        Collections.addAll(arrayList, rest);
        return new c((n[]) arrayList.toArray(new n[0]));
    }

    public static int g(long input, int buckets) {
        int i11 = 0;
        Preconditions.checkArgument(buckets > 0, "buckets must be positive: %s", buckets);
        d dVar = new d(input);
        while (true) {
            int a11 = (int) ((i11 + 1) / dVar.a());
            if (a11 < 0 || a11 >= buckets) {
                break;
            }
            i11 = a11;
        }
        return i11;
    }

    public static int h(m hashCode, int buckets) {
        return g(hashCode.m(), buckets);
    }

    public static n i() {
        return b.f75343b.f75346a;
    }

    public static n j() {
        return no.h.f75281a;
    }

    public static n k() {
        return j.f75317a;
    }

    public static n l() {
        return k.f75321a;
    }

    public static n m(int minimumBits) {
        int b11 = b(minimumBits);
        if (b11 == 32) {
            return d0.f75246e;
        }
        if (b11 <= 128) {
            return c0.f75236c;
        }
        int i11 = (b11 + 127) / 128;
        n[] nVarArr = new n[i11];
        nVarArr[0] = c0.f75236c;
        int i12 = f75342a;
        for (int i13 = 1; i13 < i11; i13++) {
            i12 += 1500450271;
            nVarArr[i13] = y(i12);
        }
        return new c(nVarArr);
    }

    public static n n(Key key) {
        return new a0("HmacMD5", key, v("hmacMd5", key));
    }

    public static n o(byte[] key) {
        return n(new SecretKeySpec((byte[]) Preconditions.checkNotNull(key), "HmacMD5"));
    }

    public static n p(Key key) {
        return new a0("HmacSHA1", key, v("hmacSha1", key));
    }

    public static n q(byte[] key) {
        return p(new SecretKeySpec((byte[]) Preconditions.checkNotNull(key), "HmacSHA1"));
    }

    public static n r(Key key) {
        return new a0(qr.b.f82657b, key, v("hmacSha256", key));
    }

    public static n s(byte[] key) {
        return r(new SecretKeySpec((byte[]) Preconditions.checkNotNull(key), qr.b.f82657b));
    }

    public static n t(Key key) {
        return new a0("HmacSHA512", key, v("hmacSha512", key));
    }

    public static n u(byte[] key) {
        return t(new SecretKeySpec((byte[]) Preconditions.checkNotNull(key), "HmacSHA512"));
    }

    public static String v(String methodName, Key key) {
        return "Hashing." + methodName + "(Key[algorithm=" + key.getAlgorithm() + ", format=" + key.getFormat() + "])";
    }

    @Deprecated
    public static n w() {
        return e.f75348a;
    }

    public static n x() {
        return c0.f75235b;
    }

    public static n y(int seed) {
        return new c0(seed);
    }

    @Deprecated
    public static n z() {
        return d0.f75244c;
    }
}
