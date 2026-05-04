package com.xiaomi.push;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes8.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private static volatile Handler f46181a;

    /* renamed from: a, reason: collision with other field name */
    private static final Object f850a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile Handler f46182b;

    public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return a(context, broadcastReceiver, intentFilter, null);
    }

    private static Handler b() {
        if (f46181a == null) {
            synchronized (l.class) {
                try {
                    if (f46181a == null) {
                        HandlerThread handlerThread = new HandlerThread("handle_receiver");
                        handlerThread.start();
                        f46181a = new Handler(handlerThread.getLooper());
                    }
                } finally {
                }
            }
        }
        return f46181a;
    }

    public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str) {
        if (context == null || broadcastReceiver == null || intentFilter == null) {
            return null;
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, str, b());
    }

    public static Handler a() {
        if (f46182b == null) {
            synchronized (f850a) {
                try {
                    if (f46182b == null) {
                        HandlerThread handlerThread = new HandlerThread("receiver_task");
                        handlerThread.start();
                        f46182b = new Handler(handlerThread.getLooper());
                    }
                } finally {
                }
            }
        }
        return f46182b;
    }

    private static void a(Context context, ComponentName componentName) {
        b().post(new m(context, componentName));
    }

    public static void a(Context context, Class<?> cls) {
        if (context == null || cls == null) {
            return;
        }
        a(context, new ComponentName(context, cls));
    }
}
