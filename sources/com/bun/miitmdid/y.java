package com.bun.miitmdid;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.samsung.android.deviceidservice.IDeviceIdService;

/* loaded from: classes6.dex */
public class y extends m implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public Context f28992a;

    /* renamed from: b, reason: collision with root package name */
    public String f28993b;

    /* renamed from: c, reason: collision with root package name */
    public ServiceConnection f28994c;

    /* renamed from: d, reason: collision with root package name */
    public IDeviceIdService f28995d;

    public y(Context context) {
        this.f28992a = context;
        Context checkContext = checkContext(context);
        this.f28992a = checkContext;
        this.f28993b = checkContext != null ? checkContext.getPackageName() : "";
    }

    @Override // com.bun.miitmdid.interfaces.IIdProvider
    public native void doStart();

    @Override // com.bun.miitmdid.m, com.bun.miitmdid.interfaces.IIdProvider
    public native boolean isSync();

    @Override // android.content.ServiceConnection
    public native void onServiceConnected(ComponentName componentName, IBinder iBinder);

    @Override // android.content.ServiceConnection
    public native void onServiceDisconnected(ComponentName componentName);

    @Override // com.bun.miitmdid.interfaces.IIdProvider
    public native void shutDown();
}
