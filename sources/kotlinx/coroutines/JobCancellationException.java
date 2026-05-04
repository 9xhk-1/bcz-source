package kotlinx.coroutines;

import c40.g0;
import c40.l2;
import c40.x2;
import java.util.concurrent.CancellationException;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class JobCancellationException extends CancellationException implements g0<JobCancellationException> {

    @l
    private final transient l2 _job;

    public JobCancellationException(@k String str, @l Throwable th2, @k l2 l2Var) {
        super(str);
        this._job = l2Var;
        if (th2 != null) {
            initCause(th2);
        }
    }

    @Override // c40.g0
    @l
    public JobCancellationException createCopy() {
        return null;
    }

    public boolean equals(@l Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JobCancellationException)) {
            return false;
        }
        JobCancellationException jobCancellationException = (JobCancellationException) obj;
        return kotlin.jvm.internal.g0.g(jobCancellationException.getMessage(), getMessage()) && kotlin.jvm.internal.g0.g(jobCancellationException.getJob$kotlinx_coroutines_core(), getJob$kotlinx_coroutines_core()) && kotlin.jvm.internal.g0.g(jobCancellationException.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    @k
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @k
    public final l2 getJob$kotlinx_coroutines_core() {
        l2 l2Var = this._job;
        return l2Var == null ? x2.f8011a : l2Var;
    }

    public int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.g0.m(message);
        int hashCode = message.hashCode() * 31;
        l2 job$kotlinx_coroutines_core = getJob$kotlinx_coroutines_core();
        int hashCode2 = (hashCode + (job$kotlinx_coroutines_core != null ? job$kotlinx_coroutines_core.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return hashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    @k
    public String toString() {
        return super.toString() + "; job=" + getJob$kotlinx_coroutines_core();
    }
}
