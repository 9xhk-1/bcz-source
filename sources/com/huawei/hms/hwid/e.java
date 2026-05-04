package com.huawei.hms.hwid;

import android.content.Context;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.utils.Util;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class e extends HuaweiApi<a> {

    /* renamed from: a, reason: collision with root package name */
    private static final Api<a> f35955a = new Api<>(HuaweiApiAvailability.HMS_API_NAME_GAME);

    /* renamed from: c, reason: collision with root package name */
    private static final a f35956c = new a();

    /* renamed from: b, reason: collision with root package name */
    private Context f35957b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements Api.ApiOptions.Optional {
    }

    public e(Context context) {
        super(context, f35955a, f35956c, new d());
        this.f35957b = context;
    }

    public void a() {
        as.b("AccountSignInNoticeClientImpl", "request Jos Notice.", true);
        String reportEntry = HiAnalyticsClient.reportEntry(getContext(), "core.getNoticeIntent", 60900100);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("noticeType", 1);
            jSONObject.put("hmsSdkVersionName", "6.12.0.300");
            jSONObject.put("cpId", Util.getCpId(this.f35957b));
            doWrite(new k("core.getNoticeIntent", jSONObject.toString(), reportEntry));
        } catch (JSONException unused) {
            as.c("AccountSignInNoticeClientImpl", "createParams Notice request meet JSONException.", true);
        }
    }

    @Override // com.huawei.hms.common.HuaweiApi
    public int getApiLevel() {
        return 1;
    }
}
