package com.huawei.hms.support.api.pay;

import com.huawei.hms.support.api.client.Result;

/* loaded from: classes7.dex */
public class HwWalletInfoResult extends Result {
    private String result;

    public String getResult() {
        return (String) get(this.result);
    }

    public void setResult(String str) {
        this.result = str;
    }

    private static <T> T get(T t11) {
        return t11;
    }
}
