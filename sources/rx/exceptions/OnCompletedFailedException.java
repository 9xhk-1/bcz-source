package rx.exceptions;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class OnCompletedFailedException extends RuntimeException {
    private static final long serialVersionUID = 8622579378868820554L;

    public OnCompletedFailedException(Throwable th2) {
        super(th2 == null ? new NullPointerException() : th2);
    }

    public OnCompletedFailedException(String str, Throwable th2) {
        super(str, th2 == null ? new NullPointerException() : th2);
    }
}
