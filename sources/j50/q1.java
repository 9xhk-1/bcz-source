package j50;

import java.lang.ref.SoftReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/MutableSoftReference\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n1#2:220\n*E\n"})
/* loaded from: classes8.dex */
public final class q1<T> {

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public volatile SoftReference<T> f63452a = new SoftReference<>(null);

    public final synchronized T a(@m80.k x00.a<? extends T> factory) {
        kotlin.jvm.internal.g0.p(factory, "factory");
        T t11 = this.f63452a.get();
        if (t11 != null) {
            return t11;
        }
        T invoke = factory.invoke();
        this.f63452a = new SoftReference<>(invoke);
        return invoke;
    }
}
