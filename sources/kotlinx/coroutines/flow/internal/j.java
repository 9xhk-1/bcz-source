package kotlinx.coroutines.flow.internal;

import c40.r0;
import e40.g0;
import e40.i0;
import e40.k0;
import java.util.Iterator;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.channels.BufferOverflow;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelLimitedFlowMerge\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,96:1\n1863#2,2:97\n*S KotlinDebug\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelLimitedFlowMerge\n*L\n91#1:97,2\n*E\n"})
/* loaded from: classes8.dex */
public final class j<T> extends d<T> {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final Iterable<kotlinx.coroutines.flow.i<T>> f68206d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f68207a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.i<T> f68208b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ w<T> f68209c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlinx.coroutines.flow.i<? extends T> iVar, w<T> wVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f68208b = iVar;
            this.f68209c = wVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f68208b, this.f68209c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f68207a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                kotlinx.coroutines.flow.i<T> iVar = this.f68208b;
                w<T> wVar = this.f68209c;
                this.f68207a = 1;
                if (iVar.collect(wVar, this) == l11) {
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

    public /* synthetic */ j(Iterable iterable, kotlin.coroutines.d dVar, int i11, BufferOverflow bufferOverflow, int i12, kotlin.jvm.internal.v vVar) {
        this(iterable, (i12 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : dVar, (i12 & 4) != 0 ? -2 : i11, (i12 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @m80.l
    public Object i(@m80.k i0<? super T> i0Var, @m80.k j00.c<? super g2> cVar) {
        w wVar = new w(i0Var);
        Iterator<kotlinx.coroutines.flow.i<T>> it = this.f68206d.iterator();
        while (it.hasNext()) {
            c40.k.f(i0Var, null, null, new a(it.next(), wVar, null), 3, null);
        }
        return g2.f100423a;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @m80.k
    public d<T> j(@m80.k kotlin.coroutines.d dVar, int i11, @m80.k BufferOverflow bufferOverflow) {
        return new j(this.f68206d, dVar, i11, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @m80.k
    public k0<T> n(@m80.k r0 r0Var) {
        return g0.g(r0Var, this.f68158a, this.f68159b, l());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@m80.k Iterable<? extends kotlinx.coroutines.flow.i<? extends T>> iterable, @m80.k kotlin.coroutines.d dVar, int i11, @m80.k BufferOverflow bufferOverflow) {
        super(dVar, i11, bufferOverflow);
        this.f68206d = iterable;
    }
}
