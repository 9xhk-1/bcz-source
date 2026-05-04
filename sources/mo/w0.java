package mo;

import com.google.common.base.Preconditions;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e0
/* loaded from: classes7.dex */
public final class w0<K, V> extends v0<K, V> {

    /* renamed from: c, reason: collision with root package name */
    @CheckForNull
    public volatile transient a<K, V> f73601c;

    /* renamed from: d, reason: collision with root package name */
    @CheckForNull
    public volatile transient a<K, V> f73602d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final K f73603a;

        /* renamed from: b, reason: collision with root package name */
        public final V f73604b;

        public a(K key, V value) {
            this.f73603a = key;
            this.f73604b = value;
        }
    }

    public w0(Map<K, V> backingMap) {
        super(backingMap);
    }

    @Override // mo.v0
    public void d() {
        super.d();
        this.f73601c = null;
        this.f73602d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.v0
    @CheckForNull
    public V f(Object key) {
        Preconditions.checkNotNull(key);
        V g11 = g(key);
        if (g11 != null) {
            return g11;
        }
        V h11 = h(key);
        if (h11 != null) {
            l(key, h11);
        }
        return h11;
    }

    @Override // mo.v0
    @CheckForNull
    public V g(@CheckForNull Object obj) {
        V v11 = (V) super.g(obj);
        if (v11 != null) {
            return v11;
        }
        a<K, V> aVar = this.f73601c;
        if (aVar != null && aVar.f73603a == obj) {
            return aVar.f73604b;
        }
        a<K, V> aVar2 = this.f73602d;
        if (aVar2 == null || aVar2.f73603a != obj) {
            return null;
        }
        m(aVar2);
        return aVar2.f73604b;
    }

    public final void l(K key, V value) {
        m(new a<>(key, value));
    }

    public final void m(a<K, V> entry) {
        this.f73602d = this.f73601c;
        this.f73601c = entry;
    }
}
