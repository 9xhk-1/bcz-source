package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true, serializable = true)
/* loaded from: classes7.dex */
public final class e8<K, V> extends ImmutableMap<K, V> {

    /* renamed from: d, reason: collision with root package name */
    public static final byte f33428d = -1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f33429e = 128;

    /* renamed from: f, reason: collision with root package name */
    public static final int f33430f = 32768;

    /* renamed from: g, reason: collision with root package name */
    public static final int f33431g = 255;

    /* renamed from: h, reason: collision with root package name */
    public static final int f33432h = 65535;

    /* renamed from: i, reason: collision with root package name */
    public static final ImmutableMap<Object, Object> f33433i = new e8(null, new Object[0], 0);

    @go.d
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    @CheckForNull
    public final transient Object f33434a;

    /* renamed from: b, reason: collision with root package name */
    @go.e
    public final transient Object[] f33435b;

    /* renamed from: c, reason: collision with root package name */
    public final transient int f33436c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<K, V> extends ImmutableSet<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public final transient ImmutableMap<K, V> f33437a;

        /* renamed from: b, reason: collision with root package name */
        public final transient Object[] f33438b;

        /* renamed from: c, reason: collision with root package name */
        public final transient int f33439c;

        /* renamed from: d, reason: collision with root package name */
        public final transient int f33440d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.google.common.collect.e8$a$a, reason: collision with other inner class name */
        public class C0396a extends ImmutableList<Map.Entry<K, V>> {
            public C0396a() {
            }

