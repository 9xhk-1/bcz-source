package kotlinx.coroutines.flow.internal;

import c40.g2;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@g2
/* loaded from: classes8.dex */
public interface p<T> extends kotlinx.coroutines.flow.i<T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public static /* synthetic */ kotlinx.coroutines.flow.i a(p pVar, kotlin.coroutines.d dVar, int i11, BufferOverflow bufferOverflow, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i12 & 1) != 0) {
                dVar = EmptyCoroutineContext.INSTANCE;
            }
            if ((i12 & 2) != 0) {
                i11 = -3;
            }
            if ((i12 & 4) != 0) {
                bufferOverflow = BufferOverflow.SUSPEND;
            }
            return pVar.e(dVar, i11, bufferOverflow);
        }
    }

    @m80.k
    kotlinx.coroutines.flow.i<T> e(@m80.k kotlin.coroutines.d dVar, int i11, @m80.k BufferOverflow bufferOverflow);
}
