package com.google.zxing;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class FormatException extends ReaderException {
    private static final FormatException INSTANCE;

    static {
        FormatException formatException = new FormatException();
        INSTANCE = formatException;
        formatException.setStackTrace(ReaderException.NO_TRACE);
    }

    private FormatException() {
    }

    public static FormatException getFormatInstance() {
        return ReaderException.isStackTrace ? new FormatException() : INSTANCE;
    }

    private FormatException(Throwable th2) {
        super(th2);
    }

    public static FormatException getFormatInstance(Throwable th2) {
        return ReaderException.isStackTrace ? new FormatException(th2) : INSTANCE;
    }
}
