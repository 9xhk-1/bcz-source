package com.baicizhan.main.plusreview.data.load;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.baicizhan.main.plusreview.data.MatchTestCache;
import com.baicizhan.main.plusreview.data.load.MatchTestLoader;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class MatchTestSyncService extends Service implements MatchTestLoader.OnDataSyncListener {
    private MatchTestLoader mMatchTestLoader;

    public static void start(Context context) {
        context.startService(new Intent(context, (Class<?>) MatchTestSyncService.class));
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mMatchTestLoader = MatchTestLoader.createInstance(this, this);
        if (MatchTestCache.getCache().getTestlib() != null) {
            this.mMatchTestLoader.sync(MatchTestCache.getCache().getTestlib().getResult_records());
        } else {
            stopSelf();
        }
    }

    @Override // com.baicizhan.main.plusreview.data.load.MatchTestLoader.OnDataSyncListener
    public void onTestDataSynced(boolean success, int errCode) {
        stopSelf();
    }
}
