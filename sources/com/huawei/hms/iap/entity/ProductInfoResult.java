package com.huawei.hms.iap.entity;

import com.huawei.hms.support.api.client.Result;
import java.util.List;

/* loaded from: classes7.dex */
public class ProductInfoResult extends Result {
    private String errMsg;
    private List<ProductInfo> productInfoList;
    private int returnCode;

    public String getErrMsg() {
        return this.errMsg;
    }

    public List<ProductInfo> getProductInfoList() {
        return this.productInfoList;
    }

    public int getReturnCode() {
        return this.returnCode;
    }

    public void setErrMsg(String str) {
        this.errMsg = str;
    }

    public void setProductInfoList(List<ProductInfo> list) {
        this.productInfoList = list;
    }

    public void setReturnCode(int i11) {
        this.returnCode = i11;
    }
}
