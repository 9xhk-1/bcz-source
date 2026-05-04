package com.igexin.c.a.c.a;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.igexin.push.core.ServiceManager;

/* loaded from: classes7.dex */
public class d extends Handler {

    /* renamed from: b, reason: collision with root package name */
    public static final int f37190b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f37191c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final String f37192d = "log_data";

    /* renamed from: e, reason: collision with root package name */
    private static final String f37193e = "d";

    /* renamed from: a, reason: collision with root package name */
    public final Messenger f37194a;

    /* renamed from: f, reason: collision with root package name */
    private final StringBuffer f37195f;

    /* renamed from: g, reason: collision with root package name */
    private Messenger f37196g;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final d f37197a = new d(0);

        private a() {
        }
    }

    private d() {
        super(Looper.getMainLooper());
        this.f37194a = new Messenger(this);
        this.f37195f = new StringBuffer();
    }

    public static d a() {
        return a.f37197a;
    }

    private void b(String str) {
        try {
            Message obtain = Message.obtain();
            obtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putString(f37192d, str);
            obtain.setData(bundle);
            this.f37196g.send(obtain);
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
        }
    }

    private IBinder c() {
        return this.f37194a.getBinder();
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        this.f37196g = message.replyTo;
        try {
            if (this.f37195f.length() > 0) {
                b(this.f37195f.toString());
                this.f37195f.setLength(0);
                this.f37195f.trimToSize();
            }
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
    }

    public /* synthetic */ d(byte b11) {
        this();
    }

    private void a(Message message) {
        this.f37196g = message.replyTo;
        try {
            if (this.f37195f.length() > 0) {
                b(this.f37195f.toString());
                this.f37195f.setLength(0);
                this.f37195f.trimToSize();
            }
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
    }

    private boolean b() {
        return this.f37195f.length() > 0;
    }

    public final void a(String str) {
        if (com.igexin.push.g.c.a(ServiceManager.f37612b)) {
            if (this.f37196g != null) {
                b(str);
                return;
            }
            if (this.f37195f.length() + str.length() < 2560) {
                StringBuffer stringBuffer = this.f37195f;
                stringBuffer.append(str);
                stringBuffer.append("\n");
            } else {
                if (this.f37195f.length() > 2560 || this.f37195f.length() + 135 <= 2560) {
                    return;
                }
                StringBuffer stringBuffer2 = this.f37195f;
                stringBuffer2.append("Warning! the log cache is too long to show the full content,we suggest you call initialize and setDebugLogger in a short time interval.");
                stringBuffer2.append("\n");
            }
        }
    }
}
