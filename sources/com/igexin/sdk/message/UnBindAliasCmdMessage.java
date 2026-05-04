package com.igexin.sdk.message;

/* loaded from: classes7.dex */
public class UnBindAliasCmdMessage extends GTCmdMessage {
    private String code;

    /* renamed from: sn, reason: collision with root package name */
    private String f38766sn;

    public UnBindAliasCmdMessage() {
    }

    public String getCode() {
        return this.code;
    }

    public String getSn() {
        return this.f38766sn;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setSn(String str) {
        this.f38766sn = str;
    }

    public UnBindAliasCmdMessage(String str, String str2, int i11) {
        super(i11);
        this.f38766sn = str;
        this.code = str2;
    }
}
