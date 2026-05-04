package rx.exceptions;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class UnsubscribeFailedException extends RuntimeException {
    private static final long serialVersionUID = 4594672310593167598L;

    public UnsubscribeFailedException(Throwable th2) {
        super(th2 == null ? new NullPointerException() : th2);
    }

    public UnsubscribeFailedException(String str, Throwable th2) {
        super(str, th2 == null ? new NullPointerException() : th2);
    }
}
