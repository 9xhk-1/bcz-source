package org.slf4j.event;

import java.util.List;
import org.slf4j.Marker;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface LoggingEvent {
    Object[] getArgumentArray();

    List<Object> getArguments();

    default String getCallerBoundary() {
        return null;
    }

    List<KeyValuePair> getKeyValuePairs();

    Level getLevel();

    String getLoggerName();

    List<Marker> getMarkers();

    String getMessage();

    String getThreadName();

    Throwable getThrowable();

    long getTimeStamp();
}
