package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.channels.BufferOverflow;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/flow/ChannelAsFlow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n1#2:159\n*E\n"})
/* loaded from: classes8.dex */
public final class e<T> extends kotlinx.coroutines.flow.internal.d<T> {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f68127f = AtomicIntegerFieldUpdater.newUpdater(e.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final e40.k0<T> f68128d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f68129e;

    public /* synthetic */ e(e40.k0 k0Var, boolean z11, kotlin.coroutines.d dVar, int i11, BufferOverflow bufferOverflow, int i12, kotlin.jvm.internal.v vVar) {
        this(k0Var, z11, (i12 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : dVar, (i12 & 8) != 0 ? -3 : i11, (i12 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.d, kotlinx.coroutines.flow.i
    @m80.l
    public Object collect(@m80.k j<? super T> jVar, @m80.k j00.c<? super g2> cVar) {
        if (this.f68159b != -3) {
            Object collect = super.collect(jVar, cVar);
            return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
        }
        q();
        Object d11 = l.d(jVar, this.f68128d, this.f68129e, cVar);
        return d11 == kotlin.coroutines.intrinsics.b.l() ? d11 : g2.f100423a;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @m80.k
    public String g() {
        return "channel=" + this.f68128d;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @m80.l
    public Object i(@m80.k e40.i0<? super T> i0Var, @m80.k j00.c<? super g2> cVar) {
        Object d11 = l.d(new kotlinx.coroutines.flow.internal.w(i0Var), this.f68128d, this.f68129e, cVar);
        return d11 == kotlin.coroutines.intrinsics.b.l() ? d11 : g2.f100423a;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @m80.k
    public kotlinx.coroutines.flow.internal.d<T> j(@m80.k kotlin.coroutines.d dVar, int i11, @m80.k BufferOverflow bufferOverflow) {
        return new e(this.f68128d, this.f68129e, dVar, i11, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @m80.k
    public i<T> k() {
        return new e(this.f68128d, this.f68129e, null, 0, null, 28, null);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @m80.k
    public e40.k0<T> n(@m80.k c40.r0 r0Var) {
        q();
        return this.f68159b == -3 ? this.f68128d : super.n(r0Var);
    }

    public final /* synthetic */ int o() {
        return this.consumed$volatile;
    }

    public final void q() {
        if (this.f68129e && f68127f.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
    }

    public final /* synthetic */ void r(int i11) {
        this.consumed$volatile = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@m80.k e40.k0<? extends T> k0Var, boolean z11, @m80.k kotlin.coroutines.d dVar, int i11, @m80.k BufferOverflow bufferOverflow) {
        super(dVar, i11, bufferOverflow);
        this.f68128d = k0Var;
        this.f68129e = z11;
    }
}
