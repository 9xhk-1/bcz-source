package kotlin.reflect.jvm.internal.impl.protobuf;

import com.huawei.hms.framework.common.ContainerUtils;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.reflect.jvm.internal.impl.protobuf.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class s<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final int f67612a;

    /* renamed from: b, reason: collision with root package name */
    public List<s<K, V>.c> f67613b;

    /* renamed from: c, reason: collision with root package name */
    public Map<K, V> f67614c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f67615d;

    /* renamed from: e, reason: collision with root package name */
    public volatile s<K, V>.e f67616e;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<FieldDescriptorType> extends s<FieldDescriptorType, Object> {
        public a(int i11) {
            super(i11, null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.s, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.put((g.b) obj, obj2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.s
        public void r() {
            if (!p()) {
                for (int i11 = 0; i11 < m(); i11++) {
                    Map.Entry<FieldDescriptorType, Object> l11 = l(i11);
                    if (((g.b) l11.getKey()).isRepeated()) {
                        l11.setValue(Collections.unmodifiableList((List) l11.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : n()) {
                    if (((g.b) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.r();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final Iterator<Object> f67617a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final Iterable<Object> f67618b = new C0800b();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a implements Iterator<Object> {
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.s$b$b, reason: collision with other inner class name */
        public static class C0800b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return b.f67617a;
            }
        }

        public static <T> Iterable<T> b() {
            return (Iterable<T>) f67618b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Comparable<s<K, V>.c>, Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final K f67619a;

        /* renamed from: b, reason: collision with root package name */
        public V f67620b;

        public c(s sVar, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(s<K, V>.c cVar) {
            return getKey().compareTo(cVar.getKey());
        }

        public final boolean b(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f67619a;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b(this.f67619a, entry.getKey()) && b(this.f67620b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f67620b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k11 = this.f67619a;
            int hashCode = k11 == null ? 0 : k11.hashCode();
            V v11 = this.f67620b;
            return hashCode ^ (v11 != null ? v11.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v11) {
            s.this.j();
            V v12 = this.f67620b;
            this.f67620b = v11;
            return v12;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f67619a);
            String valueOf2 = String.valueOf(this.f67620b);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
            sb2.append(valueOf);
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb2.append(valueOf2);
            return sb2.toString();
        }

        public c(K k11, V v11) {
            this.f67619a = k11;
            this.f67620b = v11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends AbstractSet<Map.Entry<K, V>> {
        public e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            s.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            s.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = s.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d(s.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            s.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return s.this.size();
        }

        public /* synthetic */ e(s sVar, a aVar) {
            this();
        }
    }

    public /* synthetic */ s(int i11, a aVar) {
        this(i11);
    }

    public static <FieldDescriptorType extends g.b<FieldDescriptorType>> s<FieldDescriptorType, Object> s(int i11) {
        return new a(i11);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        j();
        if (!this.f67613b.isEmpty()) {
            this.f67613b.clear();
        }
        if (this.f67614c.isEmpty()) {
            return;
        }
        this.f67614c.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return i(comparable) >= 0 || this.f67614c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f67616e == null) {
            this.f67616e = new e(this, null);
        }
        return this.f67616e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int i11 = i(comparable);
        return i11 >= 0 ? this.f67613b.get(i11).getValue() : this.f67614c.get(comparable);
    }

    public final int i(K k11) {
        int i11;
        int size = this.f67613b.size();
        int i12 = size - 1;
        if (i12 >= 0) {
            int compareTo = k11.compareTo(this.f67613b.get(i12).getKey());
            if (compareTo > 0) {
                i11 = size + 1;
                return -i11;
            }
            if (compareTo == 0) {
                return i12;
            }
        }
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) / 2;
            int compareTo2 = k11.compareTo(this.f67613b.get(i14).getKey());
            if (compareTo2 < 0) {
                i12 = i14 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i14;
                }
                i13 = i14 + 1;
            }
        }
        i11 = i13 + 1;
        return -i11;
    }

    public final void j() {
        if (this.f67615d) {
            throw new UnsupportedOperationException();
        }
    }

    public final void k() {
        j();
        if (!this.f67613b.isEmpty() || (this.f67613b instanceof ArrayList)) {
            return;
        }
        this.f67613b = new ArrayList(this.f67612a);
    }

    public Map.Entry<K, V> l(int i11) {
        return this.f67613b.get(i11);
    }

    public int m() {
        return this.f67613b.size();
    }

    public Iterable<Map.Entry<K, V>> n() {
        return this.f67614c.isEmpty() ? b.b() : this.f67614c.entrySet();
    }

    public final SortedMap<K, V> o() {
        j();
        if (this.f67614c.isEmpty() && !(this.f67614c instanceof TreeMap)) {
            this.f67614c = new TreeMap();
        }
        return (SortedMap) this.f67614c;
    }

    public boolean p() {
        return this.f67615d;
    }

    public void r() {
        if (this.f67615d) {
            return;
        }
        this.f67614c = this.f67614c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f67614c);
        this.f67615d = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        j();
        Comparable comparable = (Comparable) obj;
        int i11 = i(comparable);
        if (i11 >= 0) {
            return (V) u(i11);
        }
        if (this.f67614c.isEmpty()) {
            return null;
        }
        return this.f67614c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f67613b.size() + this.f67614c.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public V put(K k11, V v11) {
        j();
        int i11 = i(k11);
        if (i11 >= 0) {
            return this.f67613b.get(i11).setValue(v11);
        }
        k();
        int i12 = -(i11 + 1);
        if (i12 >= this.f67612a) {
            return o().put(k11, v11);
        }
        int size = this.f67613b.size();
        int i13 = this.f67612a;
        if (size == i13) {
            s<K, V>.c remove = this.f67613b.remove(i13 - 1);
            o().put(remove.getKey(), remove.getValue());
        }
        this.f67613b.add(i12, new c(k11, v11));
        return null;
    }

    public final V u(int i11) {
        j();
        V value = this.f67613b.remove(i11).getValue();
        if (!this.f67614c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = o().entrySet().iterator();
            this.f67613b.add(new c(this, it.next()));
            it.remove();
        }
        return value;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public int f67622a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f67623b;

        /* renamed from: c, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f67624c;

        public d() {
            this.f67622a = -1;
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f67624c == null) {
                this.f67624c = s.this.f67614c.entrySet().iterator();
            }
            return this.f67624c;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f67623b = true;
            int i11 = this.f67622a + 1;
            this.f67622a = i11;
            return i11 < s.this.f67613b.size() ? (Map.Entry) s.this.f67613b.get(this.f67622a) : a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f67622a + 1 < s.this.f67613b.size() || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f67623b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f67623b = false;
            s.this.j();
            if (this.f67622a >= s.this.f67613b.size()) {
                a().remove();
                return;
            }
            s sVar = s.this;
            int i11 = this.f67622a;
            this.f67622a = i11 - 1;
            sVar.u(i11);
        }

        public /* synthetic */ d(s sVar, a aVar) {
            this();
        }
    }

    public s(int i11) {
        this.f67612a = i11;
        this.f67613b = Collections.EMPTY_LIST;
        this.f67614c = Collections.EMPTY_MAP;
    }
}
