package jo;

import com.google.common.collect.ImmutableMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e
@go.b
/* loaded from: classes7.dex */
public interface i<K, V> extends b<K, V>, ho.r<K, V> {
    @Override // ho.r
    @Deprecated
    V apply(K key);

    @Override // jo.b
    ConcurrentMap<K, V> asMap();

    @uo.a
    V get(K key) throws ExecutionException;

    @uo.a
    V s(K key);

    @uo.a
    ImmutableMap<K, V> t(Iterable<? extends K> keys) throws ExecutionException;

    void v(K key);
}
