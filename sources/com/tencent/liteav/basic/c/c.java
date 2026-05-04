package com.tencent.liteav.basic.c;

import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class c extends IOException {
    private static final long serialVersionUID = 2723743254380545567L;
    private final int mErrorCode;
    private final String mErrorMessage;

    public c(int i11) {
        this(i11, null);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.mErrorMessage == null) {
            return "EGL error code: " + this.mErrorCode;
        }
        return "EGL error code: " + this.mErrorCode + this.mErrorMessage;
    }

    public c(int i11, String str) {
        this.mErrorCode = i11;
        this.mErrorMessage = str;
    }
}
