package mx;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.EmptyCoroutineContext;
import mx.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i {
    @m80.l
    public static final v c(@m80.k final v vVar, @m80.k xy.z contentEncoder, @m80.k kotlin.coroutines.d coroutineContext) {
        kotlin.jvm.internal.g0.p(vVar, "<this>");
        kotlin.jvm.internal.g0.p(contentEncoder, "contentEncoder");
        kotlin.jvm.internal.g0.p(coroutineContext, "coroutineContext");
        if (vVar instanceof v.e) {
            return new l(vVar, new x00.a() { // from class: mx.g
                @Override // x00.a
                public final Object invoke() {
                    io.ktor.utils.io.g e11;
                    e11 = i.e(v.this);
                    return e11;
                }
            }, contentEncoder, coroutineContext);
        }
        if (vVar instanceof v.f) {
            return new o((v.f) vVar, contentEncoder, coroutineContext);
        }
        if (vVar instanceof v.a) {
            return new l(vVar, new x00.a() { // from class: mx.h
                @Override // x00.a
                public final Object invoke() {
                    io.ktor.utils.io.g f11;
                    f11 = i.f(v.this);
                    return f11;
                }
            }, contentEncoder, coroutineContext);
        }
        if ((vVar instanceof v.c) || (vVar instanceof v.d)) {
            return null;
        }
        if (vVar instanceof v.b) {
            return c(((v.b) vVar).n(), contentEncoder, coroutineContext);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ v d(v vVar, xy.z zVar, kotlin.coroutines.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        return c(vVar, zVar, dVar);
    }

    public static final io.ktor.utils.io.g e(v vVar) {
        return ((v.e) vVar).m();
    }

    public static final io.ktor.utils.io.g f(v vVar) {
        return io.ktor.utils.io.c.e(((v.a) vVar).m(), 0, 0, 6, null);
    }
}
