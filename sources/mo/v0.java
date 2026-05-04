package mo;

import com.google.common.base.Preconditions;
import com.google.common.collect.aa;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e0
/* loaded from: classes7.dex */
public class v0<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final Map<K, V> f73595a;

    /* renamed from: b, reason: collision with root package name */
    @CheckForNull
    public volatile transient Map.Entry<K, V> f73596b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends AbstractSet<K> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: mo.v0$a$a, reason: collision with other inner class name */
        public class C0888a extends aa<K> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Iterator f73598a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f73599b;

            public C0888a(final a this$1, final Iterator val$entryIterator) {
                this.f73598a = val$entryIterator;
                this.f73599b = this$1;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f73598a.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry entry = (Map.Entry) this.f73598a.next();
                v0.this.f73596b = entry;
                return (K) entry.getKey();
            }
        }

        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public aa<K> iterator() {
            return new C0888a(this, v0.this.f73595a.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object key) {
            return v0.this.e(key);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return v0.this.f73595a.size();
        }
    }

    public v0(Map<K, V> backingMap) {
        this.f73595a = (Map) Preconditions.checkNotNull(backingMap);
    }

    public final void c() {
        d();
        this.f73595a.clear();
    }

    public void d() {
        this.f73596b = null;
    }

    public final boolean e(@CheckForNull Object key) {
        return g(key) != null || this.f73595a.containsKey(key);
    }

    @CheckForNull
    public V f(Object key) {
        Preconditions.checkNotNull(key);
        V g11 = g(key);
        return g11 == null ? h(key) : g11;
    }

    @CheckForNull
    public V g(@CheckForNull Object key) {
        Map.Entry<K, V> entry = this.f73596b;
        if (entry == null || entry.getKey() != key) {
            return null;
        }
        return entry.getValue();
    }

    @CheckForNull
    public final V h(Object key) {
        Preconditions.checkNotNull(key);
        return this.f73595a.get(key);
    }

    @CheckForNull
    @uo.a
    public final V i(K key, V value) {
        Preconditions.checkNotNull(key);
        Preconditions.checkNotNull(value);
        d();
        return this.f73595a.put(key, value);
    }

    @CheckForNull
    @uo.a
    public final V j(Object key) {
        Preconditions.checkNotNull(key);
        d();
        return this.f73595a.remove(key);
    }

    public final Set<K> k() {
        return new a();
    }
}
