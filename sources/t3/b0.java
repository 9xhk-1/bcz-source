package t3;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b0<T> implements k<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final ts.a<T, ? extends ts.f<T>> f89218a;

    public b0(@m80.k ts.a<T, ? extends ts.f<T>> adapter) {
        g0.p(adapter, "adapter");
        this.f89218a = adapter;
    }

    @Override // t3.k
    @m80.k
    public byte[] a(T t11) {
        return l7.d.a(t11, this.f89218a);
    }

    @Override // t3.k
    @m80.l
    public T b(@m80.k byte[] bytes) {
        g0.p(bytes, "bytes");
        return (T) l7.d.c(bytes, this.f89218a);
    }
}
