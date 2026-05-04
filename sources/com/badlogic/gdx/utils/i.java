package com.badlogic.gdx.utils;

import a3.b0;
import a3.d0;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class i<V> implements Iterable<b<V>> {

    /* renamed from: a, reason: collision with root package name */
    public int f13312a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f13313b;

    /* renamed from: c, reason: collision with root package name */
    public V[] f13314c;

    /* renamed from: d, reason: collision with root package name */
    public V f13315d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13316e;

    /* renamed from: f, reason: collision with root package name */
    public final float f13317f;

    /* renamed from: g, reason: collision with root package name */
    public int f13318g;

    /* renamed from: h, reason: collision with root package name */
    public int f13319h;

    /* renamed from: i, reason: collision with root package name */
    public int f13320i;

    /* renamed from: j, reason: collision with root package name */
    public transient a f13321j;

    /* renamed from: k, reason: collision with root package name */
    public transient a f13322k;

    /* renamed from: l, reason: collision with root package name */
    public transient e f13323l;

    /* renamed from: m, reason: collision with root package name */
    public transient e f13324m;

    /* renamed from: n, reason: collision with root package name */
    public transient c f13325n;

    /* renamed from: o, reason: collision with root package name */
    public transient c f13326o;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<V> {

        /* renamed from: a, reason: collision with root package name */
        public long f13328a;

        /* renamed from: b, reason: collision with root package name */
        @d0
        public V f13329b;

        public String toString() {
            return this.f13328a + ContainerUtils.KEY_VALUE_DELIMITER + this.f13329b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends d {
        public c(i iVar) {
            super(iVar);
        }

        @Override // com.badlogic.gdx.utils.i.d
        public /* bridge */ /* synthetic */ void b() {
            super.b();
        }

        public long d() {
            if (!this.f13332a) {
                throw new NoSuchElementException();
            }
            if (!this.f13336e) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            int i11 = this.f13334c;
            long j11 = i11 == -1 ? 0L : this.f13333b.f13313b[i11];
            this.f13335d = i11;
            a();
            return j11;
        }

        public b0 f() {
            b0 b0Var = new b0(true, this.f13333b.f13312a);
            while (this.f13332a) {
                b0Var.a(d());
            }
            return b0Var;
        }

        public b0 g(b0 b0Var) {
            while (this.f13332a) {
                b0Var.a(d());
            }
            return b0Var;
        }

        @Override // com.badlogic.gdx.utils.i.d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d<V> {

        /* renamed from: f, reason: collision with root package name */
        public static final int f13330f = -2;

        /* renamed from: g, reason: collision with root package name */
        public static final int f13331g = -1;

        /* renamed from: a, reason: collision with root package name */
        public boolean f13332a;

        /* renamed from: b, reason: collision with root package name */
        public final i<V> f13333b;

        /* renamed from: c, reason: collision with root package name */
        public int f13334c;

        /* renamed from: d, reason: collision with root package name */
        public int f13335d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f13336e = true;

        public d(i<V> iVar) {
            this.f13333b = iVar;
            b();
        }

        public void a() {
            int i11;
            long[] jArr = this.f13333b.f13313b;
            int length = jArr.length;
            do {
                i11 = this.f13334c + 1;
                this.f13334c = i11;
                if (i11 >= length) {
                    this.f13332a = false;
                    return;
                }
            } while (jArr[i11] == 0);
            this.f13332a = true;
        }

        public void b() {
            this.f13335d = -2;
            this.f13334c = -1;
            if (this.f13333b.f13316e) {
                this.f13332a = true;
            } else {
                a();
            }
        }

        public void remove() {
            int i11 = this.f13335d;
            if (i11 == -1) {
                i<V> iVar = this.f13333b;
                if (iVar.f13316e) {
                    iVar.f13316e = false;
                    iVar.f13315d = null;
                    this.f13335d = -2;
                    i<V> iVar2 = this.f13333b;
                    iVar2.f13312a--;
                }
            }
            if (i11 < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            i<V> iVar3 = this.f13333b;
            long[] jArr = iVar3.f13313b;
            V[] vArr = iVar3.f13314c;
            int i12 = iVar3.f13320i;
            int i13 = i11 + 1;
            while (true) {
                int i14 = i13 & i12;
                long j11 = jArr[i14];
                if (j11 == 0) {
                    break;
                }
                int p11 = this.f13333b.p(j11);
                if (((i14 - p11) & i12) > ((i11 - p11) & i12)) {
                    jArr[i11] = j11;
                    vArr[i11] = vArr[i14];
                    i11 = i14;
                }
                i13 = i14 + 1;
            }
            jArr[i11] = 0;
            vArr[i11] = null;
            if (i11 != this.f13335d) {
                this.f13334c--;
            }
            this.f13335d = -2;
            i<V> iVar22 = this.f13333b;
            iVar22.f13312a--;
        }
    }

    public i() {
        this(51, 0.8f);
    }

    public void a(int i11) {
        int s11 = m.s(i11, this.f13317f);
        if (this.f13313b.length <= s11) {
            clear();
            return;
        }
        this.f13312a = 0;
        this.f13316e = false;
        this.f13315d = null;
        u(s11);
    }

    public boolean b(long j11) {
        return j11 == 0 ? this.f13316e : n(j11) >= 0;
    }

    public void clear() {
        if (this.f13312a == 0) {
            return;
        }
        this.f13312a = 0;
        Arrays.fill(this.f13313b, 0L);
        Arrays.fill(this.f13314c, (Object) null);
        this.f13315d = null;
        this.f13316e = false;
    }

    public boolean d(@d0 Object obj, boolean z11) {
        V[] vArr = this.f13314c;
        if (obj == null) {
            if (this.f13316e && this.f13315d == null) {
                return true;
            }
            long[] jArr = this.f13313b;
            for (int length = vArr.length - 1; length >= 0; length--) {
                if (jArr[length] != 0 && vArr[length] == null) {
                    return true;
                }
            }
            return false;
        }
        if (z11) {
            if (obj == this.f13315d) {
                return true;
            }
            for (int length2 = vArr.length - 1; length2 >= 0; length2--) {
                if (vArr[length2] == obj) {
                    return true;
                }
            }
            return false;
        }
        if (this.f13316e && obj.equals(this.f13315d)) {
            return true;
        }
        for (int length3 = vArr.length - 1; length3 >= 0; length3--) {
            if (obj.equals(vArr[length3])) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (iVar.f13312a != this.f13312a) {
            return false;
        }
        boolean z11 = iVar.f13316e;
        boolean z12 = this.f13316e;
        if (z11 != z12) {
            return false;
        }
        if (z12) {
            V v11 = iVar.f13315d;
            if (v11 == null) {
                if (this.f13315d != null) {
                    return false;
                }
            } else if (!v11.equals(this.f13315d)) {
                return false;
            }
        }
        long[] jArr = this.f13313b;
        V[] vArr = this.f13314c;
        int length = jArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            long j11 = jArr[i11];
            if (j11 != 0) {
                V v12 = vArr[i11];
                if (v12 == null) {
                    if (iVar.l(j11, l.f13379n) != null) {
                        return false;
                    }
                } else if (!v12.equals(iVar.k(j11))) {
                    return false;
                }
            }
        }
        return true;
    }

    public void f(int i11) {
        int s11 = m.s(this.f13312a + i11, this.f13317f);
        if (this.f13313b.length < s11) {
            u(s11);
        }
    }

    public a<V> g() {
        if (a3.k.f1553a) {
            return new a<>(this);
        }
        if (this.f13321j == null) {
            this.f13321j = new a(this);
            this.f13322k = new a(this);
        }
        a aVar = this.f13321j;
        if (aVar.f13336e) {
            this.f13322k.b();
            a<V> aVar2 = this.f13322k;
            aVar2.f13336e = true;
            this.f13321j.f13336e = false;
            return aVar2;
        }
        aVar.b();
        a<V> aVar3 = this.f13321j;
        aVar3.f13336e = true;
        this.f13322k.f13336e = false;
        return aVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean h(@d0 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (iVar.f13312a != this.f13312a) {
            return false;
        }
        boolean z11 = iVar.f13316e;
        boolean z12 = this.f13316e;
        if (z11 != z12) {
            return false;
        }
        if (z12 && this.f13315d != iVar.f13315d) {
            return false;
        }
        long[] jArr = this.f13313b;
        V[] vArr = this.f13314c;
        int length = jArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            long j11 = jArr[i11];
            if (j11 != 0 && vArr[i11] != iVar.l(j11, l.f13379n)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        V v11;
        int i11 = this.f13312a;
        if (this.f13316e && (v11 = this.f13315d) != null) {
            i11 += v11.hashCode();
        }
        long[] jArr = this.f13313b;
        V[] vArr = this.f13314c;
        int length = jArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            long j11 = jArr[i12];
            if (j11 != 0) {
                i11 = (int) (i11 + (j11 * 31));
                V v12 = vArr[i12];
                if (v12 != null) {
                    i11 += v12.hashCode();
                }
            }
        }
        return i11;
    }

    public boolean isEmpty() {
        return this.f13312a == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<b<V>> iterator() {
        return g();
    }

    public long j(@d0 Object obj, boolean z11, long j11) {
        V[] vArr = this.f13314c;
        if (obj == null) {
            if (this.f13316e && this.f13315d == null) {
                return 0L;
            }
            long[] jArr = this.f13313b;
            for (int length = vArr.length - 1; length >= 0; length--) {
                long j12 = jArr[length];
                if (j12 != 0 && vArr[length] == null) {
                    return j12;
                }
            }
        } else if (z11) {
            if (obj == this.f13315d) {
                return 0L;
            }
            for (int length2 = vArr.length - 1; length2 >= 0; length2--) {
                if (vArr[length2] == obj) {
                    return this.f13313b[length2];
                }
            }
        } else {
            if (this.f13316e && obj.equals(this.f13315d)) {
                return 0L;
            }
            for (int length3 = vArr.length - 1; length3 >= 0; length3--) {
                if (obj.equals(vArr[length3])) {
                    return this.f13313b[length3];
                }
            }
        }
        return j11;
    }

    @d0
    public V k(long j11) {
        if (j11 == 0) {
            if (this.f13316e) {
                return this.f13315d;
            }
            return null;
        }
        int n11 = n(j11);
        if (n11 >= 0) {
            return this.f13314c[n11];
        }
        return null;
    }

    public V l(long j11, @d0 V v11) {
        if (j11 != 0) {
            int n11 = n(j11);
            if (n11 >= 0) {
                return this.f13314c[n11];
            }
        } else if (this.f13316e) {
            return this.f13315d;
        }
        return v11;
    }

    public c m() {
        if (a3.k.f1553a) {
            return new c(this);
        }
        if (this.f13325n == null) {
            this.f13325n = new c(this);
            this.f13326o = new c(this);
        }
        c cVar = this.f13325n;
        if (cVar.f13336e) {
            this.f13326o.b();
            c cVar2 = this.f13326o;
            cVar2.f13336e = true;
            this.f13325n.f13336e = false;
            return cVar2;
        }
        cVar.b();
        c cVar3 = this.f13325n;
        cVar3.f13336e = true;
        this.f13326o.f13336e = false;
        return cVar3;
    }

    public final int n(long j11) {
        long[] jArr = this.f13313b;
        int p11 = p(j11);
        while (true) {
            long j12 = jArr[p11];
            if (j12 == 0) {
                return -(p11 + 1);
            }
            if (j12 == j11) {
                return p11;
            }
            p11 = (p11 + 1) & this.f13320i;
        }
    }

    public boolean o() {
        return this.f13312a > 0;
    }

    public int p(long j11) {
        return (int) (((j11 ^ (j11 >>> 32)) * (-7046029254386353131L)) >>> this.f13319h);
    }

    @d0
    public V q(long j11, @d0 V v11) {
        if (j11 == 0) {
            V v12 = this.f13315d;
            this.f13315d = v11;
            if (!this.f13316e) {
                this.f13316e = true;
                this.f13312a++;
            }
            return v12;
        }
        int n11 = n(j11);
        if (n11 >= 0) {
            V[] vArr = this.f13314c;
            V v13 = vArr[n11];
            vArr[n11] = v11;
            return v13;
        }
        int i11 = -(n11 + 1);
        long[] jArr = this.f13313b;
        jArr[i11] = j11;
        this.f13314c[i11] = v11;
        int i12 = this.f13312a + 1;
        this.f13312a = i12;
        if (i12 < this.f13318g) {
            return null;
        }
        u(jArr.length << 1);
        return null;
    }

    public void r(i<? extends V> iVar) {
        f(iVar.f13312a);
        if (iVar.f13316e) {
            q(0L, iVar.f13315d);
        }
        long[] jArr = iVar.f13313b;
        V[] vArr = iVar.f13314c;
        int length = jArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            long j11 = jArr[i11];
            if (j11 != 0) {
                q(j11, vArr[i11]);
            }
        }
    }

    public final void s(long j11, @d0 V v11) {
        long[] jArr = this.f13313b;
        int p11 = p(j11);
        while (jArr[p11] != 0) {
            p11 = (p11 + 1) & this.f13320i;
        }
        jArr[p11] = j11;
        this.f13314c[p11] = v11;
    }

    @d0
    public V t(long j11) {
        if (j11 == 0) {
            if (!this.f13316e) {
                return null;
            }
            this.f13316e = false;
            V v11 = this.f13315d;
            this.f13315d = null;
            this.f13312a--;
            return v11;
        }
        int n11 = n(j11);
        if (n11 < 0) {
            return null;
        }
        long[] jArr = this.f13313b;
        V[] vArr = this.f13314c;
        V v12 = vArr[n11];
        int i11 = this.f13320i;
        int i12 = n11 + 1;
        while (true) {
            int i13 = i12 & i11;
            long j12 = jArr[i13];
            if (j12 == 0) {
                jArr[n11] = 0;
                vArr[n11] = null;
                this.f13312a--;
                return v12;
            }
            int p11 = p(j12);
            if (((i13 - p11) & i11) > ((n11 - p11) & i11)) {
                jArr[n11] = j12;
                vArr[n11] = vArr[i13];
                n11 = i13;
            }
            i12 = i13 + 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0042 -> B:9:0x0043). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            int r0 = r10.f13312a
            if (r0 != 0) goto L7
            java.lang.String r0 = "[]"
            return r0
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 32
            r0.<init>(r1)
            r1 = 91
            r0.append(r1)
            long[] r1 = r10.f13313b
            V[] r2 = r10.f13314c
            int r3 = r1.length
            boolean r4 = r10.f13316e
            r5 = 61
            r6 = 0
            if (r4 == 0) goto L2b
            java.lang.String r4 = "0="
            r0.append(r4)
            V r4 = r10.f13315d
            r0.append(r4)
            goto L43
        L2b:
            int r4 = r3 + (-1)
            if (r3 <= 0) goto L42
            r8 = r1[r4]
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 != 0) goto L37
            r3 = r4
            goto L2b
        L37:
            r0.append(r8)
            r0.append(r5)
            r3 = r2[r4]
            r0.append(r3)
        L42:
            r3 = r4
        L43:
            int r4 = r3 + (-1)
            if (r3 <= 0) goto L5f
            r8 = r1[r4]
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 != 0) goto L4e
            goto L42
        L4e:
            java.lang.String r3 = ", "
            r0.append(r3)
            r0.append(r8)
            r0.append(r5)
            r3 = r2[r4]
            r0.append(r3)
            goto L42
        L5f:
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.i.toString():java.lang.String");
    }

    public final void u(int i11) {
        int length = this.f13313b.length;
        this.f13318g = (int) (i11 * this.f13317f);
        int i12 = i11 - 1;
        this.f13320i = i12;
        this.f13319h = Long.numberOfLeadingZeros(i12);
        long[] jArr = this.f13313b;
        V[] vArr = this.f13314c;
        this.f13313b = new long[i11];
        this.f13314c = (V[]) new Object[i11];
        if (this.f13312a > 0) {
            for (int i13 = 0; i13 < length; i13++) {
                long j11 = jArr[i13];
                if (j11 != 0) {
                    s(j11, vArr[i13]);
                }
            }
        }
    }

    public void v(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("maximumCapacity must be >= 0: " + i11);
        }
        int s11 = m.s(i11, this.f13317f);
        if (this.f13313b.length > s11) {
            u(s11);
        }
    }

    public e<V> w() {
        if (a3.k.f1553a) {
            return new e<>(this);
        }
        if (this.f13323l == null) {
            this.f13323l = new e(this);
            this.f13324m = new e(this);
        }
        e eVar = this.f13323l;
        if (eVar.f13336e) {
            this.f13324m.b();
            e<V> eVar2 = this.f13324m;
            eVar2.f13336e = true;
            this.f13323l.f13336e = false;
            return eVar2;
        }
        eVar.b();
        e<V> eVar3 = this.f13323l;
        eVar3.f13336e = true;
        this.f13324m.f13336e = false;
        return eVar3;
    }

    public i(int i11) {
        this(i11, 0.8f);
    }

    public i(int i11, float f11) {
        if (f11 > 0.0f && f11 < 1.0f) {
            this.f13317f = f11;
            int s11 = m.s(i11, f11);
            this.f13318g = (int) (s11 * f11);
            int i12 = s11 - 1;
            this.f13320i = i12;
            this.f13319h = Long.numberOfLeadingZeros(i12);
            this.f13313b = new long[s11];
            this.f13314c = (V[]) new Object[s11];
            return;
        }
        throw new IllegalArgumentException("loadFactor must be > 0 and < 1: " + f11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i(com.badlogic.gdx.utils.i<? extends V> r5) {
        /*
            r4 = this;
            long[] r0 = r5.f13313b
            int r0 = r0.length
            float r0 = (float) r0
            float r1 = r5.f13317f
            float r0 = r0 * r1
            int r0 = (int) r0
            r4.<init>(r0, r1)
            long[] r0 = r5.f13313b
            long[] r1 = r4.f13313b
            int r2 = r0.length
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            V[] r0 = r5.f13314c
            V[] r1 = r4.f13314c
            int r2 = r0.length
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            int r0 = r5.f13312a
            r4.f13312a = r0
            V r0 = r5.f13315d
            r4.f13315d = r0
            boolean r5 = r5.f13316e
            r4.f13316e = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.i.<init>(com.badlogic.gdx.utils.i):void");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<V> extends d<V> implements Iterable<b<V>>, Iterator<b<V>> {

        /* renamed from: h, reason: collision with root package name */
        public final b<V> f13327h;

        public a(i iVar) {
            super(iVar);
            this.f13327h = new b<>();
        }

        @Override // com.badlogic.gdx.utils.i.d
        public /* bridge */ /* synthetic */ void b() {
            super.b();
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b<V> next() {
            if (!this.f13332a) {
                throw new NoSuchElementException();
            }
            if (!this.f13336e) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            i<V> iVar = this.f13333b;
            long[] jArr = iVar.f13313b;
            int i11 = this.f13334c;
            if (i11 == -1) {
                b<V> bVar = this.f13327h;
                bVar.f13328a = 0L;
                bVar.f13329b = iVar.f13315d;
            } else {
                b<V> bVar2 = this.f13327h;
                bVar2.f13328a = jArr[i11];
                bVar2.f13329b = iVar.f13314c[i11];
            }
            this.f13335d = i11;
            a();
            return this.f13327h;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f13336e) {
                return this.f13332a;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // com.badlogic.gdx.utils.i.d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // java.lang.Iterable
        public Iterator<b<V>> iterator() {
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e<V> extends d<V> implements Iterable<V>, Iterator<V> {
        public e(i<V> iVar) {
            super(iVar);
        }

        @Override // com.badlogic.gdx.utils.i.d
        public /* bridge */ /* synthetic */ void b() {
            super.b();
        }

        public com.badlogic.gdx.utils.a<V> d() {
            com.badlogic.gdx.utils.a<V> aVar = new com.badlogic.gdx.utils.a<>(true, this.f13333b.f13312a);
            while (this.f13332a) {
                aVar.a(next());
            }
            return aVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f13336e) {
                return this.f13332a;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // java.util.Iterator
        @d0
        public V next() {
            if (!this.f13332a) {
                throw new NoSuchElementException();
            }
            if (!this.f13336e) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            int i11 = this.f13334c;
            V v11 = i11 == -1 ? this.f13333b.f13315d : this.f13333b.f13314c[i11];
            this.f13335d = i11;
            a();
            return v11;
        }

        @Override // com.badlogic.gdx.utils.i.d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // java.lang.Iterable
        public Iterator<V> iterator() {
            return this;
        }
    }
}
