package e40;

import c40.a3;
import e40.l0;
import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a3
@yz.n(level = DeprecationLevel.ERROR, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
/* loaded from: classes8.dex */
public interface d<E> extends l0<E> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public static /* synthetic */ void a(d dVar, CancellationException cancellationException, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i11 & 1) != 0) {
                cancellationException = null;
            }
            dVar.cancel(cancellationException);
        }

        public static /* synthetic */ boolean b(d dVar, Throwable th2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i11 & 1) != 0) {
                th2 = null;
            }
            return dVar.a(th2);
        }

        @yz.n(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @w0(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@m80.k d<E> dVar, E e11) {
            return l0.a.c(dVar, e11);
        }
    }

    @yz.n(level = DeprecationLevel.HIDDEN, message = "Binary compatibility only")
    /* synthetic */ boolean a(Throwable th2);

    void cancel(@m80.l CancellationException cancellationException);

    @m80.k
    k0<E> h();
}
