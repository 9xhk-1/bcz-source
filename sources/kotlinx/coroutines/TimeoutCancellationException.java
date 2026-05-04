package kotlinx.coroutines;

import c40.g0;
import c40.l2;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import w00.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timeout.kt\nkotlinx/coroutines/TimeoutCancellationException\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n1#2:192\n*E\n"})
/* loaded from: classes8.dex */
public final class TimeoutCancellationException extends CancellationException implements g0<TimeoutCancellationException> {

    @l
    @g
    public final transient l2 coroutine;

    public TimeoutCancellationException(@k String str, @l l2 l2Var) {
        super(str);
        this.coroutine = l2Var;
    }

    @Override // c40.g0
    @k
    public TimeoutCancellationException createCopy() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        TimeoutCancellationException timeoutCancellationException = new TimeoutCancellationException(message, this.coroutine);
        timeoutCancellationException.initCause(this);
        return timeoutCancellationException;
    }

    public TimeoutCancellationException(@k String str) {
        this(str, null);
    }
}
