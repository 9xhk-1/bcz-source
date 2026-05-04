package com.alipay.sdk.m.r0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.alipay.sdk.m.q0.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: e, reason: collision with root package name */
    public static String f10992e = "OpenDeviceId library";

    /* renamed from: f, reason: collision with root package name */
    public static boolean f10993f = false;

    /* renamed from: b, reason: collision with root package name */
    public com.alipay.sdk.m.q0.a f10995b;

    /* renamed from: c, reason: collision with root package name */
    public ServiceConnection f10996c;

    /* renamed from: a, reason: collision with root package name */
    public Context f10994a = null;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0174b f10997d = null;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                b.this.f10995b = a.AbstractBinderC0172a.a(iBinder);
                if (b.this.f10997d != null) {
                    b.this.f10997d.a("Deviceid Service Connected", b.this);
                }
                b.this.b("Service onServiceConnected");
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            b.this.f10995b = null;
            b.this.b("Service onServiceDisconnected");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.alipay.sdk.m.r0.b$b, reason: collision with other inner class name */
    public interface InterfaceC0174b<T> {
        void a(T t11, b bVar);
    }

    public String b() {
        if (this.f10994a == null) {
            a("Context is null.");
            throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
        }
        try {
            com.alipay.sdk.m.q0.a aVar = this.f10995b;
            if (aVar != null) {
                return aVar.a();
            }
            return null;
        } catch (RemoteException e11) {
            a("getOAID error, RemoteException!");
            e11.printStackTrace();
            return null;
        }
    }

    public String c() {
        if (this.f10994a == null) {
            a("Context is null.");
            throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
        }
        try {
            com.alipay.sdk.m.q0.a aVar = this.f10995b;
            if (aVar != null) {
                return aVar.b();
            }
            return null;
        } catch (RemoteException e11) {
            a("getUDID error, RemoteException!");
            e11.printStackTrace();
            return null;
        } catch (Exception e12) {
            a("getUDID error, Exception!");
            e12.printStackTrace();
            return null;
        }
    }

    public String d() {
        Context context = this.f10994a;
        if (context == null) {
            b("Context is null.");
            throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
        }
        String packageName = context.getPackageName();
        b("liufeng, getVAID package：" + packageName);
        if (packageName == null || packageName.equals("")) {
            b("input package is null!");
            return null;
        }
        try {
            com.alipay.sdk.m.q0.a aVar = this.f10995b;
            if (aVar != null) {
                return aVar.b(packageName);
            }
            return null;
        } catch (RemoteException e11) {
            a("getVAID error, RemoteException!");
            e11.printStackTrace();
            return null;
        }
    }

    public boolean e() {
        try {
            if (this.f10995b == null) {
                return false;
            }
            b("Device support opendeviceid");
            return this.f10995b.c();
        } catch (RemoteException unused) {
            a("isSupport error, RemoteException!");
            return false;
        }
    }

    public void f() {
        try {
            this.f10994a.unbindService(this.f10996c);
            b("unBind Service successful");
        } catch (IllegalArgumentException unused) {
            a("unBind Service exception");
        }
        this.f10995b = null;
    }

    public int a(Context context, InterfaceC0174b<String> interfaceC0174b) {
        if (context != null) {
            this.f10994a = context;
            this.f10997d = interfaceC0174b;
            this.f10996c = new a();
            Intent intent = new Intent();
            intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
            if (this.f10994a.bindService(intent, this.f10996c, 1)) {
                b("bindService Successful!");
                return 1;
            }
            b("bindService Failed!");
            return -1;
        }
        throw new NullPointerException("Context can not be null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (f10993f) {
            Log.i(f10992e, str);
        }
    }

    public String a() {
        Context context = this.f10994a;
        if (context != null) {
            String packageName = context.getPackageName();
            b("liufeng, getAAID package：" + packageName);
            String str = null;
            if (packageName != null && !packageName.equals("")) {
                try {
                    com.alipay.sdk.m.q0.a aVar = this.f10995b;
                    return (aVar == null || !(((str = aVar.a(packageName)) == null || "".equals(str)) && this.f10995b.c(packageName))) ? str : this.f10995b.a(packageName);
                } catch (RemoteException unused) {
                    a("getAAID error, RemoteException!");
                    return str;
                }
            }
            b("input package is null!");
            return null;
        }
        b("Context is null.");
        throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
    }

    public void a(boolean z11) {
        f10993f = z11;
    }

    private void a(String str) {
        if (f10993f) {
            Log.e(f10992e, str);
        }
    }
}
