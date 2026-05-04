package com.huawei.hms.support.account.service;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.hwid.ao;
import com.huawei.hms.hwid.as;
import com.huawei.hms.hwid.d;
import com.huawei.hms.hwid.f;
import com.huawei.hms.hwid.h;
import com.huawei.hms.hwid.i;
import com.huawei.hms.hwid.j;
import com.huawei.hms.hwid.m;
import com.huawei.hms.hwid.n;
import com.huawei.hms.hwid.o;
import com.huawei.hms.hwid.p;
import com.huawei.hms.support.account.request.AccountAuthParams;
import com.huawei.hms.support.account.result.AccountIcon;
import com.huawei.hms.support.account.result.AssistTokenResult;
import com.huawei.hms.support.account.result.AuthAccount;
import com.huawei.hms.support.api.account.AccountGetTokenOptions;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.account.AccountLogoutRequest;
import com.huawei.hms.support.api.entity.account.AccountNaming;
import com.huawei.hms.support.api.entity.account.AccountSignInRequest;
import com.huawei.hms.support.api.entity.account.AccountSignOutReq;
import com.huawei.hms.support.api.entity.account.AccountStartAssistLoginRequest;
import com.huawei.hms.support.api.entity.account.GetAssistTokenRequest;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.api.entity.common.CommonNaming;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.tencent.open.SocialConstants;
import fr.k;
import fr.l;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class AccountAuthServiceImpl extends HuaweiApi<AccountAuthParams> implements AccountAuthService {
    private static final Api<AccountAuthParams> ACCOUNT_AUTH_API = new Api<>("AuthAccount.API");
    private static final Long ONE_WEEK_MILLISECOND = 604800000L;
    protected static final String TAG = "[ACCOUNT]AccountAuthServiceImpl";
    private String mAccountName;
    private boolean mFromRequestToken;

    public AccountAuthServiceImpl(Activity activity, AccountAuthParams accountAuthParams, int i11) {
        super(activity, ACCOUNT_AUTH_API, accountAuthParams, (AbstractClientBuilder) new d(), i11);
    }

    private boolean checkIdTokenSignAlg(AccountAuthParams accountAuthParams) {
        as.b(TAG, "checkIdTokenSignAlg", true);
        if (accountAuthParams == null) {
            as.d(TAG, "accountAuthParams is null", true);
            return false;
        }
        try {
            int i11 = new JSONObject(accountAuthParams.getSignInParams()).getInt(CommonConstant.RequestParams.KEY_ID_TOKEN_SIGN_ALG);
            return i11 == 1 || i11 == 2;
        } catch (JSONException e11) {
            as.d(TAG, "JSONException:" + e11.getClass().getSimpleName(), true);
            return false;
        }
    }

    private k<AssistTokenResult> doWriteGetAssistToken(GetAssistTokenRequest getAssistTokenRequest) {
        try {
            return doWrite(new p(AccountNaming.getAssistToken, getAssistTokenRequest.toJson(), HiAnalyticsClient.reportEntry(getContext(), AccountNaming.getAssistToken, 60900100)));
        } catch (JSONException unused) {
            as.d(TAG, "JSONException， errorcode is:2015", true);
            l lVar = new l();
            lVar.c(new ApiException(new Status(2015)));
            return lVar.b();
        }
    }

    private Bitmap stringToBitmap(String str) {
        try {
            byte[] decode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception e11) {
            as.d(TAG, "stringToBitmap Exception is " + e11.getClass().getSimpleName(), true);
            return null;
        } catch (OutOfMemoryError unused) {
            as.d(TAG, "out of memory error ", true);
            return null;
        }
    }

    @Override // com.huawei.hms.support.feature.service.AuthService
    public k<Void> cancelAuthorization() {
        as.b(TAG, "cancelAuthorization", true);
        AccountSignInRequest accountSignInRequest = new AccountSignInRequest();
        accountSignInRequest.setAccountAuthParams(getOption());
        try {
            return doWrite(new h(AccountNaming.revokeAccessAccount, accountSignInRequest.toJson(), HiAnalyticsClient.reportEntry(getContext(), AccountNaming.revokeAccessAccount, 60900100)));
        } catch (JSONException unused) {
            as.d(TAG, "JSONException, errorcode is:2015", true);
            l lVar = new l();
            lVar.c(new ApiException(new Status(2015)));
            return lVar.b();
        }
    }

    @Override // com.huawei.hms.common.HuaweiApi
    public int getApiLevel() {
        List<PermissionInfo> permissionInfos;
        AccountAuthParams option = getOption();
        if (option != null && (permissionInfos = option.getPermissionInfos()) != null && permissionInfos.size() != 0) {
            Iterator<PermissionInfo> it = permissionInfos.iterator();
            while (it.hasNext()) {
                String permission = it.next().getPermission();
                if (permission != null && permission.equals(CommonConstant.LocalPermission.CARRIER_ID)) {
                    as.b(TAG, "permissioninfos contain carrierId and silentSignIn setApiLevel is 13", true);
                    return 13;
                }
            }
        }
        return 1;
    }

    @Override // com.huawei.hms.support.account.service.AccountAuthService
    public k<AssistTokenResult> getAssistToken(GetAssistTokenRequest getAssistTokenRequest) {
        as.b(TAG, "getAssistToken", true);
        return doWriteGetAssistToken(getAssistTokenRequest);
    }

    @Override // com.huawei.hms.support.account.service.AccountAuthService
    public k<AccountIcon> getChannel() {
        as.b(TAG, "getChannel", true);
        AccountSignInRequest accountSignInRequest = new AccountSignInRequest();
        accountSignInRequest.setAccountAuthParams(getOption());
        Context context = getContext();
        SharedPreferences sharedPreferences = context.getSharedPreferences("ACCOUNT_CHANNEL_CACHE", 0);
        String string = sharedPreferences.getString("icon", "");
        String string2 = sharedPreferences.getString(SocialConstants.PARAM_APP_DESC, "");
        long j11 = sharedPreferences.getLong("cache_time", 0L);
        long a11 = ao.a();
        if (j11 == 0 || TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || a11 - j11 >= ONE_WEEK_MILLISECOND.longValue()) {
            try {
                return doWrite(new i(AccountNaming.getChannelAccount, accountSignInRequest.toJson(), HiAnalyticsClient.reportEntry(getContext(), AccountNaming.getChannelAccount, 60900100), context));
            } catch (JSONException unused) {
                as.d(TAG, "JSONException, errorcode is:2015", true);
                l lVar = new l();
                lVar.c(new ApiException(new Status(2015)));
                return lVar.b();
            }
        }
        AccountIcon accountIcon = new AccountIcon(string2, stringToBitmap(string));
        l lVar2 = new l();
        lVar2.d(accountIcon);
        lVar2.c(new ApiException(new Status(0)));
        return lVar2.b();
    }

    @Override // com.huawei.hms.support.account.service.AccountAuthService
    public Intent getIndependentSignInIntent(String str) {
        as.b(TAG, "getIndependentSignInIntent", true);
        return f.a(getContext(), getOption(), getSubAppID(), str);
    }

    @Override // com.huawei.hms.support.feature.service.AuthService
    public Intent getSignInIntent() {
        as.b(TAG, "getSignInIntent", true);
        return f.a(getContext(), getOption(), getSubAppID());
    }

    @Override // com.huawei.hms.support.account.service.AccountAuthService
    public k<Void> logout() {
        as.b(TAG, "logout", true);
        AccountLogoutRequest accountLogoutRequest = new AccountLogoutRequest();
        accountLogoutRequest.setAccountAuthParams(getOption());
        try {
            return doWrite(new j(AccountNaming.logout, accountLogoutRequest.toJson(), HiAnalyticsClient.reportEntry(getContext(), AccountNaming.logout, 60900100)));
        } catch (JSONException unused) {
            as.d(TAG, "JSONException, errorcode is:2015", true);
            l lVar = new l();
            lVar.c(new ApiException(new Status(2015)));
            return lVar.b();
        }
    }

    @Override // com.huawei.hms.support.feature.service.AuthService
    public k<Void> signOut() {
        as.b(TAG, "signOut", true);
        f.a();
        AccountSignOutReq accountSignOutReq = new AccountSignOutReq();
        return doWrite(new n(AccountNaming.signoutAccount, accountSignOutReq.toJson(), HiAnalyticsClient.reportEntry(getContext(), CommonNaming.signout, 60900100)));
    }

    @Override // com.huawei.hms.support.account.service.AccountAuthService
    public k<AuthAccount> silentSignIn() {
        as.b(TAG, "silentSignIn", true);
        AccountSignInRequest accountSignInRequest = new AccountSignInRequest();
        AccountAuthParams option = getOption();
        accountSignInRequest.setAccountAuthParams(option);
        boolean z11 = this.mFromRequestToken;
        if (z11) {
            accountSignInRequest.setAccountGetTokenOptions(new AccountGetTokenOptions(this.mAccountName, z11));
        }
        if (!checkIdTokenSignAlg(option)) {
            as.d(TAG, "idTokenSignAlg is invalid", true);
            l lVar = new l();
            lVar.c(new ApiException(new Status(2003, "idTokenSignAlg is invalid")));
            return lVar.b();
        }
        try {
            String json = accountSignInRequest.toJson();
            String reportEntry = HiAnalyticsClient.reportEntry(getContext(), AccountNaming.silentSignInAccount, 60900100);
            return this.mFromRequestToken ? doWrite(new com.huawei.hms.hwid.l(AccountNaming.silentSignInAccount, json, reportEntry)) : doWrite(new m(AccountNaming.silentSignInAccount, json, reportEntry));
        } catch (JSONException unused) {
            as.d(TAG, "JSONException, errorcode is:2015", true);
            l lVar2 = new l();
            lVar2.c(new ApiException(new Status(2015)));
            return lVar2.b();
        }
    }

    @Override // com.huawei.hms.support.account.service.AccountAuthService
    public k<Void> startAssistLogin(String str) {
        as.b(TAG, "startAssistLogin", true);
        try {
            return doWrite(new o(AccountNaming.startAssistLogin, new AccountStartAssistLoginRequest(str).toJson(), HiAnalyticsClient.reportEntry(getContext(), AccountNaming.startAssistLogin, 60900100)));
        } catch (JSONException unused) {
            as.d(TAG, "JSONException, errorcode is:2015", true);
            l lVar = new l();
            lVar.c(new ApiException(new Status(2015)));
            return lVar.b();
        }
    }

    public AccountAuthServiceImpl(Context context, AccountAuthParams accountAuthParams, int i11) {
        super(context, ACCOUNT_AUTH_API, accountAuthParams, new d(), i11);
    }

    public AccountAuthServiceImpl(Context context, AccountAuthParams accountAuthParams, String str, int i11) {
        super(context, ACCOUNT_AUTH_API, accountAuthParams, new d(), i11);
        this.mAccountName = str;
        this.mFromRequestToken = true;
    }

    public AccountAuthServiceImpl(Activity activity, AccountAuthParams accountAuthParams, String str, int i11) {
        super(activity, ACCOUNT_AUTH_API, accountAuthParams, (AbstractClientBuilder) new d(), i11);
        this.mAccountName = str;
        this.mFromRequestToken = true;
    }
}
