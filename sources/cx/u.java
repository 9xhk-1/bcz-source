package cx;

import ix.q0;
import mx.v;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@io.ktor.utils.io.b0
/* loaded from: classes8.dex */
public abstract class u extends v.c {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final yz.c0 f46920b = yz.e0.c(new x00.a() { // from class: cx.t
        @Override // x00.a
        public final Object invoke() {
            io.ktor.utils.io.b n11;
            n11 = u.n();
            return n11;
        }
    });

    public static final io.ktor.utils.io.b n() {
        return new io.ktor.utils.io.b(false, 1, null);
    }

    public final io.ktor.utils.io.b o() {
        return (io.ktor.utils.io.b) this.f46920b.getValue();
    }

    @m80.k
    public final io.ktor.utils.io.m p() {
        return o();
    }

    @m80.l
    public final Object r(@m80.k io.ktor.utils.io.m mVar, @m80.k j00.c<? super g2> cVar) {
        Object f11 = io.ktor.utils.io.j.f(o(), mVar, cVar);
        return f11 == kotlin.coroutines.intrinsics.b.l() ? f11 : g2.f100423a;
    }

    public abstract void s(@m80.k q0 q0Var);
}
