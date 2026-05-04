package com.bun.miitmdid;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.bun.lib.MsaIdInterface;

/* loaded from: classes6.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static String f28905a = "MsaClient";

    /* renamed from: b, reason: collision with root package name */
    public ServiceConnection f28906b;

    /* renamed from: c, reason: collision with root package name */
    public Context f28907c;

    /* renamed from: d, reason: collision with root package name */
    public MsaIdInterface f28908d;

    public class a implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e0 f28909a;

        public a(e0 e0Var) {
            this.f28909a = e0Var;
        }

        @Override // android.content.ServiceConnection
        public native synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder);

        @Override // android.content.ServiceConnection
        public native void onServiceDisconnected(ComponentName componentName);
    }

    public d0(Context context, e0 e0Var) {
        if (context == null) {
            throw new NullPointerException("Context can not be null.");
        }
        this.f28907c = context;
        this.f28906b = new a(e0Var);
    }

    public static native void a(Context context, String str);

    public native String a();

    public native void a(String str);

    public native String b();

    public native String c();

    public native boolean d();

    public native void e();
}
