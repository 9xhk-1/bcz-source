package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

/* loaded from: classes6.dex */
public class COSPushHelper {

    /* renamed from: a, reason: collision with root package name */
    private static long f45162a = 0;

    /* renamed from: a, reason: collision with other field name */
    private static volatile boolean f62a = false;

    public static void convertMessage(Intent intent) {
        i.a(intent);
    }

    public static void doInNetworkChange(Context context) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (getNeedRegister()) {
            long j11 = f45162a;
            if (j11 <= 0 || j11 + 300000 <= elapsedRealtime) {
                f45162a = elapsedRealtime;
                registerCOSAssemblePush(context);
            }
        }
    }

    public static boolean getNeedRegister() {
        return f62a;
    }

    public static boolean hasNetwork(Context context) {
        return i.m5706a(context);
    }

    public static void registerCOSAssemblePush(Context context) {
        AbstractPushManager a11 = f.a(context).a(e.ASSEMBLE_PUSH_COS);
        if (a11 != null) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("ASSEMBLE_PUSH :  register cos when network change!");
            a11.register();
        }
    }

    public static synchronized void setNeedRegister(boolean z11) {
        synchronized (COSPushHelper.class) {
            f62a = z11;
        }
    }

    public static void uploadToken(Context context, String str) {
        i.m5705a(context, e.ASSEMBLE_PUSH_COS, str);
    }

    public static void onNotificationMessageCome(Context context, String str) {
    }

    public static void onPassThoughMessageCome(Context context, String str) {
    }
}
