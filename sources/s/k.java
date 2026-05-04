package s;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import androidx.core.content.ContextCompat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    public static final String f87012e = "InactivityTimer";

    /* renamed from: f, reason: collision with root package name */
    public static final long f87013f = 300000;

    /* renamed from: a, reason: collision with root package name */
    public final Activity f87014a;

    /* renamed from: b, reason: collision with root package name */
    public final BroadcastReceiver f87015b = new b();

    /* renamed from: c, reason: collision with root package name */
    public boolean f87016c = false;

    /* renamed from: d, reason: collision with root package name */
    public AsyncTask<?, ?, ?> f87017d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends AsyncTask<Object, Object, Object> {
        @Override // android.os.AsyncTask
        public Object doInBackground(Object... objects) {
            try {
                Thread.sleep(300000L);
                qb.c.i(k.f87012e, "Finishing activity due to inactivity", new Object[0]);
                k.this.f87014a.finish();
                return null;
            } catch (InterruptedException unused) {
                return null;
            }
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                if (intent.getIntExtra("plugged", -1) <= 0) {
                    k.this.d();
                } else {
                    k.this.c();
                }
            }
        }

        public b() {
        }
    }

    public k(Activity activity) {
        this.f87014a = activity;
        d();
    }

    public final synchronized void c() {
        AsyncTask<?, ?, ?> asyncTask = this.f87017d;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.f87017d = null;
        }
    }

    public synchronized void d() {
        c();
        a aVar = new a();
        this.f87017d = aVar;
        u.b.a(aVar);
    }

    public synchronized void e() {
        try {
            c();
            if (this.f87016c) {
                this.f87014a.unregisterReceiver(this.f87015b);
                this.f87016c = false;
            } else {
                qb.c.q(f87012e, "PowerStatusReceiver was never registered?", new Object[0]);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void f() {
        try {
            if (this.f87016c) {
                qb.c.q(f87012e, "PowerStatusReceiver was already registered?", new Object[0]);
            } else {
                ContextCompat.registerReceiver(this.f87014a, this.f87015b, new IntentFilter("android.intent.action.BATTERY_CHANGED"), 4);
                this.f87016c = true;
            }
            d();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void g() {
        c();
    }
}
