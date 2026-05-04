package com.baicizhan.client.framework.network.http;

import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class NoNeed2DownloadException extends IOException {
    private static final long serialVersionUID = 4600763045531689666L;

    public NoNeed2DownloadException() {
        super("The file to request has been downloaded completely.");
    }

    public NoNeed2DownloadException(String detailMessage) {
        super(detailMessage);
    }

    public NoNeed2DownloadException(String detailMessage, Throwable cause) {
        super(detailMessage);
        initCause(cause);
    }
}
