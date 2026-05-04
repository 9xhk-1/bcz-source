package kotlinx.coroutines.flow;

import c40.l2;
import kotlin.DeprecationLevel;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final /* synthetic */ class FlowKt__CollectKt {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f67820a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i<T> f67821b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(i<? extends T> iVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f67821b = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f67821b, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f67820a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                i<T> iVar = this.f67821b;
                this.f67820a = 1;
                if (k.z(iVar, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return g2.f100423a;
        }
    }

    @m80.l
    public static final Object a(@m80.k i<?> iVar, @m80.k j00.c<? super g2> cVar) {
        Object collect = iVar.collect(kotlinx.coroutines.flow.internal.r.f68281a, cVar);
        return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
    }

    @yz.n(level = DeprecationLevel.HIDDEN, message = "Backwards compatibility with JS and K/N")
    public static final /* synthetic */ <T> Object b(i<? extends T> iVar, x00.p<? super T, ? super j00.c<? super g2>, ? extends Object> pVar, j00.c<? super g2> cVar) {
        Object collect = iVar.collect(new FlowKt__CollectKt$collect$3(pVar), cVar);
        return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
    }

    @yz.n(level = DeprecationLevel.HIDDEN, message = "Backwards compatibility with JS and K/N")
    public static final /* synthetic */ <T> Object c(i<? extends T> iVar, x00.p<? super T, ? super j00.c<? super g2>, ? extends Object> pVar, j00.c<? super g2> cVar) {
        FlowKt__CollectKt$collect$3 flowKt__CollectKt$collect$3 = new FlowKt__CollectKt$collect$3(pVar);
        kotlin.jvm.internal.d0.e(0);
        iVar.collect(flowKt__CollectKt$collect$3, cVar);
        kotlin.jvm.internal.d0.e(1);
        return g2.f100423a;
    }

    @m80.l
    public static final <T> Object d(@m80.k i<? extends T> iVar, @m80.k x00.q<? super Integer, ? super T, ? super j00.c<? super g2>, ? extends Object> qVar, @m80.k j00.c<? super g2> cVar) {
        Object collect = iVar.collect(new FlowKt__CollectKt$collectIndexed$2(qVar), cVar);
        return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
    }

    public static final <T> Object e(i<? extends T> iVar, x00.q<? super Integer, ? super T, ? super j00.c<? super g2>, ? extends Object> qVar, j00.c<? super g2> cVar) {
        FlowKt__CollectKt$collectIndexed$2 flowKt__CollectKt$collectIndexed$2 = new FlowKt__CollectKt$collectIndexed$2(qVar);
        kotlin.jvm.internal.d0.e(0);
        iVar.collect(flowKt__CollectKt$collectIndexed$2, cVar);
        kotlin.jvm.internal.d0.e(1);
        return g2.f100423a;
    }

    @m80.l
    public static final <T> Object f(@m80.k i<? extends T> iVar, @m80.k x00.p<? super T, ? super j00.c<? super g2>, ? extends Object> pVar, @m80.k j00.c<? super g2> cVar) {
        Object z11 = k.z(n.d(k.Y0(iVar, pVar), 0, null, 2, null), cVar);
        return z11 == kotlin.coroutines.intrinsics.b.l() ? z11 : g2.f100423a;
    }

    @m80.l
    public static final <T> Object g(@m80.k j<? super T> jVar, @m80.k i<? extends T> iVar, @m80.k j00.c<? super g2> cVar) {
        k.q0(jVar);
        Object collect = iVar.collect(jVar, cVar);
        return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
    }

    @m80.k
    public static final <T> l2 h(@m80.k i<? extends T> iVar, @m80.k c40.r0 r0Var) {
        l2 f11;
        f11 = c40.k.f(r0Var, null, null, new a(iVar, null), 3, null);
        return f11;
    }
}
