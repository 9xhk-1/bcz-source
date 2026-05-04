package a90;

import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class n2 {
    public static TimeoutException a(String methodSignature, k2 timeoutDuration) {
        return b(methodSignature, timeoutDuration, null);
    }

    public static TimeoutException b(String methodSignature, k2 timeoutDuration, Throwable failure) {
        TimeoutException timeoutException = new TimeoutException(String.format("%s timed out after %s", ba0.c2.r(methodSignature, "method signature must not be null"), ba0.c2.r(timeoutDuration, "timeout duration must not be null")));
        if (failure != null) {
            timeoutException.addSuppressed(failure);
        }
        return timeoutException;
    }
}
