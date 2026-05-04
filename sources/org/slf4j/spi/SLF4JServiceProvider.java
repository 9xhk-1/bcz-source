package org.slf4j.spi;

import org.slf4j.ILoggerFactory;
import org.slf4j.IMarkerFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface SLF4JServiceProvider {
    ILoggerFactory getLoggerFactory();

    MDCAdapter getMDCAdapter();

    IMarkerFactory getMarkerFactory();

    String getRequestedApiVersion();

    void initialize();
}
