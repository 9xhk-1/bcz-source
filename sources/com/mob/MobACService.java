package com.mob;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.mob.apc.a.a;

/* loaded from: classes7.dex */
public class MobACService extends Service {

    /* renamed from: a, reason: collision with root package name */
    private a f40028a = new a(this);

    public boolean a(Intent intent) {
        return super.onUnbind(intent);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f40028a.a(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f40028a.a();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f40028a.b();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        return this.f40028a.a(intent, i11, i12);
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return this.f40028a.b(intent);
    }

    public int a(Intent intent, int i11, int i12) {
        return super.onStartCommand(intent, i11, i12);
    }
}
