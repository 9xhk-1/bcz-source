package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.j7;
import com.google.common.collect.k7;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true, serializable = true)
/* loaded from: classes7.dex */
public class q7<K> {

    /* renamed from: i, reason: collision with root package name */
    public static final int f33751i = 1073741824;

    /* renamed from: j, reason: collision with root package name */
    public static final float f33752j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public static final long f33753k = 4294967295L;

    /* renamed from: l, reason: collision with root package name */
    public static final long f33754l = -4294967296L;

    /* renamed from: m, reason: collision with root package name */
    public static final int f33755m = 3;

    /* renamed from: n, reason: collision with root package name */
    public static final int f33756n = -1;

    /* renamed from: a, reason: collision with root package name */
    public transient Object[] f33757a;

    /* renamed from: b, reason: collision with root package name */
    public transient int[] f33758b;

    /* renamed from: c, reason: collision with root package name */
    public transient int f33759c;

    /* renamed from: d, reason: collision with root package name */
    public transient int f33760d;

    /* renamed from: e, reason: collision with root package name */
    public transient int[] f33761e;

    /* renamed from: f, reason: collision with root package name */
    @go.e
    public transient long[] f33762f;

    /* renamed from: g, reason: collision with root package name */
    public transient float f33763g;

    /* renamed from: h, reason: collision with root package name */
    public transient int f33764h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends k7.f<K> {

        /* renamed from: a, reason: collision with root package name */
        @t7
        public final K f33765a;

        /* renamed from: b, reason: collision with root package name */
        public int f33766b;

        public a(int i11) {
            this.f33765a = (K) q7.this.f33757a[i11];
            this.f33766b = i11;
        }

        @uo.a
        public int a(int count) {
            b();
            int i11 = this.f33766b;
            if (i11 == -1) {
                q7.this.v(this.f33765a, count);
                return 0;
            }
            int[] iArr = q7.this.f33758b;
            int i12 = iArr[i11];
            iArr[i11] = count;
            return i12;
        }

        public void b() {
            int i11 = this.f33766b;
            if (i11 == -1 || i11 >= q7.this.D() || !ho.d0.a(this.f33765a, q7.this.f33757a[this.f33766b])) {
                this.f33766b = q7.this.n(this.f33765a);
            }
        }

        @Override // com.google.common.collect.j7.a
        @t7
        public K e() {
            return this.f33765a;
        }

        @Override // com.google.common.collect.j7.a
        public int getCount() {
            b();
            int i11 = this.f33766b;
            if (i11 == -1) {
                return 0;
            }
            return q7.this.f33758b[i11];
        }
    }

    public q7() {
        o(3, 1.0f);
    }

    public static long E(long entry, int newNext) {
        return (entry & f33754l) | (4294967295L & newNext);
    }

    public static <K> q7<K> c() {
        return new q7<>();
    }

    public static <K> q7<K> d(int expectedSize) {
        return new q7<>(expectedSize);
    }

    public static int i(long entry) {
        return (int) (entry >>> 32);
    }

    public static int k(long entry) {
        return (int) entry;
    }

