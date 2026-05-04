package e30;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final c f48553a = new c();

    public final boolean a(i30.o oVar, i30.h hVar, i30.h hVar2) {
        if (oVar.i(hVar) == oVar.i(hVar2) && oVar.B0(hVar) == oVar.B0(hVar2)) {
            if ((oVar.d0(hVar) == null) == (oVar.d0(hVar2) == null) && oVar.Z(oVar.d(hVar), oVar.d(hVar2))) {
                if (oVar.q0(hVar, hVar2)) {
                    return true;
                }
                int i11 = oVar.i(hVar);
                for (int i12 = 0; i12 < i11; i12++) {
                    i30.k C = oVar.C(hVar, i12);
                    i30.k C2 = oVar.C(hVar2, i12);
                    if (oVar.y(C) != oVar.y(C2)) {
                        return false;
                    }
                    if (!oVar.y(C) && (oVar.l(C) != oVar.l(C2) || !c(oVar, oVar.H(C), oVar.H(C2)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean b(@m80.k i30.o context, @m80.k i30.g a11, @m80.k i30.g b11) {
        kotlin.jvm.internal.g0.p(context, "context");
        kotlin.jvm.internal.g0.p(a11, "a");
        kotlin.jvm.internal.g0.p(b11, "b");
        return c(context, a11, b11);
    }

    public final boolean c(i30.o oVar, i30.g gVar, i30.g gVar2) {
        if (gVar == gVar2) {
            return true;
        }
        i30.h f11 = oVar.f(gVar);
        i30.h f12 = oVar.f(gVar2);
        if (f11 != null && f12 != null) {
            return a(oVar, f11, f12);
        }
        i30.e D0 = oVar.D0(gVar);
        i30.e D02 = oVar.D0(gVar2);
        return D0 != null && D02 != null && a(oVar, oVar.c(D0), oVar.c(D02)) && a(oVar, oVar.a(D0), oVar.a(D02));
    }
}
