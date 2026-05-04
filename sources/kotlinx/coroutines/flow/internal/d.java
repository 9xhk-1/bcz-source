package kotlinx.coroutines.flow.internal;

import c40.g2;
import c40.r0;
import c40.s0;
import e40.i0;
import e40.k0;
import java.util.ArrayList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@g2
@u0({"SMAP\nChannelFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,241:1\n1#2:242\n*E\n"})
/* loaded from: classes8.dex */
public abstract class d<T> implements p<T> {

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final kotlin.coroutines.d f68158a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f68159b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final BufferOverflow f68160c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f68161a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f68162b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.j<T> f68163c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d<T> f68164d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlinx.coroutines.flow.j<? super T> jVar, d<T> dVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f68163c = jVar;
            this.f68164d = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(this.f68163c, this.f68164d, cVar);
            aVar.f68162b = obj;
            return aVar;
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f68161a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                r0 r0Var = (r0) this.f68162b;
                kotlinx.coroutines.flow.j<T> jVar = this.f68163c;
                k0<T> n11 = this.f68164d.n(r0Var);
                this.f68161a = 1;
                if (kotlinx.coroutines.flow.k.n0(jVar, n11, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements x00.p<i0<? super T>, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f68165a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f68166b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d<T> f68167c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d<T> dVar, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f68167c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            b bVar = new b(this.f68167c, cVar);
            bVar.f68166b = obj;
            return bVar;
        }

        @Override // x00.p
        public final Object invoke(i0<? super T> i0Var, j00.c<? super yz.g2> cVar) {
            return ((b) create(i0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f68165a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                i0<? super T> i0Var = (i0) this.f68166b;
                d<T> dVar = this.f68167c;
                this.f68165a = 1;
                if (dVar.i(i0Var, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return yz.g2.f100423a;
        }
    }

    public d(@m80.k kotlin.coroutines.d dVar, int i11, @m80.k BufferOverflow bufferOverflow) {
        this.f68158a = dVar;
        this.f68159b = i11;
        this.f68160c = bufferOverflow;
    }

    public static /* synthetic */ <T> Object h(d<T> dVar, kotlinx.coroutines.flow.j<? super T> jVar, j00.c<? super yz.g2> cVar) {
        Object g11 = s0.g(new a(jVar, dVar, null), cVar);
        return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : yz.g2.f100423a;
    }

    @Override // kotlinx.coroutines.flow.i
    @m80.l
    public Object collect(@m80.k kotlinx.coroutines.flow.j<? super T> jVar, @m80.k j00.c<? super yz.g2> cVar) {
        return h(this, jVar, cVar);
    }

    @Override // kotlinx.coroutines.flow.internal.p
    @m80.k
    public kotlinx.coroutines.flow.i<T> e(@m80.k kotlin.coroutines.d dVar, int i11, @m80.k BufferOverflow bufferOverflow) {
        kotlin.coroutines.d plus = dVar.plus(this.f68158a);
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            int i12 = this.f68159b;
            if (i12 != -3) {
                if (i11 != -3) {
                    if (i12 != -2) {
                        if (i11 != -2) {
                            i11 += i12;
                            if (i11 < 0) {
                                i11 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i11 = i12;
            }
            bufferOverflow = this.f68160c;
        }
        return (g0.g(plus, this.f68158a) && i11 == this.f68159b && bufferOverflow == this.f68160c) ? this : j(plus, i11, bufferOverflow);
    }

    @m80.l
    public String g() {
        return null;
    }

    @m80.l
    public abstract Object i(@m80.k i0<? super T> i0Var, @m80.k j00.c<? super yz.g2> cVar);

    @m80.k
    public abstract d<T> j(@m80.k kotlin.coroutines.d dVar, int i11, @m80.k BufferOverflow bufferOverflow);

    @m80.l
    public kotlinx.coroutines.flow.i<T> k() {
        return null;
    }

    @m80.k
    public final x00.p<i0<? super T>, j00.c<? super yz.g2>, Object> l() {
        return new b(this, null);
    }

    public final int m() {
        int i11 = this.f68159b;
        if (i11 == -3) {
            return -2;
        }
        return i11;
    }

    @m80.k
    public k0<T> n(@m80.k r0 r0Var) {
        return e40.g0.i(r0Var, this.f68158a, m(), this.f68160c, CoroutineStart.ATOMIC, null, l(), 16, null);
    }

    @m80.k
    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String g11 = g();
        if (g11 != null) {
            arrayList.add(g11);
        }
        if (this.f68158a != EmptyCoroutineContext.INSTANCE) {
            arrayList.add("context=" + this.f68158a);
        }
        if (this.f68159b != -3) {
            arrayList.add("capacity=" + this.f68159b);
        }
        if (this.f68160c != BufferOverflow.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f68160c);
        }
        return c40.u0.a(this) + '[' + a00.r0.r3(arrayList, j2.O, null, null, 0, null, null, 62, null) + l50.b.f69930l;
    }
}
