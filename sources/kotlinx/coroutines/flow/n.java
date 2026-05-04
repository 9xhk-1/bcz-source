package kotlinx.coroutines.flow;

import c40.l2;
import kotlin.DeprecationLevel;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final /* synthetic */ class n {
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final /* synthetic */ i a(i iVar, int i11) {
        return d(iVar, i11, null, 2, null);
    }

    @m80.k
    public static final <T> i<T> b(@m80.k i<? extends T> iVar, int i11, @m80.k BufferOverflow bufferOverflow) {
        if (i11 < 0 && i11 != -2 && i11 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i11).toString());
        }
        if (i11 == -1 && bufferOverflow != BufferOverflow.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i11 == -1) {
            bufferOverflow = BufferOverflow.DROP_OLDEST;
            i11 = 0;
        }
        int i12 = i11;
        BufferOverflow bufferOverflow2 = bufferOverflow;
        if (iVar instanceof kotlinx.coroutines.flow.internal.p) {
            return p.a.a((kotlinx.coroutines.flow.internal.p) iVar, null, i12, bufferOverflow2, 1, null);
        }
        return new kotlinx.coroutines.flow.internal.h(iVar, null, i12, bufferOverflow2, 2, null);
    }

    public static /* synthetic */ i c(i iVar, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = -2;
        }
        return a(iVar, i11);
    }

    public static /* synthetic */ i d(i iVar, int i11, BufferOverflow bufferOverflow, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = -2;
        }
        if ((i12 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return k.p(iVar, i11, bufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final <T> i<T> e(@m80.k i<? extends T> iVar) {
        return iVar instanceof c ? iVar : new d(iVar);
    }

    public static final void f(kotlin.coroutines.d dVar) {
        if (dVar.get(l2.f7886e0) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + dVar).toString());
    }

    @m80.k
    public static final <T> i<T> g(@m80.k i<? extends T> iVar) {
        return d(iVar, -1, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final <T> i<T> h(@m80.k i<? extends T> iVar, @m80.k kotlin.coroutines.d dVar) {
        f(dVar);
        if (kotlin.jvm.internal.g0.g(dVar, EmptyCoroutineContext.INSTANCE)) {
            return iVar;
        }
        if (iVar instanceof kotlinx.coroutines.flow.internal.p) {
            return p.a.a((kotlinx.coroutines.flow.internal.p) iVar, dVar, 0, null, 6, null);
        }
        return new kotlinx.coroutines.flow.internal.h(iVar, dVar, 0, null, 12, null);
    }
}
