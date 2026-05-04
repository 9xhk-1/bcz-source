package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.b;
import com.xiaomi.push.BuildConfig;
import com.xiaomi.push.bo;
import com.xiaomi.push.ex;
import com.xiaomi.push.g;
import com.xiaomi.push.hh;
import com.xiaomi.push.hr;
import com.xiaomi.push.hu;
import com.xiaomi.push.hv;
import com.xiaomi.push.hx;
import com.xiaomi.push.ig;
import com.xiaomi.push.ih;
import com.xiaomi.push.ii;
import com.xiaomi.push.in;
import com.xiaomi.push.io;
import com.xiaomi.push.ir;
import com.xiaomi.push.service.bd;
import com.xiaomi.push.service.br;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* loaded from: classes6.dex */
public class MiPushClient4Hybrid {
    private static MiPushCallback sCallback;
    private static Map<String, b.a> dataMap = new HashMap();
    private static Map<String, Long> sRegisterTimeMap = new HashMap();

    private static void addPullNotificationTime(Context context, String str) {
        context.getSharedPreferences("mipush_extra", 0).edit().putLong("last_pull_notification_" + str, System.currentTimeMillis()).commit();
    }

    private static short getDeviceStatus(MiPushMessage miPushMessage, boolean z11) {
        String str = miPushMessage.getExtra() == null ? "" : miPushMessage.getExtra().get(Constants.EXTRA_KEY_HYBRID_DEVICE_STATUS);
        int intValue = !TextUtils.isEmpty(str) ? Integer.valueOf(str).intValue() : 0;
        if (!z11) {
            intValue = (intValue & (-4)) + g.b.NOT_ALLOWED.a();
        }
        return (short) intValue;
    }

    public static boolean isRegistered(Context context, String str) {
        return b.m5683a(context).a(str) != null;
    }

