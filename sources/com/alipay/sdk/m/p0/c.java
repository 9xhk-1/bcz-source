package com.alipay.sdk.m.p0;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c {
    public static String A = null;
    public static volatile c B = null;
    public static volatile b C = null;

    /* renamed from: a, reason: collision with root package name */
    public static final String f10936a = "VMS_IDLG_SDK_Client";

    /* renamed from: b, reason: collision with root package name */
    public static final String f10937b = "content://com.vivo.vms.IdProvider/IdentifierId";

    /* renamed from: c, reason: collision with root package name */
    public static final String f10938c = "persist.sys.identifierid.supported";

    /* renamed from: d, reason: collision with root package name */
    public static final String f10939d = "appid";

    /* renamed from: e, reason: collision with root package name */
    public static final String f10940e = "type";

    /* renamed from: f, reason: collision with root package name */
    public static final String f10941f = "OAID";

    /* renamed from: g, reason: collision with root package name */
    public static final String f10942g = "VAID";

    /* renamed from: h, reason: collision with root package name */
    public static final String f10943h = "AAID";

    /* renamed from: i, reason: collision with root package name */
    public static final int f10944i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static final int f10945j = 1;

    /* renamed from: k, reason: collision with root package name */
    public static final int f10946k = 2;

    /* renamed from: l, reason: collision with root package name */
    public static final int f10947l = 4;

    /* renamed from: m, reason: collision with root package name */
    public static final int f10948m = 11;

    /* renamed from: n, reason: collision with root package name */
    public static final int f10949n = 2000;

    /* renamed from: o, reason: collision with root package name */
    public static Context f10950o = null;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f10951p = false;

    /* renamed from: q, reason: collision with root package name */
    public static d f10952q;

    /* renamed from: r, reason: collision with root package name */
    public static d f10953r;

    /* renamed from: s, reason: collision with root package name */
    public static d f10954s;

    /* renamed from: t, reason: collision with root package name */
    public static Object f10955t = new Object();

    /* renamed from: u, reason: collision with root package name */
    public static HandlerThread f10956u;

    /* renamed from: v, reason: collision with root package name */
    public static Handler f10957v;

    /* renamed from: w, reason: collision with root package name */
    public static String f10958w;

    /* renamed from: x, reason: collision with root package name */
    public static String f10959x;

    /* renamed from: y, reason: collision with root package name */
    public static String f10960y;

    /* renamed from: z, reason: collision with root package name */
    public static String f10961z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 11) {
                Log.e(c.f10936a, "message type valid");
                return;
            }
            String unused = c.f10958w = c.C.a(message.getData().getInt("type"), message.getData().getString("appid"));
            synchronized (c.f10955t) {
                c.f10955t.notify();
            }
        }
    }

    public static c a(Context context) {
        if (B == null) {
            synchronized (c.class) {
                f10950o = context.getApplicationContext();
                B = new c();
            }
        }
        if (C == null) {
            synchronized (c.class) {
                f10950o = context.getApplicationContext();
                g();
                C = new b(f10950o);
                f();
            }
        }
        return B;
    }

    public static void f() {
        f10951p = "1".equals(a(f10938c, "0"));
    }

    public static void g() {
        HandlerThread handlerThread = new HandlerThread("SqlWorkThread");
        f10956u = handlerThread;
        handlerThread.start();
        f10957v = new a(f10956u.getLooper());
    }

    public String b(String str) {
        if (!c()) {
            return null;
        }
        String str2 = f10960y;
        if (str2 != null) {
            return str2;
        }
        a(1, str);
        if (f10953r == null && f10960y != null) {
            a(f10950o, 1, str);
        }
        return f10960y;
    }

    public boolean c() {
        return f10951p;
    }

    public String b() {
        if (!c()) {
            return null;
        }
        a(4, (String) null);
        return A;
    }

    private void b(int i11, String str) {
        Message obtainMessage = f10957v.obtainMessage();
        obtainMessage.what = 11;
        Bundle bundle = new Bundle();
        bundle.putInt("type", i11);
        if (i11 == 1 || i11 == 2) {
            bundle.putString("appid", str);
        }
        obtainMessage.setData(bundle);
        f10957v.sendMessage(obtainMessage);
    }

    public String a() {
        if (!c()) {
            return null;
        }
        String str = f10959x;
        if (str != null) {
            return str;
        }
        a(0, (String) null);
        if (f10952q == null) {
            a(f10950o, 0, null);
        }
        return f10959x;
    }

    public String a(String str) {
        if (!c()) {
            return null;
        }
        String str2 = f10961z;
        if (str2 != null) {
            return str2;
        }
        a(2, str);
        if (f10954s == null && f10961z != null) {
            a(f10950o, 2, str);
        }
        return f10961z;
    }

    public void a(int i11, String str) {
        synchronized (f10955t) {
            b(i11, str);
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                f10955t.wait(2000L);
            } catch (InterruptedException e11) {
                e11.printStackTrace();
            }
            if (SystemClock.uptimeMillis() - uptimeMillis >= 2000) {
                Log.d(f10936a, "query timeout");
            } else if (i11 == 0) {
                f10959x = f10958w;
                f10958w = null;
            } else if (i11 != 1) {
                if (i11 == 2) {
                    String str2 = f10958w;
                    if (str2 != null) {
                        f10961z = str2;
                        f10958w = null;
                    } else {
                        Log.e(f10936a, "get aaid failed");
                    }
                } else if (i11 != 4) {
                }
                A = f10958w;
                f10958w = null;
            } else {
                String str3 = f10958w;
                if (str3 != null) {
                    f10960y = str3;
                    f10958w = null;
                } else {
                    Log.e(f10936a, "get vaid failed");
                }
            }
        }
    }

    public static String a(String str, String str2) {
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                return (String) cls.getMethod(ct.d.f46852f, String.class, String.class).invoke(cls, str, "unknown");
            } catch (Exception e11) {
                e11.printStackTrace();
                return str2;
            }
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static void a(Context context, int i11, String str) {
        if (i11 == 0) {
            f10952q = new d(B, 0, null);
            context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), true, f10952q);
            return;
        }
        if (i11 == 1) {
            f10953r = new d(B, 1, str);
            context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/VAID_" + str), false, f10953r);
            return;
        }
        if (i11 != 2) {
            return;
        }
        f10954s = new d(B, 2, str);
        context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/AAID_" + str), false, f10954s);
    }
}
