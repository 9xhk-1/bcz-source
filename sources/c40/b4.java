package c40;

import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b4 {
    @m80.l
    public static final Object a(@m80.k j00.c<? super yz.g2> cVar) {
        Object l11;
        kotlin.coroutines.d context = cVar.getContext();
        n2.z(context);
        j00.c e11 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
        h40.l lVar = e11 instanceof h40.l ? (h40.l) e11 : null;
        if (lVar == null) {
            l11 = yz.g2.f100423a;
        } else {
            if (h40.m.f(lVar.f58240d, context)) {
                lVar.m(context, yz.g2.f100423a);
            } else {
                a4 a4Var = new a4();
                kotlin.coroutines.d plus = context.plus(a4Var);
                yz.g2 g2Var = yz.g2.f100423a;
                lVar.m(plus, g2Var);
                if (a4Var.f7818a) {
                    l11 = h40.m.g(lVar) ? kotlin.coroutines.intrinsics.b.l() : g2Var;
                }
            }
            l11 = kotlin.coroutines.intrinsics.b.l();
        }
        if (l11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return l11 == kotlin.coroutines.intrinsics.b.l() ? l11 : yz.g2.f100423a;
    }
}
