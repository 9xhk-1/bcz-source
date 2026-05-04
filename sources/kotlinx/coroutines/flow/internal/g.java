package kotlinx.coroutines.flow.internal;

import c40.k0;
import e40.i0;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlinx.coroutines.channels.BufferOverflow;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class g<S, T> extends d<T> {

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final kotlinx.coroutines.flow.i<S> f68183d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements x00.p<kotlinx.coroutines.flow.j<? super T>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f68184a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f68185b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g<S, T> f68186c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g<S, T> gVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f68186c = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(this.f68186c, cVar);
            aVar.f68185b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f68184a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                kotlinx.coroutines.flow.j<? super T> jVar = (kotlinx.coroutines.flow.j) this.f68185b;
                g<S, T> gVar = this.f68186c;
                this.f68184a = 1;
                if (gVar.s(jVar, this) == l11) {
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

        @Override // x00.p
        public final Object invoke(kotlinx.coroutines.flow.j<? super T> jVar, j00.c<? super g2> cVar) {
            return ((a) create(jVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@m80.k kotlinx.coroutines.flow.i<? extends S> iVar, @m80.k kotlin.coroutines.d dVar, int i11, @m80.k BufferOverflow bufferOverflow) {
        super(dVar, i11, bufferOverflow);
        this.f68183d = iVar;
    }

    public static /* synthetic */ <S, T> Object p(g<S, T> gVar, kotlinx.coroutines.flow.j<? super T> jVar, j00.c<? super g2> cVar) {
        if (gVar.f68159b == -3) {
            kotlin.coroutines.d context = cVar.getContext();
            kotlin.coroutines.d k11 = k0.k(context, gVar.f68158a);
            if (g0.g(k11, context)) {
                Object s11 = gVar.s(jVar, cVar);
                return s11 == kotlin.coroutines.intrinsics.b.l() ? s11 : g2.f100423a;
            }
            c.b bVar = kotlin.coroutines.c.f66933w0;
            if (g0.g(k11.get(bVar), context.get(bVar))) {
                Object r11 = gVar.r(jVar, k11, cVar);
                return r11 == kotlin.coroutines.intrinsics.b.l() ? r11 : g2.f100423a;
            }
        }
        Object collect = super.collect(jVar, cVar);
        return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
    }

    public static /* synthetic */ <S, T> Object q(g<S, T> gVar, i0<? super T> i0Var, j00.c<? super g2> cVar) {
        Object s11 = gVar.s(new w(i0Var), cVar);
        return s11 == kotlin.coroutines.intrinsics.b.l() ? s11 : g2.f100423a;
    }

    @Override // kotlinx.coroutines.flow.internal.d, kotlinx.coroutines.flow.i
    @m80.l
    public Object collect(@m80.k kotlinx.coroutines.flow.j<? super T> jVar, @m80.k j00.c<? super g2> cVar) {
        return p(this, jVar, cVar);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @m80.l
    public Object i(@m80.k i0<? super T> i0Var, @m80.k j00.c<? super g2> cVar) {
        return q(this, i0Var, cVar);
    }

    public final Object r(kotlinx.coroutines.flow.j<? super T> jVar, kotlin.coroutines.d dVar, j00.c<? super g2> cVar) {
        kotlinx.coroutines.flow.j e11;
        e11 = e.e(jVar, cVar.getContext());
        return e.d(dVar, e11, null, new a(this, null), cVar, 4, null);
    }

    @m80.l
    public abstract Object s(@m80.k kotlinx.coroutines.flow.j<? super T> jVar, @m80.k j00.c<? super g2> cVar);

    @Override // kotlinx.coroutines.flow.internal.d
    @m80.k
    public String toString() {
        return this.f68183d + " -> " + super.toString();
    }
}
