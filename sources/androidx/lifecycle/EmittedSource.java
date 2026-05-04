package androidx.lifecycle;

import androidx.annotation.MainThread;
import c40.h1;
import c40.k1;
import c40.s0;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class EmittedSource implements k1 {
    private boolean disposed;

    @k
    private final MediatorLiveData<?> mediator;

    @k
    private final LiveData<?> source;

    public EmittedSource(@k LiveData<?> source, @k MediatorLiveData<?> mediator) {
        g0.p(source, "source");
        g0.p(mediator, "mediator");
        this.source = source;
        this.mediator = mediator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public final void removeSource() {
        if (this.disposed) {
            return;
        }
        this.mediator.removeSource(this.source);
        this.disposed = true;
    }

    @Override // c40.k1
    public void dispose() {
        c40.k.f(s0.a(h1.e().q()), null, null, new EmittedSource$dispose$1(this, null), 3, null);
    }

    @l
    public final Object disposeNow(@k j00.c<? super g2> cVar) {
        Object h11 = c40.i.h(h1.e().q(), new EmittedSource$disposeNow$2(this, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }
}
