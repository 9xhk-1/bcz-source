package com.huawei.hms.aggrpay.entity;

/* loaded from: classes7.dex */
public class PayResult {
    public static final String KEY = "PayResult";
    private String returnCode;
    private String returnMsg;

    public String getReturnCode() {
        return this.returnCode;
    }

    public String getReturnMsg() {
        return this.returnMsg;
    }

    public void setReturnCode(String str) {
        this.returnCode = str;
    }

    public void setReturnMsg(String str) {
        this.returnMsg = str;
    }
}
