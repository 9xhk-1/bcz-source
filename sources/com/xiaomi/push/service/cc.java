package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.xiaomi.push.aj;
import com.xiaomi.push.ep;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class cc {
    private static int a(Map<String, String> map) {
        return Math.max(0, com.xiaomi.push.t.a(map.get("notification_top_period"), 0));
    }

    private static int b(Map<String, String> map) {
        return Math.max(0, com.xiaomi.push.t.a(map.get("notification_top_frequency"), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(19)
    public static void c(Context context, String str, int i11, String str2, Notification notification) {
        ax a11;
        Notification a12;
        int groupAlertBehavior;
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || Build.VERSION.SDK_INT < 26 || (a12 = a(notification, i11, str2, (a11 = ax.a(context, str)))) == null) {
            return;
        }
        boolean z11 = notification != null;
        groupAlertBehavior = a12.getGroupAlertBehavior();
        if (groupAlertBehavior != 1) {
            com.xiaomi.push.bj.a((Object) a12, "mGroupAlertBehavior", (Object) 1);
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = a12.extras.getLong("mipush_org_when", 0L);
        int i12 = a12.extras.getInt("mipush_n_top_fre", 0);
        int i13 = a12.extras.getInt("mipush_n_top_prd", 0);
        if (i13 <= 0 || i13 < i12) {
            return;
        }
        long j12 = j11 + (i13 * 1000);
        if (j11 >= currentTimeMillis || currentTimeMillis >= j12) {
            i13 = 0;
        } else if (i12 > 0) {
            i13 = (int) Math.min((j12 - currentTimeMillis) / 1000, i12);
        }
        if (!z11) {
            if (i13 > 0) {
                a12.when = currentTimeMillis;
                com.xiaomi.channel.commonutils.logger.b.m5639a("update top notification: " + str2);
                a11.a(i11, a12);
            } else {
                Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(context, a12);
                recoverBuilder.setPriority(0);
                recoverBuilder.setWhen(currentTimeMillis);
                Bundle extras = recoverBuilder.getExtras();
                if (extras != null) {
                    extras.remove("mipush_n_top_flag");
                    extras.remove("mipush_org_when");
                    extras.remove("mipush_n_top_fre");
                    extras.remove("mipush_n_top_prd");
                    recoverBuilder.setExtras(extras);
                }
                com.xiaomi.channel.commonutils.logger.b.m5639a("update top notification to common: " + str2);
                a11.a(i11, recoverBuilder.build());
            }
        }
        if (i13 > 0) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("schedule top notification next update delay: " + i13);
            com.xiaomi.push.aj.a(context).m5719a(b(i11, str2));
            com.xiaomi.push.aj.a(context).b(a(context, str, i11, str2, (Notification) null), i13);
        }
    }

    @TargetApi(19)
    private static Notification a(Notification notification, int i11, String str, ax axVar) {
        if (notification != null) {
            if (str.equals(notification.extras.getString("message_id"))) {
                return notification;
            }
            return null;
        }
        List<StatusBarNotification> m6248b = axVar.m6248b();
        if (m6248b == null) {
            return null;
        }
        for (StatusBarNotification statusBarNotification : m6248b) {
            Notification notification2 = statusBarNotification.getNotification();
            String string = notification2.extras.getString("message_id");
            if (i11 == statusBarNotification.getId() && str.equals(string)) {
                return notification2;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(int i11, String str) {
        return "n_top_update_" + i11 + "_" + str;
    }

    private static aj.a a(Context context, String str, int i11, String str2, Notification notification) {
        return new cd(i11, str2, context, str, notification);
    }

    @TargetApi(19)
    /* renamed from: a, reason: collision with other method in class */
    public static void m6273a(Context context, String str, int i11, String str2, Notification notification) {
        if (com.xiaomi.push.j.m6172a(context) && notification != null && notification.extras.getBoolean("mipush_n_top_flag", false)) {
            c(context, str, i11, str2, notification);
        }
    }

    public static void a(Context context, Map<String, String> map, ep epVar, long j11) {
        if (map == null || epVar == null || !com.xiaomi.push.j.m6172a(context) || !m6274a(map)) {
            return;
        }
        int a11 = a(map);
        int b11 = b(map);
        if (a11 <= 0 || b11 > a11) {
            com.xiaomi.channel.commonutils.logger.b.d("set top notification failed - period:" + a11 + " frequency:" + b11);
            return;
        }
        epVar.setPriority(2);
        Bundle bundle = new Bundle();
        bundle.putLong("mipush_org_when", j11);
        bundle.putBoolean("mipush_n_top_flag", true);
        if (b11 > 0) {
            bundle.putInt("mipush_n_top_fre", b11);
        }
        bundle.putInt("mipush_n_top_prd", a11);
        epVar.addExtras(bundle);
    }

    /* renamed from: a, reason: collision with other method in class */
    private static boolean m6274a(Map<String, String> map) {
        String str = map.get("notification_top_repeat");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean parseBoolean = Boolean.parseBoolean(str);
        com.xiaomi.channel.commonutils.logger.b.c("top notification' repeat is " + parseBoolean);
        return parseBoolean;
    }
}
