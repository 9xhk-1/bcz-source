package c40;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlinx.coroutines.CoroutinesInternalError;
import kotlinx.coroutines.DispatchException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDispatchedTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,220:1\n1#2:221\n103#3,10:222\n114#3,2:236\n204#4:232\n205#4:235\n57#5,2:233\n*S KotlinDebug\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTask\n*L\n82#1:222,10\n82#1:236,2\n95#1:232\n95#1:235\n95#1:233,2\n*E\n"})
/* loaded from: classes8.dex */
public abstract class e1<T> extends j40.g {

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public int f7841c;

    public e1(int i11) {
        this.f7841c = i11;
    }

    @m80.k
    public abstract j00.c<T> d();

    @m80.l
    public Throwable f(@m80.l Object obj) {
        c0 c0Var = obj instanceof c0 ? (c0) obj : null;
        if (c0Var != null) {
            return c0Var.f7827a;
        }
        return null;
    }

    public final void h(@m80.k Throwable th2) {
        o0.b(d().getContext(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    @m80.l
    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            j00.c<T> d11 = d();
            kotlin.jvm.internal.g0.n(d11, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            h40.l lVar = (h40.l) d11;
            j00.c<T> cVar = lVar.f58241e;
            Object obj = lVar.f58243g;
            kotlin.coroutines.d context = cVar.getContext();
            Object i11 = h40.g1.i(context, obj);
            l2 l2Var = null;
            x3<?> m11 = i11 != h40.g1.f58220a ? k0.m(cVar, context, i11) : null;
            try {
                kotlin.coroutines.d context2 = cVar.getContext();
                Object i12 = i();
                Throwable f11 = f(i12);
                if (f11 == null && f1.c(this.f7841c)) {
                    l2Var = (l2) context2.get(l2.f7886e0);
                }
                if (l2Var != null && !l2Var.isActive()) {
                    CancellationException y02 = l2Var.y0();
                    c(i12, y02);
                    Result.a aVar = Result.Companion;
                    cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(y02)));
                } else if (f11 != null) {
                    Result.a aVar2 = Result.Companion;
                    cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(f11)));
                } else {
                    Result.a aVar3 = Result.Companion;
                    cVar.resumeWith(Result.m6308constructorimpl(g(i12)));
                }
                yz.g2 g2Var = yz.g2.f100423a;
                if (m11 == null || m11.f2()) {
                    h40.g1.f(context, i11);
                }
            } catch (Throwable th2) {
                if (m11 == null || m11.f2()) {
                    h40.g1.f(context, i11);
                }
                throw th2;
            }
        } catch (DispatchException e11) {
            o0.b(d().getContext(), e11.getCause());
        } catch (Throwable th3) {
            h(th3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T g(@m80.l Object obj) {
        return obj;
    }

    public void c(@m80.l Object obj, @m80.k Throwable th2) {
    }
}
