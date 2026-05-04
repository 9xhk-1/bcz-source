package k00;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.u0;
import o00.f;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCancellationException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellationException.kt\nkotlin/coroutines/cancellation/CancellationExceptionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
/* loaded from: classes8.dex */
public final class a {
    @y0(version = "1.4")
    @f
    public static final CancellationException a(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    @y0(version = "1.4")
    @f
    public static final CancellationException b(Throwable th2) {
        CancellationException cancellationException = new CancellationException(th2 != null ? String.valueOf(th2) : null);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    @y0(version = "1.4")
    public static /* synthetic */ void c() {
    }
}
