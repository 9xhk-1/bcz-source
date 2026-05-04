package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class HWPushHelper {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f45164a = false;

    public static void convertMessage(Intent intent) {
        i.a(intent);
    }

    public static boolean hasNetwork(Context context) {
        return i.m5706a(context);
    }

    public static boolean isHmsTokenSynced(Context context) {
        String a11 = i.a(context, e.ASSEMBLE_PUSH_HUAWEI, false);
        String a12 = af.a(context).a(au.UPLOAD_HUAWEI_TOKEN);
        return (TextUtils.isEmpty(a11) || TextUtils.isEmpty(a12) || !"synced".equals(a12)) ? false : true;
    }

    public static boolean isUserOpenHmsPush(Context context) {
        return MiPushClient.getOpenHmsPush(context);
    }

    public static boolean needConnect() {
        return f45164a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0026, code lost:
    
        r2 = r3.getString("pushMsg");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void notifyHmsNotificationMessageClicked(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "pushMsg"
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            java.lang.String r2 = ""
            if (r1 != 0) goto L37
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Exception -> L2b
            r1.<init>(r6)     // Catch: java.lang.Exception -> L2b
            int r6 = r1.length()     // Catch: java.lang.Exception -> L2b
            if (r6 <= 0) goto L37
            r6 = 0
        L16:
            int r3 = r1.length()     // Catch: java.lang.Exception -> L2b
            if (r6 >= r3) goto L37
            org.json.JSONObject r3 = r1.getJSONObject(r6)     // Catch: java.lang.Exception -> L2b
            boolean r4 = r3.has(r0)     // Catch: java.lang.Exception -> L2b
            if (r4 == 0) goto L2d
            java.lang.String r2 = r3.getString(r0)     // Catch: java.lang.Exception -> L2b
            goto L37
        L2b:
            r6 = move-exception
            goto L30
        L2d:
            int r6 = r6 + 1
            goto L16
        L30:
            java.lang.String r6 = r6.toString()
            com.xiaomi.channel.commonutils.logger.b.d(r6)
        L37:
            com.xiaomi.mipush.sdk.PushMessageReceiver r6 = com.xiaomi.mipush.sdk.i.a(r5)
            if (r6 == 0) goto L51
            com.xiaomi.mipush.sdk.MiPushMessage r0 = com.xiaomi.mipush.sdk.i.a(r2)
            java.util.Map r1 = r0.getExtra()
            java.lang.String r2 = "notify_effect"
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L4e
            goto L51
        L4e:
            r6.onNotificationMessageClicked(r5, r0)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.HWPushHelper.notifyHmsNotificationMessageClicked(android.content.Context, java.lang.String):void");
    }

    public static void notifyHmsPassThoughMessageArrived(Context context, String str) {
        String str2 = "";
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("content")) {
                    str2 = jSONObject.getString("content");
                }
            }
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.d(e11.toString());
        }
        PushMessageReceiver a11 = i.a(context);
        if (a11 != null) {
            a11.onReceivePassThroughMessage(context, i.a(str2));
        }
    }

    public static void registerHuaWeiAssemblePush(Context context) {
        AbstractPushManager a11 = f.a(context).a(e.ASSEMBLE_PUSH_HUAWEI);
        if (a11 != null) {
            a11.register();
        }
    }

    public static void reportError(String str, int i11) {
        i.a(str, i11);
    }

    public static synchronized void setConnectTime(Context context) {
        synchronized (HWPushHelper.class) {
            context.getSharedPreferences("mipush_extra", 0).edit().putLong("last_connect_time", System.currentTimeMillis()).commit();
        }
    }

    public static synchronized void setGetTokenTime(Context context) {
        synchronized (HWPushHelper.class) {
            context.getSharedPreferences("mipush_extra", 0).edit().putLong("last_get_token_time", System.currentTimeMillis()).commit();
        }
    }

    public static void setNeedConnect(boolean z11) {
        f45164a = z11;
    }

    public static synchronized boolean shouldGetToken(Context context) {
        boolean z11;
        synchronized (HWPushHelper.class) {
            z11 = Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_get_token_time", -1L)) > 172800000;
        }
        return z11;
    }

    public static synchronized boolean shouldTryConnect(Context context) {
        boolean z11;
        synchronized (HWPushHelper.class) {
            z11 = Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_connect_time", -1L)) > 5000;
        }
        return z11;
    }

    public static void uploadToken(Context context, String str) {
        i.m5705a(context, e.ASSEMBLE_PUSH_HUAWEI, str);
    }
}
