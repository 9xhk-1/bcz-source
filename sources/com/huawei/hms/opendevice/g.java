package com.huawei.hms.opendevice;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.huawei.hms.support.log.HMSLog;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class g implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f36088a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f36089b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f36090c;

    public g(h hVar, Bundle bundle, Context context) {
        this.f36090c = hVar;
        this.f36088a = bundle;
        this.f36089b = context;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ServiceConnection serviceConnection;
        Messenger messenger;
        HMSLog.i("RemoteService", "remote service onConnected");
        this.f36090c.f36092b = new Messenger(iBinder);
        Message obtain = Message.obtain();
        obtain.setData(this.f36088a);
        try {
            messenger = this.f36090c.f36092b;
            messenger.send(obtain);
        } catch (RemoteException unused) {
            HMSLog.i("RemoteService", "remote service message send failed");
        }
        HMSLog.i("RemoteService", "remote service unbindservice");
        Context context = this.f36089b;
        serviceConnection = this.f36090c.f36091a;
        context.unbindService(serviceConnection);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        HMSLog.i("RemoteService", "remote service onDisconnected");
        this.f36090c.f36092b = null;
    }
}
