package com.xiaomi.push;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.push.aj;

/* loaded from: classes8.dex */
public class dq {

    /* renamed from: a, reason: collision with root package name */
    private static volatile dq f45398a;

    /* renamed from: a, reason: collision with other field name */
    private Context f263a;

    /* renamed from: a, reason: collision with other field name */
    private a f264a;

    public interface a {
        void a();
    }

    private dq(Context context) {
        this.f263a = context;
    }

    public static int a(int i11) {
        return Math.max(60, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        a aVar;
        aj a11 = aj.a(this.f263a);
        com.xiaomi.push.service.ba a12 = com.xiaomi.push.service.ba.a(this.f263a);
        SharedPreferences sharedPreferences = this.f263a.getSharedPreferences("mipush_extra", 0);
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = sharedPreferences.getLong("first_try_ts", currentTimeMillis);
        if (j11 == currentTimeMillis) {
            sharedPreferences.edit().putLong("first_try_ts", currentTimeMillis).commit();
        }
        if (Math.abs(currentTimeMillis - j11) < 172800000) {
            return;
        }
        a(a12, a11, false);
        if (a12.a(hm.StorageCollectionSwitch.a(), true)) {
            int a13 = a(a12.a(hm.StorageCollectionFrequency.a(), 86400));
            a11.a(new dt(this.f263a, a13), a13, 0);
        }
        if (j.m6172a(this.f263a) && (aVar = this.f264a) != null) {
            aVar.a();
        }
        if (a12.a(hm.ActivityTSSwitch.a(), false)) {
            a();
        }
        a(a12, a11, true);
    }

    public static dq a(Context context) {
        if (f45398a == null) {
            synchronized (dq.class) {
                try {
                    if (f45398a == null) {
                        f45398a = new dq(context);
                    }
                } finally {
                }
            }
        }
        return f45398a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m5825a() {
        aj.a(this.f263a).a(new dr(this));
    }

    private void a(com.xiaomi.push.service.ba baVar, aj ajVar, boolean z11) {
        if (baVar.a(hm.UploadSwitch.a(), true)) {
            du duVar = new du(this.f263a);
            if (z11) {
                ajVar.a((aj.a) duVar, a(baVar.a(hm.UploadFrequency.a(), 86400)));
            } else {
                ajVar.m5718a((aj.a) duVar);
            }
        }
    }

    private boolean a() {
        try {
            Context context = this.f263a;
            if (!(context instanceof Application)) {
                context = context.getApplicationContext();
            }
            ((Application) context).registerActivityLifecycleCallbacks(new dk(this.f263a, String.valueOf(System.currentTimeMillis() / 1000)));
            return true;
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
            return false;
        }
    }
}
