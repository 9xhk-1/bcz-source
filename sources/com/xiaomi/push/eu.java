package com.xiaomi.push;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.xiaomi.push.et;

/* loaded from: classes8.dex */
class eu implements et.a {

    /* renamed from: a, reason: collision with other field name */
    protected Context f362a;

    /* renamed from: a, reason: collision with other field name */
    private PendingIntent f361a = null;

    /* renamed from: a, reason: collision with root package name */
    private volatile long f45491a = 0;

    public eu(Context context) {
        this.f362a = null;
        this.f362a = context;
    }

    @Override // com.xiaomi.push.et.a
    public void a() {
        if (this.f361a != null) {
            try {
                ((AlarmManager) this.f362a.getSystemService(NotificationCompat.CATEGORY_ALARM)).cancel(this.f361a);
            } catch (Exception unused) {
            } catch (Throwable th2) {
                this.f361a = null;
                com.xiaomi.channel.commonutils.logger.b.c("[Alarm] unregister timer");
                this.f45491a = 0L;
                throw th2;
            }
            this.f361a = null;
            com.xiaomi.channel.commonutils.logger.b.c("[Alarm] unregister timer");
            this.f45491a = 0L;
        }
        this.f45491a = 0L;
    }

    private void a(AlarmManager alarmManager, long j11, PendingIntent pendingIntent) {
        try {
            AlarmManager.class.getMethod("setExact", Integer.TYPE, Long.TYPE, PendingIntent.class).invoke(alarmManager, 2, Long.valueOf(j11), pendingIntent);
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.d("[Alarm] invoke setExact method meet error. " + e11);
        }
    }

    public void a(Intent intent, long j11) {
        AlarmManager alarmManager = (AlarmManager) this.f362a.getSystemService(NotificationCompat.CATEGORY_ALARM);
        this.f361a = Build.VERSION.SDK_INT >= 31 ? PendingIntent.getBroadcast(this.f362a, 0, intent, 33554432) : PendingIntent.getBroadcast(this.f362a, 0, intent, 0);
        bj.a((Object) alarmManager, "setExactAndAllowWhileIdle", 2, Long.valueOf(j11), this.f361a);
        com.xiaomi.channel.commonutils.logger.b.c("[Alarm] register timer " + j11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r8.f45491a < r4) goto L18;
     */
    @Override // com.xiaomi.push.et.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r9) {
        /*
            r8 = this;
            android.content.Context r0 = r8.f362a
            com.xiaomi.push.service.o r0 = com.xiaomi.push.service.o.a(r0)
            long r0 = r0.m6280a()
            r2 = 0
            if (r9 != 0) goto L15
            long r4 = r8.f45491a
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L15
            return
        L15:
            if (r9 == 0) goto L1a
            r8.a()
        L1a:
            long r4 = android.os.SystemClock.elapsedRealtime()
            if (r9 != 0) goto L3c
            long r6 = r8.f45491a
            int r9 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r9 != 0) goto L27
            goto L3c
        L27:
            long r2 = r8.f45491a
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 > 0) goto L40
            long r2 = r8.f45491a
            long r2 = r2 + r0
            r8.f45491a = r2
            long r2 = r8.f45491a
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 >= 0) goto L40
        L38:
            long r4 = r4 + r0
            r8.f45491a = r4
            goto L40
        L3c:
            long r2 = r4 % r0
            long r0 = r0 - r2
            goto L38
        L40:
            android.content.Intent r9 = new android.content.Intent
            java.lang.String r0 = com.xiaomi.push.service.bk.f46315p
            r9.<init>(r0)
            android.content.Context r0 = r8.f362a
            java.lang.String r0 = r0.getPackageName()
            r9.setPackage(r0)
            long r0 = r8.f45491a
            r8.a(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.eu.a(boolean):void");
    }

    @Override // com.xiaomi.push.et.a
    /* renamed from: a */
    public boolean mo5928a() {
        return this.f45491a != 0;
    }
}
