package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.alipay.sdk.m.k.b;
import com.alipay.sdk.m.s.a;
import com.alipay.sdk.m.u.l;
import com.baicizhan.client.business.webview.JsonParams;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class AlipayResultActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap<String, a> f10399a = new ConcurrentHashMap<>();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a(int i11, String str, String str2);
    }

    private void a(String str, Bundle bundle) {
        a remove = f10399a.remove(str);
        if (remove == null) {
            return;
        }
        try {
            remove.a(bundle.getInt("endCode"), bundle.getString(l.f11108b), bundle.getString("result"));
        } finally {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Throwable th2;
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            try {
                String stringExtra = intent.getStringExtra(JsonParams.ShareResultO.CHANNEL_WEIXIN);
                Bundle bundleExtra = intent.getBundleExtra("result");
                String stringExtra2 = intent.getStringExtra("scene");
                com.alipay.sdk.m.s.a a11 = a.C0175a.a(stringExtra);
                if (a11 == null) {
                    finish();
                    return;
                }
                com.alipay.sdk.m.k.a.a(a11, b.f10653l, "BSPSession", stringExtra + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + SystemClock.elapsedRealtime());
                if (TextUtils.equals("mqpSchemePay", stringExtra2)) {
                    a(stringExtra, bundleExtra);
                    return;
                }
                if ((TextUtils.isEmpty(stringExtra) || bundleExtra == null) && intent.getData() != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(Base64.decode(intent.getData().getQuery(), 2), "UTF-8"));
                        JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                        stringExtra = jSONObject.getString(JsonParams.ShareResultO.CHANNEL_WEIXIN);
                        com.alipay.sdk.m.k.a.a(a11, b.f10653l, "BSPUriSession", stringExtra);
                        Bundle bundle2 = new Bundle();
                        try {
                            Iterator<String> keys = jSONObject2.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                bundle2.putString(next, jSONObject2.getString(next));
                            }
                            bundleExtra = bundle2;
                        } catch (Throwable th3) {
                            th2 = th3;
                            bundleExtra = bundle2;
                            com.alipay.sdk.m.k.a.a(a11, b.f10653l, "BSPResEx", th2);
                            com.alipay.sdk.m.k.a.a(a11, b.f10653l, b.f10668s0, th2);
                            if (TextUtils.isEmpty(stringExtra)) {
                            }
                            com.alipay.sdk.m.k.a.b(this, a11, "", a11.f11016d);
                            finish();
                            return;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                    }
                }
                if (!TextUtils.isEmpty(stringExtra) || bundleExtra == null) {
                    com.alipay.sdk.m.k.a.b(this, a11, "", a11.f11016d);
                    finish();
                    return;
                }
                try {
                    com.alipay.sdk.m.k.a.a(a11, b.f10653l, b.V, "" + SystemClock.elapsedRealtime());
                    com.alipay.sdk.m.k.a.a(a11, b.f10653l, b.W, bundleExtra.getInt("endCode", -1) + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + bundleExtra.getString(l.f11108b, Constants.ACCEPT_TIME_SEPARATOR_SERVER));
                    OpenAuthTask.a(stringExtra, 9000, "OK", bundleExtra);
                    com.alipay.sdk.m.k.a.b(this, a11, "", a11.f11016d);
                    finish();
                } catch (Throwable th5) {
                    com.alipay.sdk.m.k.a.b(this, a11, "", a11.f11016d);
                    finish();
                    throw th5;
                }
            } catch (Throwable th6) {
                com.alipay.sdk.m.k.a.a((com.alipay.sdk.m.s.a) null, b.f10653l, "BSPSerError", th6);
                com.alipay.sdk.m.k.a.a((com.alipay.sdk.m.s.a) null, b.f10653l, b.f10666r0, th6);
                finish();
            }
        } catch (Throwable unused) {
            finish();
        }
    }
}
