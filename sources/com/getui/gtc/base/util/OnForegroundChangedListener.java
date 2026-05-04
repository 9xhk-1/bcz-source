package com.getui.gtc.base.util;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes6.dex */
public abstract class OnForegroundChangedListener implements Application.ActivityLifecycleCallbacks {
    private int resumedCounter = 0;
    private boolean isForeground = false;

    private void checkForegroundChanged() {
        try {
            if (this.isForeground && this.resumedCounter == 0) {
                this.isForeground = false;
                onForegroundChanged(false);
            }
            if (this.isForeground || this.resumedCounter <= 0) {
                return;
            }
            this.isForeground = true;
            onForegroundChanged(true);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        int i11 = this.resumedCounter;
        if (i11 > 0) {
            this.resumedCounter = i11 - 1;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.resumedCounter++;
        checkForegroundChanged();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        checkForegroundChanged();
    }

    public abstract void onForegroundChanged(boolean z11);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
