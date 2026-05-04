package l30;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class z<K, V> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final ConcurrentHashMap<String, Integer> f69848a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final AtomicInteger f69849b = new AtomicInteger(0);

    public static final int f(z zVar, String it) {
        g0.p(it, "it");
        return zVar.f69849b.getAndIncrement();
    }

    public abstract int b(@m80.k ConcurrentHashMap<String, Integer> concurrentHashMap, @m80.k String str, @m80.k x00.l<? super String, Integer> lVar);

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public final <T extends V, KK extends K> n<K, V, T> c(@m80.k h10.d<KK> kClass) {
        g0.p(kClass, "kClass");
        return new n<>(d(kClass));
    }

    public final <T extends K> int d(@m80.k h10.d<T> kClass) {
        g0.p(kClass, "kClass");
        String x11 = kClass.x();
        g0.m(x11);
        return e(x11);
    }

    public final int e(@m80.k String keyQualifiedName) {
        g0.p(keyQualifiedName, "keyQualifiedName");
        return b(this.f69848a, keyQualifiedName, new y(this));
    }

    @m80.k
    public final Collection<Integer> g() {
        Collection<Integer> values = this.f69848a.values();
        g0.o(values, "<get-values>(...)");
        return values;
    }
}
