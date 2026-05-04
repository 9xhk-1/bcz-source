package org.junit.platform.commons;

import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.5", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public class JUnitException extends RuntimeException {
    private static final long serialVersionUID = 1;

    public JUnitException(String message) {
        super(message);
    }

    public JUnitException(String message, Throwable cause) {
        super(message, cause);
    }
}
