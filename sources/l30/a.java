package l30;

import java.util.Iterator;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class a<K, V> implements Iterable<V>, y00.a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: l30.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0839a<K, V, T extends V> {

        /* renamed from: a, reason: collision with root package name */
        public final int f69760a;

        public AbstractC0839a(int i11) {
            this.f69760a = i11;
        }

        @m80.l
        public final T a(@m80.k a<K, V> thisRef) {
            g0.p(thisRef, "thisRef");
            return thisRef.a().get(this.f69760a);
        }
    }

    @m80.k
    public abstract c<V> a();

    @m80.k
    public abstract z<K, V> b();

    public final void d(@m80.k h10.d<? extends K> tClass, @m80.k V value) {
        g0.p(tClass, "tClass");
        g0.p(value, "value");
        String x11 = tClass.x();
        g0.m(x11);
        f(x11, value);
    }

    public abstract void f(@m80.k String str, @m80.k V v11);

    public final boolean isEmpty() {
        return a().a() == 0;
    }

    @Override // java.lang.Iterable
    @m80.k
    public final Iterator<V> iterator() {
        return a().iterator();
    }
}