    public static void onReceiveRegisterResult(Context context, ii iiVar) {
        ArrayList arrayList;
        b.a aVar;
        String c11 = iiVar.c();
        if (iiVar.a() == 0 && (aVar = dataMap.get(c11)) != null) {
            aVar.a(iiVar.f736e, iiVar.f737f);
            b.m5683a(context).a(c11, aVar);
        }
        if (TextUtils.isEmpty(iiVar.f736e)) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            arrayList.add(iiVar.f736e);
        }
        MiPushCommandMessage generateCommandMessage = PushMessageHelper.generateCommandMessage(ex.COMMAND_REGISTER.f366a, arrayList, iiVar.f724a, iiVar.f735d, null, null);
        MiPushCallback miPushCallback = sCallback;
        if (miPushCallback != null) {
            miPushCallback.onReceiveRegisterResult(c11, generateCommandMessage);
        }
    }

    public static void onReceiveUnregisterResult(Context context, io ioVar) {
        MiPushCommandMessage generateCommandMessage = PushMessageHelper.generateCommandMessage(ex.COMMAND_UNREGISTER.f366a, null, ioVar.f802a, ioVar.f810d, null, null);
        String a11 = ioVar.a();
        MiPushCallback miPushCallback = sCallback;
        if (miPushCallback != null) {
            miPushCallback.onReceiveUnregisterResult(a11, generateCommandMessage);
        }
    }

    public static void registerPush(Context context, String str, String str2, String str3) {
        if (b.m5683a(context).m5688a(str2, str3, str)) {
            ArrayList arrayList = new ArrayList();
            b.a a11 = b.m5683a(context).a(str);
            if (a11 != null) {
                arrayList.add(a11.f45208c);
                MiPushCommandMessage generateCommandMessage = PushMessageHelper.generateCommandMessage(ex.COMMAND_REGISTER.f366a, arrayList, 0L, null, null, null);
                MiPushCallback miPushCallback = sCallback;
                if (miPushCallback != null) {
                    miPushCallback.onReceiveRegisterResult(str, generateCommandMessage);
                }
            }
            if (shouldPullNotification(context, str)) {
                ig igVar = new ig();
                igVar.b(str2);
                igVar.c(hr.PullOfflineMessage.f538a);
                igVar.a(bd.a());
                igVar.a(false);
                ao.a(context).a(igVar, hh.Notification, false, true, null, false, str, str2);
                com.xiaomi.channel.commonutils.logger.b.b("MiPushClient4Hybrid pull offline pass through message");
                addPullNotificationTime(context, str);
                return;
            }
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - (sRegisterTimeMap.get(str) != null ? sRegisterTimeMap.get(str).longValue() : 0L)) < 5000) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("MiPushClient4Hybrid  Could not send register message within 5s repeatedly.");
            return;
        }
        sRegisterTimeMap.put(str, Long.valueOf(currentTimeMillis));
        String a12 = bo.a(6);
        b.a aVar = new b.a(context);
        aVar.c(str2, str3, a12);
        dataMap.put(str, aVar);
        ih ihVar = new ih();
        ihVar.a(bd.a());
        ihVar.b(str2);
        ihVar.e(str3);
        ihVar.d(str);
        ihVar.f(a12);
        ihVar.c(com.xiaomi.push.g.m5976a(context, context.getPackageName()));
        ihVar.b(com.xiaomi.push.g.a(context, context.getPackageName()));
        ihVar.h(BuildConfig.VERSION_NAME);
        ihVar.a(BuildConfig.VERSION_CODE);
        ihVar.a(hv.Init);
        if (!com.xiaomi.push.j.m6177d()) {
            String d11 = com.xiaomi.push.i.d(context);
            if (!TextUtils.isEmpty(d11)) {
                ihVar.i(bo.a(d11));
            }
        }
        int a13 = com.xiaomi.push.i.a();
        if (a13 >= 0) {
            ihVar.c(a13);
        }
        ig igVar2 = new ig();
        igVar2.c(hr.HybridRegister.f538a);
        igVar2.b(b.m5683a(context).m5684a());
        igVar2.d(context.getPackageName());
        igVar2.a(ir.a(ihVar));
        igVar2.a(bd.a());
        ao.a(context).a((ao) igVar2, hh.Notification, (hu) null);
    }

    public static void removeDuplicateCache(Context context, MiPushMessage miPushMessage) {
        String str = miPushMessage.getExtra() != null ? miPushMessage.getExtra().get("jobkey") : null;
        if (TextUtils.isEmpty(str)) {
            str = miPushMessage.getMessageId();
        }
        am.a(context, str);
    }

    public static void reportMessageArrived(Context context, MiPushMessage miPushMessage, boolean z11) {
        if (miPushMessage == null || miPushMessage.getExtra() == null) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("do not ack message, message is null");
            return;
        }
        try {
            hx hxVar = new hx();
            hxVar.b(b.m5683a(context).m5684a());
            hxVar.a(miPushMessage.getMessageId());
            hxVar.a(Long.valueOf(miPushMessage.getExtra().get(Constants.EXTRA_KEY_HYBRID_MESSAGE_TS)).longValue());
            hxVar.a(getDeviceStatus(miPushMessage, z11));
            if (!TextUtils.isEmpty(miPushMessage.getTopic())) {
                hxVar.c(miPushMessage.getTopic());
            }
            ao.a(context).a((ao) hxVar, hh.AckMessage, false, br.a(PushMessageHelper.generateMessage(miPushMessage)));
            com.xiaomi.channel.commonutils.logger.b.b("MiPushClient4Hybrid ack mina message, messageId is " + miPushMessage.getMessageId());
        } catch (Throwable th2) {
            try {
                com.xiaomi.channel.commonutils.logger.b.a(th2);
            } finally {
                miPushMessage.getExtra().remove(Constants.EXTRA_KEY_HYBRID_MESSAGE_TS);
                miPushMessage.getExtra().remove(Constants.EXTRA_KEY_HYBRID_DEVICE_STATUS);
            }
        }
    }

    public static void reportMessageClicked(Context context, MiPushMessage miPushMessage) {
        MiPushClient.reportMessageClicked(context, miPushMessage);
    }

    public static void setCallback(MiPushCallback miPushCallback) {
        sCallback = miPushCallback;
    }

    private static boolean shouldPullNotification(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("last_pull_notification_");
        sb2.append(str);
        return Math.abs(System.currentTimeMillis() - sharedPreferences.getLong(sb2.toString(), -1L)) > 300000;
    }

    public static void unregisterPush(Context context, String str) {
        sRegisterTimeMap.remove(str);
        b.a a11 = b.m5683a(context).a(str);
        if (a11 == null) {
            return;
        }
        in inVar = new in();
        inVar.a(bd.a());
        inVar.d(str);
        inVar.b(a11.f105a);
        inVar.c(a11.f45208c);
        inVar.e(a11.f45207b);
        ig igVar = new ig();
        igVar.c(hr.HybridUnregister.f538a);
        igVar.b(b.m5683a(context).m5684a());
        igVar.d(context.getPackageName());
        igVar.a(ir.a(inVar));
        igVar.a(bd.a());
        ao.a(context).a((ao) igVar, hh.Notification, (hu) null);
        b.m5683a(context).b(str);
    }

    public static void uploadClearMessageData(Context context, LinkedList<? extends Object> linkedList) {
        com.xiaomi.push.service.ak.a(context, linkedList);
    }

    public static class MiPushCallback {
        public void onCommandResult(String str, MiPushCommandMessage miPushCommandMessage) {
        }

        public void onReceiveRegisterResult(String str, MiPushCommandMessage miPushCommandMessage) {
        }

        public void onReceiveUnregisterResult(String str, MiPushCommandMessage miPushCommandMessage) {
        }
    }
}
