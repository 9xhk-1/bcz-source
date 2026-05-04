package com.zx.a.I8b7;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.zx.a.I8b7.l2;
import com.zx.a.I8b7.v3;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class h1 {

    /* renamed from: i, reason: collision with root package name */
    public static volatile y1 f46518i;

    /* renamed from: j, reason: collision with root package name */
    public static volatile y1 f46519j;

    /* renamed from: a, reason: collision with root package name */
    public Timer f46520a;

    /* renamed from: b, reason: collision with root package name */
    public TimerTask f46521b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f46522c;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f46523d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f46524e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public volatile String f46525f;

    /* renamed from: g, reason: collision with root package name */
    public volatile long f46526g;

    /* renamed from: h, reason: collision with root package name */
    public z1 f46527h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final h1 f46530a = new h1();
    }

    public final void a(long j11) throws JSONException {
        String a11 = l2.a.f46573a.f46572a.a(61);
        if (TextUtils.isEmpty(a11)) {
            f46518i = new y1();
        } else {
            f46518i = new y1(a11);
        }
        StringBuilder a12 = f3.a("read appRt = ");
        a12.append(f46518i);
        r2.a(a12.toString());
        f46518i.put(j11 + "#0");
        this.f46522c = f46518i.length();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() throws org.json.JSONException {
        /*
            r5 = this;
            android.content.Context r0 = com.zx.a.I8b7.m3.f46585a
            android.content.Context r0 = r0.getApplicationContext()
            boolean r0 = r0 instanceof android.app.Application
            if (r0 == 0) goto La9
            android.content.Context r0 = com.zx.a.I8b7.m3.f46585a
            android.content.Context r0 = r0.getApplicationContext()
            android.app.Application r0 = (android.app.Application) r0
            com.zx.a.I8b7.z1 r1 = new com.zx.a.I8b7.z1
            r1.<init>()
            r5.f46527h = r1
            long r1 = r5.a()
            r5.f46526g = r1
            android.content.Context r1 = com.zx.a.I8b7.m3.f46585a     // Catch: java.lang.Exception -> L59
            android.content.pm.PackageManager r1 = com.zx.a.I8b7.w3.c(r1)     // Catch: java.lang.Exception -> L59
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Exception -> L59
            java.lang.String r3 = "android.intent.action.MAIN"
            r4 = 0
            r2.<init>(r3, r4)     // Catch: java.lang.Exception -> L59
            java.lang.String r3 = "android.intent.category.LAUNCHER"
            r2.addCategory(r3)     // Catch: java.lang.Exception -> L59
            java.lang.String r3 = com.zx.a.I8b7.m3.f46591g     // Catch: java.lang.Exception -> L59
            r2.setPackage(r3)     // Catch: java.lang.Exception -> L59
            r3 = 0
            java.util.List r1 = r1.queryIntentActivities(r2, r3)     // Catch: java.lang.Exception -> L59
            if (r1 == 0) goto L5d
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Exception -> L59
            if (r2 != 0) goto L5d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L59
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L59
            if (r2 == 0) goto L5d
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Exception -> L59
            android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1     // Catch: java.lang.Exception -> L59
            android.content.pm.ActivityInfo r1 = r1.activityInfo     // Catch: java.lang.Exception -> L59
            java.lang.String r1 = r1.name     // Catch: java.lang.Exception -> L59
            goto L5f
        L59:
            r1 = move-exception
            com.zx.a.I8b7.r2.a(r1)
        L5d:
            java.lang.String r1 = "ZX_MainActivity"
        L5f:
            r5.f46525f = r1
            com.zx.a.I8b7.l2 r1 = com.zx.a.I8b7.l2.a.f46573a
            com.zx.a.I8b7.u3 r1 = r1.f46572a
            r2 = 62
            java.lang.String r1 = r1.a(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L79
            com.zx.a.I8b7.y1 r2 = new com.zx.a.I8b7.y1
            r2.<init>(r1)
            com.zx.a.I8b7.h1.f46519j = r2
            goto L80
        L79:
            com.zx.a.I8b7.y1 r1 = new com.zx.a.I8b7.y1
            r1.<init>()
            com.zx.a.I8b7.h1.f46519j = r1
        L80:
            java.lang.String r1 = "read tabRT = "
            java.lang.StringBuilder r1 = com.zx.a.I8b7.f3.a(r1)
            com.zx.a.I8b7.y1 r2 = com.zx.a.I8b7.h1.f46519j
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.zx.a.I8b7.r2.a(r1)
            com.zx.a.I8b7.y1 r1 = com.zx.a.I8b7.h1.f46519j
            com.zx.a.I8b7.z1 r2 = r5.f46527h
            r1.put(r2)
            com.zx.a.I8b7.y1 r1 = com.zx.a.I8b7.h1.f46519j
            int r1 = r1.length()
            r5.f46523d = r1
            com.zx.a.I8b7.h1$a r1 = new com.zx.a.I8b7.h1$a
            r1.<init>()
            r0.registerActivityLifecycleCallbacks(r1)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zx.a.I8b7.h1.b():void");
    }

    public static void a(h1 h1Var, long j11) throws Throwable {
        h1Var.getClass();
        try {
            long a11 = h1Var.a() - j11;
            int length = f46518i.length() - 1;
            if (length >= 0) {
                f46518i.put(length, j11 + "#" + a11);
            }
            l2 l2Var = l2.a.f46573a;
            u3 u3Var = l2Var.f46572a;
            y1 y1Var = f46518i;
            u3Var.getClass();
            if (y1Var == null) {
                return;
            }
            l2Var.f46572a.a(61, y1Var.toString(), true);
            r2.a("appRt had changed refresh:" + y1Var);
        } catch (Throwable th2) {
            StringBuilder a12 = f3.a("dealAppRT ex:");
            a12.append(th2.getMessage());
            r2.b(a12.toString());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Application.ActivityLifecycleCallbacks {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.zx.a.I8b7.h1$a$a, reason: collision with other inner class name */
        public class RunnableC0535a implements Runnable {
            public RunnableC0535a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    h1.a(h1.this);
                } catch (Throwable unused) {
                }
            }
        }

        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            try {
                v3.f.f46726a.f46725e.execute(new RunnableC0535a());
            } catch (Throwable unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            try {
                h1 h1Var = h1.this;
                h1Var.f46526g = h1Var.a();
                h1.this.f46525f = activity.getClass().getName();
            } catch (Throwable unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }

    public static void a(h1 h1Var) throws Throwable {
        y1 y1Var;
        h1Var.getClass();
        try {
            Object opt = h1Var.f46527h.opt(h1Var.f46525f);
            long a11 = h1Var.a() - h1Var.f46526g;
            if (opt != null && (opt instanceof y1)) {
                y1Var = (y1) opt;
                int a12 = y1Var.a(h1Var.f46526g + "");
                if (a12 != -1) {
                    y1Var.put(a12, h1Var.f46526g + "#" + a11);
                } else {
                    y1Var.put(h1Var.f46526g + "#" + a11);
                }
            } else {
                y1Var = new y1();
                y1Var.put(h1Var.f46526g + "#" + a11);
            }
            h1Var.f46527h.put(h1Var.f46525f, y1Var);
            int length = f46519j.length() - 1;
            if (length >= 0) {
                f46519j.remove(length);
            }
            f46519j.put(h1Var.f46527h);
            l2 l2Var = l2.a.f46573a;
            u3 u3Var = l2Var.f46572a;
            y1 y1Var2 = f46519j;
            u3Var.getClass();
            if (y1Var2 == null) {
                return;
            }
            l2Var.f46572a.a(62, y1Var2.toString(), true);
            r2.a("TABRt had changed refresh:" + y1Var2);
        } catch (Throwable th2) {
            StringBuilder a13 = f3.a("dealTabRT ex:");
            a13.append(th2.getMessage());
            r2.b(a13.toString());
        }
    }

    public final long a() {
        return System.currentTimeMillis() / 1000;
    }
}
