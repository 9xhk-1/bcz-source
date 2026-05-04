package com.tencent.bugly.proguard;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.igexin.sdk.PushConsts;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class aq extends BroadcastReceiver {

    /* renamed from: d, reason: collision with root package name */
    private static aq f42316d;

    /* renamed from: b, reason: collision with root package name */
    private Context f42318b;

    /* renamed from: c, reason: collision with root package name */
    private String f42319c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f42320e = true;

    /* renamed from: a, reason: collision with root package name */
    private IntentFilter f42317a = new IntentFilter();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            a(context, intent);
        } catch (Throwable th2) {
            if (al.a(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    public static synchronized aq a() {
        aq aqVar;
        synchronized (aq.class) {
            try {
                if (f42316d == null) {
                    f42316d = new aq();
                }
                aqVar = f42316d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aqVar;
    }

    public final synchronized void b(Context context) {
        try {
            al.a(aq.class, "Unregister broadcast receiver of Bugly.", new Object[0]);
            context.unregisterReceiver(this);
            this.f42318b = context;
        } catch (Throwable th2) {
            if (al.a(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    public final synchronized void a(String str) {
        try {
            if (!this.f42317a.hasAction(str)) {
                this.f42317a.addAction(str);
            }
            al.c("add action %s", str);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void a(Context context) {
        this.f42318b = context;
        ap.a(new Runnable() { // from class: com.tencent.bugly.proguard.aq.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    al.a(aq.f42316d.getClass(), "Register broadcast receiver of Bugly.", new Object[0]);
                    synchronized (this) {
                        aq.this.f42318b.registerReceiver(aq.f42316d, aq.this.f42317a, "com.tencent.bugly.BuglyBroadcastReceiver.permission", null);
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        });
    }

    private synchronized boolean a(Context context, Intent intent) {
        if (context != null && intent != null) {
            if (intent.getAction().equals(PushConsts.ACTION_BROADCAST_NETWORK_CHANGE)) {
                if (this.f42320e) {
                    this.f42320e = false;
                    return true;
                }
                String c11 = ab.c(this.f42318b);
                al.c("is Connect BC ".concat(String.valueOf(c11)), new Object[0]);
                al.a("network %s changed to %s", this.f42319c, String.valueOf(c11));
                if (c11 == null) {
                    this.f42319c = null;
                    return true;
                }
                String str = this.f42319c;
                this.f42319c = c11;
                long currentTimeMillis = System.currentTimeMillis();
                ac a11 = ac.a();
                ai a12 = ai.a();
                aa a13 = aa.a(context);
                if (a11 != null && a12 != null && a13 != null) {
                    if (!c11.equals(str) && currentTimeMillis - a12.a(at.f42346a) > 30000) {
                        al.a("try to upload crash on network changed.", new Object[0]);
                        at a14 = at.a();
                        if (a14 != null) {
                            a14.a(0L);
                        }
                        al.a("try to upload userinfo on network changed.", new Object[0]);
                        s.f42640b.b();
                    }
                    return true;
                }
                al.d("not inited BC not work", new Object[0]);
                return true;
            }
        }
        return false;
    }
}
