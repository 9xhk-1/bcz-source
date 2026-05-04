package kotlinx.coroutines.flow;

import h40.x0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.channels.BufferOverflow;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,746:1\n1#2:747\n*E\n"})
/* loaded from: classes8.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final x0 f68130a = new x0("NO_VALUE");

    @m80.k
    public static final <T> x<T> a(int i11, int i12, @m80.k BufferOverflow bufferOverflow) {
        if (i11 < 0) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i11).toString());
        }
        if (i12 < 0) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i12).toString());
        }
        if (i11 > 0 || i12 > 0 || bufferOverflow == BufferOverflow.SUSPEND) {
            int i13 = i12 + i11;
            if (i13 < 0) {
                i13 = Integer.MAX_VALUE;
            }
            return new d0(i11, i13, bufferOverflow);
        }
        throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + bufferOverflow).toString());
    }

    public static /* synthetic */ x b(int i11, int i12, BufferOverflow bufferOverflow, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        if ((i13 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return a(i11, i12, bufferOverflow);
    }

    @m80.k
    public static final <T> i<T> e(@m80.k c0<? extends T> c0Var, @m80.k kotlin.coroutines.d dVar, int i11, @m80.k BufferOverflow bufferOverflow) {
        return ((i11 == 0 || i11 == -3) && bufferOverflow == BufferOverflow.SUSPEND) ? c0Var : new kotlinx.coroutines.flow.internal.h(c0Var, dVar, i11, bufferOverflow);
    }

    public static final Object f(Object[] objArr, long j11) {
        return objArr[((int) j11) & (objArr.length - 1)];
    }

    public static final void g(Object[] objArr, long j11, Object obj) {
        objArr[((int) j11) & (objArr.length - 1)] = obj;
    }
}
