package com.bun.miitmdid;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.coolpad.deviceidsupport.IDeviceIdManager;

/* loaded from: classes6.dex */
public class j extends m implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public static IDeviceIdManager f28942a;

    /* renamed from: b, reason: collision with root package name */
    public Context f28943b;

    /* renamed from: c, reason: collision with root package name */
    public String f28944c;

    public j(Context context) {
        this.f28943b = context;
    }

    @Override // com.bun.miitmdid.interfaces.IIdProvider
    public native void doStart();

    @Override // android.content.ServiceConnection
    public native void onServiceConnected(ComponentName componentName, IBinder iBinder);

    @Override // android.content.ServiceConnection
    public native void onServiceDisconnected(ComponentName componentName);

    @Override // com.bun.miitmdid.interfaces.IIdProvider
    public native void shutDown();
}
