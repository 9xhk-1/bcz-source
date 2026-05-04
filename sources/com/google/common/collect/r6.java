package com.google.common.collect;

import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b
@uo.f("Use Maps.difference")
@u3
/* loaded from: classes7.dex */
public interface r6<K, V> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @uo.f("Use Maps.difference")
    public interface a<V> {
        @t7
        V a();

        @t7
        V b();

        boolean equals(@CheckForNull Object other);

        int hashCode();
    }

    Map<K, a<V>> a();

    Map<K, V> b();

    Map<K, V> c();

    Map<K, V> d();

    boolean e();

    boolean equals(@CheckForNull Object object);

    int hashCode();
}
