package jo;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.u6;
import com.google.common.util.concurrent.UncheckedExecutionException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.c
@e
/* loaded from: classes7.dex */
public abstract class a<K, V> extends com.google.common.cache.a<K, V> implements i<K, V> {
    @Override // jo.i, ho.r
    public final V apply(K key) {
        return s(key);
    }

    @Override // jo.i
    @uo.a
    public V s(K key) {
        try {
            return get(key);
        } catch (ExecutionException e11) {
            throw new UncheckedExecutionException(e11.getCause());
        }
    }

    @Override // jo.i
    public ImmutableMap<K, V> t(Iterable<? extends K> keys) throws ExecutionException {
        LinkedHashMap c02 = u6.c0();
        for (K k11 : keys) {
            if (!c02.containsKey(k11)) {
                c02.put(k11, get(k11));
            }
        }
        return ImmutableMap.copyOf((Map) c02);
    }

    @Override // jo.i
    public void v(K key) {
        throw new UnsupportedOperationException();
    }
}
