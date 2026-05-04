package com.google.common.collect;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.f9;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b
@u3
@uo.j(containerOf = {"R", "C", ExifInterface.GPS_MEASUREMENT_INTERRUPTED})
/* loaded from: classes7.dex */
public final class p3<R, C, V> extends k8<R, C, V> {

    /* renamed from: a, reason: collision with root package name */
    public final ImmutableMap<R, Integer> f33700a;

    /* renamed from: b, reason: collision with root package name */
    public final ImmutableMap<C, Integer> f33701b;

    /* renamed from: c, reason: collision with root package name */
    public final ImmutableMap<R, ImmutableMap<C, V>> f33702c;

    /* renamed from: d, reason: collision with root package name */
    public final ImmutableMap<C, ImmutableMap<R, V>> f33703d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f33704e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f33705f;

    /* renamed from: g, reason: collision with root package name */
    public final V[][] f33706g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f33707h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f33708i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends d<R, V> {

        /* renamed from: b, reason: collision with root package name */
        public final int f33709b;

        public b(int columnIndex) {
            super(p3.this.f33705f[columnIndex]);
            this.f33709b = columnIndex;
        }

        @Override // com.google.common.collect.p3.d
        @CheckForNull
        public V g(int i11) {
            return (V) p3.this.f33706g[i11][this.f33709b];
        }

        @Override // com.google.common.collect.p3.d
        public ImmutableMap<R, Integer> i() {
            return p3.this.f33700a;
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.p3.d, com.google.common.collect.ImmutableMap.c, com.google.common.collect.ImmutableMap
        @go.d
        @go.c
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class c extends d<C, ImmutableMap<R, V>> {
        @Override // com.google.common.collect.p3.d
        public ImmutableMap<C, Integer> i() {
            return p3.this.f33701b;
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isPartialView() {
            return false;
        }

        @Override // com.google.common.collect.p3.d
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public ImmutableMap<R, V> g(int keyIndex) {
            return new b(keyIndex);
        }

        @Override // com.google.common.collect.p3.d, com.google.common.collect.ImmutableMap.c, com.google.common.collect.ImmutableMap
        @go.d
        @go.c
        public Object writeReplace() {
            return super.writeReplace();
        }

        public c() {
            super(p3.this.f33705f.length);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class d<K, V> extends ImmutableMap.c<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final int f33712a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends com.google.common.collect.c<Map.Entry<K, V>> {

            /* renamed from: c, reason: collision with root package name */
            public int f33713c = -1;

            /* renamed from: d, reason: collision with root package name */
            public final int f33714d;

            public a() {
                this.f33714d = d.this.i().size();
            }

            @Override // com.google.common.collect.c
            @CheckForNull
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> a() {
                int i11 = this.f33713c;
                while (true) {
                    this.f33713c = i11 + 1;
                    int i12 = this.f33713c;
                    if (i12 >= this.f33714d) {
                        return b();
                    }
                    Object g11 = d.this.g(i12);
                    if (g11 != null) {
                        return u6.O(d.this.d(this.f33713c), g11);
                    }
                    i11 = this.f33713c;
                }
            }
        }

        public d(int size) {
            this.f33712a = size;
        }

        @Override // com.google.common.collect.ImmutableMap.c
        public aa<Map.Entry<K, V>> b() {
            return new a();
        }

        @Override // com.google.common.collect.ImmutableMap.c, com.google.common.collect.ImmutableMap
        public ImmutableSet<K> createKeySet() {
            return h() ? i().keySet() : super.createKeySet();
        }

        public K d(int index) {
            return i().keySet().asList().get(index);
        }

        @CheckForNull
        public abstract V g(int keyIndex);

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        @CheckForNull
        public V get(@CheckForNull Object key) {
            Integer num = i().get(key);
            if (num == null) {
                return null;
            }
            return g(num.intValue());
        }

        public final boolean h() {
            return this.f33712a == i().size();
        }

        public abstract ImmutableMap<K, Integer> i();

        @Override // java.util.Map
        public int size() {
            return this.f33712a;
        }

        @Override // com.google.common.collect.ImmutableMap.c, com.google.common.collect.ImmutableMap
        @go.d
        @go.c
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class e extends d<C, V> {

        /* renamed from: b, reason: collision with root package name */
        public final int f33716b;

        public e(int rowIndex) {
            super(p3.this.f33704e[rowIndex]);
            this.f33716b = rowIndex;
        }

        @Override // com.google.common.collect.p3.d
        @CheckForNull
        public V g(int i11) {
            return (V) p3.this.f33706g[this.f33716b][i11];
        }

        @Override // com.google.common.collect.p3.d
        public ImmutableMap<C, Integer> i() {
            return p3.this.f33701b;
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.p3.d, com.google.common.collect.ImmutableMap.c, com.google.common.collect.ImmutableMap
        @go.d
        @go.c
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class f extends d<R, ImmutableMap<C, V>> {
        @Override // com.google.common.collect.p3.d
        public ImmutableMap<R, Integer> i() {
            return p3.this.f33700a;
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isPartialView() {
            return false;
        }

        @Override // com.google.common.collect.p3.d
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public ImmutableMap<C, V> g(int keyIndex) {
            return new e(keyIndex);
        }

        @Override // com.google.common.collect.p3.d, com.google.common.collect.ImmutableMap.c, com.google.common.collect.ImmutableMap
        @go.d
        @go.c
        public Object writeReplace() {
            return super.writeReplace();
        }

        public f() {
            super(p3.this.f33704e.length);
        }
    }

    public p3(ImmutableList<f9.a<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        this.f33706g = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, immutableSet.size(), immutableSet2.size()));
        ImmutableMap<R, Integer> Q = u6.Q(immutableSet);
        this.f33700a = Q;
        ImmutableMap<C, Integer> Q2 = u6.Q(immutableSet2);
        this.f33701b = Q2;
        this.f33704e = new int[Q.size()];
        this.f33705f = new int[Q2.size()];
        int[] iArr = new int[immutableList.size()];
        int[] iArr2 = new int[immutableList.size()];
        for (int i11 = 0; i11 < immutableList.size(); i11++) {
            f9.a<R, C, V> aVar = immutableList.get(i11);
            R b11 = aVar.b();
            C a11 = aVar.a();
            Integer num = this.f33700a.get(b11);
            Objects.requireNonNull(num);
            int intValue = num.intValue();
            Integer num2 = this.f33701b.get(a11);
            Objects.requireNonNull(num2);
            int intValue2 = num2.intValue();
            b(b11, a11, this.f33706g[intValue][intValue2], aVar.getValue());
            this.f33706g[intValue][intValue2] = aVar.getValue();
            int[] iArr3 = this.f33704e;
            iArr3[intValue] = iArr3[intValue] + 1;
            int[] iArr4 = this.f33705f;
            iArr4[intValue2] = iArr4[intValue2] + 1;
            iArr[i11] = intValue;
            iArr2[i11] = intValue2;
        }
        this.f33707h = iArr;
        this.f33708i = iArr2;
        this.f33702c = new f();
        this.f33703d = new c();
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.q, com.google.common.collect.f9
    @CheckForNull
    public V get(@CheckForNull Object rowKey, @CheckForNull Object columnKey) {
        Integer num = this.f33700a.get(rowKey);
        Integer num2 = this.f33701b.get(columnKey);
        if (num == null || num2 == null) {
            return null;
        }
        return this.f33706g[num.intValue()][num2.intValue()];
    }

    @Override // com.google.common.collect.k8
    public f9.a<R, C, V> getCell(int index) {
        int i11 = this.f33707h[index];
        int i12 = this.f33708i[index];
        R r11 = rowKeySet().asList().get(i11);
        C c11 = columnKeySet().asList().get(i12);
        V v11 = this.f33706g[i11][i12];
        Objects.requireNonNull(v11);
        return ImmutableTable.cellOf(r11, c11, v11);
    }

    @Override // com.google.common.collect.k8
    public V getValue(int index) {
        V v11 = this.f33706g[this.f33707h[index]][this.f33708i[index]];
        Objects.requireNonNull(v11);
        return v11;
    }

    @Override // com.google.common.collect.f9
    public int size() {
        return this.f33707h.length;
    }

    @Override // com.google.common.collect.k8, com.google.common.collect.ImmutableTable
    @go.d
    @go.c
    public Object writeReplace() {
        return ImmutableTable.b.a(this, this.f33707h, this.f33708i);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.f9
    public ImmutableMap<C, Map<R, V>> columnMap() {
        return ImmutableMap.copyOf((Map) this.f33703d);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.f9
    public ImmutableMap<R, Map<C, V>> rowMap() {
        return ImmutableMap.copyOf((Map) this.f33702c);
    }
}
