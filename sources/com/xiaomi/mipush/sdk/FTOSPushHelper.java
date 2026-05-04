package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes6.dex */
public class FTOSPushHelper {

    /* renamed from: a, reason: collision with root package name */
    private static long f45163a = 0;

    /* renamed from: a, reason: collision with other field name */
    private static volatile boolean f63a = false;

    private static void a(Context context) {
        AbstractPushManager a11 = f.a(context).a(e.ASSEMBLE_PUSH_FTOS);
        if (a11 != null) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("ASSEMBLE_PUSH :  register fun touch os when network change!");
            a11.register();
        }
    }

    public static void doInNetworkChange(Context context) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (getNeedRegister()) {
            long j11 = f45163a;
            if (j11 <= 0 || j11 + 300000 <= elapsedRealtime) {
                f45163a = elapsedRealtime;
                a(context);
            }
        }
    }

    public static boolean getNeedRegister() {
        return f63a;
    }

    public static boolean hasNetwork(Context context) {
        return i.m5706a(context);
    }

    public static void notifyFTOSNotificationClicked(Context context, Map<String, String> map) {
        PushMessageReceiver a11;
        if (map == null || !map.containsKey("pushMsg")) {
            return;
        }
        String str = map.get("pushMsg");
        if (TextUtils.isEmpty(str) || (a11 = i.a(context)) == null) {
            return;
        }
        MiPushMessage a12 = i.a(str);
        if (a12.getExtra().containsKey("notify_effect")) {
            return;
        }
        a11.onNotificationMessageClicked(context, a12);
    }

    public static void setNeedRegister(boolean z11) {
        f63a = z11;
    }

    public static void uploadToken(Context context, String str) {
        i.m5705a(context, e.ASSEMBLE_PUSH_FTOS, str);
    }
}
