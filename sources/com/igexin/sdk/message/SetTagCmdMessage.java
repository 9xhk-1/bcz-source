package com.igexin.sdk.message;

/* loaded from: classes7.dex */
public class SetTagCmdMessage extends GTCmdMessage {
    private String code;

    /* renamed from: sn, reason: collision with root package name */
    private String f38765sn;

    public SetTagCmdMessage() {
    }

    public String getCode() {
        return this.code;
    }

    public String getSn() {
        return this.f38765sn;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setSn(String str) {
        this.f38765sn = str;
    }

    public SetTagCmdMessage(String str, String str2, int i11) {
        super(i11);
        this.f38765sn = str;
        this.code = str2;
    }
}
