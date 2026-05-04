package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.alipay.sdk.m.j.b;
import com.alipay.sdk.m.j.d;
import com.alipay.sdk.m.s.a;
import com.alipay.sdk.m.u.e;
import com.alipay.sdk.m.u.n;
import com.alipay.sdk.m.x.c;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class H5PayActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public c f10405a;

    /* renamed from: b, reason: collision with root package name */
    public String f10406b;

    /* renamed from: c, reason: collision with root package name */
    public String f10407c;

    /* renamed from: d, reason: collision with root package name */
    public String f10408d;

    /* renamed from: e, reason: collision with root package name */
    public String f10409e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10410f;

    /* renamed from: g, reason: collision with root package name */
    public String f10411g;

    /* renamed from: h, reason: collision with root package name */
    public WeakReference<a> f10412h;

    private void b() {
        try {
            super.requestWindowFeature(1);
            getWindow().addFlags(8192);
        } catch (Throwable th2) {
            e.a(th2);
        }
    }

    public void a() {
        Object obj = PayTask.f10437h;
        synchronized (obj) {
            try {
                obj.notify();
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        a();
        super.finish();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 1010) {
            d.a((a) n.a(this.f10412h), i11, i12, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        c cVar = this.f10405a;
        if (cVar == null) {
            finish();
            return;
        }
        if (cVar.a()) {
            cVar.b();
            return;
        }
        if (!cVar.b()) {
            super.onBackPressed();
        }
        b.a(b.a());
        finish();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        b();
        super.onCreate(bundle);
        try {
            a a11 = a.C0175a.a(getIntent());
            if (a11 == null) {
                finish();
                return;
            }
            this.f10412h = new WeakReference<>(a11);
            if (com.alipay.sdk.m.m.a.D().y()) {
                setRequestedOrientation(3);
            } else {
                setRequestedOrientation(1);
            }
            try {
                Bundle extras = getIntent().getExtras();
                String string = extras.getString("url", null);
                this.f10406b = string;
                if (!n.f(string)) {
                    finish();
                    return;
                }
                this.f10408d = extras.getString("cookie", null);
                this.f10407c = extras.getString("method", null);
                this.f10409e = extras.getString("title", null);
                this.f10411g = extras.getString("version", c.f11162c);
                this.f10410f = extras.getBoolean("backisexit", false);
                try {
                    com.alipay.sdk.m.x.d dVar = new com.alipay.sdk.m.x.d(this, a11, this.f10411g);
                    setContentView(dVar);
                    dVar.a(this.f10409e, this.f10407c, this.f10410f);
                    dVar.a(this.f10406b, this.f10408d);
                    dVar.a(this.f10406b);
                    this.f10405a = dVar;
                } catch (Throwable th2) {
                    com.alipay.sdk.m.k.a.a(a11, com.alipay.sdk.m.k.b.f10653l, "GetInstalledAppEx", th2);
                    finish();
                }
            } catch (Exception unused) {
                finish();
            }
        } catch (Exception unused2) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c cVar = this.f10405a;
        if (cVar != null) {
            cVar.c();
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i11) {
        try {
            super.setRequestedOrientation(i11);
        } catch (Throwable th2) {
            try {
                com.alipay.sdk.m.k.a.a((a) n.a(this.f10412h), com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.B, th2);
            } catch (Throwable unused) {
            }
        }
    }
}
