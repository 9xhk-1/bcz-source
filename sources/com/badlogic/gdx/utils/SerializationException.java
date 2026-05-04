package com.badlogic.gdx.utils;

import a3.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class SerializationException extends RuntimeException {
    private y0 trace;

    public SerializationException() {
    }

    public void addTrace(String str) {
        if (str == null) {
            throw new IllegalArgumentException("info cannot be null.");
        }
        if (this.trace == null) {
            this.trace = new y0(512);
        }
        this.trace.append('\n');
        this.trace.O(str);
    }

    public boolean causedBy(Class cls) {
        return causedBy(this, cls);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.trace == null) {
            return super.getMessage();
        }
        y0 y0Var = new y0(512);
        y0Var.O(super.getMessage());
        if (y0Var.length() > 0) {
            y0Var.append('\n');
        }
        y0Var.O("Serialization trace:");
        y0Var.J(this.trace);
        return y0Var.toString();
    }

    public SerializationException(String str, Throwable th2) {
        super(str, th2);
    }

    private boolean causedBy(Throwable th2, Class cls) {
        Throwable cause = th2.getCause();
        if (cause == null || cause == th2) {
            return false;
        }
        if (cls.isAssignableFrom(cause.getClass())) {
            return true;
        }
        return causedBy(cause, cls);
    }

    public SerializationException(String str) {
        super(str);
    }

    public SerializationException(Throwable th2) {
        super("", th2);
    }
}
