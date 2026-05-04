package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import com.xiaomi.push.hh;
import com.xiaomi.push.id;
import com.xiaomi.push.ik;
import com.xiaomi.push.ir;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class FCMPushHelper {
    private static Map<String, String> a(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put("actionType", String.valueOf(hh.AckMessage.a()));
        hashMap.put("deviceStatus", String.valueOf((int) ir.a(context, context.getPackageName())));
        hashMap.put("mat", Long.toString(System.currentTimeMillis()));
        return hashMap;
    }

    private static boolean b(Context context) {
        return context.getSharedPreferences("mipush_extra", 0).getBoolean("is_xmsf_sup_decrypt", false);
    }

    public static void clearToken(Context context) {
        i.m5704a(context, e.ASSEMBLE_PUSH_FCM);
    }

    public static void convertMessage(Intent intent) {
        i.a(intent);
    }

    public static boolean isFCMSwitchOpen(Context context) {
        return i.m5707a(context, e.ASSEMBLE_PUSH_FCM) && MiPushClient.getOpenFCMPush(context);
    }

    public static void notifyFCMNotificationCome(Context context, Map<String, String> map) {
        PushMessageReceiver a11;
        String str = map.get("pushMsg");
        if (TextUtils.isEmpty(str) || (a11 = i.a(context)) == null) {
            return;
        }
        a11.onNotificationMessageArrived(context, i.a(str));
    }

    public static Map<String, String> notifyFCMPassThoughMessageCome(Context context, Map<String, String> map) {
        PushMessageReceiver a11;
        String str = map.get("pushMsg");
        if (!TextUtils.isEmpty(str) && (a11 = i.a(context)) != null) {
            a11.onReceivePassThroughMessage(context, i.a(str));
        }
        String str2 = map.get("mipushContainer");
        if (TextUtils.isEmpty(str2)) {
            return new HashMap();
        }
        try {
            byte[] decode = Base64.decode(str2, 2);
            a(context, com.xiaomi.push.service.y.a(decode));
            a(context, decode);
        } catch (Throwable th2) {
            com.xiaomi.channel.commonutils.logger.b.a("fcm notify notification error ", th2);
        }
        return a(context);
    }

    public static void persistIfXmsfSupDecrypt(Context context) {
        context.getSharedPreferences("mipush_extra", 0).edit().putBoolean("is_xmsf_sup_decrypt", ((long) com.xiaomi.push.j.b(context)) >= 50002000).apply();
    }

    public static void reportFCMMessageDelete() {
        MiTinyDataClient.upload(i.c(e.ASSEMBLE_PUSH_FCM), "fcm", 1L, "some fcm messages was deleted ");
    }

    public static void uploadToken(Context context, String str) {
        i.m5705a(context, e.ASSEMBLE_PUSH_FCM, str);
    }

    private static void a(Context context, id idVar) {
        try {
            MiPushMessage generateMessage = PushMessageHelper.generateMessage((ik) ai.a(context, idVar), idVar.m6085a(), false);
            PushMessageReceiver a11 = i.a(context);
            if (a11 != null) {
                a11.onNotificationMessageArrived(context, generateMessage);
            }
        } catch (Throwable th2) {
            com.xiaomi.channel.commonutils.logger.b.a("fcm broadcast notification come error ", th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(android.content.Context r6, byte[] r7) {
        /*
            com.xiaomi.mipush.sdk.ao r0 = com.xiaomi.mipush.sdk.ao.a(r6)
            boolean r0 = r0.m5676a()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r2 = "com.xiaomi.xmsf"
            boolean r1 = r2.equals(r1)
            r3 = r1 ^ 1
            boolean r4 = m5652a(r6)
            r5 = 0
            if (r0 == 0) goto L68
            if (r1 != 0) goto L68
            if (r4 == 0) goto L68
            com.xiaomi.mipush.sdk.b r0 = com.xiaomi.mipush.sdk.b.m5683a(r6)
            java.lang.String r0 = r0.d()
            byte[] r7 = com.xiaomi.push.service.n.a(r7, r0)
            if (r7 != 0) goto L33
            java.lang.String r0 = "fcm message encrypt failed"
        L2f:
            com.xiaomi.channel.commonutils.logger.b.m5639a(r0)
            goto L7f
        L33:
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r7, r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L41
            java.lang.String r0 = "fcm message buf base64 encode failed"
            goto L2f
        L41:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r3 = com.xiaomi.push.service.bk.f46313n
            r1.<init>(r3)
            r1.setPackage(r2)
            java.lang.String r3 = "com.xiaomi.push.service.XMPushService"
            r1.setClassName(r2, r3)
            java.lang.String r2 = "ext_fcm_container_buffer"
            r1.putExtra(r2, r0)
            java.lang.String r0 = "mipush_app_package"
            java.lang.String r2 = r6.getPackageName()
            r1.putExtra(r0, r2)
            r6.startService(r1)
            java.lang.String r0 = "fcm message reroute to xmsf"
            com.xiaomi.channel.commonutils.logger.b.m5639a(r0)
            r5 = 1
            goto L7f
        L68:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2}
            java.lang.String r1 = "xmsf can not receive fcm msg - shouldUseMIUIPush=%s;isNotXmsf=%s;xmsfSupport=%s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            goto L2f
        L7f:
            if (r5 != 0) goto L8d
            java.lang.String r0 = "fcm message post local"
            com.xiaomi.channel.commonutils.logger.b.b(r0)
            com.xiaomi.push.id r0 = com.xiaomi.push.service.y.a(r7)
            com.xiaomi.push.service.ak.m6222a(r6, r0, r7)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.FCMPushHelper.a(android.content.Context, byte[]):void");
    }

    /* renamed from: a, reason: collision with other method in class */
    private static boolean m5652a(Context context) {
        return ((long) com.xiaomi.push.j.b(context)) >= 50002000 && b(context);
    }
}
