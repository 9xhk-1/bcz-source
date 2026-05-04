package org.slf4j.helpers;

import org.slf4j.Marker;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class LegacyAbstractLogger extends AbstractLogger {
    private static final long serialVersionUID = -7041884104854048950L;

    @Override // org.slf4j.Logger
    public boolean isDebugEnabled(Marker marker) {
        return isDebugEnabled();
    }

    @Override // org.slf4j.Logger
    public boolean isErrorEnabled(Marker marker) {
        return isErrorEnabled();
    }

    @Override // org.slf4j.Logger
    public boolean isInfoEnabled(Marker marker) {
        return isInfoEnabled();
    }

    @Override // org.slf4j.Logger
    public boolean isTraceEnabled(Marker marker) {
        return isTraceEnabled();
    }

    @Override // org.slf4j.Logger
    public boolean isWarnEnabled(Marker marker) {
        return isWarnEnabled();
    }
}
