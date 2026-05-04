package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.xiaomi.push.hm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@TargetApi(24)
/* loaded from: classes8.dex */
class au {

    /* renamed from: a, reason: collision with root package name */
    private static au f46253a = new au();

    public class a {

        /* renamed from: a, reason: collision with other field name */
        List<b> f939a;

        /* renamed from: b, reason: collision with root package name */
        List<b> f46255b;

        private a() {
            this.f939a = new ArrayList();
            this.f46255b = new ArrayList();
        }
    }

    public class b {

        /* renamed from: a, reason: collision with root package name */
        int f46256a;

        /* renamed from: a, reason: collision with other field name */
        Notification f940a;

        public b(int i11, Notification notification) {
            this.f46256a = i11;
            this.f940a = notification;
        }

        public String toString() {
            return "id:" + this.f46256a;
        }
    }

    private au() {
    }

    private int a(String str, String str2) {
        return ("GroupSummary" + str + str2).hashCode();
    }

    private String b(Notification notification) {
        if (notification == null) {
            return null;
        }
        return m6237b(notification) ? a(notification) : notification.getGroup();
    }

    public static au a() {
        return f46253a;
    }

    private void b(Context context, int i11, Notification notification) {
        String str;
        String c11 = ay.c(notification);
        if (TextUtils.isEmpty(c11)) {
            str = "group restore not extract pkg from notification:" + i11;
        } else {
            ax a11 = ax.a(context, c11);
            List<StatusBarNotification> a12 = a(a11);
            if (a12 != null) {
                for (StatusBarNotification statusBarNotification : a12) {
                    Notification notification2 = statusBarNotification.getNotification();
                    if (notification2 != null && m6237b(notification2) && statusBarNotification.getId() != i11) {
                        Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(context, statusBarNotification.getNotification());
                        recoverBuilder.setGroup(a(notification2));
                        ay.a(recoverBuilder, m6236a(notification2));
                        a11.a(statusBarNotification.getId(), recoverBuilder.build());
                        com.xiaomi.channel.commonutils.logger.b.b("group restore notification:" + statusBarNotification.getId());
                    }
                }
                return;
            }
            str = "group restore not get notifications";
        }
        com.xiaomi.channel.commonutils.logger.b.m5639a(str);
    }

    private String a(Notification notification) {
        Bundle bundle;
        if (notification == null || (bundle = notification.extras) == null) {
            return null;
        }
        return bundle.getString("push_src_group_name");
    }

    /* renamed from: b, reason: collision with other method in class */
    private boolean m6237b(Notification notification) {
        Bundle bundle;
        if (notification == null || notification.getGroup() == null || (bundle = notification.extras) == null) {
            return false;
        }
        return notification.getGroup().equals(String.format("pushmask_%s_%s", Long.valueOf(bundle.getLong("push_src_group_time")), a(notification)));
    }

    private boolean b(Context context) {
        return ba.a(context).a(hm.NotificationAutoGroupSwitch.a(), true);
    }

