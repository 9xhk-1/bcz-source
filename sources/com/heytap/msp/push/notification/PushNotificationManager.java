package com.heytap.msp.push.notification;

import com.heytap.mcssdk.notification.PushNotificationSortManager;
import com.heytap.msp.push.notification.PushNotification;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class PushNotificationManager {
    private PushNotification.Builder builder;
    private Executor executor;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SingletonHolder {
        private static final PushNotificationManager INSTANCE = new PushNotificationManager();

        private SingletonHolder() {
        }
    }

    public static PushNotificationManager getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void enqueue(final ISortListener iSortListener) {
        if (this.executor == null) {
            this.executor = new ThreadPoolExecutor(1, 0, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(16), new ThreadPoolExecutor.DiscardPolicy());
        }
        this.executor.execute(new Runnable() { // from class: com.heytap.msp.push.notification.PushNotificationManager.1
            @Override // java.lang.Runnable
            public void run() {
                PushNotificationSortManager.getInstance().startBuild(PushNotificationManager.this.builder, iSortListener);
            }
        });
    }

    public void execute(ISortListener iSortListener) {
        PushNotificationSortManager.getInstance().startBuild(this.builder, iSortListener);
    }

    public PushNotificationManager with(PushNotification.Builder builder) {
        this.builder = builder;
        return this;
    }
}
