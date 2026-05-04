package com.baicizhan.client.business.util;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class AuthCallback<Result> {
    private static Handler sHandler = new Handler(Looper.getMainLooper());

    public static final boolean isMain() {
        return Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId();
    }

    public static void post(Runnable runnable) {
        if (isMain()) {
            runnable.run();
        } else {
            sHandler.post(runnable);
        }
    }

    public static void postDelayed(Runnable runnable, long timeMillis) {
        sHandler.postDelayed(runnable, timeMillis);
    }

    public abstract void onError(Throwable throwable);

    public abstract void onSuccess(Result result);

    public void postError(final Throwable throwable) {
        if (isMain()) {
            onError(throwable);
        } else {
            sHandler.post(new Runnable() { // from class: com.baicizhan.client.business.util.AuthCallback.3
                @Override // java.lang.Runnable
                public void run() {
                    AuthCallback.this.onError(throwable);
                }
            });
        }
    }

    public void postProgress(final Object arg) {
        if (isMain()) {
            onProgress(arg);
        } else {
            sHandler.post(new Runnable() { // from class: com.baicizhan.client.business.util.AuthCallback.2
                @Override // java.lang.Runnable
                public void run() {
                    AuthCallback.this.onProgress(arg);
                }
            });
        }
    }

    public void postSuccess(final Result result) {
        if (isMain()) {
            onSuccess(result);
        } else {
            sHandler.post(new Runnable() { // from class: com.baicizhan.client.business.util.AuthCallback.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    AuthCallback.this.onSuccess(result);
                }
            });
        }
    }

    public void onProgress(Object arg) {
    }
}
