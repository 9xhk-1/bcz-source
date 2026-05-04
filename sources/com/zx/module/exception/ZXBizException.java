package com.zx.module.exception;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class ZXBizException extends ZXModuleException {
    private final String bizMessage;
    private final int code;

    public ZXBizException(int i11, String str) {
        super("ZXBizException: code=" + i11 + ", bizMessage=" + str);
        this.code = i11;
        this.bizMessage = str;
    }

    public String getBizMessage() {
        return this.bizMessage;
    }

    public int getCode() {
        return this.code;
    }
}
