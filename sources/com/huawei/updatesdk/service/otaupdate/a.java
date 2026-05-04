package com.huawei.updatesdk.service.otaupdate;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class a {
    public static void a(Context context, BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver == null || context == null) {
            return;
        }
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException e11) {
            com.huawei.updatesdk.a.a.c.a.a.a.b("ActivityUtil", "unregisterReceiver error:" + e11.getMessage());
        }
    }

    public static void a(Context context, IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        if (intentFilter == null || broadcastReceiver == null || a(context)) {
            return;
        }
        try {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (IllegalArgumentException e11) {
            com.huawei.updatesdk.a.a.c.a.a.a.b("ActivityUtil", "registerReceiver error:" + e11.getMessage());
        }
    }

    public static boolean a(Context context) {
        if (context == null) {
            return true;
        }
        if (!(context instanceof Activity)) {
            return false;
        }
        Activity activity = (Activity) context;
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            return false;
        }
        com.huawei.updatesdk.a.a.c.a.a.a.b("ActivityUtil", "activity has bean finished, cannot instance:" + activity);
        return true;
    }
}
