package com.google.common.cache;

import com.google.common.cache.d;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.c
@jo.e
/* loaded from: classes7.dex */
public interface e<K, V> {
    @CheckForNull
    d.a0<K, V> a();

    int b();

    void c(e<K, V> previous);

    e<K, V> d();

    void e(d.a0<K, V> valueReference);

    long f();

    void g(long time);

    @CheckForNull
    K getKey();

    @CheckForNull
    e<K, V> getNext();

    void i(long time);

    e<K, V> k();

    e<K, V> l();

    e<K, V> m();

    long o();

    void p(e<K, V> next);

    void q(e<K, V> next);

    void r(e<K, V> previous);
}
