package xy;

import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface m0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public static /* synthetic */ io.ktor.utils.io.g a(m0 m0Var, io.ktor.utils.io.g gVar, kotlin.coroutines.d dVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
            }
            if ((i11 & 2) != 0) {
                dVar = EmptyCoroutineContext.INSTANCE;
            }
            return m0Var.a(gVar, dVar);
        }

        public static /* synthetic */ io.ktor.utils.io.g b(m0 m0Var, io.ktor.utils.io.g gVar, kotlin.coroutines.d dVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
            }
            if ((i11 & 2) != 0) {
                dVar = EmptyCoroutineContext.INSTANCE;
            }
            return m0Var.b(gVar, dVar);
        }

        public static /* synthetic */ io.ktor.utils.io.m c(m0 m0Var, io.ktor.utils.io.m mVar, kotlin.coroutines.d dVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
            }
            if ((i11 & 2) != 0) {
                dVar = EmptyCoroutineContext.INSTANCE;
            }
            return m0Var.c(mVar, dVar);
        }
    }

    @m80.k
    io.ktor.utils.io.g a(@m80.k io.ktor.utils.io.g gVar, @m80.k kotlin.coroutines.d dVar);

    @m80.k
    io.ktor.utils.io.g b(@m80.k io.ktor.utils.io.g gVar, @m80.k kotlin.coroutines.d dVar);

    @m80.k
    io.ktor.utils.io.m c(@m80.k io.ktor.utils.io.m mVar, @m80.k kotlin.coroutines.d dVar);
}
