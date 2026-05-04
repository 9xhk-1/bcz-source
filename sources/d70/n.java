package d70;

import java.util.concurrent.ThreadFactory;
import org.apache.http.nio.reactor.IOReactorException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class n {
    public static x70.a a(h70.i iVar, ThreadFactory threadFactory) {
        try {
            return new h70.f(iVar, threadFactory);
        } catch (IOReactorException e11) {
            throw new IllegalStateException(e11);
        }
    }
}
