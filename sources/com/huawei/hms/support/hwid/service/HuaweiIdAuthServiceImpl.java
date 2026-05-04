package com.huawei.hms.support.hwid.service;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.hwid.ab;
import com.huawei.hms.hwid.ac;
import com.huawei.hms.hwid.ad;
import com.huawei.hms.hwid.as;
import com.huawei.hms.hwid.v;
import com.huawei.hms.hwid.x;
import com.huawei.hms.hwid.z;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.common.CommonNaming;
import com.huawei.hms.support.api.entity.hwid.HuaweiIdSignInRequest;
import com.huawei.hms.support.api.entity.hwid.SignOutReq;
import com.huawei.hms.support.api.hwid.HuaweiIdGetTokenOptions;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParams;
import com.huawei.hms.support.hwid.result.AuthHuaweiId;
import fr.k;
import fr.l;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class HuaweiIdAuthServiceImpl extends HuaweiApi<HuaweiIdAuthParams> implements HuaweiIdAuthService {
    private static final Api<HuaweiIdAuthParams> HUAWEI_ID_AUTH_API = new Api<>(HuaweiApiAvailability.HMS_API_NAME_ID);
    protected static final String TAG = "[HUAWEIIDSDK]HuaweiIdAuthService";
    private String mAccountName;
    private boolean mFromRequestToken;

    public HuaweiIdAuthServiceImpl(Activity activity, HuaweiIdAuthParams huaweiIdAuthParams, int i11) {
        super(activity, HUAWEI_ID_AUTH_API, huaweiIdAuthParams, (AbstractClientBuilder) new v(), i11);
    }

    private HuaweiIdAuthParams setSignInParams(String str) {
        HuaweiIdAuthParams option = getOption();
        try {
            new JSONObject(str);
            try {
                HuaweiIdAuthParams m5635clone = option.m5635clone();
                m5635clone.setSignInParams(str);
                return m5635clone;
            } catch (CloneNotSupportedException unused) {
                as.d(TAG, "CloneNotSupportedException", true);
                return option;
            }
        } catch (JSONException unused2) {
            as.d(TAG, "JSONException", true);
            return option;
        }
    }

    @Override // com.huawei.hms.support.feature.service.AuthService
    public k<Void> cancelAuthorization() {
        as.b(TAG, "cancelAuthorization", true);
        HuaweiIdSignInRequest huaweiIdSignInRequest = new HuaweiIdSignInRequest();
        huaweiIdSignInRequest.setHuaweiIdAuthParams(getOption());
        try {
            return doWrite(new z(CommonNaming.revokeAccess, huaweiIdSignInRequest.toJson(), HiAnalyticsClient.reportEntry(getContext(), CommonNaming.revokeAccess, 60900100)));
        } catch (JSONException unused) {
            as.d(TAG, "JSONException, errorcode is:2015", true);
            l lVar = new l();
            lVar.c(new ApiException(new Status(2015)));
            return lVar.b();
        }
    }

    @Override // com.huawei.hms.common.HuaweiApi
    public int getApiLevel() {
        return 1;
    }

    @Override // com.huawei.hms.support.feature.service.AuthService
    public Intent getSignInIntent() {
        return getSignInIntent("");
    }

    @Override // com.huawei.hms.support.feature.service.AuthService
    public k<Void> signOut() {
        as.b(TAG, "signOut", true);
        x.a();
        SignOutReq signOutReq = new SignOutReq();
        return doWrite(new ad(CommonNaming.signout, signOutReq.toJson(), HiAnalyticsClient.reportEntry(getContext(), CommonNaming.signout, 60900100)));
    }

    @Override // com.huawei.hms.support.hwid.service.HuaweiIdAuthService
    public k<AuthHuaweiId> silentSignIn() {
        return silentSignIn("");
    }

    public HuaweiIdAuthServiceImpl(Context context, HuaweiIdAuthParams huaweiIdAuthParams, int i11) {
        super(context, HUAWEI_ID_AUTH_API, huaweiIdAuthParams, new v(), i11);
    }

    @Override // com.huawei.hms.support.hwid.service.HuaweiIdAuthService
    public Intent getSignInIntent(String str) {
        as.b(TAG, "getSignInIntent", true);
        return x.a(getContext(), setSignInParams(str), getSubAppID());
    }

    @Override // com.huawei.hms.support.hwid.service.HuaweiIdAuthService
    public k<AuthHuaweiId> silentSignIn(String str) {
        as.b(TAG, "silentSignIn", true);
        HuaweiIdSignInRequest huaweiIdSignInRequest = new HuaweiIdSignInRequest();
        huaweiIdSignInRequest.setHuaweiIdAuthParams(setSignInParams(str));
        boolean z11 = this.mFromRequestToken;
        if (z11) {
            huaweiIdSignInRequest.setHuaweiIdGetTokenOptions(new HuaweiIdGetTokenOptions(this.mAccountName, z11));
        }
        try {
            String json = huaweiIdSignInRequest.toJson();
            String reportEntry = HiAnalyticsClient.reportEntry(getContext(), CommonNaming.silentSignIn, 60900100);
            return this.mFromRequestToken ? doWrite(new ab(CommonNaming.silentSignIn, json, reportEntry)) : doWrite(new ac(CommonNaming.silentSignIn, json, reportEntry));
        } catch (JSONException unused) {
            as.d(TAG, "JSONException, errorcode is:2015", true);
            l lVar = new l();
            lVar.c(new ApiException(new Status(2015)));
            return lVar.b();
        }
    }

    public HuaweiIdAuthServiceImpl(Context context, HuaweiIdAuthParams huaweiIdAuthParams, String str, int i11) {
        super(context, HUAWEI_ID_AUTH_API, huaweiIdAuthParams, new v(), i11);
        this.mAccountName = str;
        this.mFromRequestToken = true;
    }

    public HuaweiIdAuthServiceImpl(Activity activity, HuaweiIdAuthParams huaweiIdAuthParams, String str, int i11) {
        super(activity, HUAWEI_ID_AUTH_API, huaweiIdAuthParams, (AbstractClientBuilder) new v(), i11);
        this.mAccountName = str;
        this.mFromRequestToken = true;
    }
}
