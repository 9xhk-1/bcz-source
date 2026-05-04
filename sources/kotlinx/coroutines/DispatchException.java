package kotlinx.coroutines;

import c40.m0;
import kotlin.coroutines.d;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class DispatchException extends Exception {

    @k
    private final Throwable cause;

    public DispatchException(@k Throwable th2, @k m0 m0Var, @k d dVar) {
        super("Coroutine dispatcher " + m0Var + " threw an exception, context = " + dVar, th2);
        this.cause = th2;
    }

    @Override // java.lang.Throwable
    @k
    public Throwable getCause() {
        return this.cause;
    }
}
