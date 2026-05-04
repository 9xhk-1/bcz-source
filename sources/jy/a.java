package jy;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final x00.a<T> f64717a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public T f64718b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@m80.k x00.a<? extends T> property) {
        g0.p(property, "property");
        this.f64717a = property;
    }

    @m80.k
    public final x00.a<T> a() {
        return this.f64717a;
    }

    @m80.k
    public final T b(@m80.k Object thisRef, @m80.k h10.n<?> property) {
        g0.p(thisRef, "thisRef");
        g0.p(property, "property");
        T t11 = this.f64718b;
        return t11 == null ? this.f64717a.invoke() : t11;
    }

    public final void c(@m80.k Object thisRef, @m80.k h10.n<?> property, @m80.k T value) {
        g0.p(thisRef, "thisRef");
        g0.p(property, "property");
        g0.p(value, "value");
        this.f64718b = value;
    }
}
