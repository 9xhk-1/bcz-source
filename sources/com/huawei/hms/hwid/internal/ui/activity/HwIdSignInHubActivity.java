package com.huawei.hms.hwid.internal.ui.activity;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.activity.ForegroundIntentBuilder;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.hwid.ao;
import com.huawei.hms.hwid.ar;
import com.huawei.hms.hwid.as;
import com.huawei.hms.hwid.f;
import com.huawei.hms.hwid.q;
import com.huawei.hms.hwid.s;
import com.huawei.hms.hwid.y;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.common.CommonNaming;
import com.huawei.hms.support.api.entity.hwid.HuaweiIdSignInRequest;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.hwid.result.HuaweiIdAuthResult;
import com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIService;
import com.huawei.hms.ui.SafeIntent;
import com.huawei.hms.utils.HMSPackageManager;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class HwIdSignInHubActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private String f35961a = null;

    /* renamed from: b, reason: collision with root package name */
    private boolean f35962b = false;

    /* renamed from: c, reason: collision with root package name */
    private HuaweiIdSignInRequest f35963c = null;

    /* renamed from: d, reason: collision with root package name */
    private HuaweiIdAuthResult f35964d = null;

    /* renamed from: e, reason: collision with root package name */
    private s f35965e;

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        as.b("[HUAWEIIDSDK]HwIdSignInClientHub", "startSignInActivity", true);
        try {
            startActivityForResult(c(), 16587);
        } catch (ActivityNotFoundException e11) {
            this.f35962b = true;
            as.d("[HUAWEIIDSDK]HwIdSignInClientHub", "Launch sign in Intent failed. hms is probably being updated：" + e11.getClass().getSimpleName(), true);
            a(17);
        }
    }

    private Intent c() {
        as.b("[HUAWEIIDSDK]HwIdSignInClientHub", "getJosSignInIntent", true);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("HUAWEIID_CP_CLIENTINFO");
        String stringExtra2 = intent.getStringExtra("HUAWEIID_SIGNIN_REQUEST");
        String stringExtra3 = intent.getStringExtra("exParams");
        as.b("[HUAWEIIDSDK]HwIdSignInClientHub", "getJosSignInIntent. exParams is null " + TextUtils.isEmpty(stringExtra3), true);
        if (!TextUtils.isEmpty(stringExtra3)) {
            try {
                JSONObject jSONObject = new JSONObject(stringExtra2);
                jSONObject.put("exParams", stringExtra3);
                stringExtra2 = jSONObject.toString();
            } catch (JSONException e11) {
                as.b("[HUAWEIIDSDK]HwIdSignInClientHub", "getJosSignInIntent Exception " + e11.getClass().getSimpleName(), true);
            }
        }
        String action = intent.getAction();
        try {
            s a11 = s.a(stringExtra);
            ForegroundIntentBuilder kitSdkVersion = new ForegroundIntentBuilder(this).setAction(action).setRequestBody(stringExtra2).setKitSdkVersion(60900100);
            if (a11.c() != null) {
                kitSdkVersion.setSubAppId(a11.c());
            }
            Intent build = kitSdkVersion.build();
            as.b("[HUAWEIIDSDK]HwIdSignInClientHub", "get package name of hms is " + HMSPackageManager.getInstance(this).getHMSPackageName(), true);
            as.b("[HUAWEIIDSDK]HwIdSignInClientHub", "Current package name is " + getPackageName(), true);
            build.setPackage(getPackageName());
            return build;
        } catch (Exception e12) {
            as.d("[HUAWEIIDSDK]HwIdSignInClientHub", "getSignInIntent failed because:" + e12.getClass().getSimpleName(), true);
            return new Intent();
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        String stringExtra;
        s sVar;
        super.onActivityResult(i11, i12, intent);
        as.b("[HUAWEIIDSDK]HwIdSignInClientHub", "onActivityResult: requestCode：" + i11 + " , resultCode：" + i12, true);
        SafeIntent safeIntent = intent != null ? new SafeIntent(intent) : null;
        if (this.f35962b || i11 != 16587) {
            return;
        }
        int i13 = 8;
        if (safeIntent == null || (stringExtra = intent.getStringExtra(HuaweiIdAuthAPIService.EXTRA_AUTH_HUAWEI_ID)) == null) {
            if (i12 <= 0) {
                i12 = 8;
            }
            a(i12);
            return;
        }
        try {
            this.f35964d = new HuaweiIdAuthResult().fromJson(stringExtra);
            y.a().a(this.f35964d.getHuaweiId(), this.f35963c.getHuaweiIdAuthParams());
            i13 = this.f35964d.getStatus().getStatusCode();
        } catch (JSONException unused) {
            this.f35964d = null;
            as.d("[HUAWEIIDSDK]HwIdSignInClientHub", "onActivityResult: JsonException", true);
        }
        int i14 = i13;
        String str = this.f35961a;
        if (str != null && (sVar = this.f35965e) != null) {
            HiAnalyticsClient.reportExit(this, CommonNaming.signinIntent, str, sVar.a(), ar.a(i14), i14, (int) this.f35965e.b());
            as.b("[HUAWEIIDSDK]HwIdSignInClientHub", "report: api=hwid.signinintentversion=" + this.f35965e.b(), true);
        }
        setResult(i12, safeIntent);
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        as.b("[HUAWEIIDSDK]HwIdSignInClientHub", "onCreate", true);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (a(intent)) {
            a(0, "invalid intent");
            return;
        }
        SafeIntent safeIntent = new SafeIntent(intent);
        boolean booleanExtra = safeIntent.getBooleanExtra("intent.extra.isfullscreen", false);
        as.b("[HUAWEIIDSDK]HwIdSignInClientHub", "isActivityFullScreen is :" + booleanExtra, true);
        if (booleanExtra) {
            f.a(getWindow());
            getWindow().setFlags(1024, 1024);
        } else {
            f.a(this);
        }
        String action = safeIntent.getAction();
        if (!TextUtils.equals("com.huawei.hms.jos.signIn", action)) {
            String str = "unknow Action:";
            if (action != null) {
                str = "unknow Action:" + action;
            }
            a(0, str);
            return;
        }
        String stringExtra = safeIntent.getStringExtra("HUAWEIID_CP_CLIENTINFO");
        try {
            this.f35963c = HuaweiIdSignInRequest.fromJson(safeIntent.getStringExtra("HUAWEIID_SIGNIN_REQUEST"));
        } catch (JSONException unused) {
            this.f35963c = null;
            as.d("[HUAWEIIDSDK]HwIdSignInClientHub", "onCreate: JsonException", true);
        }
        if (TextUtils.isEmpty(stringExtra)) {
            a(0, "Activity started with invalid cp client info");
            return;
        }
        try {
            this.f35965e = s.a(stringExtra);
        } catch (JSONException unused2) {
            this.f35965e = null;
            as.d("[HUAWEIIDSDK]HwIdSignInClientHub", "onCreate: JsonException", true);
        }
        if (this.f35963c == null || this.f35965e == null) {
            a(0, "Activity started with invalid sign in request info");
            return;
        }
        ao.a(this);
        if (bundle != null) {
            restoreInstanceState(bundle);
        } else {
            this.f35961a = HiAnalyticsClient.reportEntry(this, CommonNaming.signinIntent, 60900100);
            a();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String str = this.f35961a;
        if (str == null || bundle == null) {
            return;
        }
        bundle.putString("HiAnalyticsTransId", str);
    }

    public void restoreInstanceState(Bundle bundle) {
        if (bundle != null) {
            this.f35961a = bundle.getString("HiAnalyticsTransId");
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
        as.d("[HUAWEIIDSDK]HwIdSignInClientHub", str, true);
        setResult(0);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i11) {
        int i12;
        s sVar;
        as.b("[HUAWEIIDSDK]HwIdSignInClientHub", "onSignInAccountFailed: retCode：" + i11, true);
        String str = this.f35961a;
        if (str == null || (sVar = this.f35965e) == null) {
            i12 = i11;
        } else {
            i12 = i11;
            HiAnalyticsClient.reportExit(this, CommonNaming.signinIntent, str, sVar.a(), ar.a(i11), i12, (int) this.f35965e.b());
            as.b("[HUAWEIIDSDK]HwIdSignInClientHub", "report: api=hwid.signinintentversion=" + this.f35965e.b(), true);
        }
        Status status = new Status(i12);
        HuaweiIdAuthResult huaweiIdAuthResult = new HuaweiIdAuthResult();
        huaweiIdAuthResult.setStatus(status);
        Intent intent = new Intent();
        try {
            intent.putExtra(HuaweiIdAuthAPIService.EXTRA_AUTH_HUAWEI_ID, huaweiIdAuthResult.toJson());
        } catch (JSONException unused) {
            as.d("[HUAWEIIDSDK]HwIdSignInClientHub", "convert result to json failed", true);
        }
        setResult(0, intent);
        finish();
    }

    private void a() {
        as.b("[HUAWEIIDSDK]HwIdSignInClientHub", "checkMinVersion start.", true);
        q.a(this, new AvailableAdapter.AvailableCallBack() { // from class: com.huawei.hms.hwid.internal.ui.activity.HwIdSignInHubActivity.1
            @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
            public void onComplete(int i11) {
                if (i11 == 0) {
                    as.b("[HUAWEIIDSDK]HwIdSignInClientHub", "version check ok", true);
                    HwIdSignInHubActivity.this.b();
                } else {
                    as.b("[HUAWEIIDSDK]HwIdSignInClientHub", "version check failed", true);
                    HwIdSignInHubActivity.this.a(i11);
                }
            }
        });
    }
}
