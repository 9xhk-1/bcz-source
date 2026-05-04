package com.huawei.hms.jos.product;

import android.text.TextUtils;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.jos.JosBaseApiCall;
import com.huawei.hms.jos.JosConstant;
import com.huawei.hms.jos.apps.AppHmsClient;
import com.huawei.hms.support.log.HMSLog;
import fr.l;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class GetMissProductOrderTaskApiCall extends JosBaseApiCall<AppHmsClient, List<ProductOrderInfo>> {
    public GetMissProductOrderTaskApiCall(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    private List<ProductOrderInfo> a(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            if (jSONArray.length() <= 0) {
                return null;
            }
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                arrayList.add(new ProductOrderInfo(jSONArray.getString(i11)));
            }
            return arrayList;
        } catch (JSONException unused) {
            HMSLog.e("GetMissProductOrderTask", "parsePlayer from json meet excveption");
            return null;
        }
    }

    @Override // com.huawei.hms.jos.JosBaseApiCall
    public void doExecuteSuccess(ResponseErrorCode responseErrorCode, String str, l<List<ProductOrderInfo>> lVar) {
        lVar.d(!TextUtils.isEmpty(str) ? a(str) : null);
    }

    @Override // com.huawei.hms.jos.JosBaseApiCall, com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return JosConstant.APP_HMS_VERSION_3_0_3;
    }
}
