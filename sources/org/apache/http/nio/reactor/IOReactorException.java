package org.apache.http.nio.reactor;

import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class IOReactorException extends IOException {
    private static final long serialVersionUID = -4248110651729635749L;

    public IOReactorException(String str, Exception exc) {
        super(str);
        if (exc != null) {
            initCause(exc);
        }
    }

    public IOReactorException(String str, Throwable th2) {
        super(str);
        if (th2 != null) {
            initCause(th2);
        }
    }

    public IOReactorException(String str) {
        super(str);
    }
}
