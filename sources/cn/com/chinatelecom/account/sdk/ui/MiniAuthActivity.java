package cn.com.chinatelecom.account.sdk.ui;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import cn.com.chinatelecom.account.api.d.f;
import cn.com.chinatelecom.account.api.d.g;
import cn.com.chinatelecom.account.api.d.j;
import cn.com.chinatelecom.account.sdk.AuthPageConfig;
import cn.com.chinatelecom.account.sdk.a.d;

/* loaded from: classes3.dex */
public final class MiniAuthActivity extends Activity {

    /* renamed from: b, reason: collision with root package name */
    private static final String f9210b = "MiniAuthActivity";

    /* renamed from: c, reason: collision with root package name */
    private static MiniAuthActivity f9211c;

    /* renamed from: e, reason: collision with root package name */
    private b f9214e;

    /* renamed from: f, reason: collision with root package name */
    private AuthPageConfig f9215f;

    /* renamed from: d, reason: collision with root package name */
    private a f9213d = null;

    /* renamed from: g, reason: collision with root package name */
    private cn.com.chinatelecom.account.sdk.a.a f9216g = null;

    /* renamed from: h, reason: collision with root package name */
    private String f9217h = "0";

    /* renamed from: a, reason: collision with root package name */
    View.OnClickListener f9212a = new View.OnClickListener() { // from class: cn.com.chinatelecom.account.sdk.ui.MiniAuthActivity.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MiniAuthActivity.this.c();
        }
    };

    public class a extends BroadcastReceiver {
        private a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (MiniAuthActivity.this.f9214e != null) {
                MiniAuthActivity.this.f9214e.a();
            }
        }
    }

    public static synchronized MiniAuthActivity a() {
        MiniAuthActivity miniAuthActivity;
        synchronized (MiniAuthActivity.class) {
            miniAuthActivity = f9211c;
        }
        return miniAuthActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        f.a(this.f9217h).c(0L);
        cn.com.chinatelecom.account.sdk.a.a.a().a(j.f());
    }

    private void d() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("cn.com.chinatelecom.account.sdk.preAuth.Action");
            a aVar = new a();
            this.f9213d = aVar;
            registerReceiver(aVar, intentFilter);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private void e() {
        try {
            a aVar = this.f9213d;
            if (aVar != null) {
                unregisterReceiver(aVar);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        c();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        synchronized (MiniAuthActivity.class) {
            try {
                f9211c = this;
            } catch (Throwable th2) {
                th = th2;
                while (true) {
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
        }
        AuthPageConfig b11 = d.a().b();
        this.f9215f = b11;
        if (b11 == null) {
            b();
            return;
        }
        int a11 = b11.a();
        if (a11 == 0) {
            b();
        }
        this.f9217h = cn.com.chinatelecom.account.api.d.d.a();
        String a12 = cn.com.chinatelecom.account.api.d.d.a(this);
        cn.com.chinatelecom.account.sdk.a.a a13 = cn.com.chinatelecom.account.sdk.a.a.a();
        this.f9216g = a13;
        a13.a((Context) this, false, this.f9217h);
        setContentView(a11);
        this.f9214e = new b(this, this.f9216g, this.f9215f, this.f9212a, this.f9217h);
        d();
        a(this.f9215f.I(), this.f9215f.J(), this.f9215f.K());
        f.a(this.f9217h).a(a12).c("MiniLogin").b(g.f(this));
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        b bVar = this.f9214e;
        if (bVar != null) {
            bVar.d();
            this.f9214e = null;
        }
        this.f9215f = null;
        this.f9216g = null;
        e();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
    }

    private void a(int i11, int i12, int i13) {
        try {
            Point a11 = this.f9216g.a((Activity) this);
            if (i11 == 0) {
                i11 = (int) (a11.x * 0.8d);
            }
            if (i12 == 0) {
                i12 = (int) (a11.x * 0.8d);
            }
            if (i13 == 0) {
                i13 = 17;
            }
            Window window = getWindow();
            if (window != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.width = i11;
                attributes.height = i12;
                window.setAttributes(attributes);
                window.setGravity(i13);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public void b() {
        cn.com.chinatelecom.account.api.a.a(f9210b, "finishActivity");
        synchronized (MiniAuthActivity.class) {
            try {
                MiniAuthActivity miniAuthActivity = f9211c;
                if (miniAuthActivity != null && !miniAuthActivity.isFinishing()) {
                    f9211c.finish();
                    f9211c = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
