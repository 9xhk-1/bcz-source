package com.mob.commons.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mob.commons.r;
import com.mob.commons.t;
import com.mob.tools.MobHandlerThread;
import com.mob.tools.MobLog;

/* loaded from: classes7.dex */
public class l implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    private static l f40134a = new l();

    /* renamed from: b, reason: collision with root package name */
    private Handler f40135b;

    private l() {
        String str;
        if (TextUtils.isEmpty("M-")) {
            str = null;
        } else {
            str = t.f40412a + a("004,fjhiijhl");
        }
        this.f40135b = MobHandlerThread.newHandler(str, this);
    }

    public static l a() {
        return f40134a;
    }

    public Looper b() {
        Handler handler = this.f40135b;
        if (handler != null) {
            return handler.getLooper();
        }
        return null;
    }

    public boolean c(long j11, Runnable runnable) {
        return b(1005, j11, runnable);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        c a11;
        try {
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
        if (!com.mob.commons.b.e()) {
            Message obtain = Message.obtain();
            obtain.copyFrom(message);
            this.f40135b.sendMessageDelayed(obtain, 60000L);
            return false;
        }
        int i11 = message.what;
        if (i11 != 1003 && i11 != 1004) {
            if (i11 == 1005) {
                Runnable runnable = (Runnable) message.obj;
                if (runnable != null) {
                    t.f40414c.execute(runnable);
                }
            } else if (i11 >= 10000 || i11 < -10000) {
                Object[] objArr = (Object[]) message.obj;
                Class cls = (Class) objArr[0];
                if (cls != null && (a11 = c.a((Class<? extends c>) cls)) != null) {
                    Object[] objArr2 = (Object[]) objArr[1];
                    a11.f40116b = ((Integer) objArr2[0]).intValue();
                    a11.f40115a = objArr2[1];
                    a11.g();
                }
            }
            return false;
        }
        Runnable runnable2 = (Runnable) message.obj;
        if (runnable2 != null) {
            t.f40415d.execute(runnable2);
        }
        return false;
    }

    public void a(long j11, Class<? extends c> cls, Object[] objArr, int i11) {
        int a11 = a(cls);
        if (i11 == 1) {
            this.f40135b.removeMessages(a11);
        } else if (i11 == 2 && this.f40135b.hasMessages(a11)) {
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = a11;
        obtain.obj = new Object[]{cls, objArr};
        a(obtain, j11 * 1000);
    }

    public boolean b(long j11, Runnable runnable) {
        return a(1004, j11 * 1000, runnable);
    }

    private boolean b(int i11, long j11, Runnable runnable) {
        Message obtain = Message.obtain();
        obtain.what = i11;
        obtain.obj = runnable;
        a(obtain, j11);
        return true;
    }

    public boolean a(long j11, Runnable runnable) {
        return a(1003, j11 * 1000, runnable);
    }

    private boolean a(int i11, long j11, Runnable runnable) {
        if (this.f40135b.hasMessages(i11)) {
            return false;
        }
        b(i11, j11, runnable);
        return true;
    }

    private int a(Class<? extends c> cls) {
        int hashCode = cls.getName().hashCode();
        return hashCode > 0 ? hashCode + 10000 : hashCode - 10000;
    }

    private void a(Message message, long j11) {
        if (j11 > 0) {
            this.f40135b.sendMessageDelayed(message, j11);
        } else {
            this.f40135b.sendMessage(message);
        }
    }

    public static String a(String str) {
        return r.a(str, 100);
    }
}
