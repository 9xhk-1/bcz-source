package sx;

import java.io.Closeable;
import java.nio.channels.spi.SelectorProvider;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h {
    @k
    public static final g a(@k kotlin.coroutines.d dispatcher) {
        g0.p(dispatcher, "dispatcher");
        return new a(dispatcher);
    }

    public static /* synthetic */ g b(kotlin.coroutines.d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        return a(dVar);
    }

    public static final <C extends Closeable, R> R c(@k g gVar, @k l<? super SelectorProvider, ? extends C> create, @k l<? super C, ? extends R> setup) {
        g0.p(gVar, "<this>");
        g0.p(create, "create");
        g0.p(setup, "setup");
        C invoke = create.invoke(gVar.X());
        try {
            return setup.invoke(invoke);
        } catch (Throwable th2) {
            invoke.close();
            throw th2;
        }
    }
}
