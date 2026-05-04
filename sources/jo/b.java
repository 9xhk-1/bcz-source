package jo;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e
@go.b
@uo.f("Use CacheBuilder.newBuilder().build()")
/* loaded from: classes7.dex */
public interface b<K, V> {
    ConcurrentMap<K, V> asMap();

    void d();

    @uo.a
    V g(K key, Callable<? extends V> loader) throws ExecutionException;

    void invalidateAll();

    @CheckForNull
    @uo.a
    V k(@uo.c("K") Object key);

    void l(Iterable<? extends Object> keys);

    ImmutableMap<K, V> o(Iterable<? extends Object> keys);

    d p();

    void put(K key, V value);

    void putAll(Map<? extends K, ? extends V> m11);

    long size();

    void u(@uo.c("K") Object key);
}
