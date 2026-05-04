package com.tencent.mobileqq.openpay.data.pay;

import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.mobileqq.openpay.data.base.BaseResponse;

/* loaded from: classes6.dex */
public class PayResponse extends BaseResponse {

    /* renamed from: a, reason: collision with root package name */
    private String f44381a;
    public String callbackUrl;
    public String payTime;
    public String serialNumber;
    public String spData;
    public String totalFee;
    public String transactionId;

    @Override // com.tencent.mobileqq.openpay.data.base.BaseResponse
    public boolean checkParams() {
        if (this.retCode == -9999999) {
            return false;
        }
        if (!isSuccess() || isPayByWeChat()) {
            return true;
        }
        return (TextUtils.isEmpty(this.transactionId) || TextUtils.isEmpty(this.payTime) || TextUtils.isEmpty(this.totalFee)) ? false : true;
    }

    @Override // com.tencent.mobileqq.openpay.data.base.BaseResponse
    public void fromBundle(Bundle bundle) {
        super.fromBundle(bundle);
        this.f44381a = bundle.getString("_mqqpay_payresp_paychanneltype");
        this.transactionId = bundle.getString("_mqqpay_payresp_transactionid");
        this.payTime = bundle.getString("_mqqpay_payresp_paytime");
        this.totalFee = bundle.getString("_mqqpay_payresp_totalfee");
        this.callbackUrl = bundle.getString("_mqqpay_payresp_callbackurl");
        this.spData = bundle.getString("_mqqpay_payresp_spdata");
        this.serialNumber = bundle.getString("_mqqpay_payapi_serialnumber");
    }

    public boolean isPayByWeChat() {
        return !TextUtils.isEmpty(this.f44381a) && this.f44381a.compareTo("1") == 0;
    }

    @Override // com.tencent.mobileqq.openpay.data.base.BaseResponse
    public void toBundle(Bundle bundle) {
        super.toBundle(bundle);
        bundle.putString("_mqqpay_payresp_paychanneltype", this.f44381a);
        bundle.putString("_mqqpay_payresp_transactionid", this.transactionId);
        bundle.putString("_mqqpay_payresp_paytime", this.payTime);
        bundle.putString("_mqqpay_payresp_totalfee", this.totalFee);
        bundle.putString("_mqqpay_payresp_callbackurl", this.callbackUrl);
        bundle.putString("_mqqpay_payresp_spdata", this.spData);
        bundle.putString("_mqqpay_payapi_serialnumber", this.serialNumber);
    }
}
