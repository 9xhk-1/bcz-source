package jo;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.c
@e
/* loaded from: classes7.dex */
public abstract class g<K, V> extends f<K, V> implements i<K, V> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class a<K, V> extends g<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final i<K, V> f64460a;

        public a(i<K, V> delegate) {
            this.f64460a = (i) Preconditions.checkNotNull(delegate);
        }

        @Override // jo.g, jo.f
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public final i<K, V> delegate() {
            return this.f64460a;
        }
    }

    @Override // jo.i, ho.r
    public V apply(K key) {
        return delegate().apply(key);
    }

    @Override // jo.i
    @uo.a
    public V get(K key) throws ExecutionException {
        return delegate().get(key);
    }

    @Override // jo.i
    @uo.a
    public V s(K key) {
        return delegate().s(key);
    }

    @Override // jo.i
    @uo.a
    public ImmutableMap<K, V> t(Iterable<? extends K> keys) throws ExecutionException {
        return delegate().t(keys);
    }

    @Override // jo.i
    public void v(K key) {
        delegate().v(key);
    }

    @Override // jo.f
    /* renamed from: x */
    public abstract i<K, V> delegate();
}
