package kotlinx.datetime;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class DateTimeFormatException extends IllegalArgumentException {
    public DateTimeFormatException() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateTimeFormatException(@m80.k String message) {
        super(message);
        g0.p(message, "message");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateTimeFormatException(@m80.k Throwable cause) {
        super(cause);
        g0.p(cause, "cause");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateTimeFormatException(@m80.k String message, @m80.k Throwable cause) {
        super(message, cause);
        g0.p(message, "message");
        g0.p(cause, "cause");
    }
}
