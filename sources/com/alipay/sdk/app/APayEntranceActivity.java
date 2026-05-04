package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.sdk.m.k.b;
import com.alipay.sdk.m.s.a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class APayEntranceActivity extends Activity {

    /* renamed from: d, reason: collision with root package name */
    public static final String f10391d = "ap_order_info";

    /* renamed from: e, reason: collision with root package name */
    public static final String f10392e = "ap_target_packagename";

    /* renamed from: f, reason: collision with root package name */
    public static final String f10393f = "ap_session";

    /* renamed from: g, reason: collision with root package name */
    public static final String f10394g = "ap_local_info";

    /* renamed from: h, reason: collision with root package name */
    public static final ConcurrentHashMap<String, a> f10395h = new ConcurrentHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    public String f10396a;

    /* renamed from: b, reason: collision with root package name */
    public String f10397b;

    /* renamed from: c, reason: collision with root package name */
    public com.alipay.sdk.m.s.a f10398c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a(String str);
    }

    @Override // android.app.Activity
    public void finish() {
        String str = this.f10397b;
        com.alipay.sdk.m.k.a.a(this.f10398c, b.f10653l, "BSAFinish", str + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + TextUtils.isEmpty(this.f10396a));
        if (TextUtils.isEmpty(this.f10396a)) {
            this.f10396a = com.alipay.sdk.m.j.b.a();
            com.alipay.sdk.m.s.a aVar = this.f10398c;
            if (aVar != null) {
                aVar.b(true);
            }
        }
        if (str != null) {
            a remove = f10395h.remove(str);
            if (remove != null) {
                remove.a(this.f10396a);
            } else {
                com.alipay.sdk.m.k.a.b(this.f10398c, "wr", "refNull", "session=" + str);
            }
        }
        try {
            super.finish();
        } catch (Throwable th2) {
            com.alipay.sdk.m.k.a.a(this.f10398c, "wr", "APStartFinish", th2);
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        com.alipay.sdk.m.k.a.a(this.f10398c, b.f10653l, "BSAOnAR", this.f10397b + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i11 + "," + i12);
        if (i11 == 1000) {
            if (intent != null) {
                try {
                    this.f10396a = intent.getStringExtra("result");
                } catch (Throwable unused) {
                }
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                finish();
                return;
            }
            String string = extras.getString(f10391d);
            String string2 = extras.getString(f10392e);
            this.f10397b = extras.getString(f10393f);
            String string3 = extras.getString(f10394g, "{}");
            if (!TextUtils.isEmpty(this.f10397b)) {
                com.alipay.sdk.m.s.a a11 = a.C0175a.a(this.f10397b);
                this.f10398c = a11;
                com.alipay.sdk.m.k.a.a(a11, b.f10653l, "BSAEntryCreate", this.f10397b + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + SystemClock.elapsedRealtime());
            }
            Intent intent = new Intent();
            intent.putExtra("order_info", string);
            intent.putExtra("localInfo", string3);
            intent.setClassName(string2, "com.alipay.android.app.flybird.ui.window.FlyBirdWindowActivity");
            try {
                startActivityForResult(intent, 1000);
            } catch (Throwable th2) {
                com.alipay.sdk.m.k.a.a(this.f10398c, "wr", "APStartEx", th2);
                finish();
            }
            if (this.f10398c != null) {
                Context applicationContext = getApplicationContext();
                com.alipay.sdk.m.s.a aVar = this.f10398c;
                com.alipay.sdk.m.k.a.a(applicationContext, aVar, string, aVar.f11016d);
                this.f10398c.a(true);
            }
        } catch (Throwable unused) {
            finish();
        }
    }
}