    public String a(Context context, Notification.Builder builder, String str) {
        if (!m6235a() || !a(context)) {
            return str;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Bundle extras = builder.getExtras();
        extras.putString("push_src_group_name", str);
        extras.putLong("push_src_group_time", currentTimeMillis);
        return String.format("pushmask_%s_%s", Long.valueOf(currentTimeMillis), str);
    }

    private List<StatusBarNotification> a(ax axVar) {
        List<StatusBarNotification> m6248b = axVar != null ? axVar.m6248b() : null;
        if (m6248b == null || m6248b.size() == 0) {
            return null;
        }
        return m6248b;
    }

    public void a(Context context, int i11, Notification notification) {
        if (m6235a()) {
            if (a(context)) {
                try {
                    b(context, i11, notification);
                } catch (Exception e11) {
                    com.xiaomi.channel.commonutils.logger.b.m5639a("group notify handle restore error " + e11);
                }
            }
            if (b(context)) {
                try {
                    a(context, i11, notification, true);
                } catch (Exception e12) {
                    com.xiaomi.channel.commonutils.logger.b.m5639a("group notify handle auto error " + e12);
                }
            }
        }
    }

    private void a(Context context, int i11, Notification notification, boolean z11) {
        String str;
        String c11 = ay.c(notification);
        if (TextUtils.isEmpty(c11)) {
            str = "group auto not extract pkg from notification:" + i11;
        } else {
            List<StatusBarNotification> a11 = a(ax.a(context, c11));
            if (a11 != null) {
                String b11 = b(notification);
                HashMap hashMap = new HashMap();
                for (StatusBarNotification statusBarNotification : a11) {
                    if (statusBarNotification.getNotification() != null && statusBarNotification.getId() != i11) {
                        a(hashMap, statusBarNotification);
                    }
                }
                for (Map.Entry<String, a> entry : hashMap.entrySet()) {
                    String key = entry.getKey();
                    if (!TextUtils.isEmpty(key)) {
                        a value = entry.getValue();
                        if (z11 && key.equals(b11) && !m6237b(notification)) {
                            (m6236a(notification) ? value.f46255b : value.f939a).add(new b(i11, notification));
                        }
                        int size = value.f939a.size();
                        if (value.f46255b.size() <= 0) {
                            if (z11 && size >= 2) {
                                a(context, c11, key, value.f939a.get(0).f940a);
                            }
                        } else if (size <= 0) {
                            a(context, c11, key);
                        }
                    }
                }
                return;
            }
            str = "group auto not get notifications";
        }
        com.xiaomi.channel.commonutils.logger.b.m5639a(str);
    }

    private void a(Context context, String str, String str2) {
        com.xiaomi.channel.commonutils.logger.b.b("group cancel summary:" + str2);
        ax.a(context, str).a(a(str, str2));
    }

    private void a(Context context, String str, String str2, Notification notification) {
        Notification.Builder defaults;
        String channelId;
        String str3;
        try {
            if (TextUtils.isEmpty(str2)) {
                str3 = "group show summary group is null";
            } else {
                int a11 = ay.a(context, str);
                if (a11 != 0) {
                    ax a12 = ax.a(context, str);
                    if (Build.VERSION.SDK_INT >= 26) {
                        channelId = notification.getChannelId();
                        String b11 = a12.b(channelId, "groupSummary");
                        NotificationChannel m6242a = a12.m6242a(b11);
                        if ("groupSummary".equals(b11) && m6242a == null) {
                            androidx.media3.common.util.o.a();
                            a12.a(androidx.media3.common.util.n.a(b11, "group_summary", 3));
                        }
                        rh.d.a();
                        defaults = rh.c.a(context, b11);
                    } else {
                        defaults = new Notification.Builder(context).setPriority(0).setDefaults(-1);
                    }
                    ay.a(defaults, true);
                    Notification build = defaults.setContentTitle("GroupSummary").setContentText("GroupSummary").setSmallIcon(Icon.createWithResource(str, a11)).setAutoCancel(true).setGroup(str2).setGroupSummary(true).build();
                    if (!com.xiaomi.push.j.m6176c() && "com.xiaomi.xmsf".equals(context.getPackageName())) {
                        ay.m6249a(build, str);
                    }
                    int a13 = a(str, str2);
                    a12.a(a13, build);
                    com.xiaomi.channel.commonutils.logger.b.b("group show summary notify:" + a13);
                    return;
                }
                str3 = "group show summary not get icon from " + str;
            }
            com.xiaomi.channel.commonutils.logger.b.m5639a(str3);
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("group show summary error " + e11);
        }
    }

    private void a(Map<String, a> map, StatusBarNotification statusBarNotification) {
        String b11 = b(statusBarNotification.getNotification());
        a aVar = map.get(b11);
        if (aVar == null) {
            aVar = new a();
            map.put(b11, aVar);
        }
        (m6236a(statusBarNotification.getNotification()) ? aVar.f46255b : aVar.f939a).add(new b(statusBarNotification.getId(), statusBarNotification.getNotification()));
    }

    /* renamed from: a, reason: collision with other method in class */
    private boolean m6235a() {
        return true;
    }

    /* renamed from: a, reason: collision with other method in class */
    private boolean m6236a(Notification notification) {
        if (notification == null) {
            return false;
        }
        Object a11 = com.xiaomi.push.bj.a((Object) notification, "isGroupSummary", (Object[]) null);
        if (a11 instanceof Boolean) {
            return ((Boolean) a11).booleanValue();
        }
        return false;
    }

    private boolean a(Context context) {
        if (b(context) && ax.m6240a(context)) {
            return ba.a(context).a(hm.LatestNotificationNotIntoGroupSwitch.a(), false);
        }
        return false;
    }
}
