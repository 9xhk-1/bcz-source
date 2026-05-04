package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.push.bi;
import com.xiaomi.push.bj;
import com.xiaomi.push.bn;
import com.xiaomi.push.id;
import com.xiaomi.push.service.ba;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class i {
    public static int a() {
        Integer num = (Integer) bj.a("com.xiaomi.assemble.control.AssembleConstants", "ASSEMBLE_VERSION_CODE");
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static String b(e eVar) {
        return a(eVar) + "_version";
    }

    public static String c(e eVar) {
        int i11 = k.f45222a[eVar.ordinal()];
        if (i11 == 1) {
            return "hms_push_error";
        }
        if (i11 == 2) {
            return "fcm_push_error";
        }
        if (i11 == 3) {
            return "cos_push_error";
        }
        if (i11 != 4) {
            return null;
        }
        return "ftos_push_error";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void d(Context context, e eVar, String str) {
        synchronized (i.class) {
            String a11 = a(eVar);
            if (TextUtils.isEmpty(a11)) {
                com.xiaomi.channel.commonutils.logger.b.m5639a("ASSEMBLE_PUSH : can not find the key of token used in sp file");
                return;
            }
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.putString(a11, str).putString("last_check_token", b.m5683a(context).m5691c());
            if (m5708a(eVar)) {
                edit.putInt(b(eVar), a());
            }
            edit.putString("syncingToken", "");
            com.xiaomi.push.q.a(edit);
            com.xiaomi.channel.commonutils.logger.b.m5639a("ASSEMBLE_PUSH : update sp file success!  " + str);
        }
    }

    private static int a(Context context, e eVar, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        String a11 = a(eVar);
        String string = sharedPreferences.getString(a11, "");
        String m5691c = b.m5683a(context).m5691c();
        String string2 = sharedPreferences.getString("last_check_token", "");
        if (TextUtils.isEmpty(a11)) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("ASSEMBLE_PUSH : can not find the key of token used in sp file");
            return 0;
        }
        if (TextUtils.isEmpty(string)) {
            return 1;
        }
        if (!string.equals(str)) {
            return 2;
        }
        if (!TextUtils.equals(m5691c, string2)) {
            return 3;
        }
        if (m5708a(eVar)) {
            if (a() != sharedPreferences.getInt(b(eVar), 0)) {
                return 4;
            }
        }
        return 0;
    }

    public static void b(Context context) {
        f.a(context).register();
    }

    public static void c(Context context) {
        f.a(context).unregister();
    }

    public static MiPushMessage a(String str) {
        MiPushMessage miPushMessage = new MiPushMessage();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("messageId")) {
                    miPushMessage.setMessageId(jSONObject.getString("messageId"));
                }
                if (jSONObject.has("description")) {
                    miPushMessage.setDescription(jSONObject.getString("description"));
                }
                if (jSONObject.has("title")) {
                    miPushMessage.setTitle(jSONObject.getString("title"));
                }
                if (jSONObject.has("content")) {
                    miPushMessage.setContent(jSONObject.getString("content"));
                }
                if (jSONObject.has("passThrough")) {
                    miPushMessage.setPassThrough(jSONObject.getInt("passThrough"));
                }
                if (jSONObject.has("notifyType")) {
                    miPushMessage.setNotifyType(jSONObject.getInt("notifyType"));
                }
                if (jSONObject.has("messageType")) {
                    miPushMessage.setMessageType(jSONObject.getInt("messageType"));
                }
                if (jSONObject.has(PushConstants.SUB_ALIAS_STATUS_NAME)) {
                    miPushMessage.setAlias(jSONObject.getString(PushConstants.SUB_ALIAS_STATUS_NAME));
                }
                if (jSONObject.has("topic")) {
                    miPushMessage.setTopic(jSONObject.getString("topic"));
                }
                if (jSONObject.has("user_account")) {
                    miPushMessage.setUserAccount(jSONObject.getString("user_account"));
                }
                if (jSONObject.has(RemoteMessageConst.Notification.NOTIFY_ID)) {
                    miPushMessage.setNotifyId(jSONObject.getInt(RemoteMessageConst.Notification.NOTIFY_ID));
                }
                if (jSONObject.has(za.a.f102442j)) {
                    miPushMessage.setCategory(jSONObject.getString(za.a.f102442j));
                }
                if (jSONObject.has("isNotified")) {
                    miPushMessage.setNotified(jSONObject.getBoolean("isNotified"));
                }
                if (jSONObject.has("extra")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("extra");
                    Iterator<String> keys = jSONObject2.keys();
                    HashMap hashMap = new HashMap();
                    while (keys != null && keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, jSONObject2.getString(next));
                    }
                    if (hashMap.size() > 0) {
                        miPushMessage.setExtra(hashMap);
                        return miPushMessage;
                    }
                }
            } catch (Exception e11) {
                com.xiaomi.channel.commonutils.logger.b.d(e11.toString());
            }
        }
        return miPushMessage;
    }

    public static void b(Context context, e eVar, String str) {
        com.xiaomi.push.aj.a(context).a(new j(str, context, eVar));
    }

    public static PushMessageReceiver a(Context context) {
        ResolveInfo resolveInfo;
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setPackage(context.getPackageName());
        try {
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            if (queryBroadcastReceivers != null) {
                Iterator<ResolveInfo> it = queryBroadcastReceivers.iterator();
                while (it.hasNext()) {
                    resolveInfo = it.next();
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    if (activityInfo != null && activityInfo.packageName.equals(context.getPackageName())) {
                        break;
                    }
                }
            }
            resolveInfo = null;
            if (resolveInfo != null) {
                return (PushMessageReceiver) com.xiaomi.push.s.a(context, resolveInfo.activityInfo.name).newInstance();
            }
            return null;
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.d(e11.toString());
            return null;
        }
    }

    public static String a(Context context, e eVar) {
        return a(context, eVar, false);
    }

    public static synchronized String a(Context context, e eVar, boolean z11) {
        synchronized (i.class) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
            if (z11) {
                String string = sharedPreferences.getString("syncingToken", "");
                if (!TextUtils.isEmpty(string)) {
                    return string;
                }
            }
            String a11 = a(eVar);
            if (TextUtils.isEmpty(a11)) {
                return "";
            }
            return sharedPreferences.getString(a11, "");
        }
    }

    public static String a(e eVar) {
        int i11 = k.f45222a[eVar.ordinal()];
        if (i11 == 1) {
            return "hms_push_token";
        }
        if (i11 == 2) {
            return "fcm_push_token_v2";
        }
        if (i11 == 3) {
            return "cos_push_token";
        }
        if (i11 != 4) {
            return null;
        }
        return "ftos_push_token";
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
    
        if (r12 != 0) goto L13;
     */
    /* renamed from: a, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashMap<java.lang.String, java.lang.String> m5702a(android.content.Context r11, com.xiaomi.mipush.sdk.e r12) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int[] r1 = com.xiaomi.mipush.sdk.k.f45222a
            int r2 = r12.ordinal()
            r1 = r1[r2]
            java.lang.String r2 = "package_name"
            java.lang.String r3 = "token"
            java.lang.String r4 = "brand"
            java.lang.String r5 = "~"
            java.lang.String r6 = ":"
            r7 = 0
            r8 = 1
            if (r1 == r8) goto La5
            r9 = 2
            java.lang.String r10 = "version"
            if (r1 == r9) goto L7a
            r9 = 3
            if (r1 == r9) goto L5a
            r9 = 4
            if (r1 == r9) goto L28
            goto Lf3
        L28:
            com.xiaomi.push.t$a r1 = new com.xiaomi.push.t$a
            r1.<init>(r6, r5)
            com.xiaomi.mipush.sdk.ag r5 = com.xiaomi.mipush.sdk.ag.VIVO
            java.lang.String r5 = r5.name()
            com.xiaomi.push.t$a r1 = r1.a(r4, r5)
            java.lang.String r12 = a(r11, r12, r8)
            com.xiaomi.push.t$a r12 = r1.a(r3, r12)
            java.lang.String r11 = r11.getPackageName()
            com.xiaomi.push.t$a r11 = r12.a(r2, r11)
            int r12 = a()
            if (r12 == 0) goto L54
        L4d:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11.a(r10, r12)
        L54:
            java.lang.String r7 = r11.toString()
            goto Lf3
        L5a:
            com.xiaomi.push.t$a r1 = new com.xiaomi.push.t$a
            r1.<init>(r6, r5)
            com.xiaomi.mipush.sdk.ag r5 = com.xiaomi.mipush.sdk.ag.OPPO
            java.lang.String r5 = r5.name()
            com.xiaomi.push.t$a r1 = r1.a(r4, r5)
            java.lang.String r12 = a(r11, r12, r8)
            com.xiaomi.push.t$a r12 = r1.a(r3, r12)
            java.lang.String r11 = r11.getPackageName()
            com.xiaomi.push.t$a r11 = r12.a(r2, r11)
            goto L54
        L7a:
            com.xiaomi.push.t$a r1 = new com.xiaomi.push.t$a
            r1.<init>(r6, r5)
            com.xiaomi.mipush.sdk.ag r5 = com.xiaomi.mipush.sdk.ag.FCM
            java.lang.String r5 = r5.name()
            com.xiaomi.push.t$a r1 = r1.a(r4, r5)
            r4 = 0
            java.lang.String r12 = a(r11, r12, r4)
            com.xiaomi.push.t$a r12 = r1.a(r3, r12)
            java.lang.String r11 = r11.getPackageName()
            com.xiaomi.push.t$a r11 = r12.a(r2, r11)
            int r12 = a()
            if (r12 == 0) goto La1
        La0:
            goto L4d
        La1:
            r12 = 50008(0xc358, float:7.0076E-41)
            goto La0
        La5:
            android.content.pm.PackageManager r1 = r11.getPackageManager()     // Catch: java.lang.Exception -> Lb4
            java.lang.String r9 = r11.getPackageName()     // Catch: java.lang.Exception -> Lb4
            r10 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r7 = r1.getApplicationInfo(r9, r10)     // Catch: java.lang.Exception -> Lb4
            goto Lbc
        Lb4:
            r1 = move-exception
            java.lang.String r1 = r1.toString()
            com.xiaomi.channel.commonutils.logger.b.d(r1)
        Lbc:
            if (r7 == 0) goto Lc7
            android.os.Bundle r1 = r7.metaData
            java.lang.String r7 = "com.huawei.hms.client.appid"
            int r1 = r1.getInt(r7)
            goto Lc8
        Lc7:
            r1 = -1
        Lc8:
            com.xiaomi.push.t$a r7 = new com.xiaomi.push.t$a
            r7.<init>(r6, r5)
            com.xiaomi.mipush.sdk.ag r5 = com.xiaomi.mipush.sdk.ag.HUAWEI
            java.lang.String r5 = r5.name()
            com.xiaomi.push.t$a r4 = r7.a(r4, r5)
            java.lang.String r12 = a(r11, r12, r8)
            com.xiaomi.push.t$a r12 = r4.a(r3, r12)
            java.lang.String r11 = r11.getPackageName()
            com.xiaomi.push.t$a r11 = r12.a(r2, r11)
            java.lang.String r12 = "app_id"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.xiaomi.push.t$a r11 = r11.a(r12, r1)
            goto L54
        Lf3:
            java.lang.String r11 = "RegInfo"
            r0.put(r11, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.i.m5702a(android.content.Context, com.xiaomi.mipush.sdk.e):java.util.HashMap");
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m5703a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        String a11 = a(e.ASSEMBLE_PUSH_HUAWEI);
        String a12 = a(e.ASSEMBLE_PUSH_FCM);
        if (TextUtils.isEmpty(sharedPreferences.getString(a11, "")) || !TextUtils.isEmpty(sharedPreferences.getString(a12, ""))) {
            return;
        }
        ao.a(context).a(2, a11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m5704a(Context context, e eVar) {
        String a11 = a(eVar);
        if (TextUtils.isEmpty(a11)) {
            return;
        }
        com.xiaomi.push.q.a(context.getSharedPreferences("mipush_extra", 0).edit().putString(a11, ""));
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m5705a(Context context, e eVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int a11 = a(context, eVar, str);
        if (a11 == 0) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("ASSEMBLE_PUSH : do not need to send token");
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.m5639a("ASSEMBLE_PUSH : send token upload, check:" + a11);
        a(context, str);
        au a12 = l.a(eVar);
        if (a12 == null) {
            return;
        }
        ao.a(context).a((String) null, a12, eVar, "upload");
    }

    private static synchronized void a(Context context, String str) {
        synchronized (i.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.putString("syncingToken", str);
            edit.apply();
        }
    }

    public static void a(Intent intent) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null || !extras.containsKey("pushMsg")) {
            return;
        }
        intent.putExtra(PushMessageHelper.KEY_MESSAGE, a(extras.getString("pushMsg")));
    }

    public static void a(String str, int i11) {
        MiTinyDataClient.upload("hms_push_error", str, 1L, "error code = " + i11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m5706a(Context context) {
        if (context == null) {
            return false;
        }
        return bi.b(context);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m5707a(Context context, e eVar) {
        if (l.m5710a(eVar) != null) {
            return ba.a(context).a(l.m5710a(eVar).a(), true);
        }
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m5708a(e eVar) {
        return eVar == e.ASSEMBLE_PUSH_FTOS || eVar == e.ASSEMBLE_PUSH_FCM;
    }

    public static boolean a(id idVar, e eVar) {
        if (idVar == null || idVar.m6085a() == null || idVar.m6085a().m6046a() == null) {
            return false;
        }
        return (eVar == e.ASSEMBLE_PUSH_FCM ? "FCM" : "").equalsIgnoreCase(idVar.m6085a().m6046a().get("assemble_push_type"));
    }

    public static byte[] a(Context context, id idVar, e eVar) {
        if (a(idVar, eVar)) {
            return bn.m5756a(a(context, eVar));
        }
        return null;
    }
}
