package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h<T> extends g<T, T> {
    public /* synthetic */ h(kotlinx.coroutines.flow.i iVar, kotlin.coroutines.d dVar, int i11, BufferOverflow bufferOverflow, int i12, kotlin.jvm.internal.v vVar) {
        this(iVar, (i12 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : dVar, (i12 & 4) != 0 ? -3 : i11, (i12 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @m80.k
    public d<T> j(@m80.k kotlin.coroutines.d dVar, int i11, @m80.k BufferOverflow bufferOverflow) {
        return new h(this.f68183d, dVar, i11, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @m80.k
    public kotlinx.coroutines.flow.i<T> k() {
        return (kotlinx.coroutines.flow.i<T>) this.f68183d;
    }

    @Override // kotlinx.coroutines.flow.internal.g
    @m80.l
    public Object s(@m80.k kotlinx.coroutines.flow.j<? super T> jVar, @m80.k j00.c<? super g2> cVar) {
        Object collect = this.f68183d.collect(jVar, cVar);
        return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
    }

    public h(@m80.k kotlinx.coroutines.flow.i<? extends T> iVar, @m80.k kotlin.coroutines.d dVar, int i11, @m80.k BufferOverflow bufferOverflow) {
        super(iVar, dVar, i11, bufferOverflow);
    }
}
