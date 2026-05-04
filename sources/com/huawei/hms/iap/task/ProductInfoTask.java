package com.huawei.hms.iap.task;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.iap.entity.ProductInfoReq;
import com.huawei.hms.iap.entity.ProductInfoResult;
import com.huawei.hms.iap.entity.f;
import com.huawei.hms.iapfull.IIapFullAPIVer4;
import com.huawei.hms.iapfull.bean.WebProductInfoRequest;
import com.huawei.hms.iapfull.webpay.callback.WebPayCallback;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;

/* loaded from: classes7.dex */
public class ProductInfoTask extends BaseIapFullTask<ProductInfoResult, ProductInfoReq> {
    public ProductInfoTask(Context context, ProductInfoReq productInfoReq) {
        super(context, productInfoReq);
    }

    private WebProductInfoRequest a(ProductInfoReq productInfoReq) {
        if (productInfoReq == null) {
            return new WebProductInfoRequest();
        }
        WebProductInfoRequest webProductInfoRequest = new WebProductInfoRequest();
        webProductInfoRequest.setPriceType(productInfoReq.getPriceType());
        webProductInfoRequest.setProductIds(productInfoReq.getProductIds());
        webProductInfoRequest.setReservedInfor(productInfoReq.getReservedInfor());
        return webProductInfoRequest;
    }

    @Override // com.huawei.hms.iap.task.BaseIapFullTask
    public void handleRequest(ProductInfoReq productInfoReq, IIapFullAPIVer4 iIapFullAPIVer4) {
        iIapFullAPIVer4.obtainProductInfo(a(productInfoReq), new WebPayCallback() { // from class: com.huawei.hms.iap.task.ProductInfoTask.1
            public void onFailure(int i11, String str) {
                ProductInfoTask.this.handleRequestFailed(i11, str);
            }

            public void onSuccess(String str) {
                f fVar = new f();
                if (!TextUtils.isEmpty(str)) {
                    try {
                        JsonUtil.jsonToEntity(str, fVar);
                    } catch (IllegalArgumentException e11) {
                        HMSLog.e("ProductInfoTask", "ProductInfoResp jsonToEntity " + e11.getMessage());
                    }
                }
                ProductInfoTask.this.mResult = new ProductInfoResult();
                ((ProductInfoResult) ProductInfoTask.this.mResult).setReturnCode(fVar.getReturnCode());
                ((ProductInfoResult) ProductInfoTask.this.mResult).setErrMsg(fVar.getErrMsg());
                ((ProductInfoResult) ProductInfoTask.this.mResult).setProductInfoList(fVar.getProductInfoList());
                ((ProductInfoResult) ProductInfoTask.this.mResult).setStatus(fVar.getCommonStatus());
                ProductInfoTask.this.handleRequestSuccess();
            }
        });
    }

    @Override // com.huawei.hms.iap.task.BaseIapFullTask
    public void setResult() {
        this.mResult = new ProductInfoResult();
    }
}
