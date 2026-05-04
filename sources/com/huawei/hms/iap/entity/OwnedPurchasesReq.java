package com.huawei.hms.iap.entity;

import com.huawei.hms.core.aidl.annotation.Packed;

/* loaded from: classes7.dex */
public class OwnedPurchasesReq extends BaseReq {

    @Packed
    private String continuationToken;

    @Packed
    private int priceType;

    @Packed
    private String signatureAlgorithm;

    public String getContinuationToken() {
        return this.continuationToken;
    }

    public int getPriceType() {
        return this.priceType;
    }

    public String getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    public void setContinuationToken(String str) {
        this.continuationToken = str;
    }

    public void setPriceType(int i11) {
        this.priceType = i11;
    }

    public void setSignatureAlgorithm(String str) {
        this.signatureAlgorithm = str;
    }
}
