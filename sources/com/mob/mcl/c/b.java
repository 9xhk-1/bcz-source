package com.mob.mcl.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import com.igexin.sdk.PushConsts;
import com.mob.MobSDK;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.ReflectHelper;
import com.mob.tools.utils.UIHandler;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f40489a;

    /* renamed from: d, reason: collision with root package name */
    private ScheduledExecutorService f40492d;

    /* renamed from: c, reason: collision with root package name */
    private int f40491c = -1;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f40493e = false;

    /* renamed from: b, reason: collision with root package name */
    private Context f40490b = MobSDK.getContext();

    private b() {
        c();
        this.f40492d = Executors.newSingleThreadScheduledExecutor();
    }

    private void c() {
        try {
            ReflectHelper.invokeInstanceMethod(this.f40490b, "registerReceiver", new Object[]{d(), new IntentFilter(PushConsts.ACTION_BROADCAST_NETWORK_CHANGE)}, new Class[]{BroadcastReceiver.class, IntentFilter.class});
        } catch (Throwable th2) {
            com.mob.mcl.d.b.a().a(th2);
        }
    }

    private BroadcastReceiver d() {
        return new BroadcastReceiver() { // from class: com.mob.mcl.c.b.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                try {
                    if (intent.getAction().equals(PushConsts.ACTION_BROADCAST_NETWORK_CHANGE)) {
                        String networkType = DeviceHelper.getInstance(context).getNetworkType();
                        com.mob.mcl.d.b.a().b("ServiceInit receiver network " + networkType);
                        b.this.a("wifi".equalsIgnoreCase(networkType) ? 1 : "4G".equalsIgnoreCase(networkType) ? 4 : "3G".equalsIgnoreCase(networkType) ? 3 : "2G".equalsIgnoreCase(networkType) ? 2 : 0);
                    }
                } catch (Throwable th2) {
                    com.mob.mcl.d.b.a().a(th2);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (!h.b().d()) {
            h.b().f();
        }
        h.b().g();
    }

    public void b() {
        if (this.f40493e) {
            com.mob.mcl.d.b.a().b("HB already started");
            return;
        }
        try {
            this.f40492d.scheduleWithFixedDelay(new Runnable() { // from class: com.mob.mcl.c.b.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (!h.b().c() || !h.b().a(2000, 0)) {
                            b.this.e();
                        } else {
                            com.mob.mcl.d.b.a().b("tcp send ping success ");
                            b.this.f40493e = true;
                        }
                    } catch (Throwable unused) {
                    }
                }
            }, 0L, h.b().f40514e, TimeUnit.SECONDS);
        } catch (Throwable th2) {
            com.mob.mcl.d.b.a().a("HB timer error", th2);
        }
    }

    public static b a() {
        if (f40489a == null) {
            synchronized (b.class) {
                try {
                    if (f40489a == null) {
                        f40489a = new b();
                    }
                } finally {
                }
            }
        }
        return f40489a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i11) {
        if (this.f40491c == -1) {
            this.f40491c = i11;
            return;
        }
        this.f40491c = i11;
        if (i11 == 0 || h.b().c()) {
            return;
        }
        UIHandler.sendEmptyMessageDelayed(0, 200L, new Handler.Callback() { // from class: com.mob.mcl.c.b.2
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                com.mob.mcl.b.a.f40475a.execute(new Runnable() { // from class: com.mob.mcl.c.b.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (h.b().c()) {
                                return;
                            }
                            if (!h.b().d()) {
                                h.b().f();
                            }
                            h.b().g();
                        } catch (Throwable unused) {
                        }
                    }
                });
                return false;
            }
        });
    }
}
