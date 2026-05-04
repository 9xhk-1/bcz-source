package com.igexin.push.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import com.igexin.push.core.d;
import com.igexin.sdk.PushConsts;

/* loaded from: classes7.dex */
public class i extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f38182a = "GTReceiver";

    /* renamed from: b, reason: collision with root package name */
    private static volatile i f38183b;

    private i() {
    }

    public static i a() {
        if (f38183b == null) {
            synchronized (i.class) {
                try {
                    if (f38183b == null) {
                        f38183b = new i();
                    }
                } finally {
                }
            }
        }
        return f38183b;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null && intent.getAction() != null && intent.getAction().equals(PushConsts.ACTION_BROADCAST_NETWORK_CHANGE)) {
            try {
                intent.getAction();
                intent.getComponent();
                com.igexin.c.a.c.a.a("----------------------------------------------------------------------------------", new Object[0]);
                com.igexin.c.a.c.a.a("GTReceiver|action = " + intent.getAction() + ", component = " + intent.getComponent(), new Object[0]);
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    for (String str : extras.keySet()) {
                        extras.get(str);
                        com.igexin.c.a.c.a.a("GTReceiver|key [" + str + "]: " + extras.get(str), new Object[0]);
                    }
                } else {
                    com.igexin.c.a.c.a.a("GTReceiver|no extras", new Object[0]);
                }
            } catch (Exception e11) {
                com.igexin.c.a.c.a.a(e11);
            }
        }
        StringBuilder sb2 = new StringBuilder("GTReceiver InternalPublicReceiver:");
        sb2.append(intent != null ? intent.getAction() : "null");
        com.igexin.c.a.c.a.a(sb2.toString(), new Object[0]);
        if (intent != null) {
            intent.getAction();
        }
        Message obtain = Message.obtain();
        obtain.what = "com.igexin.action.notification.click".equals(intent.getAction()) ? b.Q : b.R;
        obtain.obj = intent;
        d.a.f37956a.a(obtain);
    }

    private static void a(Intent intent) {
        try {
            intent.getAction();
            intent.getComponent();
            com.igexin.c.a.c.a.a("----------------------------------------------------------------------------------", new Object[0]);
            com.igexin.c.a.c.a.a("GTReceiver|action = " + intent.getAction() + ", component = " + intent.getComponent(), new Object[0]);
            Bundle extras = intent.getExtras();
            if (extras == null) {
                com.igexin.c.a.c.a.a("GTReceiver|no extras", new Object[0]);
                return;
            }
            for (String str : extras.keySet()) {
                extras.get(str);
                com.igexin.c.a.c.a.a("GTReceiver|key [" + str + "]: " + extras.get(str), new Object[0]);
            }
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
        }
    }
}
