package kotlin.collections.builders;

import com.alipay.sdk.m.u.i;
import g10.u;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import org.junit.jupiter.api.j2;
import y00.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,751:1\n1#2:752\n*E\n"})
/* loaded from: classes8.dex */
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, g {

    @k
    public static final a Companion = new a(null);

    @k
    private static final MapBuilder Empty;
    private static final int INITIAL_CAPACITY = 8;
    private static final int INITIAL_MAX_PROBE_DISTANCE = 2;
    private static final int MAGIC = -1640531527;
    private static final int TOMBSTONE = -1;

    @l
    private kotlin.collections.builders.a<K, V> entriesView;

    @k
    private int[] hashArray;
    private int hashShift;
    private boolean isReadOnly;

    @k
    private K[] keysArray;

    @l
    private kotlin.collections.builders.b<K> keysView;
    private int length;
    private int maxProbeDistance;
    private int modCount;

    @k
    private int[] presenceArray;
    private int size;

    @l
    private V[] valuesArray;

    @l
    private kotlin.collections.builders.c<V> valuesView;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public final int c(int i11) {
            return Integer.highestOneBit(u.u(i11, 1) * 3);
        }

        public final int d(int i11) {
            return Integer.numberOfLeadingZeros(i11) + 1;
        }

        @k
        public final MapBuilder e() {
            return MapBuilder.Empty;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>>, y00.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@k MapBuilder<K, V> map) {
            super(map);
            g0.p(map, "map");
        }

        @Override // java.util.Iterator
        @k
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public c<K, V> next() {
            a();
            if (b() >= ((MapBuilder) d()).length) {
                throw new NoSuchElementException();
            }
            int b11 = b();
            f(b11 + 1);
            g(b11);
            c<K, V> cVar = new c<>(d(), c());
            e();
            return cVar;
        }

        public final void j(@k StringBuilder sb2) {
            g0.p(sb2, "sb");
            if (b() >= ((MapBuilder) d()).length) {
                throw new NoSuchElementException();
            }
            int b11 = b();
            f(b11 + 1);
            g(b11);
            Object obj = ((MapBuilder) d()).keysArray[c()];
            if (obj == d()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = ((MapBuilder) d()).valuesArray;
            g0.m(objArr);
            Object obj2 = objArr[c()];
            if (obj2 == d()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            e();
        }

        public final int k() {
            if (b() >= ((MapBuilder) d()).length) {
                throw new NoSuchElementException();
            }
            int b11 = b();
            f(b11 + 1);
            g(b11);
            Object obj = ((MapBuilder) d()).keysArray[c()];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = ((MapBuilder) d()).valuesArray;
            g0.m(objArr);
            Object obj2 = objArr[c()];
            int hashCode2 = hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            e();
            return hashCode2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<K, V> implements Map.Entry<K, V>, g.a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final MapBuilder<K, V> f66919a;

        /* renamed from: b, reason: collision with root package name */
        public final int f66920b;

        /* renamed from: c, reason: collision with root package name */
        public final int f66921c;

        public c(@k MapBuilder<K, V> map, int i11) {
            g0.p(map, "map");
            this.f66919a = map;
            this.f66920b = i11;
            this.f66921c = ((MapBuilder) map).modCount;
        }

        private final void a() {
            if (((MapBuilder) this.f66919a).modCount != this.f66921c) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(@l Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return g0.g(entry.getKey(), getKey()) && g0.g(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            a();
            return (K) ((MapBuilder) this.f66919a).keysArray[this.f66920b];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            a();
            Object[] objArr = ((MapBuilder) this.f66919a).valuesArray;
            g0.m(objArr);
            return (V) objArr[this.f66920b];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v11) {
            a();
            this.f66919a.checkIsMutable$kotlin_stdlib();
            Object[] allocateValuesArray = this.f66919a.allocateValuesArray();
            int i11 = this.f66920b;
            V v12 = (V) allocateValuesArray[i11];
            allocateValuesArray[i11] = v11;
            return v12;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,751:1\n1#2:752\n*E\n"})
    public static class d<K, V> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final MapBuilder<K, V> f66922a;

        /* renamed from: b, reason: collision with root package name */
        public int f66923b;

        /* renamed from: c, reason: collision with root package name */
        public int f66924c;

        /* renamed from: d, reason: collision with root package name */
        public int f66925d;

        public d(@k MapBuilder<K, V> map) {
            g0.p(map, "map");
            this.f66922a = map;
            this.f66924c = -1;
            this.f66925d = ((MapBuilder) map).modCount;
            e();
        }

        public final void a() {
            if (((MapBuilder) this.f66922a).modCount != this.f66925d) {
                throw new ConcurrentModificationException();
            }
        }

        public final int b() {
            return this.f66923b;
        }

        public final int c() {
            return this.f66924c;
        }

        @k
        public final MapBuilder<K, V> d() {
            return this.f66922a;
        }

        public final void e() {
            while (this.f66923b < ((MapBuilder) this.f66922a).length) {
                int[] iArr = ((MapBuilder) this.f66922a).presenceArray;
                int i11 = this.f66923b;
                if (iArr[i11] >= 0) {
                    return;
                } else {
                    this.f66923b = i11 + 1;
                }
            }
        }

        public final void f(int i11) {
            this.f66923b = i11;
        }

        public final void g(int i11) {
            this.f66924c = i11;
        }

        public final boolean hasNext() {
            return this.f66923b < ((MapBuilder) this.f66922a).length;
        }

        public final void remove() {
            a();
            if (this.f66924c == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.f66922a.checkIsMutable$kotlin_stdlib();
            this.f66922a.removeEntryAt(this.f66924c);
            this.f66924c = -1;
            this.f66925d = ((MapBuilder) this.f66922a).modCount;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e<K, V> extends d<K, V> implements Iterator<K>, y00.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@k MapBuilder<K, V> map) {
            super(map);
            g0.p(map, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            a();
            if (b() >= ((MapBuilder) d()).length) {
                throw new NoSuchElementException();
            }
            int b11 = b();
            f(b11 + 1);
            g(b11);
            K k11 = (K) ((MapBuilder) d()).keysArray[c()];
            e();
            return k11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f<K, V> extends d<K, V> implements Iterator<V>, y00.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@k MapBuilder<K, V> map) {
            super(map);
            g0.p(map, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            a();
            if (b() >= ((MapBuilder) d()).length) {
                throw new NoSuchElementException();
            }
            int b11 = b();
            f(b11 + 1);
            g(b11);
            Object[] objArr = ((MapBuilder) d()).valuesArray;
            g0.m(objArr);
            V v11 = (V) objArr[c()];
            e();
            return v11;
        }
    }

    static {
        MapBuilder mapBuilder = new MapBuilder(0);
        mapBuilder.isReadOnly = true;
        Empty = mapBuilder;
    }

    private MapBuilder(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i11, int i12) {
        this.keysArray = kArr;
        this.valuesArray = vArr;
        this.presenceArray = iArr;
        this.hashArray = iArr2;
        this.maxProbeDistance = i11;
        this.length = i12;
        this.hashShift = Companion.d(getHashSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V[] allocateValuesArray() {
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) b00.b.d(getCapacity$kotlin_stdlib());
        this.valuesArray = vArr2;
        return vArr2;
    }

    private final void compact(boolean z11) {
        int i11;
        V[] vArr = this.valuesArray;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i11 = this.length;
            if (i12 >= i11) {
                break;
            }
            int[] iArr = this.presenceArray;
            int i14 = iArr[i12];
            if (i14 >= 0) {
                K[] kArr = this.keysArray;
                kArr[i13] = kArr[i12];
                if (vArr != null) {
                    vArr[i13] = vArr[i12];
                }
                if (z11) {
                    iArr[i13] = i14;
                    this.hashArray[i14] = i13 + 1;
                }
                i13++;
            }
            i12++;
        }
        b00.b.g(this.keysArray, i13, i11);
        if (vArr != null) {
            b00.b.g(vArr, i13, this.length);
        }
        this.length = i13;
    }

    private final boolean contentEquals(Map<?, ?> map) {
        return size() == map.size() && containsAllEntries$kotlin_stdlib(map.entrySet());
    }

    private final void ensureCapacity(int i11) {
        if (i11 < 0) {
            throw new OutOfMemoryError();
        }
        if (i11 > getCapacity$kotlin_stdlib()) {
            int e11 = a00.d.Companion.e(getCapacity$kotlin_stdlib(), i11);
            this.keysArray = (K[]) b00.b.e(this.keysArray, e11);
            V[] vArr = this.valuesArray;
            this.valuesArray = vArr != null ? (V[]) b00.b.e(vArr, e11) : null;
            int[] copyOf = Arrays.copyOf(this.presenceArray, e11);
            g0.o(copyOf, "copyOf(...)");
            this.presenceArray = copyOf;
            int c11 = Companion.c(e11);
            if (c11 > getHashSize()) {
                rehash(c11);
            }
        }
    }

    private final void ensureExtraCapacity(int i11) {
        if (shouldCompact(i11)) {
            compact(true);
        } else {
            ensureCapacity(this.length + i11);
        }
    }

    private final int findKey(K k11) {
        int hash = hash(k11);
        int i11 = this.maxProbeDistance;
        while (true) {
            int i12 = this.hashArray[hash];
            if (i12 == 0) {
                return -1;
            }
            if (i12 > 0) {
                int i13 = i12 - 1;
                if (g0.g(this.keysArray[i13], k11)) {
                    return i13;
                }
            }
            i11--;
            if (i11 < 0) {
                return -1;
            }
            hash = hash == 0 ? getHashSize() - 1 : hash - 1;
        }
    }

    private final int findValue(V v11) {
        int i11 = this.length;
        while (true) {
            i11--;
            if (i11 < 0) {
                return -1;
            }
            if (this.presenceArray[i11] >= 0) {
                V[] vArr = this.valuesArray;
                g0.m(vArr);
                if (g0.g(vArr[i11], v11)) {
                    return i11;
                }
            }
        }
    }

    private final int getHashSize() {
        return this.hashArray.length;
    }

    private final int hash(K k11) {
        return ((k11 != null ? k11.hashCode() : 0) * (-1640531527)) >>> this.hashShift;
    }

    private final boolean putAllEntries(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z11 = false;
        if (collection.isEmpty()) {
            return false;
        }
        ensureExtraCapacity(collection.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = collection.iterator();
        while (it.hasNext()) {
            if (putEntry(it.next())) {
                z11 = true;
            }
        }
        return z11;
    }

    private final boolean putEntry(Map.Entry<? extends K, ? extends V> entry) {
        int addKey$kotlin_stdlib = addKey$kotlin_stdlib(entry.getKey());
        V[] allocateValuesArray = allocateValuesArray();
        if (addKey$kotlin_stdlib >= 0) {
            allocateValuesArray[addKey$kotlin_stdlib] = entry.getValue();
            return true;
        }
        int i11 = (-addKey$kotlin_stdlib) - 1;
        if (g0.g(entry.getValue(), allocateValuesArray[i11])) {
            return false;
        }
        allocateValuesArray[i11] = entry.getValue();
        return true;
    }

    private final boolean putRehash(int i11) {
        int hash = hash(this.keysArray[i11]);
        int i12 = this.maxProbeDistance;
        while (true) {
            int[] iArr = this.hashArray;
            if (iArr[hash] == 0) {
                iArr[hash] = i11 + 1;
                this.presenceArray[i11] = hash;
                return true;
            }
            i12--;
            if (i12 < 0) {
                return false;
            }
            hash = hash == 0 ? getHashSize() - 1 : hash - 1;
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final void registerModification() {
        this.modCount++;
    }

    private final void rehash(int i11) {
        registerModification();
        int i12 = 0;
        if (this.length > size()) {
            compact(false);
        }
        this.hashArray = new int[i11];
        this.hashShift = Companion.d(i11);
        while (i12 < this.length) {
            int i13 = i12 + 1;
            if (!putRehash(i12)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i12 = i13;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeEntryAt(int i11) {
        b00.b.f(this.keysArray, i11);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            b00.b.f(vArr, i11);
        }
        removeHashAt(this.presenceArray[i11]);
        this.presenceArray[i11] = -1;
        this.size = size() - 1;
        registerModification();
    }

    private final void removeHashAt(int i11) {
        int B = u.B(this.maxProbeDistance * 2, getHashSize() / 2);
        int i12 = 0;
        int i13 = i11;
        do {
            i11 = i11 == 0 ? getHashSize() - 1 : i11 - 1;
            i12++;
            if (i12 > this.maxProbeDistance) {
                this.hashArray[i13] = 0;
                return;
            }
            int[] iArr = this.hashArray;
            int i14 = iArr[i11];
            if (i14 == 0) {
                iArr[i13] = 0;
                return;
            }
            if (i14 < 0) {
                iArr[i13] = -1;
            } else {
                int i15 = i14 - 1;
                if (((hash(this.keysArray[i15]) - i11) & (getHashSize() - 1)) >= i12) {
                    this.hashArray[i13] = i14;
                    this.presenceArray[i15] = i13;
                }
                B--;
            }
            i13 = i11;
            i12 = 0;
            B--;
        } while (B >= 0);
        this.hashArray[i13] = -1;
    }

    private final boolean shouldCompact(int i11) {
        int capacity$kotlin_stdlib = getCapacity$kotlin_stdlib();
        int i12 = this.length;
        int i13 = capacity$kotlin_stdlib - i12;
        int size = i12 - size();
        return i13 < i11 && i13 + size >= i11 && size >= getCapacity$kotlin_stdlib() / 4;
    }

    private final Object writeReplace() {
        if (this.isReadOnly) {
            return new b00.c(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int addKey$kotlin_stdlib(K k11) {
        checkIsMutable$kotlin_stdlib();
        while (true) {
            int hash = hash(k11);
            int B = u.B(this.maxProbeDistance * 2, getHashSize() / 2);
            int i11 = 0;
            while (true) {
                int i12 = this.hashArray[hash];
                if (i12 <= 0) {
                    if (this.length < getCapacity$kotlin_stdlib()) {
                        int i13 = this.length;
                        int i14 = i13 + 1;
                        this.length = i14;
                        this.keysArray[i13] = k11;
                        this.presenceArray[i13] = hash;
                        this.hashArray[hash] = i14;
                        this.size = size() + 1;
                        registerModification();
                        if (i11 > this.maxProbeDistance) {
                            this.maxProbeDistance = i11;
                        }
                        return i13;
                    }
                    ensureExtraCapacity(1);
                } else {
                    if (g0.g(this.keysArray[i12 - 1], k11)) {
                        return -i12;
                    }
                    i11++;
                    if (i11 > B) {
                        rehash(getHashSize() * 2);
                        break;
                    }
                    hash = hash == 0 ? getHashSize() - 1 : hash - 1;
                }
            }
        }
    }

    @k
    public final Map<K, V> build() {
        checkIsMutable$kotlin_stdlib();
        this.isReadOnly = true;
        if (size() > 0) {
            return this;
        }
        MapBuilder mapBuilder = Empty;
        g0.n(mapBuilder, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return mapBuilder;
    }

    public final void checkIsMutable$kotlin_stdlib() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public void clear() {
        checkIsMutable$kotlin_stdlib();
        int i11 = this.length - 1;
        if (i11 >= 0) {
            int i12 = 0;
            while (true) {
                int[] iArr = this.presenceArray;
                int i13 = iArr[i12];
                if (i13 >= 0) {
                    this.hashArray[i13] = 0;
                    iArr[i12] = -1;
                }
                if (i12 == i11) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        b00.b.g(this.keysArray, 0, this.length);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            b00.b.g(vArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
        registerModification();
    }

    public final boolean containsAllEntries$kotlin_stdlib(@k Collection<?> m11) {
        g0.p(m11, "m");
        for (Object obj : m11) {
            if (obj != null) {
                try {
                    if (!containsEntry$kotlin_stdlib((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean containsEntry$kotlin_stdlib(@k Map.Entry<? extends K, ? extends V> entry) {
        g0.p(entry, "entry");
        int findKey = findKey(entry.getKey());
        if (findKey < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        g0.m(vArr);
        return g0.g(vArr[findKey], entry.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return findKey(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return findValue(obj) >= 0;
    }

    @k
    public final b<K, V> entriesIterator$kotlin_stdlib() {
        return new b<>(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(@l Object obj) {
        if (obj != this) {
            return (obj instanceof Map) && contentEquals((Map) obj);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @l
    public V get(Object obj) {
        int findKey = findKey(obj);
        if (findKey < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        g0.m(vArr);
        return vArr[findKey];
    }

    public final int getCapacity$kotlin_stdlib() {
        return this.keysArray.length;
    }

    @k
    public Set<Map.Entry<K, V>> getEntries() {
        kotlin.collections.builders.a<K, V> aVar = this.entriesView;
        if (aVar != null) {
            return aVar;
        }
        kotlin.collections.builders.a<K, V> aVar2 = new kotlin.collections.builders.a<>(this);
        this.entriesView = aVar2;
        return aVar2;
    }

    @k
    public Set<K> getKeys() {
        kotlin.collections.builders.b<K> bVar = this.keysView;
        if (bVar != null) {
            return bVar;
        }
        kotlin.collections.builders.b<K> bVar2 = new kotlin.collections.builders.b<>(this);
        this.keysView = bVar2;
        return bVar2;
    }

    public int getSize() {
        return this.size;
    }

    @k
    public Collection<V> getValues() {
        kotlin.collections.builders.c<V> cVar = this.valuesView;
        if (cVar != null) {
            return cVar;
        }
        kotlin.collections.builders.c<V> cVar2 = new kotlin.collections.builders.c<>(this);
        this.valuesView = cVar2;
        return cVar2;
    }

    @Override // java.util.Map
    public int hashCode() {
        b<K, V> entriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i11 = 0;
        while (entriesIterator$kotlin_stdlib.hasNext()) {
            i11 += entriesIterator$kotlin_stdlib.k();
        }
        return i11;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final boolean isReadOnly$kotlin_stdlib() {
        return this.isReadOnly;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @k
    public final e<K, V> keysIterator$kotlin_stdlib() {
        return new e<>(this);
    }

    @Override // java.util.Map
    @l
    public V put(K k11, V v11) {
        checkIsMutable$kotlin_stdlib();
        int addKey$kotlin_stdlib = addKey$kotlin_stdlib(k11);
        V[] allocateValuesArray = allocateValuesArray();
        if (addKey$kotlin_stdlib >= 0) {
            allocateValuesArray[addKey$kotlin_stdlib] = v11;
            return null;
        }
        int i11 = (-addKey$kotlin_stdlib) - 1;
        V v12 = allocateValuesArray[i11];
        allocateValuesArray[i11] = v11;
        return v12;
    }

    @Override // java.util.Map
    public void putAll(@k Map<? extends K, ? extends V> from) {
        g0.p(from, "from");
        checkIsMutable$kotlin_stdlib();
        putAllEntries(from.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @l
    public V remove(Object obj) {
        checkIsMutable$kotlin_stdlib();
        int findKey = findKey(obj);
        if (findKey < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        g0.m(vArr);
        V v11 = vArr[findKey];
        removeEntryAt(findKey);
        return v11;
    }

    public final boolean removeEntry$kotlin_stdlib(@k Map.Entry<? extends K, ? extends V> entry) {
        g0.p(entry, "entry");
        checkIsMutable$kotlin_stdlib();
        int findKey = findKey(entry.getKey());
        if (findKey < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        g0.m(vArr);
        if (!g0.g(vArr[findKey], entry.getValue())) {
            return false;
        }
        removeEntryAt(findKey);
        return true;
    }

    public final boolean removeKey$kotlin_stdlib(K k11) {
        checkIsMutable$kotlin_stdlib();
        int findKey = findKey(k11);
        if (findKey < 0) {
            return false;
        }
        removeEntryAt(findKey);
        return true;
    }

    public final boolean removeValue$kotlin_stdlib(V v11) {
        checkIsMutable$kotlin_stdlib();
        int findValue = findValue(v11);
        if (findValue < 0) {
            return false;
        }
        removeEntryAt(findValue);
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append("{");
        b<K, V> entriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i11 = 0;
        while (entriesIterator$kotlin_stdlib.hasNext()) {
            if (i11 > 0) {
                sb2.append(j2.O);
            }
            entriesIterator$kotlin_stdlib.j(sb2);
            i11++;
        }
        sb2.append(i.f11099d);
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    @k
    public final f<K, V> valuesIterator$kotlin_stdlib() {
        return new f<>(this);
    }

    public MapBuilder() {
        this(8);
    }

    public MapBuilder(int i11) {
        this(b00.b.d(i11), null, new int[i11], new int[Companion.c(i11)], 2, 0);
    }
}
