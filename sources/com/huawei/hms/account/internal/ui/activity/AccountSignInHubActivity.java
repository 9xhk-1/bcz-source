package com.huawei.hms.account.internal.ui.activity;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.activity.ForegroundIntentBuilder;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.hwid.a;
import com.huawei.hms.hwid.ao;
import com.huawei.hms.hwid.ap;
import com.huawei.hms.hwid.ar;
import com.huawei.hms.hwid.as;
import com.huawei.hms.hwid.b;
import com.huawei.hms.hwid.f;
import com.huawei.hms.hwid.g;
import com.huawei.hms.support.account.request.AccountAuthParams;
import com.huawei.hms.support.account.result.AccountAuthResult;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.account.AccountSignInRequest;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.api.entity.common.CommonNaming;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIService;
import com.huawei.hms.ui.SafeIntent;
import com.huawei.hms.utils.HMSPackageManager;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class AccountSignInHubActivity extends Activity {

    /* renamed from: e, reason: collision with root package name */
    private b f35236e;

    /* renamed from: f, reason: collision with root package name */
    private int f35237f;

    /* renamed from: a, reason: collision with root package name */
    private String f35232a = null;

    /* renamed from: b, reason: collision with root package name */
    private boolean f35233b = false;

    /* renamed from: c, reason: collision with root package name */
    private AccountSignInRequest f35234c = null;

    /* renamed from: d, reason: collision with root package name */
    private AccountAuthResult f35235d = null;

    /* renamed from: g, reason: collision with root package name */
    private String f35238g = CommonNaming.signinIntent;

    private void b() {
        as.b("[ACCOUNTSDK]AccountSignInHubActivity", "checkMinVersion start.", true);
        a.a(this, new AvailableAdapter.AvailableCallBack() { // from class: com.huawei.hms.account.internal.ui.activity.AccountSignInHubActivity.1
            @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
            public void onComplete(int i11) {
                if (i11 == 0) {
                    as.b("[ACCOUNTSDK]AccountSignInHubActivity", "version check ok", true);
                    AccountSignInHubActivity.this.c();
                } else {
                    as.b("[ACCOUNTSDK]AccountSignInHubActivity", "version check failed", true);
                    AccountSignInHubActivity.this.a(i11);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        as.b("[ACCOUNTSDK]AccountSignInHubActivity", "startSignInActivity", true);
        try {
            startActivityForResult(d(), this.f35237f == 1 ? 16588 : 16587);
        } catch (ActivityNotFoundException e11) {
            this.f35233b = true;
            as.d("[ACCOUNTSDK]AccountSignInHubActivity", "Launch sign in Intent failed. hms is probably being updated：" + e11.getClass().getSimpleName(), true);
            a(17);
        }
    }

    private Intent d() {
        as.b("[ACCOUNTSDK]AccountSignInHubActivity", "getJosSignInIntent", true);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("HUAWEIID_CP_CLIENTINFO");
        String stringExtra2 = intent.getStringExtra("HUAWEIID_SIGNIN_REQUEST");
        String stringExtra3 = intent.getStringExtra("exParams");
        as.b("[ACCOUNTSDK]AccountSignInHubActivity", "getJosSignInIntent. exParams is null " + TextUtils.isEmpty(stringExtra3), true);
        if (!TextUtils.isEmpty(stringExtra3)) {
            try {
                JSONObject jSONObject = new JSONObject(stringExtra2);
                jSONObject.put("exParams", stringExtra3);
                stringExtra2 = jSONObject.toString();
            } catch (JSONException e11) {
                as.b("[ACCOUNTSDK]AccountSignInHubActivity", "getJosSignInIntent Exception " + e11.getClass().getSimpleName(), true);
            }
        }
        String action = intent.getAction();
        try {
            b a11 = b.a(stringExtra);
            ForegroundIntentBuilder kitSdkVersion = new ForegroundIntentBuilder(this).setAction(action).setRequestBody(stringExtra2).setKitSdkVersion(60900100);
            if (a11.c() != null) {
                kitSdkVersion.setSubAppId(a11.c());
            }
            if (this.f35237f == 1) {
                as.b("[ACCOUNTSDK]AccountSignInHubActivity", "setApiLevel is 11", true);
                kitSdkVersion.setApiLevel(11);
            }
            if (e().booleanValue()) {
                as.b("[ACCOUNTSDK]AccountSignInHubActivity", "setApiLevel is 13", true);
                kitSdkVersion.setApiLevel(13);
            }
            if (f()) {
                as.b("[ACCOUNTSDK]AccountSignInHubActivity", "setApiLevel is 22", true);
                kitSdkVersion.setApiLevel(22);
            }
            Intent build = kitSdkVersion.build();
            as.b("[ACCOUNTSDK]AccountSignInHubActivity", "get package name of hms is " + HMSPackageManager.getInstance(this).getHMSPackageName(), true);
            as.b("[ACCOUNTSDK]AccountSignInHubActivity", "current package name is " + getPackageName(), true);
            build.setPackage(getPackageName());
            return build;
        } catch (Exception e12) {
            as.d("[ACCOUNTSDK]AccountSignInHubActivity", "getSignInIntent failed because:" + e12.getClass().getSimpleName(), true);
            return new Intent();
        }
    }

    private Boolean e() {
        as.b("[ACCOUNTSDK]AccountSignInHubActivity", "checkCarrierIdPermission begin", true);
        AccountAuthParams accountAuthParams = this.f35234c.getAccountAuthParams();
        if (accountAuthParams == null) {
            return Boolean.FALSE;
        }
        List<PermissionInfo> permissionInfos = accountAuthParams.getPermissionInfos();
        if (ap.b(permissionInfos).booleanValue()) {
            Iterator<PermissionInfo> it = permissionInfos.iterator();
            while (it.hasNext()) {
                String permission = it.next().getPermission();
                if (permission != null && permission.equals(CommonConstant.LocalPermission.CARRIER_ID)) {
                    as.b("[ACCOUNTSDK]AccountSignInHubActivity", "permissioninfos contain carrierId", true);
                    return Boolean.TRUE;
                }
            }
        }
        return Boolean.FALSE;
    }

    private boolean f() {
        as.b("[ACCOUNTSDK]AccountSignInHubActivity", "checkNeedConsent begin", true);
        AccountAuthParams accountAuthParams = this.f35234c.getAccountAuthParams();
        if (accountAuthParams == null) {
            return false;
        }
        try {
            return new JSONObject(accountAuthParams.getSignInParams()).optBoolean(CommonConstant.RequestParams.KEY_ID_NEED_CONSENT, false);
        } catch (JSONException e11) {
            as.d("[ACCOUNTSDK]AccountSignInHubActivity", "JSONException:" + e11.getClass().getSimpleName(), true);
            return false;
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        String stringExtra;
        b bVar;
        super.onActivityResult(i11, i12, intent);
        as.b("[ACCOUNTSDK]AccountSignInHubActivity", "onActivityResult: requestCode：" + i11 + " , resultCode：" + i12, true);
        SafeIntent safeIntent = intent != null ? new SafeIntent(intent) : null;
        if (this.f35233b) {
            return;
        }
        if (i11 == 16587 || i11 == 16588) {
            int i13 = 8;
            if (safeIntent == null || (stringExtra = intent.getStringExtra(HuaweiIdAuthAPIService.EXTRA_AUTH_HUAWEI_ID)) == null) {
                a(i12 > 0 ? i12 : 8);
                return;
            }
            try {
                this.f35235d = new AccountAuthResult().fromJson(stringExtra);
                if (i11 == 16587) {
                    g.a().a(this.f35235d.getAccount(), this.f35234c.getAccountAuthParams());
                }
                i13 = this.f35235d.getStatus().getStatusCode();
            } catch (JSONException unused) {
                this.f35235d = null;
                as.d("[ACCOUNTSDK]AccountSignInHubActivity", "onActivityResult: JsonException", true);
            }
            int i14 = i13;
            String str = this.f35232a;
            if (str != null && (bVar = this.f35236e) != null) {
                HiAnalyticsClient.reportExit(this, this.f35238g, str, bVar.a(), ar.a(i14), i14, (int) this.f35236e.b());
            }
            setResult(i12, safeIntent);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        as.b("[ACCOUNTSDK]AccountSignInHubActivity", "onCreate", true);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (a(intent)) {
            a(0, "invalid intent");
            return;
        }
        SafeIntent safeIntent = new SafeIntent(intent);
        a(safeIntent.getBooleanExtra("intent.extra.isfullscreen", false));
        String action = safeIntent.getAction();
        if (!TextUtils.equals("com.huawei.hms.jos.signIn", action) && !TextUtils.equals("com.huawei.hms.account.signIn", action) && !TextUtils.equals("com.huawei.hms.account.picker.signIn", action)) {
            String str = "unknow Action:";
            if (action != null) {
                str = "unknow Action:" + action;
            }
            a(0, str);
            return;
        }
        String stringExtra = safeIntent.getStringExtra("HUAWEIID_CP_CLIENTINFO");
        try {
            this.f35234c = AccountSignInRequest.fromJson(safeIntent.getStringExtra("HUAWEIID_SIGNIN_REQUEST"));
        } catch (JSONException unused) {
            this.f35234c = null;
            as.d("[ACCOUNTSDK]AccountSignInHubActivity", "onCreate: JsonException", true);
        }
        if (TextUtils.isEmpty(stringExtra)) {
            a(0, "Activity started with invalid cp client info");
            return;
        }
        try {
            this.f35236e = b.a(stringExtra);
        } catch (JSONException unused2) {
            this.f35236e = null;
            as.d("[ACCOUNTSDK]AccountSignInHubActivity", "onCreate: JsonException", true);
        }
        if (this.f35234c == null || this.f35236e == null) {
            a(0, "Activity started with invalid sign in request info");
            return;
        }
        if (!a()) {
            a(2003);
            return;
        }
        int intExtra = safeIntent.getIntExtra("INDEPENDENT_SIGN_IN_FLAG", 0);
        this.f35237f = intExtra;
        if (intExtra == 1 && !a(safeIntent).booleanValue()) {
            a(2003);
            return;
        }
        ao.a(this);
        if (bundle != null) {
            restoreInstanceState(bundle);
        } else {
            this.f35232a = HiAnalyticsClient.reportEntry(this, this.f35238g, 60900100);
            b();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        as.b("[ACCOUNTSDK]AccountSignInHubActivity", "onSaveInstanceState start", true);
        String str = this.f35232a;
        if (str == null || bundle == null) {
            return;
        }
        bundle.putString("HiAnalyticsTransId", str);
    }

    public void restoreInstanceState(Bundle bundle) {
        if (bundle != null) {
            this.f35232a = bundle.getString("HiAnalyticsTransId");
        }
    }

    private boolean a() {
        AccountAuthParams accountAuthParams = this.f35234c.getAccountAuthParams();
        if (accountAuthParams == null) {
            return false;
        }
        try {
            int optInt = new JSONObject(accountAuthParams.getSignInParams()).optInt(CommonConstant.RequestParams.KEY_ID_TOKEN_SIGN_ALG, 2);
            return optInt == 1 || optInt == 2;
        } catch (JSONException e11) {
            as.d("[ACCOUNTSDK]AccountSignInHubActivity", "JSONException:" + e11.getClass().getSimpleName(), true);
            return false;
        }
    }

    private boolean a(Intent intent) {
        if (intent == null) {
            return true;
        }
        try {
            intent.getStringExtra("ANYTHING");
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    private void a(int i11, String str) {
        as.d("[ACCOUNTSDK]AccountSignInHubActivity", "errMessage is: " + str, true);
        setResult(0);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i11) {
        int i12;
        b bVar;
        as.b("[ACCOUNTSDK]AccountSignInHubActivity", "onSignInAccountFailed: retCode：" + i11, true);
        String str = this.f35232a;
        if (str == null || (bVar = this.f35236e) == null) {
            i12 = i11;
        } else {
            i12 = i11;
            HiAnalyticsClient.reportExit(this, this.f35238g, str, bVar.a(), ar.a(i11), i12, (int) this.f35236e.b());
        }
        Status status = new Status(i12);
        AccountAuthResult accountAuthResult = new AccountAuthResult();
        accountAuthResult.setStatus(status);
        Intent intent = new Intent();
        try {
            intent.putExtra(HuaweiIdAuthAPIService.EXTRA_AUTH_HUAWEI_ID, accountAuthResult.toJson());
        } catch (JSONException unused) {
            as.d("[ACCOUNTSDK]AccountSignInHubActivity", "convert result to json failed", true);
        }
        setResult(0, intent);
        finish();
    }

    private Boolean a(SafeIntent safeIntent) {
        String stringExtra = safeIntent.getStringExtra("ACCESS_TOKEN");
        AccountAuthParams accountAuthParams = this.f35234c.getAccountAuthParams();
        if (accountAuthParams == null) {
            a("accountAuthParams is null");
            return Boolean.FALSE;
        }
        List<Scope> requestScopeList = accountAuthParams.getRequestScopeList();
        if (!TextUtils.isEmpty(stringExtra) && !ap.a(requestScopeList).booleanValue() && requestScopeList.size() == 1) {
            this.f35238g = CommonNaming.independentsigninIntent;
            return Boolean.TRUE;
        }
        a("independent sign in params error");
        return Boolean.FALSE;
    }

    private void a(String str) {
        as.d("[ACCOUNTSDK]AccountSignInHubActivity", "onIndependentSignInFailed errMessage:" + str, true);
        Status status = new Status(2003, str);
        AccountAuthResult accountAuthResult = new AccountAuthResult();
        accountAuthResult.setStatus(status);
        Intent intent = new Intent();
        try {
            intent.putExtra(HuaweiIdAuthAPIService.EXTRA_AUTH_HUAWEI_ID, accountAuthResult.toJson());
        } catch (JSONException unused) {
            as.d("[ACCOUNTSDK]AccountSignInHubActivity", "convert result to json failed", true);
        }
        setResult(0, intent);
        finish();
    }

    private void a(boolean z11) {
        as.b("[ACCOUNTSDK]AccountSignInHubActivity", "isActivityFullScreen is :" + z11, true);
        if (z11) {
            f.a(getWindow());
            getWindow().setFlags(1024, 1024);
        } else {
            f.a(this);
        }
    }
}
