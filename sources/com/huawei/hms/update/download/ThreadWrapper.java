package com.huawei.hms.update.download;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.update.download.api.IOtaUpdate;
import com.huawei.hms.update.download.api.IUpdateCallback;
import com.huawei.hms.update.download.api.UpdateInfo;
import com.huawei.hms.utils.Checker;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ThreadWrapper implements IOtaUpdate {

    /* renamed from: b, reason: collision with root package name */
    private static final Executor f36452b = Executors.newSingleThreadExecutor();

    /* renamed from: a, reason: collision with root package name */
    private final IOtaUpdate f36453a;

    public ThreadWrapper(IOtaUpdate iOtaUpdate) {
        Checker.checkNonNull(iOtaUpdate, "update must not be null.");
        this.f36453a = iOtaUpdate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IUpdateCallback b(final IUpdateCallback iUpdateCallback) {
        return new IUpdateCallback() { // from class: com.huawei.hms.update.download.ThreadWrapper.1
            @Override // com.huawei.hms.update.download.api.IUpdateCallback
            public void onCheckUpdate(final int i11, final UpdateInfo updateInfo) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huawei.hms.update.download.ThreadWrapper.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        IUpdateCallback.this.onCheckUpdate(i11, updateInfo);
                    }
                });
            }

            @Override // com.huawei.hms.update.download.api.IUpdateCallback
            public void onDownloadPackage(final int i11, final int i12, final int i13, final File file) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huawei.hms.update.download.ThreadWrapper.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        IUpdateCallback.this.onDownloadPackage(i11, i12, i13, file);
                    }
                });
            }
        };
    }

    @Override // com.huawei.hms.update.download.api.IOtaUpdate
    public void cancel() {
        this.f36453a.cancel();
    }

    @Override // com.huawei.hms.update.download.api.IOtaUpdate
    public void downloadPackage(final IUpdateCallback iUpdateCallback, final UpdateInfo updateInfo) {
        f36452b.execute(new Runnable() { // from class: com.huawei.hms.update.download.ThreadWrapper.2
            @Override // java.lang.Runnable
            public void run() {
                ThreadWrapper.this.f36453a.downloadPackage(ThreadWrapper.b(iUpdateCallback), updateInfo);
            }
        });
    }

    @Override // com.huawei.hms.update.download.api.IOtaUpdate
    public Context getContext() {
        return this.f36453a.getContext();
    }
}
