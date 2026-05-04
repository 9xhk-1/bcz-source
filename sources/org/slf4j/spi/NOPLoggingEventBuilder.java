package org.slf4j.spi;

import java.util.function.Supplier;
import org.slf4j.Marker;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class NOPLoggingEventBuilder implements LoggingEventBuilder {
    static final NOPLoggingEventBuilder SINGLETON = new NOPLoggingEventBuilder();

    private NOPLoggingEventBuilder() {
    }

    public static LoggingEventBuilder singleton() {
        return SINGLETON;
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public LoggingEventBuilder addArgument(Object obj) {
        return singleton();
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public LoggingEventBuilder addKeyValue(String str, Object obj) {
        return singleton();
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public LoggingEventBuilder addMarker(Marker marker) {
        return singleton();
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public void log() {
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public LoggingEventBuilder setCause(Throwable th2) {
        return singleton();
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public LoggingEventBuilder setMessage(String str) {
        return this;
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public LoggingEventBuilder addArgument(Supplier<?> supplier) {
        return singleton();
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public LoggingEventBuilder addKeyValue(String str, Supplier<Object> supplier) {
        return singleton();
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public void log(String str) {
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public LoggingEventBuilder setMessage(Supplier<String> supplier) {
        return this;
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public void log(String str, Object obj) {
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public void log(String str, Object obj, Object obj2) {
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public void log(String str, Object... objArr) {
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public void log(Supplier<String> supplier) {
    }
}
