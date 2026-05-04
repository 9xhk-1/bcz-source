package k10;

import java.lang.ref.SoftReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l<V> extends ClassValue<SoftReference<V>> {

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final x00.l<Class<?>, V> f64958a;

    /* JADX WARN: Multi-variable type inference failed */
    public l(@m80.k x00.l<? super Class<?>, ? extends V> compute) {
        kotlin.jvm.internal.g0.p(compute, "compute");
        this.f64958a = compute;
    }

    @Override // java.lang.ClassValue
    @m80.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public SoftReference<V> computeValue(@m80.k Class<?> type) {
        kotlin.jvm.internal.g0.p(type, "type");
        return new SoftReference<>(this.f64958a.invoke(type));
    }

    @m80.k
    public final l<V> b() {
        return new l<>(this.f64958a);
    }
}
