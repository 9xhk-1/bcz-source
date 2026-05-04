package com.igexin.sdk.message;

/* loaded from: classes7.dex */
public class BindAliasCmdMessage extends GTCmdMessage {
    private String code;

    /* renamed from: sn, reason: collision with root package name */
    private String f38763sn;

    public BindAliasCmdMessage() {
    }

    public String getCode() {
        return this.code;
    }

    public String getSn() {
        return this.f38763sn;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setSn(String str) {
        this.f38763sn = str;
    }

    public BindAliasCmdMessage(String str, String str2, int i11) {
        super(i11);
        this.f38763sn = str;
        this.code = str2;
    }
}
