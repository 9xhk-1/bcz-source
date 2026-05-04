package cn.com.chinatelecom.account.sdk.ui;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import cn.com.chinatelecom.account.api.d.f;
import cn.com.chinatelecom.account.api.d.g;
import cn.com.chinatelecom.account.api.d.j;
import cn.com.chinatelecom.account.sdk.AuthPageConfig;
import cn.com.chinatelecom.account.sdk.a.d;

/* loaded from: classes3.dex */
public final class AuthActivity extends Activity {

    /* renamed from: b, reason: collision with root package name */
    private static final String f9200b = "AuthActivity";

    /* renamed from: c, reason: collision with root package name */
    private static AuthActivity f9201c;

    /* renamed from: e, reason: collision with root package name */
    private b f9204e;

    /* renamed from: f, reason: collision with root package name */
    private AuthPageConfig f9205f;

    /* renamed from: d, reason: collision with root package name */
    private a f9203d = null;

    /* renamed from: g, reason: collision with root package name */
    private cn.com.chinatelecom.account.sdk.a.a f9206g = null;

    /* renamed from: h, reason: collision with root package name */
    private String f9207h = "0";

    /* renamed from: a, reason: collision with root package name */
    View.OnClickListener f9202a = new View.OnClickListener() { // from class: cn.com.chinatelecom.account.sdk.ui.AuthActivity.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AuthActivity.this.c();
        }
    };

    public class a extends BroadcastReceiver {
        private a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (AuthActivity.this.f9204e != null) {
                AuthActivity.this.f9204e.a();
            }
        }
    }

    public static synchronized AuthActivity a() {
        AuthActivity authActivity;
        synchronized (AuthActivity.class) {
            authActivity = f9201c;
        }
        return authActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        f.a(this.f9207h).c(0L);
        cn.com.chinatelecom.account.sdk.a.a.a().a(j.f());
    }

    private void d() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("cn.com.chinatelecom.account.sdk.preAuth.Action");
            a aVar = new a();
            this.f9203d = aVar;
            registerReceiver(aVar, intentFilter);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private void e() {
        try {
            a aVar = this.f9203d;
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
        synchronized (AuthActivity.class) {
            try {
                f9201c = this;
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
        this.f9205f = b11;
        if (b11 == null) {
            b();
            return;
        }
        int a11 = b11.a();
        if (a11 == 0) {
            b();
        }
        this.f9207h = cn.com.chinatelecom.account.api.d.d.a();
        String a12 = cn.com.chinatelecom.account.api.d.d.a(this);
        cn.com.chinatelecom.account.sdk.a.a a13 = cn.com.chinatelecom.account.sdk.a.a.a();
        this.f9206g = a13;
        a13.a((Context) this, false, this.f9207h);
        setContentView(a11);
        this.f9204e = new b(this, this.f9206g, this.f9205f, this.f9202a, this.f9207h);
        d();
        f.a(this.f9207h).a(a12).c("Login").b(g.f(this));
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        b bVar = this.f9204e;
        if (bVar != null) {
            bVar.d();
            this.f9204e = null;
        }
        this.f9205f = null;
        this.f9206g = null;
        e();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
    }

    public void b() {
        cn.com.chinatelecom.account.api.a.a(f9200b, "finishActivity");
        synchronized (AuthActivity.class) {
            try {
                AuthActivity authActivity = f9201c;
                if (authActivity != null && !authActivity.isFinishing()) {
                    f9201c.finish();
                    f9201c = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
