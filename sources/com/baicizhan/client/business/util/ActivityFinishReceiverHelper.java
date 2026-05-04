package com.baicizhan.client.business.util;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class ActivityFinishReceiverHelper {
    private static final String ACTION_FINISH_ALL = "com.baicizhan.ACTION_FINISH_ALL";
    private static final IntentFilter RECEIVER_INTENT_FILTER = createReceiverIntentFilter();
    private final Activity mActivity;
    private final ActivityFinishReceiver mReceiver = new ActivityFinishReceiver(this);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ActivityFinishReceiver extends BroadcastReceiver {
        final WeakReference<ActivityFinishReceiverHelper> mWeakHelper;

        public ActivityFinishReceiver(ActivityFinishReceiverHelper helper) {
            this.mWeakHelper = new WeakReference<>(helper);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ActivityFinishReceiverHelper activityFinishReceiverHelper = this.mWeakHelper.get();
            if (activityFinishReceiverHelper != null && intent.getAction().equals(ActivityFinishReceiverHelper.ACTION_FINISH_ALL)) {
                qb.c.b("whiz", "activity finish all: " + activityFinishReceiverHelper.mActivity, new Object[0]);
                activityFinishReceiverHelper.mActivity.finish();
            }
        }
    }

    public ActivityFinishReceiverHelper(@NonNull Activity activity) {
        this.mActivity = activity;
    }

    private static IntentFilter createReceiverIntentFilter() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTION_FINISH_ALL);
        return intentFilter;
    }

    public static void notifyFinishAll(Context context) {
        qb.c.b("whiz", "activity finish all, send: " + context, new Object[0]);
        context.sendBroadcast(new Intent(ACTION_FINISH_ALL));
    }

    public void register() {
        ContextCompat.registerReceiver(this.mActivity, this.mReceiver, RECEIVER_INTENT_FILTER, 4);
    }

    public void unRegister() {
        this.mActivity.unregisterReceiver(this.mReceiver);
    }
}
