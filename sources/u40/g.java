package u40;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g<T, E> implements v<T> {

    /* renamed from: a, reason: collision with root package name */
    public final E f91790a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.l<T, E> f91791b;

    /* JADX WARN: Multi-variable type inference failed */
    public g(E e11, @m80.k x00.l<? super T, ? extends E> getter) {
        g0.p(getter, "getter");
        this.f91790a = e11;
        this.f91791b = getter;
    }

    @Override // u40.v
    public boolean test(T t11) {
        return g0.g(this.f91791b.invoke(t11), this.f91790a);
    }
}
