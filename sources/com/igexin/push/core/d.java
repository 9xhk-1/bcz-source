package com.igexin.push.core;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.core.app.NotificationCompat;
import androidx.media3.common.C;
import com.getui.gtc.api.GtcManager;
import com.getui.gtc.api.SdkInfo;
import com.igexin.assist.sdk.AssistPushManager;
import com.igexin.c.a.d.g;
import com.igexin.push.config.a.AnonymousClass1;
import com.igexin.push.core.e.f.AnonymousClass27;
import com.igexin.push.core.e.f.AnonymousClass28;
import com.igexin.sdk.PushConsts;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public final class d implements com.igexin.c.a.d.a.c {

    /* renamed from: j, reason: collision with root package name */
    private static final String f37941j = "CoreLogic";

    /* renamed from: a, reason: collision with root package name */
    Context f37942a;

    /* renamed from: b, reason: collision with root package name */
    Handler f37943b;

    /* renamed from: c, reason: collision with root package name */
    final ConcurrentLinkedQueue<Message> f37944c;

    /* renamed from: d, reason: collision with root package name */
    com.igexin.push.core.a.b f37945d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f37946e;

    /* renamed from: f, reason: collision with root package name */
    final com.igexin.c.a.b.e f37947f;

    /* renamed from: g, reason: collision with root package name */
    public com.igexin.c.a.b.d f37948g;

    /* renamed from: h, reason: collision with root package name */
    public final com.igexin.push.e.a f37949h;

    /* renamed from: i, reason: collision with root package name */
    public final com.igexin.push.b.b f37950i;

    /* renamed from: k, reason: collision with root package name */
    private final f f37951k;

    /* renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f37952l;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final d f37956a = new d(0);

        private a() {
        }
    }

    private d() {
        this.f37944c = new ConcurrentLinkedQueue<>();
        this.f37952l = new AtomicBoolean(false);
        this.f37951k = new f();
        com.igexin.c.a.b.e a11 = com.igexin.c.a.b.e.a();
        this.f37947f = a11;
        a11.f37160g = new com.igexin.push.d.a(this.f37942a);
        a11.a((com.igexin.c.a.d.a.c) this);
        this.f37949h = new com.igexin.push.e.a();
        this.f37950i = new com.igexin.push.b.b(ServiceManager.f37612b);
        this.f37948g = com.igexin.push.d.a.c.a();
    }

    public static boolean c() {
        com.igexin.c.a.c.a.a("CoreLogic|ext init ###", new Object[0]);
        Process.myPid();
        DisplayMetrics displayMetrics = e.f38035l.getResources().getDisplayMetrics();
        e.f38033j = Math.max(displayMetrics.heightPixels, displayMetrics.widthPixels);
        e.f38034k = Math.min(displayMetrics.heightPixels, displayMetrics.widthPixels);
        try {
            if (Build.VERSION.SDK_INT < 30) {
                com.igexin.push.g.j.j();
            }
        } catch (Throwable unused) {
        }
        if (e.aC == null) {
            e.aC = com.igexin.c.b.a.b(e.f38035l.getPackageName() + System.currentTimeMillis());
            com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) com.igexin.push.config.a.a().new AnonymousClass1(e.aC), false, true);
            String str = e.aC;
        }
        boolean z11 = e.f38044u;
        return true;
    }

    public static String h() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) e.f38035l.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                if (activeNetworkInfo.getType() == 1) {
                    return "wifi";
                }
                if (activeNetworkInfo.getType() == 0) {
                    return "mobile";
                }
            }
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
        return null;
    }

    private Handler i() {
        return this.f37946e;
    }

    private static d j() {
        return a.f37956a;
    }

    private com.igexin.c.a.b.d k() {
        return this.f37948g;
    }

    private com.igexin.push.e.a l() {
        return this.f37949h;
    }

    private com.igexin.push.b.b m() {
        return this.f37950i;
    }

    private void n() {
        Handler handler;
        try {
            e.a(this.f37942a);
            com.igexin.push.config.b.a();
            com.igexin.push.config.b.b();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(PushConsts.ACTION_BROADCAST_NETWORK_CHANGE);
            intentFilter.addAction(b.L);
            intentFilter.addAction(b.N);
            intentFilter.addAction("com.igexin.action.notification.click");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            int i11 = Build.VERSION.SDK_INT;
            if (i11 > 33) {
                this.f37942a.registerReceiver(i.a(), intentFilter, e.f38001ac, null, 4);
            } else {
                this.f37942a.registerReceiver(i.a(), intentFilter, e.f38001ac, null);
            }
            com.igexin.push.b.a aVar = new com.igexin.push.b.a();
            aVar.a((com.igexin.push.core.e.a) com.igexin.push.core.e.f.a());
            aVar.a((com.igexin.push.core.e.a) com.igexin.push.config.a.a());
            aVar.a((com.igexin.push.core.e.a) com.igexin.push.core.e.e.a());
            aVar.a((com.igexin.push.core.e.a) com.igexin.push.core.e.c.a());
            this.f37947f.a((com.igexin.c.a.d.f) aVar, true, false);
            com.igexin.push.core.e.f a11 = com.igexin.push.core.e.f.a();
            if (TextUtils.isEmpty(com.igexin.push.g.g.f38691c)) {
                com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) a11.new AnonymousClass27(), true, false);
                com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) a11.new AnonymousClass28(), true, false);
            }
            com.igexin.push.core.d.b.d().a();
            com.igexin.push.f.h.b();
            com.igexin.c.a.b.e eVar = this.f37947f;
            Context context = this.f37942a;
            if (!eVar.I) {
                if (!com.igexin.push.g.n.l()) {
                    eVar.f37251v = (PowerManager) context.getSystemService(c6.d.f8118j);
                    eVar.D = true;
                    eVar.f37252w = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
                    try {
                        if (i11 >= 31) {
                            eVar.f37249t = ((Boolean) AlarmManager.class.getDeclaredMethod("canScheduleExactAlarms", null).invoke(eVar.f37252w, null)).booleanValue();
                        } else {
                            eVar.f37249t = true;
                        }
                    } catch (Throwable th2) {
                        com.igexin.c.a.c.a.a(th2);
                    }
                    g.AnonymousClass1 anonymousClass1 = new g.AnonymousClass1(context);
                    int i12 = Build.VERSION.SDK_INT;
                    if (i12 > 33) {
                        context.registerReceiver(eVar, anonymousClass1, e.f38001ac, null, 4);
                    } else {
                        context.registerReceiver(eVar, anonymousClass1, e.f38001ac, null);
                    }
                    eVar.B = "AlarmNioTaskSchedule." + context.getPackageName();
                    if (i12 > 33) {
                        context.registerReceiver(eVar, new IntentFilter(eVar.B), e.f38001ac, null, 4);
                    } else {
                        context.registerReceiver(eVar, new IntentFilter(eVar.B), e.f38001ac, null);
                    }
                    int i13 = (com.igexin.push.g.n.a(context) < 31 || i12 < 30) ? C.BUFFER_FLAG_FIRST_SAMPLE : 201326592;
                    eVar.f37253x = new Intent("AlarmTaskSchedule." + context.getPackageName());
                    eVar.f37254y = PendingIntent.getBroadcast(context, eVar.hashCode(), eVar.f37253x, i13);
                    eVar.hashCode();
                    eVar.f37255z = new Intent(eVar.B);
                    eVar.A = PendingIntent.getBroadcast(context, eVar.hashCode() + 2, eVar.f37255z, i13);
                    eVar.hashCode();
                }
                eVar.f37245p.start();
                try {
                    Thread.yield();
                } catch (Throwable th3) {
                    com.igexin.c.a.c.a.a(th3);
                }
                eVar.I = true;
            }
            com.igexin.c.a.b.e eVar2 = this.f37947f;
            byte[] a12 = com.igexin.c.b.a.a(e.L.getBytes());
            eVar2.f37158e = a12;
            byte[] a13 = com.igexin.c.b.a.a(a12);
            eVar2.f37159f = a13;
            if (a13 != null) {
                new String(a13);
            }
            e.f38003ae = this.f37947f.a((com.igexin.c.a.d.f) com.igexin.push.f.b.b.g(), false, true);
            e.f38004af = this.f37947f.a((com.igexin.c.a.d.f) com.igexin.push.f.b.e.g(), true, true);
            com.igexin.push.c.c.a();
            com.igexin.push.c.c.b();
            b();
            this.f37945d = com.igexin.push.core.a.b.d();
            this.f37949h.a();
            e.f38036m.set(true);
            com.igexin.push.f.g.a().d();
            while (!this.f37944c.isEmpty()) {
                Message poll = this.f37944c.poll();
                if (poll != null && (handler = this.f37943b) != null) {
                    handler.sendMessage(poll);
                }
            }
            com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new AnonymousClass1(), true);
        } catch (Throwable th4) {
            th = th4;
            StringBuilder sb2 = new StringBuilder();
            StackTraceElement[] stackTrace = th.getStackTrace();
            while (th.getCause() != null) {
                th = th.getCause();
            }
            sb2.append(th.toString());
            sb2.append("\n");
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb2.append(stackTraceElement.toString());
                sb2.append("\n");
            }
            String sb3 = sb2.toString();
            com.igexin.c.a.c.a.b(f37941j, sb3);
            com.igexin.c.a.c.a.d.a().a("[CoreLogic] ------ CoreLogic init failed = " + sb3 + " ------");
        }
    }

    private void o() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(PushConsts.ACTION_BROADCAST_NETWORK_CHANGE);
        intentFilter.addAction(b.L);
        intentFilter.addAction(b.N);
        intentFilter.addAction("com.igexin.action.notification.click");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        if (Build.VERSION.SDK_INT > 33) {
            this.f37942a.registerReceiver(i.a(), intentFilter, e.f38001ac, null, 4);
        } else {
            this.f37942a.registerReceiver(i.a(), intentFilter, e.f38001ac, null);
        }
    }

    private boolean p() {
        if (e.f38035l == null) {
            return true;
        }
        com.igexin.push.core.d.d.a().a("p", Boolean.FALSE);
        e.f38042s = false;
        e.f38045v = false;
        this.f37949h.b();
        return true;
    }

    private static void q() {
        String str = e.f37998a;
        String str2 = e.A;
        GtcManager.getInstance().loadSdk(new SdkInfo.Builder().appid(e.f37998a).cid(e.A).moduleName(b.f37738j).version("3.3.7.0").build());
    }

    private void r() {
        try {
            this.f37942a.unregisterReceiver(i.a());
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
        }
    }

    private static /* synthetic */ void s() {
        String str = e.f37998a;
        String str2 = e.A;
        GtcManager.getInstance().loadSdk(new SdkInfo.Builder().appid(e.f37998a).cid(e.A).moduleName(b.f37738j).version("3.3.7.0").build());
    }

    public final long a() {
        Handler handler = this.f37943b;
        if (handler == null) {
            return -2L;
        }
        return handler.getLooper().getThread().getId();
    }

    public final void b() {
        com.igexin.push.f.b.a g11 = com.igexin.push.f.b.a.g();
        com.igexin.push.f.c cVar = new com.igexin.push.f.c();
        g11.a((com.igexin.push.f.b.c) cVar);
        g11.a((com.igexin.push.f.b.c) com.igexin.push.f.a.a());
        g11.a((com.igexin.push.f.b.c) com.igexin.push.f.f.a());
        g11.a((com.igexin.push.f.b.c) com.igexin.push.f.g.a());
        g11.a((com.igexin.push.f.b.c) com.igexin.push.f.e.a());
        try {
            com.igexin.push.f.a.a().a(false);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
        try {
            com.igexin.c.a.c.a.a("ReDisplayTask | execute redisplayTask", new Object[0]);
            com.igexin.push.f.e.a().b();
            com.igexin.push.f.e.a().d();
        } catch (Throwable th3) {
            com.igexin.c.a.c.a.a(th3);
        }
        try {
            cVar.b();
            cVar.f38577b = System.currentTimeMillis();
        } catch (Throwable th4) {
            com.igexin.c.a.c.a.a(th4);
        }
        e.f38005ag = this.f37947f.a((com.igexin.c.a.d.f) g11, false, true);
    }

    @Override // com.igexin.c.a.d.a.c
    public final boolean d() {
        return false;
    }

    @Override // com.igexin.c.a.d.a.c
    public final boolean e() {
        return false;
    }

    @Override // com.igexin.c.a.d.a.c
    public final boolean f() {
        return true;
    }

    @Override // com.igexin.c.a.d.a.c
    public final long g() {
        return 94808L;
    }

    public /* synthetic */ d(byte b11) {
        this();
    }

    @Override // com.igexin.c.a.d.a.c
    public final void a(long j11) {
    }

    public final boolean a(Context context) {
        this.f37942a = context.getApplicationContext();
        f fVar = this.f37951k;
        if (fVar != null && fVar.isAlive()) {
            com.igexin.c.a.c.a.a("CoreLogic|coreThread is alive +++++", new Object[0]);
            return true;
        }
        if (!this.f37952l.getAndSet(true)) {
            com.igexin.c.a.c.a.a("CoreLogic|start coreThread +++++", new Object[0]);
            this.f37951k.start();
            this.f37943b = new c(this.f37951k.getLooper());
            this.f37946e = new com.igexin.c.a.b.a.a.c(this.f37951k.getLooper());
        }
        return true;
    }

    public final boolean a(Message message) {
        if (e.f38036m.get()) {
            this.f37943b.sendMessage(message);
            return true;
        }
        this.f37944c.add(message);
        return true;
    }

    @Override // com.igexin.c.a.d.a.c
    public final boolean a(com.igexin.c.a.d.a.e eVar) {
        com.igexin.push.core.a.b bVar = this.f37945d;
        return bVar != null && bVar.a(eVar);
    }

    public static boolean a(com.igexin.push.f.b.f fVar) {
        return com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) fVar, false, true);
    }

    public static boolean a(boolean z11) {
        com.igexin.c.a.c.a.a("CoreLogic|start sdkSwitch isSlave = ".concat(String.valueOf(z11)), new Object[0]);
        if (e.f38035l == null) {
            return false;
        }
        if (!com.igexin.push.core.d.d.a().b("i")) {
            com.igexin.push.core.d.d a11 = com.igexin.push.core.d.d.a();
            Boolean bool = Boolean.TRUE;
            a11.a("i", bool);
            com.igexin.push.core.d.d.a().a("p", bool);
            e.f38042s = true;
        }
        if (z11) {
            com.igexin.push.core.d.d.a().a("p", Boolean.TRUE);
            e.f38042s = true;
        }
        a.f37956a.f37949h.a();
        return true;
    }

    /* renamed from: com.igexin.push.core.d$1, reason: invalid class name */
    public class AnonymousClass1 extends com.igexin.c.a.b.a.a.a {
        public AnonymousClass1() {
            super(com.igexin.c.a.b.c.f37144f, null);
        }

        @Override // com.igexin.c.a.d.f, com.igexin.c.a.d.a.f
        public final void b_() throws Exception {
            super.b_();
            int myPid = Process.myPid();
            l a11 = l.a();
            Bundle bundle = new Bundle();
            bundle.putInt("action", PushConsts.GET_SDKSERVICEPID);
            bundle.putInt(PushConsts.KEY_SERVICE_PIT, myPid);
            a11.a(bundle);
            l a12 = l.a();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("action", PushConsts.ACTION_NOTIFICATION_ENABLE);
            a12.a(bundle2);
            String str = e.f37998a;
            String str2 = e.A;
            GtcManager.getInstance().loadSdk(new SdkInfo.Builder().appid(e.f37998a).cid(e.A).moduleName(b.f37738j).version("3.3.7.0").build());
            try {
                AssistPushManager.getInstance().initialize(e.f38035l);
                AssistPushManager.getInstance().register(e.f38035l);
            } catch (Throwable th2) {
                com.igexin.c.a.c.a.a(th2);
                com.igexin.c.a.c.a.b(d.f37941j, "|init|failed|");
            }
        }

        @Override // com.igexin.c.a.d.a.e
        public final int c() {
            return 0;
        }

        @Override // com.igexin.c.a.b.a.a.a
        public final void c_() {
        }
    }
}
