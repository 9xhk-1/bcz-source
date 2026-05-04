package com.google.common.collect;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true, serializable = true)
/* loaded from: classes7.dex */
public class r7<K> extends q7<K> {

    /* renamed from: r, reason: collision with root package name */
    public static final int f33812r = -2;

    /* renamed from: o, reason: collision with root package name */
    @go.e
    public transient long[] f33813o;

    /* renamed from: p, reason: collision with root package name */
    public transient int f33814p;

    /* renamed from: q, reason: collision with root package name */
    public transient int f33815q;

    public r7() {
        this(3);
    }

    public static <K> r7<K> F() {
        return new r7<>();
    }

    public static <K> r7<K> G(int expectedSize) {
        return new r7<>(expectedSize);
    }

    public final int H(int entry) {
        return (int) (this.f33813o[entry] >>> 32);
    }

    public final int I(int entry) {
        return (int) this.f33813o[entry];
    }

    public final void J(int entry, int pred) {
        long[] jArr = this.f33813o;
        jArr[entry] = (jArr[entry] & 4294967295L) | (pred << 32);
    }

    public final void K(int pred, int succ) {
        if (pred == -2) {
            this.f33814p = succ;
        } else {
            L(pred, succ);
        }
        if (succ == -2) {
            this.f33815q = pred;
        } else {
            J(succ, pred);
        }
    }

    public final void L(int entry, int succ) {
        long[] jArr = this.f33813o;
        jArr[entry] = (jArr[entry] & q7.f33754l) | (succ & 4294967295L);
    }

    @Override // com.google.common.collect.q7
    public void a() {
        super.a();
        this.f33814p = -2;
        this.f33815q = -2;
    }

    @Override // com.google.common.collect.q7
    public int f() {
        int i11 = this.f33814p;
        if (i11 == -2) {
            return -1;
        }
        return i11;
    }

    @Override // com.google.common.collect.q7
    public void o(int expectedSize, float loadFactor) {
        super.o(expectedSize, loadFactor);
        this.f33814p = -2;
        this.f33815q = -2;
        long[] jArr = new long[expectedSize];
        this.f33813o = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // com.google.common.collect.q7
    public void p(int entryIndex, @t7 K key, int value, int hash) {
        super.p(entryIndex, key, value, hash);
        K(this.f33815q, entryIndex);
        K(entryIndex, -2);
    }

    @Override // com.google.common.collect.q7
    public void q(int dstIndex) {
        int D = D() - 1;
        K(H(dstIndex), I(dstIndex));
        if (dstIndex < D) {
            K(H(D), dstIndex);
            K(dstIndex, I(D));
        }
        super.q(dstIndex);
    }

    @Override // com.google.common.collect.q7
    public int t(int index) {
        int I = I(index);
        if (I == -2) {
            return -1;
        }
        return I;
    }

    @Override // com.google.common.collect.q7
    public int u(int oldNextIndex, int removedIndex) {
        return oldNextIndex == D() ? removedIndex : oldNextIndex;
    }

    @Override // com.google.common.collect.q7
    public void z(int newCapacity) {
        super.z(newCapacity);
        long[] jArr = this.f33813o;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, newCapacity);
        this.f33813o = copyOf;
        Arrays.fill(copyOf, length, newCapacity, -1L);
    }

    public r7(int expectedSize) {
        this(expectedSize, 1.0f);
    }

    public r7(int expectedSize, float loadFactor) {
        super(expectedSize, loadFactor);
    }

    public r7(q7<K> map) {
        o(map.D(), 1.0f);
        int f11 = map.f();
        while (f11 != -1) {
            v(map.j(f11), map.l(f11));
            f11 = map.t(f11);
        }
    }
}
