package org.junit.jupiter.params.converter;

import org.apiguardian.api.API;
import org.junit.platform.commons.JUnitException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.7", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public class ArgumentConversionException extends JUnitException {
    private static final long serialVersionUID = 1;

    public ArgumentConversionException(String message) {
        super(message);
    }

    public ArgumentConversionException(String message, Throwable cause) {
        super(message, cause);
    }
}
