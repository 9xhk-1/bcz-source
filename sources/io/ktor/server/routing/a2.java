package io.ktor.server.routing;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a2 extends h0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a2 f61578a = new a2();

    @Override // io.ktor.server.routing.h0
    @m80.l
    public Object a(@m80.k p1 p1Var, int i11, @m80.k j00.c<? super i0> cVar) {
        return k.e(p1Var.c()) ? i0.f61619b.i() : p1Var.f().isEmpty() ? i0.f61619b.a() : i11 < a00.h0.L(p1Var.f()) ? i0.f61619b.i() : i11 > a00.h0.L(p1Var.f()) ? i0.f61619b.f() : p1Var.f().get(i11).length() > 0 ? i0.f61619b.i() : p1Var.d() ? i0.f61619b.b() : i0.f61619b.f();
    }

    @m80.k
    public String toString() {
        return "<slash>";
    }
}
