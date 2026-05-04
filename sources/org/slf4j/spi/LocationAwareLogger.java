package org.slf4j.spi;

import org.slf4j.Logger;
import org.slf4j.Marker;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface LocationAwareLogger extends Logger {
    public static final int DEBUG_INT = 10;
    public static final int ERROR_INT = 40;
    public static final int INFO_INT = 20;
    public static final int TRACE_INT = 0;
    public static final int WARN_INT = 30;

    void log(Marker marker, String str, int i11, String str2, Object[] objArr, Throwable th2);
}
