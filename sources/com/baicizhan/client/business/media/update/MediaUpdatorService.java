package com.baicizhan.client.business.media.update;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.baicizhan.client.business.media.update.a;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class MediaUpdatorService extends Service implements a.InterfaceC0270a {

    /* renamed from: a, reason: collision with root package name */
    public a f16528a;

    public static void b(Context context) {
        try {
            context.startService(new Intent(context, (Class<?>) MediaUpdatorService.class));
        } catch (Throwable th2) {
            c.c("MediaUpdatorService", "", th2);
        }
    }

    @Override // com.baicizhan.client.business.media.update.a.InterfaceC0270a
    public void a(boolean success, int errCode) {
        stopSelf();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        a c11 = a.c(this, this);
        this.f16528a = c11;
        c11.g();
    }
}
