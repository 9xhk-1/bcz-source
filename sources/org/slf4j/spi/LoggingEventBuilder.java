package org.slf4j.spi;

import java.util.function.Supplier;
import org.slf4j.Marker;
import org.slf4j.helpers.CheckReturnValue;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface LoggingEventBuilder {
    @CheckReturnValue
    LoggingEventBuilder addArgument(Object obj);

    @CheckReturnValue
    LoggingEventBuilder addArgument(Supplier<?> supplier);

    @CheckReturnValue
    LoggingEventBuilder addKeyValue(String str, Object obj);

    @CheckReturnValue
    LoggingEventBuilder addKeyValue(String str, Supplier<Object> supplier);

    @CheckReturnValue
    LoggingEventBuilder addMarker(Marker marker);

    void log();

    void log(String str);

    void log(String str, Object obj);

    void log(String str, Object obj, Object obj2);

    void log(String str, Object... objArr);

    void log(Supplier<String> supplier);

    @CheckReturnValue
    LoggingEventBuilder setCause(Throwable th2);

    @CheckReturnValue
    LoggingEventBuilder setMessage(String str);

    @CheckReturnValue
    LoggingEventBuilder setMessage(Supplier<String> supplier);
}