            @Override // java.util.List
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> get(int index) {
                Preconditions.checkElementIndex(index, a.this.f33440d);
                int i11 = index * 2;
                Object obj = a.this.f33438b[a.this.f33439c + i11];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f33438b[i11 + (a.this.f33439c ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // com.google.common.collect.ImmutableCollection
            public boolean isPartialView() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f33440d;
            }

            @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            @go.d
            public Object writeReplace() {
                return super.writeReplace();
            }
        }

        public a(ImmutableMap<K, V> map, Object[] alternatingKeysAndValues, int keyOffset, int size) {
            this.f33437a = map;
            this.f33438b = alternatingKeysAndValues;
            this.f33439c = keyOffset;
            this.f33440d = size;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object object) {
            if (object instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) object;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.f33437a.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int copyIntoArray(Object[] dst, int offset) {
            return asList().copyIntoArray(dst, offset);
        }

        @Override // com.google.common.collect.ImmutableSet
        public ImmutableList<Map.Entry<K, V>> createAsList() {
            return new C0396a();
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f33440d;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @go.d
        @go.c
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public aa<Map.Entry<K, V>> iterator() {
            return asList().iterator();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<K> extends ImmutableSet<K> {

        /* renamed from: a, reason: collision with root package name */
        public final transient ImmutableMap<K, ?> f33442a;

        /* renamed from: b, reason: collision with root package name */
        public final transient ImmutableList<K> f33443b;

        public b(ImmutableMap<K, ?> map, ImmutableList<K> list) {
            this.f33442a = map;
            this.f33443b = list;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public ImmutableList<K> asList() {
            return this.f33443b;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object object) {
            return this.f33442a.get(object) != null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int copyIntoArray(Object[] dst, int offset) {
            return asList().copyIntoArray(dst, offset);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f33442a.size();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @go.d
        @go.c
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public aa<K> iterator() {
            return asList().iterator();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends ImmutableList<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final transient Object[] f33444a;

        /* renamed from: b, reason: collision with root package name */
        public final transient int f33445b;

        /* renamed from: c, reason: collision with root package name */
        public final transient int f33446c;

        public c(Object[] alternatingKeysAndValues, int offset, int size) {
            this.f33444a = alternatingKeysAndValues;
            this.f33445b = offset;
            this.f33446c = size;
        }

        @Override // java.util.List
        public Object get(int index) {
            Preconditions.checkElementIndex(index, this.f33446c);
            Object obj = this.f33444a[(index * 2) + this.f33445b];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f33446c;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public e8(@CheckForNull Object hashTable, Object[] alternatingKeysAndValues, int size) {
        this.f33434a = hashTable;
        this.f33435b = alternatingKeysAndValues;
        this.f33436c = size;
    }

    public static <K, V> e8<K, V> b(int n11, Object[] alternatingKeysAndValues) {
        return d(n11, alternatingKeysAndValues, null);
    }

    public static <K, V> e8<K, V> d(int n11, Object[] alternatingKeysAndValues, ImmutableMap.b<K, V> builder) {
        if (n11 == 0) {
            return (e8) f33433i;
        }
        if (n11 == 1) {
            Object obj = alternatingKeysAndValues[0];
            Objects.requireNonNull(obj);
            Object obj2 = alternatingKeysAndValues[1];
            Objects.requireNonNull(obj2);
            x2.a(obj, obj2);
            return new e8<>(null, alternatingKeysAndValues, 1);
        }
        Preconditions.checkPositionIndex(n11, alternatingKeysAndValues.length >> 1);
        Object g11 = g(alternatingKeysAndValues, n11, ImmutableSet.chooseTableSize(n11), 0);
        if (g11 instanceof Object[]) {
            Object[] objArr = (Object[]) g11;
            ImmutableMap.b.a aVar = (ImmutableMap.b.a) objArr[2];
            if (builder == null) {
                throw aVar.a();
            }
            builder.f33007e = aVar;
            Object obj3 = objArr[0];
            int intValue = ((Integer) objArr[1]).intValue();
            alternatingKeysAndValues = Arrays.copyOf(alternatingKeysAndValues, intValue * 2);
            g11 = obj3;
            n11 = intValue;
        }
        return new e8<>(g11, alternatingKeysAndValues, n11);
    }

    @CheckForNull
    public static Object g(Object[] alternatingKeysAndValues, int n11, int tableSize, int keyOffset) {
        int i11;
        ImmutableMap.b.a aVar = null;
        int i12 = 1;
        if (n11 == 1) {
            Object obj = alternatingKeysAndValues[keyOffset];
            Objects.requireNonNull(obj);
            Object obj2 = alternatingKeysAndValues[keyOffset ^ 1];
            Objects.requireNonNull(obj2);
            x2.a(obj, obj2);
            return null;
        }
        int i13 = tableSize - 1;
        if (tableSize <= 128) {
            byte[] bArr = new byte[tableSize];
            Arrays.fill(bArr, (byte) -1);
            int i14 = 0;
            for (int i15 = 0; i15 < n11; i15++) {
                int i16 = (i15 * 2) + keyOffset;
                int i17 = (i14 * 2) + keyOffset;
                Object obj3 = alternatingKeysAndValues[i16];
                Objects.requireNonNull(obj3);
                Object obj4 = alternatingKeysAndValues[i16 ^ 1];
                Objects.requireNonNull(obj4);
                x2.a(obj3, obj4);
                int c11 = o5.c(obj3.hashCode());
                while (true) {
                    int i18 = c11 & i13;
                    int i19 = bArr[i18] & 255;
                    if (i19 == 255) {
                        bArr[i18] = (byte) i17;
                        if (i14 < i15) {
                            alternatingKeysAndValues[i17] = obj3;
                            alternatingKeysAndValues[i17 ^ 1] = obj4;
                        }
                        i14++;
                    } else {
                        if (obj3.equals(alternatingKeysAndValues[i19])) {
                            int i21 = i19 ^ 1;
                            Object obj5 = alternatingKeysAndValues[i21];
                            Objects.requireNonNull(obj5);
                            aVar = new ImmutableMap.b.a(obj3, obj4, obj5);
                            alternatingKeysAndValues[i21] = obj4;
                            break;
                        }
                        c11 = i18 + 1;
                    }
                }
            }
            return i14 == n11 ? bArr : new Object[]{bArr, Integer.valueOf(i14), aVar};
        }
        if (tableSize <= 32768) {
            short[] sArr = new short[tableSize];
            Arrays.fill(sArr, (short) -1);
            int i22 = 0;
            for (int i23 = 0; i23 < n11; i23++) {
                int i24 = (i23 * 2) + keyOffset;
                int i25 = (i22 * 2) + keyOffset;
                Object obj6 = alternatingKeysAndValues[i24];
                Objects.requireNonNull(obj6);
                Object obj7 = alternatingKeysAndValues[i24 ^ 1];
                Objects.requireNonNull(obj7);
                x2.a(obj6, obj7);
                int c12 = o5.c(obj6.hashCode());
                while (true) {
                    int i26 = c12 & i13;
                    int i27 = sArr[i26] & yz.c2.f100412d;
                    if (i27 == 65535) {
                        sArr[i26] = (short) i25;
                        if (i22 < i23) {
                            alternatingKeysAndValues[i25] = obj6;
                            alternatingKeysAndValues[i25 ^ 1] = obj7;
                        }
                        i22++;
                    } else {
                        if (obj6.equals(alternatingKeysAndValues[i27])) {
                            int i28 = i27 ^ 1;
                            Object obj8 = alternatingKeysAndValues[i28];
                            Objects.requireNonNull(obj8);
                            aVar = new ImmutableMap.b.a(obj6, obj7, obj8);
                            alternatingKeysAndValues[i28] = obj7;
                            break;
                        }
                        c12 = i26 + 1;
                    }
                }
            }
            return i22 == n11 ? sArr : new Object[]{sArr, Integer.valueOf(i22), aVar};
        }
        int[] iArr = new int[tableSize];
        Arrays.fill(iArr, -1);
        int i29 = 0;
        int i31 = 0;
        while (i29 < n11) {
            int i32 = (i29 * 2) + keyOffset;
            int i33 = (i31 * 2) + keyOffset;
            Object obj9 = alternatingKeysAndValues[i32];
            Objects.requireNonNull(obj9);
            Object obj10 = alternatingKeysAndValues[i32 ^ i12];
            Objects.requireNonNull(obj10);
            x2.a(obj9, obj10);
            int c13 = o5.c(obj9.hashCode());
            while (true) {
                int i34 = c13 & i13;
                int i35 = iArr[i34];
                if (i35 == -1) {
                    iArr[i34] = i33;
                    if (i31 < i29) {
                        alternatingKeysAndValues[i33] = obj9;
                        alternatingKeysAndValues[i33 ^ 1] = obj10;
                    }
                    i31++;
                    i11 = i12;
                } else {
                    i11 = i12;
                    if (obj9.equals(alternatingKeysAndValues[i35])) {
                        int i36 = i35 ^ 1;
                        Object obj11 = alternatingKeysAndValues[i36];
                        Objects.requireNonNull(obj11);
                        aVar = new ImmutableMap.b.a(obj9, obj10, obj11);
                        alternatingKeysAndValues[i36] = obj10;
                        break;
                    }
                    c13 = i34 + 1;
                    i12 = i11;
                }
            }
            i29++;
            i12 = i11;
        }
        int i37 = i12;
        if (i31 == n11) {
            return iArr;
        }
        Object[] objArr = new Object[3];
        objArr[0] = iArr;
        objArr[i37] = Integer.valueOf(i31);
        objArr[2] = aVar;
        return objArr;
    }

    @CheckForNull
    public static Object h(Object[] alternatingKeysAndValues, int n11, int tableSize, int keyOffset) {
        Object g11 = g(alternatingKeysAndValues, n11, tableSize, keyOffset);
        if (g11 instanceof Object[]) {
            throw ((ImmutableMap.b.a) ((Object[]) g11)[2]).a();
        }
        return g11;
    }

    @CheckForNull
    public static Object i(@CheckForNull Object hashTableObject, Object[] alternatingKeysAndValues, int size, int keyOffset, @CheckForNull Object key) {
        if (key == null) {
            return null;
        }
        if (size == 1) {
            Object obj = alternatingKeysAndValues[keyOffset];
            Objects.requireNonNull(obj);
            if (!obj.equals(key)) {
                return null;
            }
            Object obj2 = alternatingKeysAndValues[keyOffset ^ 1];
            Objects.requireNonNull(obj2);
            return obj2;
        }
        if (hashTableObject == null) {
            return null;
        }
        if (hashTableObject instanceof byte[]) {
            byte[] bArr = (byte[]) hashTableObject;
            int length = bArr.length - 1;
            int c11 = o5.c(key.hashCode());
            while (true) {
                int i11 = c11 & length;
                int i12 = bArr[i11] & 255;
                if (i12 == 255) {
                    return null;
                }
                if (key.equals(alternatingKeysAndValues[i12])) {
                    return alternatingKeysAndValues[i12 ^ 1];
                }
                c11 = i11 + 1;
            }
        } else if (hashTableObject instanceof short[]) {
            short[] sArr = (short[]) hashTableObject;
            int length2 = sArr.length - 1;
            int c12 = o5.c(key.hashCode());
            while (true) {
                int i13 = c12 & length2;
                int i14 = sArr[i13] & yz.c2.f100412d;
                if (i14 == 65535) {
                    return null;
                }
                if (key.equals(alternatingKeysAndValues[i14])) {
                    return alternatingKeysAndValues[i14 ^ 1];
                }
                c12 = i13 + 1;
            }
        } else {
            int[] iArr = (int[]) hashTableObject;
            int length3 = iArr.length - 1;
            int c13 = o5.c(key.hashCode());
            while (true) {
                int i15 = c13 & length3;
                int i16 = iArr[i15];
                if (i16 == -1) {
                    return null;
                }
                if (key.equals(alternatingKeysAndValues[i16])) {
                    return alternatingKeysAndValues[i16 ^ 1];
                }
                c13 = i15 + 1;
            }
        }
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        return new a(this, this.f33435b, 0, this.f33436c);
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<K> createKeySet() {
        return new b(this, new c(this.f33435b, 0, this.f33436c));
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableCollection<V> createValues() {
        return new c(this.f33435b, 1, this.f33436c);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object obj) {
        V v11 = (V) i(this.f33434a, this.f33435b, this.f33436c, 0, obj);
        if (v11 == null) {
            return null;
        }
        return v11;
    }

    @Override // com.google.common.collect.ImmutableMap
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f33436c;
    }

    @Override // com.google.common.collect.ImmutableMap
    @go.d
    @go.c
    public Object writeReplace() {
        return super.writeReplace();
    }
}
