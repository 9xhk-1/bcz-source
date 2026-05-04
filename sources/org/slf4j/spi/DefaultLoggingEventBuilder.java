package org.slf4j.spi;

import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.event.DefaultLoggingEvent;
import org.slf4j.event.KeyValuePair;
import org.slf4j.event.Level;
import org.slf4j.event.LoggingEvent;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class DefaultLoggingEventBuilder implements LoggingEventBuilder, CallerBoundaryAware {
    static String DLEB_FQCN = "org.slf4j.spi.DefaultLoggingEventBuilder";
    protected Logger logger;
    protected DefaultLoggingEvent loggingEvent;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: org.slf4j.spi.DefaultLoggingEventBuilder$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$slf4j$event$Level;

        static {
            int[] iArr = new int[Level.values().length];
            $SwitchMap$org$slf4j$event$Level = iArr;
            try {
                iArr[Level.TRACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$slf4j$event$Level[Level.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$slf4j$event$Level[Level.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$slf4j$event$Level[Level.WARN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$slf4j$event$Level[Level.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public DefaultLoggingEventBuilder(Logger logger, Level level) {
        this.logger = logger;
        this.loggingEvent = new DefaultLoggingEvent(level, logger);
    }

    private void logViaLocationAwareLoggerAPI(LocationAwareLogger locationAwareLogger, LoggingEvent loggingEvent) {
        loggingEvent.getMessage();
        loggingEvent.getMarkers();
        locationAwareLogger.log(null, loggingEvent.getCallerBoundary(), loggingEvent.getLevel().toInt(), mergeMarkersAndKeyValuePairsAndMessage(loggingEvent), loggingEvent.getArgumentArray(), loggingEvent.getThrowable());
    }

    private void logViaPublicSLF4JLoggerAPI(LoggingEvent loggingEvent) {
        Object[] argumentArray = loggingEvent.getArgumentArray();
        int length = argumentArray == null ? 0 : argumentArray.length;
        Throwable throwable = loggingEvent.getThrowable();
        Object[] objArr = new Object[(throwable == null ? 0 : 1) + length];
        if (argumentArray != null) {
            System.arraycopy(argumentArray, 0, objArr, 0, length);
        }
        if (throwable != null) {
            objArr[length] = throwable;
        }
        String mergeMarkersAndKeyValuePairsAndMessage = mergeMarkersAndKeyValuePairsAndMessage(loggingEvent);
        int i11 = AnonymousClass1.$SwitchMap$org$slf4j$event$Level[loggingEvent.getLevel().ordinal()];
        if (i11 == 1) {
            this.logger.trace(mergeMarkersAndKeyValuePairsAndMessage, objArr);
            return;
        }
        if (i11 == 2) {
            this.logger.debug(mergeMarkersAndKeyValuePairsAndMessage, objArr);
            return;
        }
        if (i11 == 3) {
            this.logger.info(mergeMarkersAndKeyValuePairsAndMessage, objArr);
        } else if (i11 == 4) {
            this.logger.warn(mergeMarkersAndKeyValuePairsAndMessage, objArr);
        } else {
            if (i11 != 5) {
                return;
            }
            this.logger.error(mergeMarkersAndKeyValuePairsAndMessage, objArr);
        }
    }

    private StringBuilder mergeKeyValuePairs(List<KeyValuePair> list, StringBuilder sb2) {
        if (list != null && !list.isEmpty()) {
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            for (KeyValuePair keyValuePair : list) {
                sb2.append(keyValuePair.key);
                sb2.append('=');
                sb2.append(keyValuePair.value);
                sb2.append(' ');
            }
        }
        return sb2;
    }

    private StringBuilder mergeMarkers(List<Marker> list, StringBuilder sb2) {
        if (list != null && !list.isEmpty()) {
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            Iterator<Marker> it = list.iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
                sb2.append(' ');
            }
        }
        return sb2;
    }

    private String mergeMarkersAndKeyValuePairsAndMessage(LoggingEvent loggingEvent) {
        return mergeMessage(loggingEvent.getMessage(), mergeKeyValuePairs(loggingEvent.getKeyValuePairs(), mergeMarkers(loggingEvent.getMarkers(), null)));
    }

    private String mergeMessage(String str, StringBuilder sb2) {
        if (sb2 == null) {
            return str;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public LoggingEventBuilder addArgument(Object obj) {
        this.loggingEvent.addArgument(obj);
        return this;
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public LoggingEventBuilder addKeyValue(String str, Object obj) {
        this.loggingEvent.addKeyValue(str, obj);
        return this;
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public LoggingEventBuilder addMarker(Marker marker) {
        this.loggingEvent.addMarker(marker);
        return this;
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public void log() {
        log(this.loggingEvent);
    }

    @Override // org.slf4j.spi.CallerBoundaryAware
    public void setCallerBoundary(String str) {
        this.loggingEvent.setCallerBoundary(str);
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public LoggingEventBuilder setCause(Throwable th2) {
        this.loggingEvent.setThrowable(th2);
        return this;
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public LoggingEventBuilder setMessage(String str) {
        this.loggingEvent.setMessage(str);
        return this;
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public LoggingEventBuilder addArgument(Supplier<?> supplier) {
        this.loggingEvent.addArgument(supplier.get());
        return this;
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public LoggingEventBuilder addKeyValue(String str, Supplier<Object> supplier) {
        this.loggingEvent.addKeyValue(str, supplier.get());
        return this;
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public void log(String str) {
        this.loggingEvent.setMessage(str);
        log(this.loggingEvent);
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public LoggingEventBuilder setMessage(Supplier<String> supplier) {
        this.loggingEvent.setMessage(supplier.get());
        return this;
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public void log(String str, Object obj) {
        this.loggingEvent.setMessage(str);
        this.loggingEvent.addArgument(obj);
        log(this.loggingEvent);
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public void log(String str, Object obj, Object obj2) {
        this.loggingEvent.setMessage(str);
        this.loggingEvent.addArgument(obj);
        this.loggingEvent.addArgument(obj2);
        log(this.loggingEvent);
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public void log(String str, Object... objArr) {
        this.loggingEvent.setMessage(str);
        this.loggingEvent.addArguments(objArr);
        log(this.loggingEvent);
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public void log(Supplier<String> supplier) {
        if (supplier == null) {
            log((String) null);
        } else {
            log(supplier.get());
        }
    }

    public void log(LoggingEvent loggingEvent) {
        if (loggingEvent.getCallerBoundary() == null) {
            setCallerBoundary(DLEB_FQCN);
        }
        Logger logger = this.logger;
        if (logger instanceof LoggingEventAware) {
            ((LoggingEventAware) logger).log(loggingEvent);
        } else if (logger instanceof LocationAwareLogger) {
            logViaLocationAwareLoggerAPI((LocationAwareLogger) logger, loggingEvent);
        } else {
            logViaPublicSLF4JLoggerAPI(loggingEvent);
        }
    }
}
