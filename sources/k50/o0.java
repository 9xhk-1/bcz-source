package k50;

import l50.u1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class o0<T> implements f50.i<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final f50.i<T> f65975a;

    public o0(@m80.k f50.i<T> tSerializer) {
        kotlin.jvm.internal.g0.p(tSerializer, "tSerializer");
        this.f65975a = tSerializer;
    }

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return this.f65975a.a();
    }

    @Override // f50.b0
    public final void b(@m80.k i50.h encoder, T t11) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        x e11 = w.e(encoder);
        e11.d(h(u1.e(e11.a(), t11, this.f65975a)));
    }

    @Override // f50.e
    public final T e(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        i d11 = w.d(decoder);
        return (T) d11.a().e(this.f65975a, g(d11.i()));
    }

    @m80.k
    public k g(@m80.k k element) {
        kotlin.jvm.internal.g0.p(element, "element");
        return element;
    }

    @m80.k
    public k h(@m80.k k element) {
        kotlin.jvm.internal.g0.p(element, "element");
        return element;
    }
}
