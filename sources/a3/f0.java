package a3;

import com.badlogic.gdx.utils.GdxRuntimeException;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f0<K> implements Iterable<b<K>> {

    /* renamed from: a, reason: collision with root package name */
    public int f1506a;

    /* renamed from: b, reason: collision with root package name */
    public K[] f1507b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f1508c;

    /* renamed from: d, reason: collision with root package name */
    public float f1509d;

    /* renamed from: e, reason: collision with root package name */
    public int f1510e;

    /* renamed from: f, reason: collision with root package name */
    public int f1511f;

    /* renamed from: g, reason: collision with root package name */
    public int f1512g;

    /* renamed from: h, reason: collision with root package name */
    public transient a f1513h;

    /* renamed from: i, reason: collision with root package name */
    public transient a f1514i;

    /* renamed from: j, reason: collision with root package name */
    public transient e f1515j;

    /* renamed from: k, reason: collision with root package name */
    public transient e f1516k;

    /* renamed from: l, reason: collision with root package name */
    public transient c f1517l;

    /* renamed from: m, reason: collision with root package name */
    public transient c f1518m;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<K> {

        /* renamed from: a, reason: collision with root package name */
        public K f1520a;

        /* renamed from: b, reason: collision with root package name */
        public long f1521b;

        public String toString() {
            return this.f1520a + ContainerUtils.KEY_VALUE_DELIMITER + this.f1521b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d<K> {

        /* renamed from: a, reason: collision with root package name */
        public boolean f1522a;

        /* renamed from: b, reason: collision with root package name */
        public final f0<K> f1523b;

        /* renamed from: c, reason: collision with root package name */
        public int f1524c;

        /* renamed from: d, reason: collision with root package name */
        public int f1525d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f1526e = true;

        public d(f0<K> f0Var) {
            this.f1523b = f0Var;
            b();
        }

        public void a() {
            int i11;
            K[] kArr = this.f1523b.f1507b;
            int length = kArr.length;
            do {
                i11 = this.f1524c + 1;
                this.f1524c = i11;
                if (i11 >= length) {
                    this.f1522a = false;
                    return;
                }
            } while (kArr[i11] == null);
            this.f1522a = true;
        }

        public void b() {
            this.f1525d = -1;
            this.f1524c = -1;
            a();
        }

        public void remove() {
            int i11 = this.f1525d;
            if (i11 < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            f0<K> f0Var = this.f1523b;
            K[] kArr = f0Var.f1507b;
            long[] jArr = f0Var.f1508c;
            int i12 = f0Var.f1512g;
            int i13 = i11 + 1;
            while (true) {
                int i14 = i13 & i12;
                K k11 = kArr[i14];
                if (k11 == null) {
                    break;
                }
                int p11 = this.f1523b.p(k11);
                if (((i14 - p11) & i12) > ((i11 - p11) & i12)) {
                    kArr[i11] = k11;
                    jArr[i11] = jArr[i14];
                    i11 = i14;
                }
                i13 = i14 + 1;
            }
            kArr[i11] = null;
            f0<K> f0Var2 = this.f1523b;
            f0Var2.f1506a--;
            if (i11 != this.f1525d) {
                this.f1524c--;
            }
            this.f1525d = -1;
        }
    }

    public f0() {
        this(51, 0.8f);
    }

    public void a(int i11) {
        int s11 = com.badlogic.gdx.utils.m.s(i11, this.f1509d);
        if (this.f1507b.length <= s11) {
            clear();
        } else {
            this.f1506a = 0;
            v(s11);
        }
    }

    public boolean b(K k11) {
        return n(k11) >= 0;
    }

    public void clear() {
        if (this.f1506a == 0) {
            return;
        }
        this.f1506a = 0;
        Arrays.fill(this.f1507b, (Object) null);
    }

    public boolean d(long j11) {
        K[] kArr = this.f1507b;
        long[] jArr = this.f1508c;
        for (int length = jArr.length - 1; length >= 0; length--) {
            if (kArr[length] != null && jArr[length] == j11) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (f0Var.f1506a != this.f1506a) {
            return false;
        }
        K[] kArr = this.f1507b;
        long[] jArr = this.f1508c;
        int length = kArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            K k11 = kArr[i11];
            if (k11 != null) {
                long j11 = f0Var.j(k11, 0L);
                if ((j11 == 0 && !f0Var.b(k11)) || j11 != jArr[i11]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void f(int i11) {
        int s11 = com.badlogic.gdx.utils.m.s(this.f1506a + i11, this.f1509d);
        if (this.f1507b.length < s11) {
            v(s11);
        }
    }

    public a<K> g() {
        if (k.f1553a) {
            return new a<>(this);
        }
        if (this.f1513h == null) {
            this.f1513h = new a(this);
            this.f1514i = new a(this);
        }
        a aVar = this.f1513h;
        if (aVar.f1526e) {
            this.f1514i.b();
            a<K> aVar2 = this.f1514i;
            aVar2.f1526e = true;
            this.f1513h.f1526e = false;
            return aVar2;
        }
        aVar.b();
        a<K> aVar3 = this.f1513h;
        aVar3.f1526e = true;
        this.f1514i.f1526e = false;
        return aVar3;
    }

    @d0
    public K h(long j11) {
        K[] kArr = this.f1507b;
        long[] jArr = this.f1508c;
        for (int length = jArr.length - 1; length >= 0; length--) {
            K k11 = kArr[length];
            if (k11 != null && jArr[length] == j11) {
                return k11;
            }
        }
        return null;
    }

    public int hashCode() {
        int i11 = this.f1506a;
        K[] kArr = this.f1507b;
        long[] jArr = this.f1508c;
        int length = kArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (kArr[i12] != null) {
                i11 = (int) (i11 + r5.hashCode() + jArr[i12]);
            }
        }
        return i11;
    }

    public boolean isEmpty() {
        return this.f1506a == 0;
    }

    public long j(K k11, long j11) {
        int n11 = n(k11);
        return n11 < 0 ? j11 : this.f1508c[n11];
    }

    public long k(K k11, long j11, long j12) {
        int n11 = n(k11);
        if (n11 >= 0) {
            long[] jArr = this.f1508c;
            long j13 = jArr[n11];
            jArr[n11] = j12 + j13;
            return j13;
        }
        int i11 = -(n11 + 1);
        K[] kArr = this.f1507b;
        kArr[i11] = k11;
        this.f1508c[i11] = j12 + j11;
        int i12 = this.f1506a + 1;
        this.f1506a = i12;
        if (i12 >= this.f1510e) {
            v(kArr.length << 1);
        }
        return j11;
    }

    @Override // java.lang.Iterable
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public a<K> iterator() {
        return g();
    }

    public c<K> m() {
        if (k.f1553a) {
            return new c<>(this);
        }
        if (this.f1517l == null) {
            this.f1517l = new c(this);
            this.f1518m = new c(this);
        }
        c cVar = this.f1517l;
        if (cVar.f1526e) {
            this.f1518m.b();
            c<K> cVar2 = this.f1518m;
            cVar2.f1526e = true;
            this.f1517l.f1526e = false;
            return cVar2;
        }
        cVar.b();
        c<K> cVar3 = this.f1517l;
        cVar3.f1526e = true;
        this.f1518m.f1526e = false;
        return cVar3;
    }

    public int n(K k11) {
        if (k11 == null) {
            throw new IllegalArgumentException("key cannot be null.");
        }
        K[] kArr = this.f1507b;
        int p11 = p(k11);
        while (true) {
            K k12 = kArr[p11];
            if (k12 == null) {
                return -(p11 + 1);
            }
            if (k12.equals(k11)) {
                return p11;
            }
            p11 = (p11 + 1) & this.f1512g;
        }
    }

    public boolean o() {
        return this.f1506a > 0;
    }

    public int p(K k11) {
        return (int) ((k11.hashCode() * (-7046029254386353131L)) >>> this.f1511f);
    }

    public long q(K k11, long j11, long j12) {
        int n11 = n(k11);
        if (n11 >= 0) {
            long[] jArr = this.f1508c;
            long j13 = jArr[n11];
            jArr[n11] = j11;
            return j13;
        }
        int i11 = -(n11 + 1);
        K[] kArr = this.f1507b;
        kArr[i11] = k11;
        this.f1508c[i11] = j11;
        int i12 = this.f1506a + 1;
        this.f1506a = i12;
        if (i12 >= this.f1510e) {
            v(kArr.length << 1);
        }
        return j12;
    }

    public void r(K k11, long j11) {
        int n11 = n(k11);
        if (n11 >= 0) {
            this.f1508c[n11] = j11;
            return;
        }
        int i11 = -(n11 + 1);
        K[] kArr = this.f1507b;
        kArr[i11] = k11;
        this.f1508c[i11] = j11;
        int i12 = this.f1506a + 1;
        this.f1506a = i12;
        if (i12 >= this.f1510e) {
            v(kArr.length << 1);
        }
    }

    public void s(f0<? extends K> f0Var) {
        f(f0Var.f1506a);
        K[] kArr = f0Var.f1507b;
        long[] jArr = f0Var.f1508c;
        int length = kArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            K k11 = kArr[i11];
            if (k11 != null) {
                r(k11, jArr[i11]);
            }
        }
    }

    public final void t(K k11, long j11) {
        K[] kArr = this.f1507b;
        int p11 = p(k11);
        while (kArr[p11] != null) {
            p11 = (p11 + 1) & this.f1512g;
        }
        kArr[p11] = k11;
        this.f1508c[p11] = j11;
    }

    public String toString() {
        return y(j2.O, true);
    }

    public long u(K k11, long j11) {
        int n11 = n(k11);
        if (n11 < 0) {
            return j11;
        }
        K[] kArr = this.f1507b;
        long[] jArr = this.f1508c;
        long j12 = jArr[n11];
        int i11 = this.f1512g;
        int i12 = n11 + 1;
        while (true) {
            int i13 = i12 & i11;
            K k12 = kArr[i13];
            if (k12 == null) {
                kArr[n11] = null;
                this.f1506a--;
                return j12;
            }
            int p11 = p(k12);
            if (((i13 - p11) & i11) > ((n11 - p11) & i11)) {
                kArr[n11] = k12;
                jArr[n11] = jArr[i13];
                n11 = i13;
            }
            i12 = i13 + 1;
        }
    }

    public final void v(int i11) {
        int length = this.f1507b.length;
        this.f1510e = (int) (i11 * this.f1509d);
        int i12 = i11 - 1;
        this.f1512g = i12;
        this.f1511f = Long.numberOfLeadingZeros(i12);
        K[] kArr = this.f1507b;
        long[] jArr = this.f1508c;
        this.f1507b = (K[]) new Object[i11];
        this.f1508c = new long[i11];
        if (this.f1506a > 0) {
            for (int i13 = 0; i13 < length; i13++) {
                K k11 = kArr[i13];
                if (k11 != null) {
                    t(k11, jArr[i13]);
                }
            }
        }
    }

    public void w(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("maximumCapacity must be >= 0: " + i11);
        }
        int s11 = com.badlogic.gdx.utils.m.s(i11, this.f1509d);
        if (this.f1507b.length > s11) {
            v(s11);
        }
    }

    public String x(String str) {
        return y(str, false);
    }

    public final String y(String str, boolean z11) {
        int i11;
        if (this.f1506a == 0) {
            return z11 ? "{}" : "";
        }
        StringBuilder sb2 = new StringBuilder(32);
        if (z11) {
            sb2.append(l50.b.f69927i);
        }
        K[] kArr = this.f1507b;
        long[] jArr = this.f1508c;
        int length = kArr.length;
        while (true) {
            i11 = length - 1;
            if (length > 0) {
                K k11 = kArr[i11];
                if (k11 != null) {
                    sb2.append(k11);
                    sb2.append('=');
                    sb2.append(jArr[i11]);
                    break;
                }
                length = i11;
            } else {
                break;
            }
        }
        while (true) {
            int i12 = i11 - 1;
            if (i11 <= 0) {
                break;
            }
            K k12 = kArr[i12];
            if (k12 != null) {
                sb2.append(str);
                sb2.append(k12);
                sb2.append('=');
                sb2.append(jArr[i12]);
            }
            i11 = i12;
        }
        if (z11) {
            sb2.append(l50.b.f69928j);
        }
        return sb2.toString();
    }

    public e z() {
        if (k.f1553a) {
            return new e(this);
        }
        if (this.f1515j == null) {
            this.f1515j = new e(this);
            this.f1516k = new e(this);
        }
        e eVar = this.f1515j;
        if (eVar.f1526e) {
            this.f1516k.b();
            e eVar2 = this.f1516k;
            eVar2.f1526e = true;
            this.f1515j.f1526e = false;
            return eVar2;
        }
        eVar.b();
        e eVar3 = this.f1515j;
        eVar3.f1526e = true;
        this.f1516k.f1526e = false;
        return eVar3;
    }

    public f0(int i11) {
        this(i11, 0.8f);
    }

    public f0(int i11, float f11) {
        if (f11 > 0.0f && f11 < 1.0f) {
            this.f1509d = f11;
            int s11 = com.badlogic.gdx.utils.m.s(i11, f11);
            this.f1510e = (int) (s11 * f11);
            int i12 = s11 - 1;
            this.f1512g = i12;
            this.f1511f = Long.numberOfLeadingZeros(i12);
            this.f1507b = (K[]) new Object[s11];
            this.f1508c = new long[s11];
            return;
        }
        throw new IllegalArgumentException("loadFactor must be > 0 and < 1: " + f11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f0(a3.f0<? extends K> r5) {
        /*
            r4 = this;
            K[] r0 = r5.f1507b
            int r0 = r0.length
            float r0 = (float) r0
            float r1 = r5.f1509d
            float r0 = r0 * r1
            int r0 = (int) r0
            r4.<init>(r0, r1)
            K[] r0 = r5.f1507b
            K[] r1 = r4.f1507b
            int r2 = r0.length
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            long[] r0 = r5.f1508c
            long[] r1 = r4.f1508c
            int r2 = r0.length
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            int r5 = r5.f1506a
            r4.f1506a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.f0.<init>(a3.f0):void");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<K> extends d<K> implements Iterable<b<K>>, Iterator<b<K>> {

        /* renamed from: f, reason: collision with root package name */
        public b<K> f1519f;

        public a(f0<K> f0Var) {
            super(f0Var);
            this.f1519f = new b<>();
        }

        @Override // a3.f0.d
        public /* bridge */ /* synthetic */ void b() {
            super.b();
        }

        @Override // java.util.Iterator
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public b<K> next() {
            if (!this.f1522a) {
                throw new NoSuchElementException();
            }
            if (!this.f1526e) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            f0<K> f0Var = this.f1523b;
            K[] kArr = f0Var.f1507b;
            b<K> bVar = this.f1519f;
            int i11 = this.f1524c;
            bVar.f1520a = kArr[i11];
            bVar.f1521b = f0Var.f1508c[i11];
            this.f1525d = i11;
            a();
            return this.f1519f;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f1526e) {
                return this.f1522a;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // a3.f0.d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // java.lang.Iterable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a<K> iterator() {
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c<K> extends d<K> implements Iterable<K>, Iterator<K> {
        public c(f0<K> f0Var) {
            super(f0Var);
        }

        @Override // a3.f0.d
        public /* bridge */ /* synthetic */ void b() {
            super.b();
        }

        public com.badlogic.gdx.utils.a<K> f() {
            return g(new com.badlogic.gdx.utils.a<>(true, this.f1523b.f1506a));
        }

        public com.badlogic.gdx.utils.a<K> g(com.badlogic.gdx.utils.a<K> aVar) {
            while (this.f1522a) {
                aVar.a(next());
            }
            return aVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f1526e) {
                return this.f1522a;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // java.util.Iterator
        public K next() {
            if (!this.f1522a) {
                throw new NoSuchElementException();
            }
            if (!this.f1526e) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            K[] kArr = this.f1523b.f1507b;
            int i11 = this.f1524c;
            K k11 = kArr[i11];
            this.f1525d = i11;
            a();
            return k11;
        }

        @Override // a3.f0.d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // java.lang.Iterable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public c<K> iterator() {
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e extends d<Object> {
        public e(f0<?> f0Var) {
            super(f0Var);
        }

        @Override // a3.f0.d
        public /* bridge */ /* synthetic */ void b() {
            super.b();
        }

        public long f() {
            if (!this.f1522a) {
                throw new NoSuchElementException();
            }
            if (!this.f1526e) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            long[] jArr = this.f1523b.f1508c;
            int i11 = this.f1524c;
            long j11 = jArr[i11];
            this.f1525d = i11;
            a();
            return j11;
        }

        public b0 g() {
            b0 b0Var = new b0(true, this.f1523b.f1506a);
            while (this.f1522a) {
                b0Var.a(f());
            }
            return b0Var;
        }

        public b0 h(b0 b0Var) {
            while (this.f1522a) {
                b0Var.a(f());
            }
            return b0Var;
        }

        public boolean hasNext() {
            if (this.f1526e) {
                return this.f1522a;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // a3.f0.d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        public e d() {
            return this;
        }
    }
}
