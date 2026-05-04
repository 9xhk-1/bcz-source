package com.igexin.sdk;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.getui.gtc.base.GtcProvider;
import com.igexin.push.core.ServiceManager;

/* loaded from: classes7.dex */
public class GService extends Service {
    public static final String TAG = "com.igexin.sdk.GService";

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        try {
            GtcProvider.setContext(getApplicationContext());
            ServiceManager.getInstance().a(getApplicationContext(), intent);
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            GtcProvider.setContext(getApplicationContext());
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        try {
            GtcProvider.setContext(getApplicationContext());
            ServiceManager.getInstance().a(getApplicationContext(), intent);
            return 2;
        } catch (Throwable unused) {
            return 2;
        }
    }
}
