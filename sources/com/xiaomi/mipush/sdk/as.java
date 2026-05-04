package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes6.dex */
class as implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ao f45196a;

    public as(ao aoVar) {
        this.f45196a = aoVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        List<Message> list;
        List list2;
        Messenger messenger;
        synchronized (this.f45196a) {
            this.f45196a.f90a = new Messenger(iBinder);
            this.f45196a.f45191c = false;
            list = this.f45196a.f93a;
            for (Message message : list) {
                try {
                    messenger = this.f45196a.f90a;
                    messenger.send(message);
                } catch (RemoteException e11) {
                    com.xiaomi.channel.commonutils.logger.b.a(e11);
                }
            }
            list2 = this.f45196a.f93a;
            list2.clear();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f45196a.f90a = null;
        this.f45196a.f45191c = false;
    }
}
