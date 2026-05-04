package com.igexin.push.core;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.media3.common.C;
import com.igexin.c.a.d.g;
import com.igexin.push.core.d;
import com.igexin.push.core.d.AnonymousClass1;
import com.igexin.push.core.e.f.AnonymousClass27;
import com.igexin.push.core.e.f.AnonymousClass28;
import com.igexin.sdk.PushConsts;

/* loaded from: classes7.dex */
public final class f extends HandlerThread {
    public f() {
        super("CoreThread");
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        Handler handler;
        d dVar = d.a.f37956a;
        try {
            e.a(dVar.f37942a);
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
                dVar.f37942a.registerReceiver(i.a(), intentFilter, e.f38001ac, null, 4);
            } else {
                dVar.f37942a.registerReceiver(i.a(), intentFilter, e.f38001ac, null);
            }
            com.igexin.push.b.a aVar = new com.igexin.push.b.a();
            aVar.a((com.igexin.push.core.e.a) com.igexin.push.core.e.f.a());
            aVar.a((com.igexin.push.core.e.a) com.igexin.push.config.a.a());
            aVar.a((com.igexin.push.core.e.a) com.igexin.push.core.e.e.a());
            aVar.a((com.igexin.push.core.e.a) com.igexin.push.core.e.c.a());
            dVar.f37947f.a((com.igexin.c.a.d.f) aVar, true, false);
            com.igexin.push.core.e.f a11 = com.igexin.push.core.e.f.a();
            if (TextUtils.isEmpty(com.igexin.push.g.g.f38691c)) {
                com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) a11.new AnonymousClass27(), true, false);
                com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) a11.new AnonymousClass28(), true, false);
            }
            com.igexin.push.core.d.b.d().a();
            com.igexin.push.f.h.b();
            com.igexin.c.a.b.e eVar = dVar.f37947f;
            Context context = dVar.f37942a;
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
            com.igexin.c.a.b.e eVar2 = dVar.f37947f;
            byte[] a12 = com.igexin.c.b.a.a(e.L.getBytes());
            eVar2.f37158e = a12;
            byte[] a13 = com.igexin.c.b.a.a(a12);
            eVar2.f37159f = a13;
            if (a13 != null) {
                new String(a13);
            }
            e.f38003ae = dVar.f37947f.a((com.igexin.c.a.d.f) com.igexin.push.f.b.b.g(), false, true);
            e.f38004af = dVar.f37947f.a((com.igexin.c.a.d.f) com.igexin.push.f.b.e.g(), true, true);
            com.igexin.push.c.c.a();
            com.igexin.push.c.c.b();
            dVar.b();
            dVar.f37945d = com.igexin.push.core.a.b.d();
            dVar.f37949h.a();
            e.f38036m.set(true);
            com.igexin.push.f.g.a().d();
            while (!dVar.f37944c.isEmpty()) {
                Message poll = dVar.f37944c.poll();
                if (poll != null && (handler = dVar.f37943b) != null) {
                    handler.sendMessage(poll);
                }
            }
            com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) dVar.new AnonymousClass1(), true);
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
            com.igexin.c.a.c.a.b("CoreLogic", sb3);
            com.igexin.c.a.c.a.d.a().a("[CoreLogic] ------ CoreLogic init failed = " + sb3 + " ------");
        }
    }
}
