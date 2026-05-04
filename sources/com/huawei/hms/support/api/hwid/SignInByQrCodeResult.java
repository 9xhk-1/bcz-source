package com.huawei.hms.support.api.hwid;

import android.text.TextUtils;
import com.huawei.hms.support.feature.result.AbstractAuthResult;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class SignInByQrCodeResult extends AbstractAuthResult {
    public SignInByQrCodeResult fromJson(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        jsonToSuper(new JSONObject(str));
        return this;
    }
}
