package com.baicizhan.client.fm.data.update;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.baicizhan.client.business.media.update.MediaUpdatorService;
import com.baicizhan.client.fm.data.FmList;
import com.baicizhan.client.fm.data.db.FmDBAccessObservables;
import java.util.ArrayList;
import java.util.List;
import q9.x;
import qb.c;
import qb0.g;
import qb0.h;
import tb0.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class FmUpdatorService extends Service {
    private static List<FmList> FMLIST_CACHE = new ArrayList();
    private h mUpdateFmLearnRecordsSubscription;
    private boolean mUpdating = false;

    public static void start(Context context, FmList list) {
        FMLIST_CACHE.add(list);
        if (FMLIST_CACHE.isEmpty()) {
            return;
        }
        context.startService(new Intent(context, (Class<?>) FmUpdatorService.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void update() {
        List<FmList> list = FMLIST_CACHE;
        if (list == null || list.isEmpty()) {
            stopSelf();
        } else {
            this.mUpdateFmLearnRecordsSubscription = FmDBAccessObservables.updateFmLearnRecords(this, x.r().l(), FMLIST_CACHE.remove(0)).I3(a.a()).r5(new g<Boolean>() { // from class: com.baicizhan.client.fm.data.update.FmUpdatorService.1
                @Override // qb0.c
                public void onError(Throwable e11) {
                    c.c("", "fm update error.", e11);
                    FmUpdatorService.this.stopSelf();
                }

                @Override // qb0.c
                public void onNext(Boolean aBoolean) {
                    if (!FmUpdatorService.FMLIST_CACHE.isEmpty()) {
                        FmUpdatorService.this.update();
                        return;
                    }
                    FmUpdatorService.this.mUpdating = false;
                    MediaUpdatorService.b(FmUpdatorService.this);
                    FmUpdatorService.this.stopSelf();
                }

                @Override // qb0.c
                public void onCompleted() {
                }
            });
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        h hVar = this.mUpdateFmLearnRecordsSubscription;
        if (hVar == null || hVar.isUnsubscribed()) {
            return;
        }
        this.mUpdateFmLearnRecordsSubscription.unsubscribe();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (!this.mUpdating) {
            this.mUpdating = true;
            update();
        }
        return super.onStartCommand(intent, flags, startId);
    }
}
