package com.vivo.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import com.vivo.push.util.t;
import com.vivo.push.util.z;
import com.vivo.vms.IPCInvoke;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class b implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f44876a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static Map<String, b> f44877b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private boolean f44878c;

    /* renamed from: d, reason: collision with root package name */
    private String f44879d;

    /* renamed from: e, reason: collision with root package name */
    private Context f44880e;

    /* renamed from: g, reason: collision with root package name */
    private volatile IPCInvoke f44882g;

    /* renamed from: i, reason: collision with root package name */
    private String f44884i;

    /* renamed from: j, reason: collision with root package name */
    private Handler f44885j;

    /* renamed from: h, reason: collision with root package name */
    private Object f44883h = new Object();

    /* renamed from: f, reason: collision with root package name */
    private AtomicInteger f44881f = new AtomicInteger(1);

    private b(Context context, String str) {
        this.f44879d = null;
        this.f44885j = null;
        this.f44880e = context;
        this.f44884i = str;
        this.f44885j = new Handler(Looper.getMainLooper(), new c(this));
        String b11 = t.b(context);
        this.f44879d = b11;
        if (!TextUtils.isEmpty(b11) && !TextUtils.isEmpty(this.f44884i)) {
            this.f44878c = z.a(context, this.f44879d) >= 1260;
            b();
            return;
        }
        com.vivo.push.util.p.c(this.f44880e, "init error : push pkgname is " + this.f44879d + " ; action is " + this.f44884i);
        this.f44878c = false;
    }

    private void d() {
        this.f44885j.removeMessages(1);
        this.f44885j.sendEmptyMessageDelayed(1, 3000L);
    }

    private void e() {
        this.f44885j.removeMessages(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        try {
            this.f44880e.unbindService(this);
        } catch (Exception e11) {
            com.vivo.push.util.p.a("AidlManager", "On unBindServiceException:" + e11.getMessage());
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        com.vivo.push.util.p.b("AidlManager", "onBindingDied : ".concat(String.valueOf(componentName)));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        e();
        this.f44882g = IPCInvoke.Stub.asInterface(iBinder);
        if (this.f44882g == null) {
            com.vivo.push.util.p.d("AidlManager", "onServiceConnected error : aidl must not be null.");
            f();
            this.f44881f.set(1);
            return;
        }
        if (this.f44881f.get() == 2) {
            a(4);
        } else if (this.f44881f.get() != 4) {
            f();
        }
        synchronized (this.f44883h) {
            this.f44883h.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f44882g = null;
        a(1);
    }

    public static b a(Context context, String str) {
        b bVar;
        b bVar2 = f44877b.get(str);
        if (bVar2 != null) {
            return bVar2;
        }
        synchronized (f44876a) {
            try {
                bVar = f44877b.get(str);
                if (bVar == null) {
                    bVar = new b(context, str);
                    f44877b.put(str, bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    private void b() {
        int i11 = this.f44881f.get();
        com.vivo.push.util.p.d("AidlManager", "Enter connect, Connection Status: ".concat(String.valueOf(i11)));
        if (i11 == 4 || i11 == 2 || i11 == 3 || i11 == 5 || !this.f44878c) {
            return;
        }
        a(2);
        if (c()) {
            d();
        } else {
            a(1);
            com.vivo.push.util.p.a("AidlManager", "bind core service fail");
        }
    }

    private boolean c() {
        Intent intent = new Intent(this.f44884i);
        intent.setPackage(this.f44879d);
        try {
            return this.f44880e.bindService(intent, this, 1);
        } catch (Exception e11) {
            com.vivo.push.util.p.a("AidlManager", "bind core error", e11);
            return false;
        }
    }

    public final boolean a() {
        String b11 = t.b(this.f44880e);
        this.f44879d = b11;
        if (TextUtils.isEmpty(b11)) {
            com.vivo.push.util.p.c(this.f44880e, "push pkgname is null");
            return false;
        }
        boolean z11 = z.a(this.f44880e, this.f44879d) >= 1260;
        this.f44878c = z11;
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i11) {
        this.f44881f.set(i11);
    }

    public final boolean a(Bundle bundle) {
        b();
        if (this.f44881f.get() == 2) {
            synchronized (this.f44883h) {
                try {
                    this.f44883h.wait(2000L);
                } catch (InterruptedException e11) {
                    e11.printStackTrace();
                }
            }
        }
        try {
            int i11 = this.f44881f.get();
            if (i11 == 4) {
                this.f44885j.removeMessages(2);
                this.f44885j.sendEmptyMessageDelayed(2, 30000L);
                this.f44882g.asyncCall(bundle, null);
                return true;
            }
            com.vivo.push.util.p.d("AidlManager", "invoke error : connect status = ".concat(String.valueOf(i11)));
            return false;
        } catch (Exception e12) {
            com.vivo.push.util.p.a("AidlManager", "invoke error ", e12);
            int i12 = this.f44881f.get();
            com.vivo.push.util.p.d("AidlManager", "Enter disconnect, Connection Status: ".concat(String.valueOf(i12)));
            if (i12 == 2) {
                e();
                a(1);
                return false;
            }
            if (i12 == 3) {
                a(1);
                return false;
            }
            if (i12 != 4) {
                return false;
            }
            a(1);
            f();
            return false;
        }
    }
}
