package com.hihonor.ads.identifier;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.bun.miitmdid.n0;
import com.hihonor.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes7.dex */
public class a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public AdvertisingIdClient.Info f35189a;

    /* renamed from: b, reason: collision with root package name */
    public Context f35190b;

    /* renamed from: c, reason: collision with root package name */
    public BinderC0442a f35191c = new BinderC0442a();

    /* renamed from: d, reason: collision with root package name */
    public b f35192d = new b();

    /* renamed from: e, reason: collision with root package name */
    public CountDownLatch f35193e = new CountDownLatch(2);

    /* renamed from: com.hihonor.ads.identifier.a$a, reason: collision with other inner class name */
    public class BinderC0442a extends n0.a {
        public BinderC0442a() {
        }

        @Override // com.bun.miitmdid.n0
        public native void a(int i11, long j11, boolean z11, float f11, double d11, String str);

        @Override // com.bun.miitmdid.n0
        public native void a(int i11, Bundle bundle);
    }

    public class b extends n0.a {
        public b() {
        }

        @Override // com.bun.miitmdid.n0
        public native void a(int i11, long j11, boolean z11, float f11, double d11, String str);

        @Override // com.bun.miitmdid.n0
        public native void a(int i11, Bundle bundle);
    }

    public final native void a();

    public native boolean a(Context context);

    @Override // android.content.ServiceConnection
    public native void onServiceConnected(ComponentName componentName, IBinder iBinder);

    @Override // android.content.ServiceConnection
    public native void onServiceDisconnected(ComponentName componentName);
}
