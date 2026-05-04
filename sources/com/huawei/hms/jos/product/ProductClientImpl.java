package com.huawei.hms.jos.product;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.jos.apps.AppApiConstants;
import com.huawei.hms.jos.apps.AppsBaseClientImpl;
import com.huawei.hms.jos.util.Utils;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.log.HMSLog;
import fr.k;
import fr.l;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ProductClientImpl extends AppsBaseClientImpl implements ProductClient {

    /* renamed from: e, reason: collision with root package name */
    private boolean f36069e;

    public ProductClientImpl(Activity activity) {
        super(activity);
        this.f36069e = true;
    }

    @Override // com.huawei.hms.jos.product.ProductClient
    public k<List<ProductOrderInfo>> getMissProductOrder(Context context) {
        String reportEntry = HiAnalyticsClient.reportEntry(getContext(), AppApiConstants.GET_MISS_PRODUCT_ORDER, Utils.getSDKVersionCode(getContext()));
        ApiException checkInit = checkInit();
        if (checkInit != null) {
            l lVar = new l();
            lVar.c(checkInit);
            return lVar.b();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isActivityCaller", this.f36069e);
        } catch (JSONException unused) {
            HMSLog.e("ProductClientImpl", "add product client extra info to json failed");
        }
        return doWrite(new GetMissProductOrderTaskApiCall(AppApiConstants.GET_MISS_PRODUCT_ORDER, attachBaseRequest(jSONObject).toString(), reportEntry));
    }

    public ProductClientImpl(Context context) {
        super(context);
        this.f36069e = false;
    }
}
