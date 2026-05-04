package y10;

import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i0<T> implements g0<T> {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Map<n20.c, T> f99090b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final d30.f f99091c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final d30.h<n20.c, T> f99092d;

    /* JADX WARN: Multi-variable type inference failed */
    public i0(@m80.k Map<n20.c, ? extends T> states) {
        kotlin.jvm.internal.g0.p(states, "states");
        this.f99090b = states;
        d30.f fVar = new d30.f("Java nullability annotation states");
        this.f99091c = fVar;
        d30.h<n20.c, T> h11 = fVar.h(new h0(this));
        kotlin.jvm.internal.g0.o(h11, "createMemoizedFunctionWithNullableValues(...)");
        this.f99092d = h11;
    }

    public static final Object c(i0 i0Var, n20.c cVar) {
        kotlin.jvm.internal.g0.m(cVar);
        return n20.e.a(cVar, i0Var.f99090b);
    }

    @Override // y10.g0
    @m80.l
    public T a(@m80.k n20.c fqName) {
        kotlin.jvm.internal.g0.p(fqName, "fqName");
        return this.f99092d.invoke(fqName);
    }
}
