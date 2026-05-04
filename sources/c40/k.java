package c40;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.c;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nBuilders.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.common.kt\nkotlinx/coroutines/BuildersKt__Builders_commonKt\n+ 2 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,268:1\n91#2,5:269\n*S KotlinDebug\n*F\n+ 1 Builders.common.kt\nkotlinx/coroutines/BuildersKt__Builders_commonKt\n*L\n164#1:269,5\n*E\n"})
/* loaded from: classes8.dex */
public final /* synthetic */ class k {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7879a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f7880b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7881c = 2;

    @m80.k
    public static final <T> x0<T> a(@m80.k r0 r0Var, @m80.k kotlin.coroutines.d dVar, @m80.k CoroutineStart coroutineStart, @m80.k x00.p<? super r0, ? super j00.c<? super T>, ? extends Object> pVar) {
        kotlin.coroutines.d j11 = k0.j(r0Var, dVar);
        y0 t2Var = coroutineStart.isLazy() ? new t2(j11, pVar) : new y0(j11, true);
        ((a) t2Var).d2(coroutineStart, t2Var, pVar);
        return (x0<T>) t2Var;
    }

    public static /* synthetic */ x0 b(r0 r0Var, kotlin.coroutines.d dVar, CoroutineStart coroutineStart, x00.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return i.a(r0Var, dVar, coroutineStart, pVar);
    }

    @m80.l
    public static final <T> Object c(@m80.k m0 m0Var, @m80.k x00.p<? super r0, ? super j00.c<? super T>, ? extends Object> pVar, @m80.k j00.c<? super T> cVar) {
        return i.h(m0Var, pVar, cVar);
    }

    public static final <T> Object d(m0 m0Var, x00.p<? super r0, ? super j00.c<? super T>, ? extends Object> pVar, j00.c<? super T> cVar) {
        kotlin.jvm.internal.d0.e(0);
        Object h11 = i.h(m0Var, pVar, cVar);
        kotlin.jvm.internal.d0.e(1);
        return h11;
    }

    @m80.k
    public static final l2 e(@m80.k r0 r0Var, @m80.k kotlin.coroutines.d dVar, @m80.k CoroutineStart coroutineStart, @m80.k x00.p<? super r0, ? super j00.c<? super yz.g2>, ? extends Object> pVar) {
        kotlin.coroutines.d j11 = k0.j(r0Var, dVar);
        a u2Var = coroutineStart.isLazy() ? new u2(j11, pVar) : new i3(j11, true);
        u2Var.d2(coroutineStart, u2Var, pVar);
        return u2Var;
    }

    public static /* synthetic */ l2 f(r0 r0Var, kotlin.coroutines.d dVar, CoroutineStart coroutineStart, x00.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return i.d(r0Var, dVar, coroutineStart, pVar);
    }

    @m80.l
    public static final <T> Object g(@m80.k kotlin.coroutines.d dVar, @m80.k x00.p<? super r0, ? super j00.c<? super T>, ? extends Object> pVar, @m80.k j00.c<? super T> cVar) {
        Object f22;
        kotlin.coroutines.d context = cVar.getContext();
        kotlin.coroutines.d k11 = k0.k(context, dVar);
        n2.z(k11);
        if (k11 == context) {
            h40.t0 t0Var = new h40.t0(k11, cVar);
            f22 = i40.b.d(t0Var, t0Var, pVar);
        } else {
            c.b bVar = kotlin.coroutines.c.f66933w0;
            if (kotlin.jvm.internal.g0.g(k11.get(bVar), context.get(bVar))) {
                x3 x3Var = new x3(k11, cVar);
                kotlin.coroutines.d context2 = x3Var.getContext();
                Object i11 = h40.g1.i(context2, null);
                try {
                    Object d11 = i40.b.d(x3Var, x3Var, pVar);
                    h40.g1.f(context2, i11);
                    f22 = d11;
                } catch (Throwable th2) {
                    h40.g1.f(context2, i11);
                    throw th2;
                }
            } else {
                d1 d1Var = new d1(k11, cVar);
                i40.a.e(pVar, d1Var, d1Var);
                f22 = d1Var.f2();
            }
        }
        if (f22 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return f22;
    }
}
