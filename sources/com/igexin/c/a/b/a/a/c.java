package com.igexin.c.a.b.a.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.igexin.c.a.b.a.a.d.AnonymousClass1;
import com.igexin.push.core.d;
import java.net.Socket;

/* loaded from: classes7.dex */
public final class c extends Handler {

    /* renamed from: com.igexin.c.a.b.a.a.c$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37091a;

        static {
            int[] iArr = new int[j.a().length];
            f37091a = iArr;
            try {
                iArr[j.f37128d - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37091a[j.f37129e - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37091a[j.f37127c - 1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37091a[j.f37130f - 1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37091a[j.f37131g - 1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37091a[j.f37125a - 1] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37091a[j.f37132h - 1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public c(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            int i11 = AnonymousClass1.f37091a[j.a()[message.what] - 1];
            if (i11 == 1) {
                d a11 = d.a();
                Socket socket = a11.f37094a;
                boolean z11 = (socket == null || socket.isClosed()) ? false : true;
                if (!z11 && a11.f37097d == null) {
                    com.igexin.c.a.c.a.a("GS-M|disconnect = true, reconnect", new Object[0]);
                    a11.f37097d = new b(a11.new AnonymousClass1());
                    com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) a11.f37097d, true);
                    return;
                }
                com.igexin.c.a.c.a.a("GS-Mstart connect, isConnected = " + z11 + ", ctask = " + a11.f37097d, new Object[0]);
                return;
            }
            if (i11 == 3) {
                d.a().a((Socket) message.obj);
                return;
            }
            if (i11 == 4) {
                d a12 = d.a();
                if (!a12.i() || a12.f37099f) {
                    return;
                }
                a12.b();
                a12.f37099f = true;
                return;
            }
            if (i11 == 5) {
                d a13 = d.a();
                a13.j();
                if ((a13.f37097d == null && a13.f37096c == null && a13.f37095b == null) || a13.i()) {
                    a13.b();
                    return;
                } else {
                    a13.h();
                    return;
                }
            }
            if (i11 == 6) {
                d.a();
                com.igexin.push.core.d unused = d.a.f37956a;
                com.igexin.push.e.a.a(j.f37125a);
            } else {
                if (i11 != 7) {
                    return;
                }
                d a14 = d.a();
                com.igexin.c.a.c.a.b("GS-M", ((String) message.obj) + " write task response timeout");
                a14.c();
            }
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
    }
}
