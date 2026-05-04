package com.huawei.hms.jos;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.jos.util.Utils;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Util;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class JosBaseClientImpl extends HuaweiApi<JosOptions> {

    /* renamed from: b, reason: collision with root package name */
    private static AtomicBoolean f36060b = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    private Context f36061a;

    public JosBaseClientImpl(Activity activity, Api<JosOptions> api, JosOptions josOptions, JosClientBuilder josClientBuilder) {
        super(activity, api, josOptions, (AbstractClientBuilder) josClientBuilder);
        this.f36061a = activity;
        setKitSdkVersion(Utils.getSDKVersionCode(activity));
    }

    public JSONObject attachBaseRequest(JSONObject jSONObject) {
        try {
            jSONObject.put("cpId", Util.getCpId(this.f36061a));
            jSONObject.put("sdkVersionName", "6.7.0.300");
            return jSONObject;
        } catch (JSONException unused) {
            HMSLog.e("GamesBaseClientImpl", "base requestBody create failed. ");
            return jSONObject;
        }
    }

    public ApiException checkAccess() {
        if (isInit()) {
            return null;
        }
        HMSLog.e("GamesBaseClientImpl", "call init method first");
        return new ApiException(new Status(7018, "call init method first"));
    }

    public ApiException checkInit() {
        if (isInit()) {
            return null;
        }
        HMSLog.e("GamesBaseClientImpl", "call init method first");
        return new ApiException(new Status(7018, "call init method first"));
    }

    public ApiException getParamsInvalidException() {
        return new ApiException(new Status(7005, ""));
    }

    public boolean isInit() {
        return f36060b.get();
    }

    public void setInit() {
        f36060b.set(true);
    }

    public JosBaseClientImpl(Context context, Api<JosOptions> api, JosOptions josOptions, JosClientBuilder josClientBuilder) {
        super(context, api, josOptions, josClientBuilder);
        this.f36061a = context;
        setKitSdkVersion(Utils.getSDKVersionCode(context));
    }
}
