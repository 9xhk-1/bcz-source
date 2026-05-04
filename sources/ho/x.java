package ho;

import java.time.Duration;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@j
@go.c
/* loaded from: classes7.dex */
public final class x {
    @u
    public static long a(Duration duration) {
        boolean isNegative;
        long nanos;
        try {
            nanos = duration.toNanos();
            return nanos;
        } catch (ArithmeticException unused) {
            isNegative = duration.isNegative();
            return isNegative ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
    }
}
