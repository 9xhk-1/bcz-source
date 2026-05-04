package com.alipay.sdk.app;

import android.content.Intent;
import android.net.Uri;
import com.alipay.sdk.m.k.b;
import com.alipay.sdk.m.s.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class H5OpenAuthActivity extends H5PayActivity {

    /* renamed from: i, reason: collision with root package name */
    public boolean f10404i = false;

    @Override // com.alipay.sdk.app.H5PayActivity, android.app.Activity
    public void onDestroy() {
        if (this.f10404i) {
            try {
                a a11 = a.C0175a.a(getIntent());
                if (a11 != null) {
                    com.alipay.sdk.m.k.a.b(this, a11, "", a11.f11016d);
                }
            } catch (Throwable unused) {
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        try {
            a a11 = a.C0175a.a(intent);
            try {
                super.startActivity(intent);
                Uri data = intent != null ? intent.getData() : null;
                if (data == null || !data.toString().startsWith("alipays://platformapi/startapp")) {
                    return;
                }
                finish();
            } catch (Throwable th2) {
                String uri = (intent == null || intent.getData() == null) ? "null" : intent.getData().toString();
                if (a11 != null) {
                    com.alipay.sdk.m.k.a.a(a11, b.f10653l, b.f10662p0, th2, uri);
                }
                this.f10404i = true;
                throw th2;
            }
        } catch (Throwable unused) {
            finish();
        }
    }

    @Override // com.alipay.sdk.app.H5PayActivity
    public void a() {
    }
}
