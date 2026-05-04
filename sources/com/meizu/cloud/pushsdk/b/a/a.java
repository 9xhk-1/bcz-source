package com.meizu.cloud.pushsdk.b.a;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;
import com.meizu.cloud.pushinternal.DebugLogger;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private AlarmManager f39346a;

    /* renamed from: b, reason: collision with root package name */
    private Context f39347b;

    /* renamed from: c, reason: collision with root package name */
    private Runnable f39348c;

    /* renamed from: d, reason: collision with root package name */
    private long f39349d;

    /* renamed from: e, reason: collision with root package name */
    private int f39350e;

    /* renamed from: f, reason: collision with root package name */
    private C0472a f39351f;

    /* renamed from: g, reason: collision with root package name */
    private PendingIntent f39352g;

    /* renamed from: h, reason: collision with root package name */
    private String f39353h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f39354i;

    /* renamed from: com.meizu.cloud.pushsdk.b.a.a$a, reason: collision with other inner class name */
    public class C0472a extends BroadcastReceiver {
        private C0472a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !intent.getAction().equals("alarm.util")) {
                return;
            }
            DebugLogger.i("AlarmUtils", "on receive delayed task, keyword: " + a.this.f39353h);
            a.this.f39354i = true;
            a.this.c();
            a.this.f39348c.run();
        }
    }

    public a(Context context, Runnable runnable, long j11) {
        this(context, runnable, j11, true);
    }

    public void b() {
        if (this.f39346a != null && this.f39352g != null && !this.f39354i) {
            DebugLogger.i("AlarmUtils", "cancel  delayed task, keyword: " + this.f39353h);
            this.f39346a.cancel(this.f39352g);
        }
        c();
    }

    public a(Context context, Runnable runnable, long j11, boolean z11) {
        Context applicationContext = context.getApplicationContext();
        this.f39347b = applicationContext;
        this.f39348c = runnable;
        this.f39349d = j11;
        this.f39350e = !z11 ? 1 : 0;
        this.f39346a = (AlarmManager) applicationContext.getSystemService(NotificationCompat.CATEGORY_ALARM);
        this.f39354i = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            C0472a c0472a = this.f39351f;
            if (c0472a != null) {
                this.f39347b.unregisterReceiver(c0472a);
                this.f39351f = null;
            }
        } catch (Exception e11) {
            DebugLogger.e("AlarmUtils", "clean error, " + e11.getMessage());
        }
    }

    public boolean a() {
        if (!this.f39354i) {
            DebugLogger.e("AlarmUtils", "last task not completed");
            return false;
        }
        this.f39354i = false;
        C0472a c0472a = new C0472a();
        this.f39351f = c0472a;
        this.f39347b.registerReceiver(c0472a, new IntentFilter("alarm.util"));
        this.f39353h = String.valueOf(System.currentTimeMillis());
        this.f39352g = PendingIntent.getBroadcast(this.f39347b, 0, new Intent("alarm.util"), 1073741824);
        this.f39346a.setExactAndAllowWhileIdle(this.f39350e, System.currentTimeMillis() + this.f39349d, this.f39352g);
        DebugLogger.i("AlarmUtils", "start delayed task, keyword: " + this.f39353h);
        return true;
    }
}
