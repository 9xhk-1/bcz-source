package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.alipay.sdk.m.s.a;
import com.alipay.sdk.m.u.e;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class PayResultActivity extends Activity {

    /* renamed from: b, reason: collision with root package name */
    public static final String f10425b = "{\"isLogin\":\"false\"}";

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap<String, Object> f10426c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public static final String f10427d = "hk.alipay.wallet";

    /* renamed from: e, reason: collision with root package name */
    public static final String f10428e = "phonecashier.pay.hash";

    /* renamed from: f, reason: collision with root package name */
    public static final String f10429f = "orderSuffix";

    /* renamed from: g, reason: collision with root package name */
    public static final String f10430g = "externalPkgName";

    /* renamed from: h, reason: collision with root package name */
    public static final String f10431h = "phonecashier.pay.result";

    /* renamed from: i, reason: collision with root package name */
    public static final String f10432i = "phonecashier.pay.resultOrderHash";

    /* renamed from: a, reason: collision with root package name */
    public com.alipay.sdk.m.s.a f10433a = null;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f10434a;

        public a(Activity activity) {
            this.f10434a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10434a.finish();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static volatile String f10435a;

        /* renamed from: b, reason: collision with root package name */
        public static volatile String f10436b;
    }

    public static void a(Activity activity, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        Intent intent = new Intent();
        try {
            intent.setPackage("hk.alipay.wallet");
            intent.setData(Uri.parse("alipayhk://platformapi/startApp?appId=20000125&schemePaySession=" + URLEncoder.encode(str, "UTF-8") + "&orderSuffix=" + URLEncoder.encode(str2, "UTF-8") + "&packageName=" + URLEncoder.encode(str3, "UTF-8") + "&externalPkgName=" + URLEncoder.encode(str3, "UTF-8")));
        } catch (UnsupportedEncodingException e11) {
            e.a(e11);
        }
        if (activity != null) {
            try {
                activity.startActivity(intent);
            } catch (Throwable unused) {
                activity.finish();
            }
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            if (!TextUtils.isEmpty(intent.getStringExtra(f10429f))) {
                b.f10435a = intent.getStringExtra(f10428e);
                String stringExtra = intent.getStringExtra(f10429f);
                String stringExtra2 = intent.getStringExtra(f10430g);
                com.alipay.sdk.m.s.a a11 = a.C0175a.a(intent);
                this.f10433a = a11;
                if (a11 == null) {
                    finish();
                }
                a(this, b.f10435a, stringExtra, stringExtra2);
                a(this, 300);
                return;
            }
            if (this.f10433a == null) {
                finish();
            }
            String stringExtra3 = intent.getStringExtra(f10431h);
            int intExtra = intent.getIntExtra(f10432i, 0);
            if (intExtra != 0 && TextUtils.equals(b.f10435a, String.valueOf(intExtra))) {
                if (TextUtils.isEmpty(stringExtra3)) {
                    a(b.f10435a);
                } else {
                    a(stringExtra3, b.f10435a);
                }
                b.f10435a = "";
                a(this, 300);
                return;
            }
            com.alipay.sdk.m.k.a.b(this.f10433a, com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.f10654l0, "Expected " + b.f10435a + ", got " + intExtra);
            a(b.f10435a);
            a(this, 300);
        } catch (Throwable unused) {
            finish();
        }
    }

    public static void a(String str) {
        b.f10436b = com.alipay.sdk.m.j.b.a();
        a(f10426c, str);
    }

    public static void a(String str, String str2) {
        b.f10436b = str;
        a(f10426c, str2);
    }

    public static void a(Activity activity, int i11) {
        new Handler().postDelayed(new a(activity), i11);
    }

    public static boolean a(HashMap<String, Object> hashMap, String str) {
        Object obj;
        if (hashMap == null || str == null || (obj = hashMap.get(str)) == null) {
            return false;
        }
        synchronized (obj) {
            obj.notifyAll();
        }
        return true;
    }
}
