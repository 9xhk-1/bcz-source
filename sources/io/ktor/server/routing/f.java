package io.ktor.server.routing;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f extends h0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final ix.k f61613a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final i f61614b;

    public f(@m80.k ix.k contentType) {
        kotlin.jvm.internal.g0.p(contentType, "contentType");
        this.f61613a = contentType;
        this.f61614b = new i(a00.g0.l(contentType));
    }

    public static /* synthetic */ f d(f fVar, ix.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kVar = fVar.f61613a;
        }
        return fVar.c(kVar);
    }

    @Override // io.ktor.server.routing.h0
    @m80.l
    public Object a(@m80.k p1 p1Var, int i11, @m80.k j00.c<? super i0> cVar) {
        return this.f61614b.a(p1Var, i11, cVar);
    }

    @m80.k
    public final ix.k b() {
        return this.f61613a;
    }

    @m80.k
    public final f c(@m80.k ix.k contentType) {
        kotlin.jvm.internal.g0.p(contentType, "contentType");
        return new f(contentType);
    }

    @m80.k
    public final ix.k e() {
        return this.f61613a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && kotlin.jvm.internal.g0.g(this.f61613a, ((f) obj).f61613a);
    }

    public int hashCode() {
        return this.f61613a.hashCode();
    }

    @m80.k
    public String toString() {
        return "(contentType:" + this.f61613a + ')';
    }
}
