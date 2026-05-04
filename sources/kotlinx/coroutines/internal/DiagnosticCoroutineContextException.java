package kotlinx.coroutines.internal;

import kotlin.coroutines.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class DiagnosticCoroutineContextException extends RuntimeException {

    @l
    private final transient d context;

    public DiagnosticCoroutineContextException(@k d dVar) {
        this.context = dVar;
    }

    @Override // java.lang.Throwable
    @k
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    @k
    public String getLocalizedMessage() {
        return String.valueOf(this.context);
    }
}
