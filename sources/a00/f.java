package a00;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.y0(version = "1.1")
@kotlin.jvm.internal.u0({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1761#2,3:154\n1740#2,3:157\n295#2,2:160\n*S KotlinDebug\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n*L\n28#1:154,3\n60#1:157,3\n141#1:160,2\n*E\n"})
/* loaded from: classes8.dex */
public abstract class f<K, V> implements Map<K, V>, y00.a {

    @m80.k
    public static final a Companion = new a(null);

    @m80.l
    private volatile Set<? extends K> _keys;

    @m80.l
    private volatile Collection<? extends V> _values;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public final boolean a(@m80.k Map.Entry<?, ?> e11, @m80.l Object obj) {
            kotlin.jvm.internal.g0.p(e11, "e");
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return kotlin.jvm.internal.g0.g(e11.getKey(), entry.getKey()) && kotlin.jvm.internal.g0.g(e11.getValue(), entry.getValue());
        }

        public final int b(@m80.k Map.Entry<?, ?> e11) {
            kotlin.jvm.internal.g0.p(e11, "e");
            Object key = e11.getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            Object value = e11.getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        @m80.k
        public final String c(@m80.k Map.Entry<?, ?> e11) {
            kotlin.jvm.internal.g0.p(e11, "e");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e11.getKey());
            sb2.append('=');
            sb2.append(e11.getValue());
            return sb2.toString();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends k<K> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f<K, V> f1099a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a implements Iterator<K>, y00.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Iterator<Map.Entry<K, V>> f1100a;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f1100a = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f1100a.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                return this.f1100a.next().getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(f<K, ? extends V> fVar) {
            this.f1099a = fVar;
        }

        @Override // a00.b, java.util.Collection
        public boolean contains(Object obj) {
            return this.f1099a.containsKey(obj);
        }

        @Override // a00.b
        public int getSize() {
            return this.f1099a.size();
        }

        @Override // a00.k, a00.b, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(this.f1099a.entrySet().iterator());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends a00.b<V> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f<K, V> f1101a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a implements Iterator<V>, y00.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Iterator<Map.Entry<K, V>> f1102a;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f1102a = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f1102a.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                return this.f1102a.next().getValue();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(f<K, ? extends V> fVar) {
            this.f1101a = fVar;
        }

        @Override // a00.b, java.util.Collection
        public boolean contains(Object obj) {
            return this.f1101a.containsValue(obj);
        }

        @Override // a00.b
        public int getSize() {
            return this.f1101a.size();
        }

        @Override // a00.b, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(this.f1101a.entrySet().iterator());
        }
    }

    public static final CharSequence j(f fVar, Map.Entry it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return fVar.h(it);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsEntry$kotlin_stdlib(@m80.l Map.Entry<?, ?> entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        kotlin.jvm.internal.g0.n(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        V v11 = get(key);
        if (!kotlin.jvm.internal.g0.g(value, v11)) {
            return false;
        }
        if (v11 != null) {
            return true;
        }
        kotlin.jvm.internal.g0.n(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
        return containsKey(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set<Map.Entry<K, V>> entrySet = entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.g0.g(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public final Map.Entry<K, V> d(K k11) {
        Object obj;
        Iterator<T> it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.g0.g(((Map.Entry) obj).getKey(), k11)) {
                break;
            }
        }
        return (Map.Entry) obj;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(@m80.l Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Set<Map.Entry<K, V>> entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            if (!containsEntry$kotlin_stdlib((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final String g(Object obj) {
        return obj == this ? "(this Map)" : String.valueOf(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @m80.l
    public V get(Object obj) {
        Map.Entry<K, V> d11 = d(obj);
        if (d11 != null) {
            return d11.getValue();
        }
        return null;
    }

    public abstract Set<Map.Entry<K, V>> getEntries();

    @m80.k
    public Set<K> getKeys() {
        if (this._keys == null) {
            this._keys = new b(this);
        }
        Set<? extends K> set = this._keys;
        kotlin.jvm.internal.g0.m(set);
        return set;
    }

    public int getSize() {
        return entrySet().size();
    }

    @m80.k
    public Collection<V> getValues() {
        if (this._values == null) {
            this._values = new c(this);
        }
        Collection<? extends V> collection = this._values;
        kotlin.jvm.internal.g0.m(collection);
        return collection;
    }

    public final String h(Map.Entry<? extends K, ? extends V> entry) {
        return g(entry.getKey()) + '=' + g(entry.getValue());
    }

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public V put(K k11, V v11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @m80.k
    public String toString() {
        return r0.r3(entrySet(), j2.O, "{", com.alipay.sdk.m.u.i.f11099d, 0, null, new x00.l() { // from class: a00.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                CharSequence j11;
                j11 = f.j(f.this, (Map.Entry) obj);
                return j11;
            }
        }, 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }
}
