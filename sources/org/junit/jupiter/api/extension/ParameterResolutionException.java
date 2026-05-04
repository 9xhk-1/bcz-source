package org.junit.jupiter.api.extension;

import org.apiguardian.api.API;
import org.junit.platform.commons.JUnitException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public class ParameterResolutionException extends JUnitException {
    private static final long serialVersionUID = 1;

    public ParameterResolutionException(String message) {
        super(message);
    }

    public ParameterResolutionException(String message, Throwable cause) {
        super(message, cause);
    }
}
