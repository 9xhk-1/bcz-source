package com.baicizhan.client.framework.network.http;

import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class HttpCancelException extends IOException {
    private static final long serialVersionUID = 6712119810502114101L;

    public HttpCancelException() {
        super("request cancelled.");
    }

    public HttpCancelException(String detailMessage) {
        super(detailMessage);
    }

    public HttpCancelException(String detailMessage, Throwable cause) {
        super(detailMessage);
        initCause(cause);
    }
}
