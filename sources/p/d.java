package p;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class d {
    @k
    public static final Throwable a(@k Throwable th2) {
        g0.p(th2, "<this>");
        if (th2 instanceof VirtualMachineError) {
            throw th2;
        }
        if (th2 instanceof ThreadDeath) {
            throw th2;
        }
        if (th2 instanceof InterruptedException) {
            throw th2;
        }
        if (th2 instanceof LinkageError) {
            throw th2;
        }
        if (th2 instanceof CancellationException) {
            throw th2;
        }
        return th2;
    }
}
