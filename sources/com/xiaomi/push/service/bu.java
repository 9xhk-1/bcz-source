package com.xiaomi.push.service;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes8.dex */
class bu implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ServiceClient f46340a;

    public bu(ServiceClient serviceClient) {
        this.f46340a = serviceClient;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        List<Message> list;
        List list2;
        Messenger messenger;
        synchronized (this.f46340a) {
            this.f46340a.f868b = new Messenger(iBinder);
            this.f46340a.f869b = false;
            list = this.f46340a.f866a;
            for (Message message : list) {
                try {
                    messenger = this.f46340a.f868b;
                    messenger.send(message);
                } catch (RemoteException e11) {
                    com.xiaomi.channel.commonutils.logger.b.a(e11);
                }
            }
            list2 = this.f46340a.f866a;
            list2.clear();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f46340a.f868b = null;
        this.f46340a.f869b = false;
    }
}