    public static long[] r(int size) {
        long[] jArr = new long[size];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    public static int[] s(int size) {
        int[] iArr = new int[size];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public final void A(int newSize) {
        int length = this.f33762f.length;
        if (newSize > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            }
            if (max != length) {
                z(max);
            }
        }
    }

    public final void B(int newCapacity) {
        if (this.f33761e.length >= 1073741824) {
            this.f33764h = Integer.MAX_VALUE;
            return;
        }
        int i11 = ((int) (newCapacity * this.f33763g)) + 1;
        int[] s11 = s(newCapacity);
        long[] jArr = this.f33762f;
        int length = s11.length - 1;
        for (int i12 = 0; i12 < this.f33759c; i12++) {
            int i13 = i(jArr[i12]);
            int i14 = i13 & length;
            int i15 = s11[i14];
            s11[i14] = i12;
            jArr[i12] = (i13 << 32) | (i15 & 4294967295L);
        }
        this.f33764h = i11;
        this.f33761e = s11;
    }

    public void C(int index, int newValue) {
        Preconditions.checkElementIndex(index, this.f33759c);
        this.f33758b[index] = newValue;
    }

    public int D() {
        return this.f33759c;
    }

    public void a() {
        this.f33760d++;
        Arrays.fill(this.f33757a, 0, this.f33759c, (Object) null);
        Arrays.fill(this.f33758b, 0, this.f33759c, 0);
        Arrays.fill(this.f33761e, -1);
        Arrays.fill(this.f33762f, -1L);
        this.f33759c = 0;
    }

    public boolean b(@CheckForNull Object key) {
        return n(key) != -1;
    }

    public void e(int minCapacity) {
        if (minCapacity > this.f33762f.length) {
            z(minCapacity);
        }
        if (minCapacity >= this.f33764h) {
            B(Math.max(2, Integer.highestOneBit(minCapacity - 1) << 1));
        }
    }

    public int f() {
        return this.f33759c == 0 ? -1 : 0;
    }

    public int g(@CheckForNull Object key) {
        int n11 = n(key);
        if (n11 == -1) {
            return 0;
        }
        return this.f33758b[n11];
    }

    public j7.a<K> h(int index) {
        Preconditions.checkElementIndex(index, this.f33759c);
        return new a(index);
    }

    @t7
    public K j(int i11) {
        Preconditions.checkElementIndex(i11, this.f33759c);
        return (K) this.f33757a[i11];
    }

    public int l(int index) {
        Preconditions.checkElementIndex(index, this.f33759c);
        return this.f33758b[index];
    }

    public final int m() {
        return this.f33761e.length - 1;
    }

    public int n(@CheckForNull Object key) {
        int d11 = o5.d(key);
        int i11 = this.f33761e[m() & d11];
        while (i11 != -1) {
            long j11 = this.f33762f[i11];
            if (i(j11) == d11 && ho.d0.a(key, this.f33757a[i11])) {
                return i11;
            }
            i11 = k(j11);
        }
        return -1;
    }

    public void o(int expectedSize, float loadFactor) {
        Preconditions.checkArgument(expectedSize >= 0, "Initial capacity must be non-negative");
        Preconditions.checkArgument(loadFactor > 0.0f, "Illegal load factor");
        int a11 = o5.a(expectedSize, loadFactor);
        this.f33761e = s(a11);
        this.f33763g = loadFactor;
        this.f33757a = new Object[expectedSize];
        this.f33758b = new int[expectedSize];
        this.f33762f = r(expectedSize);
        this.f33764h = Math.max(1, (int) (a11 * loadFactor));
    }

    public void p(int entryIndex, @t7 K key, int value, int hash) {
        this.f33762f[entryIndex] = (hash << 32) | 4294967295L;
        this.f33757a[entryIndex] = key;
        this.f33758b[entryIndex] = value;
    }

    public void q(int dstIndex) {
        int D = D() - 1;
        if (dstIndex >= D) {
            this.f33757a[dstIndex] = null;
            this.f33758b[dstIndex] = 0;
            this.f33762f[dstIndex] = -1;
            return;
        }
        Object[] objArr = this.f33757a;
        objArr[dstIndex] = objArr[D];
        int[] iArr = this.f33758b;
        iArr[dstIndex] = iArr[D];
        objArr[D] = null;
        iArr[D] = 0;
        long[] jArr = this.f33762f;
        long j11 = jArr[D];
        jArr[dstIndex] = j11;
        jArr[D] = -1;
        int i11 = i(j11) & m();
        int[] iArr2 = this.f33761e;
        int i12 = iArr2[i11];
        if (i12 == D) {
            iArr2[i11] = dstIndex;
            return;
        }
        while (true) {
            long j12 = this.f33762f[i12];
            int k11 = k(j12);
            if (k11 == D) {
                this.f33762f[i12] = E(j12, dstIndex);
                return;
            }
            i12 = k11;
        }
    }

    public int t(int index) {
        int i11 = index + 1;
        if (i11 < this.f33759c) {
            return i11;
        }
        return -1;
    }

    public int u(int oldNextIndex, int removedIndex) {
        return oldNextIndex - 1;
    }

    @uo.a
    public int v(@t7 K key, int value) {
        x2.d(value, "count");
        long[] jArr = this.f33762f;
        Object[] objArr = this.f33757a;
        int[] iArr = this.f33758b;
        int d11 = o5.d(key);
        int m11 = m() & d11;
        int i11 = this.f33759c;
        int[] iArr2 = this.f33761e;
        int i12 = iArr2[m11];
        if (i12 == -1) {
            iArr2[m11] = i11;
        } else {
            while (true) {
                long j11 = jArr[i12];
                if (i(j11) == d11 && ho.d0.a(key, objArr[i12])) {
                    int i13 = iArr[i12];
                    iArr[i12] = value;
                    return i13;
                }
                int k11 = k(j11);
                if (k11 == -1) {
                    jArr[i12] = E(j11, i11);
                    break;
                }
                i12 = k11;
            }
        }
        if (i11 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i14 = i11 + 1;
        A(i14);
        p(i11, key, value, d11);
        this.f33759c = i14;
        if (i11 >= this.f33764h) {
            B(this.f33761e.length * 2);
        }
        this.f33760d++;
        return 0;
    }

    @uo.a
    public int w(@CheckForNull Object key) {
        return x(key, o5.d(key));
    }

    public final int x(@CheckForNull Object key, int hash) {
        int m11 = m() & hash;
        int i11 = this.f33761e[m11];
        if (i11 == -1) {
            return 0;
        }
        int i12 = -1;
        while (true) {
            if (i(this.f33762f[i11]) == hash && ho.d0.a(key, this.f33757a[i11])) {
                int i13 = this.f33758b[i11];
                if (i12 == -1) {
                    this.f33761e[m11] = k(this.f33762f[i11]);
                } else {
                    long[] jArr = this.f33762f;
                    jArr[i12] = E(jArr[i12], k(jArr[i11]));
                }
                q(i11);
                this.f33759c--;
                this.f33760d++;
                return i13;
            }
            int k11 = k(this.f33762f[i11]);
            if (k11 == -1) {
                return 0;
            }
            i12 = i11;
            i11 = k11;
        }
    }

    @uo.a
    public int y(int entryIndex) {
        return x(this.f33757a[entryIndex], i(this.f33762f[entryIndex]));
    }

    public void z(int newCapacity) {
        this.f33757a = Arrays.copyOf(this.f33757a, newCapacity);
        this.f33758b = Arrays.copyOf(this.f33758b, newCapacity);
        long[] jArr = this.f33762f;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, newCapacity);
        if (newCapacity > length) {
            Arrays.fill(copyOf, length, newCapacity, -1L);
        }
        this.f33762f = copyOf;
    }

    public q7(q7<? extends K> map) {
        o(map.D(), 1.0f);
        int f11 = map.f();
        while (f11 != -1) {
            v(map.j(f11), map.l(f11));
            f11 = map.t(f11);
        }
    }

    public q7(int capacity) {
        this(capacity, 1.0f);
    }

    public q7(int expectedSize, float loadFactor) {
        o(expectedSize, loadFactor);
    }
}
