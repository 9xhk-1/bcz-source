package org.slf4j;

import org.slf4j.helpers.BasicMarkerFactory;
import org.slf4j.helpers.Reporter;
import org.slf4j.spi.SLF4JServiceProvider;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class MarkerFactory {
    static IMarkerFactory MARKER_FACTORY;

    static {
        SLF4JServiceProvider provider = LoggerFactory.getProvider();
        if (provider != null) {
            MARKER_FACTORY = provider.getMarkerFactory();
            return;
        }
        Reporter.error("Failed to find provider");
        Reporter.error("Defaulting to BasicMarkerFactory.");
        MARKER_FACTORY = new BasicMarkerFactory();
    }

    private MarkerFactory() {
    }

    public static Marker getDetachedMarker(String str) {
        return MARKER_FACTORY.getDetachedMarker(str);
    }

    public static IMarkerFactory getIMarkerFactory() {
        return MARKER_FACTORY;
    }

    public static Marker getMarker(String str) {
        return MARKER_FACTORY.getMarker(str);
    }
}
