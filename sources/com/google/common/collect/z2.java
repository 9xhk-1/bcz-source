package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.c
/* loaded from: classes7.dex */
public class z2<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f34123j = new Object();

    /* renamed from: k, reason: collision with root package name */
    @go.e
    public static final double f34124k = 0.001d;

    /* renamed from: l, reason: collision with root package name */
    public static final int f34125l = 9;

    /* renamed from: a, reason: collision with root package name */
    @CheckForNull
    public transient Object f34126a;

    /* renamed from: b, reason: collision with root package name */
    @CheckForNull
    @go.e
    public transient int[] f34127b;

    /* renamed from: c, reason: collision with root package name */
    @CheckForNull
    @go.e
    public transient Object[] f34128c;

    /* renamed from: d, reason: collision with root package name */
    @CheckForNull
    @go.e
    public transient Object[] f34129d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f34130e;

    /* renamed from: f, reason: collision with root package name */
    public transient int f34131f;

    /* renamed from: g, reason: collision with root package name */
    @CheckForNull
    @vo.b
    public transient Set<K> f34132g;

    /* renamed from: h, reason: collision with root package name */
    @CheckForNull
    @vo.b
    public transient Set<Map.Entry<K, V>> f34133h;

    /* renamed from: i, reason: collision with root package name */
    @CheckForNull
    @vo.b
    public transient Collection<V> f34134i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends z2<K, V>.e<K> {
        public a() {
            super(z2.this, null);
        }

        @Override // com.google.common.collect.z2.e
        @t7
        public K b(int i11) {
            return (K) z2.this.N(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends z2<K, V>.e<Map.Entry<K, V>> {
        public b() {
            super(z2.this, null);
        }

        @Override // com.google.common.collect.z2.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> b(int entry) {
            return new g(entry);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends z2<K, V>.e<V> {
        public c() {
            super(z2.this, null);
        }

        @Override // com.google.common.collect.z2.e
        @t7
        public V b(int i11) {
            return (V) z2.this.i0(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends AbstractSet<Map.Entry<K, V>> {
        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            z2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object o11) {
            Map<K, V> C = z2.this.C();
            if (C != null) {
                return C.entrySet().contains(o11);
            }
            if (o11 instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) o11;
                int K = z2.this.K(entry.getKey());
                if (K != -1 && ho.d0.a(z2.this.i0(K), entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return z2.this.F();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object o11) {
            int I;
            int f11;
            Map<K, V> C = z2.this.C();
            if (C != null) {
                return C.entrySet().remove(o11);
            }
            if (!(o11 instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) o11;
            if (z2.this.Q() || (f11 = b3.f(entry.getKey(), entry.getValue(), (I = z2.this.I()), z2.this.U(), z2.this.S(), z2.this.T(), z2.this.V())) == -1) {
                return false;
            }
            z2.this.P(f11, I);
            z2.i(z2.this);
            z2.this.J();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return z2.this.size();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f extends AbstractSet<K> {
        public f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            z2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object o11) {
            return z2.this.containsKey(o11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return z2.this.O();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object o11) {
            Map<K, V> C = z2.this.C();
            return C != null ? C.keySet().remove(o11) : z2.this.R(o11) != z2.f34123j;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return z2.this.size();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class g extends com.google.common.collect.g<K, V> {

        /* renamed from: a, reason: collision with root package name */
        @t7
        public final K f34144a;

        /* renamed from: b, reason: collision with root package name */
        public int f34145b;

        public g(int i11) {
            this.f34144a = (K) z2.this.N(i11);
            this.f34145b = i11;
        }

        public final void c() {
            int i11 = this.f34145b;
            if (i11 == -1 || i11 >= z2.this.size() || !ho.d0.a(this.f34144a, z2.this.N(this.f34145b))) {
                this.f34145b = z2.this.K(this.f34144a);
            }
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @t7
        public K getKey() {
            return this.f34144a;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @t7
        public V getValue() {
            Map<K, V> C = z2.this.C();
            if (C != null) {
                return (V) m7.a(C.get(this.f34144a));
            }
            c();
            int i11 = this.f34145b;
            return i11 == -1 ? (V) m7.b() : (V) z2.this.i0(i11);
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @t7
        public V setValue(@t7 V v11) {
            Map<K, V> C = z2.this.C();
            if (C != null) {
                return (V) m7.a(C.put(this.f34144a, v11));
            }
            c();
            int i11 = this.f34145b;
            if (i11 == -1) {
                z2.this.put(this.f34144a, v11);
                return (V) m7.b();
            }
            V v12 = (V) z2.this.i0(i11);
            z2.this.e0(this.f34145b, v11);
            return v12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h extends AbstractCollection<V> {
        public h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            z2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return z2.this.j0();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return z2.this.size();
        }
    }

    public z2() {
        L(3);
    }

    public static <K, V> z2<K, V> B(int expectedSize) {
        return new z2<>(expectedSize);
    }

    public static /* synthetic */ int i(z2 z2Var) {
        int i11 = z2Var.f34131f;
        z2Var.f34131f = i11 - 1;
        return i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @go.d
    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        int readInt = stream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Invalid size: " + readInt);
        }
        L(readInt);
        for (int i11 = 0; i11 < readInt; i11++) {
            put(stream.readObject(), stream.readObject());
        }
    }

    public static <K, V> z2<K, V> w() {
        return new z2<>();
    }

    @go.d
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeInt(size());
        Iterator<Map.Entry<K, V>> F = F();
        while (F.hasNext()) {
            Map.Entry<K, V> next = F.next();
            stream.writeObject(next.getKey());
            stream.writeObject(next.getValue());
        }
    }

    public Collection<V> A() {
        return new h();
    }

    @CheckForNull
    @go.e
    public Map<K, V> C() {
        Object obj = this.f34126a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int D(int i11) {
        return S()[i11];
    }

    public Iterator<Map.Entry<K, V>> F() {
        Map<K, V> C = C();
        return C != null ? C.entrySet().iterator() : new b();
    }

    public int G() {
        return isEmpty() ? -1 : 0;
    }

    public int H(int entryIndex) {
        int i11 = entryIndex + 1;
        if (i11 < this.f34131f) {
            return i11;
        }
        return -1;
    }

    public final int I() {
        return (1 << (this.f34130e & 31)) - 1;
    }

    public void J() {
        this.f34130e += 32;
    }

    public final int K(@CheckForNull Object key) {
        if (Q()) {
            return -1;
        }
        int d11 = o5.d(key);
        int I = I();
        int h11 = b3.h(U(), d11 & I);
        if (h11 == 0) {
            return -1;
        }
        int b11 = b3.b(d11, I);
        do {
            int i11 = h11 - 1;
            int D = D(i11);
            if (b3.b(D, I) == b11 && ho.d0.a(key, N(i11))) {
                return i11;
            }
            h11 = b3.c(D, I);
        } while (h11 != 0);
        return -1;
    }

    public void L(int expectedSize) {
        Preconditions.checkArgument(expectedSize >= 0, "Expected size must be >= 0");
        this.f34130e = ro.i.h(expectedSize, 1, 1073741823);
    }

    public void M(int entryIndex, @t7 K key, @t7 V value, int hash, int mask) {
        a0(entryIndex, b3.d(hash, 0, mask));
        d0(entryIndex, key);
        e0(entryIndex, value);
    }

    public final K N(int i11) {
        return (K) T()[i11];
    }

    public Iterator<K> O() {
        Map<K, V> C = C();
        return C != null ? C.keySet().iterator() : new a();
    }

    public void P(int dstIndex, int mask) {
        Object U = U();
        int[] S = S();
        Object[] T = T();
        Object[] V = V();
        int size = size();
        int i11 = size - 1;
        if (dstIndex >= i11) {
            T[dstIndex] = null;
            V[dstIndex] = null;
            S[dstIndex] = 0;
            return;
        }
        Object obj = T[i11];
        T[dstIndex] = obj;
        V[dstIndex] = V[i11];
        T[i11] = null;
        V[i11] = null;
        S[dstIndex] = S[i11];
        S[i11] = 0;
        int d11 = o5.d(obj) & mask;
        int h11 = b3.h(U, d11);
        if (h11 == size) {
            b3.i(U, d11, dstIndex + 1);
            return;
        }
        while (true) {
            int i12 = h11 - 1;
            int i13 = S[i12];
            int c11 = b3.c(i13, mask);
            if (c11 == size) {
                S[i12] = b3.d(i13, dstIndex + 1, mask);
                return;
            }
            h11 = c11;
        }
    }

    public boolean Q() {
        return this.f34126a == null;
    }

    public final Object R(@CheckForNull Object key) {
        if (Q()) {
            return f34123j;
        }
        int I = I();
        int f11 = b3.f(key, null, I, U(), S(), T(), null);
        if (f11 == -1) {
            return f34123j;
        }
        V i02 = i0(f11);
        P(f11, I);
        this.f34131f--;
        J();
        return i02;
    }

    public final int[] S() {
        int[] iArr = this.f34127b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] T() {
        Object[] objArr = this.f34128c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object U() {
        Object obj = this.f34126a;
        Objects.requireNonNull(obj);
        return obj;
    }

    public final Object[] V() {
        Object[] objArr = this.f34129d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public void W(int newCapacity) {
        this.f34127b = Arrays.copyOf(S(), newCapacity);
        this.f34128c = Arrays.copyOf(T(), newCapacity);
        this.f34129d = Arrays.copyOf(V(), newCapacity);
    }

    public final void X(int newSize) {
        int min;
        int length = S().length;
        if (newSize <= length || (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        W(min);
    }

    @uo.a
    public final int Y(int oldMask, int newCapacity, int targetHash, int targetEntryIndex) {
        Object a11 = b3.a(newCapacity);
        int i11 = newCapacity - 1;
        if (targetEntryIndex != 0) {
            b3.i(a11, targetHash & i11, targetEntryIndex + 1);
        }
        Object U = U();
        int[] S = S();
        for (int i12 = 0; i12 <= oldMask; i12++) {
            int h11 = b3.h(U, i12);
            while (h11 != 0) {
                int i13 = h11 - 1;
                int i14 = S[i13];
                int b11 = b3.b(i14, oldMask) | i12;
                int i15 = b11 & i11;
                int h12 = b3.h(a11, i15);
                b3.i(a11, i15, h11);
                S[i13] = b3.d(b11, h12, i11);
                h11 = b3.c(i14, oldMask);
            }
        }
        this.f34126a = a11;
        b0(i11);
        return i11;
    }

    public final void a0(int i11, int value) {
        S()[i11] = value;
    }

    public final void b0(int mask) {
        this.f34130e = b3.d(this.f34130e, 32 - Integer.numberOfLeadingZeros(mask), 31);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (Q()) {
            return;
        }
        J();
        Map<K, V> C = C();
        if (C != null) {
            this.f34130e = ro.i.h(size(), 3, 1073741823);
            C.clear();
            this.f34126a = null;
            this.f34131f = 0;
            return;
        }
        Arrays.fill(T(), 0, this.f34131f, (Object) null);
        Arrays.fill(V(), 0, this.f34131f, (Object) null);
        b3.g(U());
        Arrays.fill(S(), 0, this.f34131f, 0);
        this.f34131f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@CheckForNull Object key) {
        Map<K, V> C = C();
        return C != null ? C.containsKey(key) : K(key) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@CheckForNull Object value) {
        Map<K, V> C = C();
        if (C != null) {
            return C.containsValue(value);
        }
        for (int i11 = 0; i11 < this.f34131f; i11++) {
            if (ho.d0.a(value, i0(i11))) {
                return true;
            }
        }
        return false;
    }

    public final void d0(int i11, K key) {
        T()[i11] = key;
    }

    public final void e0(int i11, V value) {
        V()[i11] = value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f34133h;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> x11 = x();
        this.f34133h = x11;
        return x11;
    }

    public void g0() {
        if (Q()) {
            return;
        }
        Map<K, V> C = C();
        if (C != null) {
            Map<K, V> y11 = y(size());
            y11.putAll(C);
            this.f34126a = y11;
            return;
        }
        int i11 = this.f34131f;
        if (i11 < S().length) {
            W(i11);
        }
        int j11 = b3.j(i11);
        int I = I();
        if (j11 < I) {
            Y(I, j11, 0, 0);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object key) {
        Map<K, V> C = C();
        if (C != null) {
            return C.get(key);
        }
        int K = K(key);
        if (K == -1) {
            return null;
        }
        s(K);
        return i0(K);
    }

    public final V i0(int i11) {
        return (V) V()[i11];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public Iterator<V> j0() {
        Map<K, V> C = C();
        return C != null ? C.values().iterator() : new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f34132g;
        if (set != null) {
            return set;
        }
        Set<K> z11 = z();
        this.f34132g = z11;
        return z11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    @uo.a
    public V put(@t7 K k11, @t7 V v11) {
        if (Q()) {
            u();
        }
        Map<K, V> C = C();
        if (C != null) {
            return C.put(k11, v11);
        }
        int[] S = S();
        Object[] T = T();
        Object[] V = V();
        int i11 = this.f34131f;
        int i12 = i11 + 1;
        int d11 = o5.d(k11);
        int I = I();
        int i13 = d11 & I;
        int h11 = b3.h(U(), i13);
        if (h11 != 0) {
            int b11 = b3.b(d11, I);
            int i14 = 0;
            while (true) {
                int i15 = h11 - 1;
                int i16 = S[i15];
                if (b3.b(i16, I) == b11 && ho.d0.a(k11, T[i15])) {
                    V v12 = (V) V[i15];
                    V[i15] = v11;
                    s(i15);
                    return v12;
                }
                int c11 = b3.c(i16, I);
                i14++;
                if (c11 != 0) {
                    k11 = k11;
                    v11 = v11;
                    h11 = c11;
                } else {
                    if (i14 >= 9) {
                        return v().put(k11, v11);
                    }
                    if (i12 > I) {
                        I = Y(I, b3.e(I), d11, i11);
                    } else {
                        S[i15] = b3.d(i16, i12, I);
                    }
                }
            }
        } else if (i12 > I) {
            I = Y(I, b3.e(I), d11, i11);
        } else {
            b3.i(U(), i13, i12);
        }
        int i17 = I;
        X(i12);
        M(i11, k11, v11, d11, i17);
        this.f34131f = i12;
        J();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    @uo.a
    public V remove(@CheckForNull Object obj) {
        Map<K, V> C = C();
        if (C != null) {
            return C.remove(obj);
        }
        V v11 = (V) R(obj);
        if (v11 == f34123j) {
            return null;
        }
        return v11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> C = C();
        return C != null ? C.size() : this.f34131f;
    }

    public int t(int indexBeforeRemove, int indexRemoved) {
        return indexBeforeRemove - 1;
    }

    @uo.a
    public int u() {
        Preconditions.checkState(Q(), "Arrays already allocated");
        int i11 = this.f34130e;
        int j11 = b3.j(i11);
        this.f34126a = b3.a(j11);
        b0(j11 - 1);
        this.f34127b = new int[i11];
        this.f34128c = new Object[i11];
        this.f34129d = new Object[i11];
        return i11;
    }

    @uo.a
    public Map<K, V> v() {
        Map<K, V> y11 = y(I() + 1);
        int G = G();
        while (G >= 0) {
            y11.put(N(G), i0(G));
            G = H(G);
        }
        this.f34126a = y11;
        this.f34127b = null;
        this.f34128c = null;
        this.f34129d = null;
        J();
        return y11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f34134i;
        if (collection != null) {
            return collection;
        }
        Collection<V> A = A();
        this.f34134i = A;
        return A;
    }

    public Set<Map.Entry<K, V>> x() {
        return new d();
    }

    public Map<K, V> y(int tableSize) {
        return new LinkedHashMap(tableSize, 1.0f);
    }

    public Set<K> z() {
        return new f();
    }

    public z2(int expectedSize) {
        L(expectedSize);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public abstract class e<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        public int f34139a;

        /* renamed from: b, reason: collision with root package name */
        public int f34140b;

        /* renamed from: c, reason: collision with root package name */
        public int f34141c;

        public e() {
            this.f34139a = z2.this.f34130e;
            this.f34140b = z2.this.G();
            this.f34141c = -1;
        }

        public final void a() {
            if (z2.this.f34130e != this.f34139a) {
                throw new ConcurrentModificationException();
            }
        }

        @t7
        public abstract T b(int entry);

        public void c() {
            this.f34139a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f34140b >= 0;
        }

        @Override // java.util.Iterator
        @t7
        public T next() {
            a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i11 = this.f34140b;
            this.f34141c = i11;
            T b11 = b(i11);
            this.f34140b = z2.this.H(this.f34140b);
            return b11;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            x2.e(this.f34141c >= 0);
            c();
            z2 z2Var = z2.this;
            z2Var.remove(z2Var.N(this.f34141c));
            this.f34140b = z2.this.t(this.f34140b, this.f34141c);
            this.f34141c = -1;
        }

        public /* synthetic */ e(z2 z2Var, a aVar) {
            this();
        }
    }

    public void s(int index) {
    }
}
