package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.xiaomi.push.hm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes8.dex */
public class ax {

    /* renamed from: a, reason: collision with root package name */
    private static Context f46260a;

    /* renamed from: a, reason: collision with other field name */
    private static Object f944a;

    /* renamed from: a, reason: collision with other field name */
    private static WeakHashMap<Integer, ax> f945a = new WeakHashMap<>();

    /* renamed from: a, reason: collision with other field name */
    private static boolean f946a;

    /* renamed from: a, reason: collision with other field name */
    private String f947a;

    /* renamed from: b, reason: collision with root package name */
    private String f46261b;

    private ax(String str) {
        this.f947a = str;
    }

    private static int a(String str) {
        try {
            return f46260a.getPackageManager().getPackageUid(str, 0);
        } catch (Exception unused) {
            return -1;
        }
    }

    public String b() {
        if (TextUtils.isEmpty(this.f46261b)) {
            this.f46261b = b("default");
        }
        return this.f46261b;
    }

    public String toString() {
        return "NotificationManagerHelper{" + this.f947a + com.alipay.sdk.m.u.i.f11099d;
    }

    private String b(String str) {
        return a(m6239a() ? "mipush|%s|%s" : "mipush_%s_%s", this.f947a, str);
    }

    @TargetApi(26)
    /* renamed from: a, reason: collision with other method in class */
    public NotificationChannel m6242a(String str) {
        NotificationChannel notificationChannel;
        String id2;
        try {
            if (!m6239a()) {
                notificationChannel = a().getNotificationChannel(str);
                return notificationChannel;
            }
            List<NotificationChannel> m6246a = m6246a();
            if (m6246a != null) {
                Iterator<NotificationChannel> it = m6246a.iterator();
                while (it.hasNext()) {
                    NotificationChannel a11 = androidx.core.app.i.a(it.next());
                    id2 = a11.getId();
                    if (str.equals(id2)) {
                        return a11;
                    }
                }
            }
            return null;
        } catch (Exception e11) {
            m6238a("getNotificationChannel error" + e11);
            return null;
        }
    }

    private static NotificationManager a() {
        return (NotificationManager) f46260a.getSystemService("notification");
    }

    public String b(String str, String str2) {
        return m6239a() ? str : str2;
    }

    /* renamed from: a, reason: collision with other method in class */
    public Context m6243a() {
        return f46260a;
    }

    /* renamed from: b, reason: collision with other method in class */
    public List<StatusBarNotification> m6248b() {
        String str = this.f947a;
        NotificationManager a11 = a();
        ArrayList arrayList = null;
        try {
            if (m6239a()) {
                int a12 = com.xiaomi.push.i.a();
                if (a12 != -1) {
                    return (List) a(com.xiaomi.push.bj.a(f944a, "getAppActiveNotifications", str, Integer.valueOf(a12)));
                }
            } else {
                StatusBarNotification[] activeNotifications = a11.getActiveNotifications();
                if (activeNotifications != null && activeNotifications.length > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        for (StatusBarNotification statusBarNotification : activeNotifications) {
                            if (str.equals(ay.c(statusBarNotification.getNotification()))) {
                                arrayList2.add(statusBarNotification);
                            }
                        }
                        return arrayList2;
                    } catch (Throwable th2) {
                        th = th2;
                        arrayList = arrayList2;
                        m6238a("getActiveNotifications error " + th);
                        return arrayList;
                    }
                }
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static ax a(Context context, String str) {
        a(context);
        int hashCode = str.hashCode();
        ax axVar = f945a.get(Integer.valueOf(hashCode));
        if (axVar != null) {
            return axVar;
        }
        ax axVar2 = new ax(str);
        f945a.put(Integer.valueOf(hashCode), axVar2);
        return axVar2;
    }

    private static <T> T a(Object obj) {
        if (obj != null) {
            try {
                return (T) obj.getClass().getMethod("getList", null).invoke(obj, null);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private static Object a(List list) {
        return Class.forName("android.content.pm.ParceledListSlice").getConstructor(List.class).newInstance(list);
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m6244a() {
        return this.f947a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m6245a(String str) {
        return TextUtils.isEmpty(str) ? b() : com.xiaomi.push.j.m6172a(m6243a()) ? b(str) : str;
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String a11 = a("mipush|%s|%s", str2, "");
        return str.startsWith(a11) ? a("mipush_%s_%s", str2, str.replace(a11, "")) : str;
    }

    private static String a(String str, String str2, String str3) {
        return TextUtils.isEmpty(str) ? "" : String.format(str, str2, str3);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @TargetApi(26)
    /* renamed from: a, reason: collision with other method in class */
    public List<NotificationChannel> m6246a() {
        String str;
        String id2;
        String str2 = this.f947a;
        List<NotificationChannel> list = null;
        try {
            if (m6239a()) {
                int a11 = a(str2);
                if (a11 != -1) {
                    List<NotificationChannel> list2 = (List) a(com.xiaomi.push.bj.a(f944a, "getNotificationChannelsForPackage", str2, Integer.valueOf(a11), Boolean.FALSE));
                    str = "mipush|%s|%s";
                    list = list2;
                } else {
                    str = null;
                }
            } else {
                list = a().getNotificationChannels();
                str = "mipush_%s_%s";
            }
            if (!com.xiaomi.push.j.m6171a() || list == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            String a12 = a(str, str2, "");
            Iterator<NotificationChannel> it = list.iterator();
            while (it.hasNext()) {
                NotificationChannel a13 = androidx.core.app.i.a(it.next());
                id2 = a13.getId();
                if (id2.startsWith(a12)) {
                    arrayList.add(a13);
                }
            }
            return arrayList;
        } catch (Exception e11) {
            m6238a("getNotificationChannels error " + e11);
            return list;
        }
    }

    public void a(int i11) {
        String str = this.f947a;
        try {
            if (!m6239a()) {
                a().cancel(i11);
                return;
            }
            int a11 = com.xiaomi.push.i.a();
            String packageName = m6243a().getPackageName();
            if (Build.VERSION.SDK_INT >= 30) {
                com.xiaomi.push.bj.b(f944a, "cancelNotificationWithTag", str, packageName, null, Integer.valueOf(i11), Integer.valueOf(a11));
            } else {
                com.xiaomi.push.bj.b(f944a, "cancelNotificationWithTag", str, null, Integer.valueOf(i11), Integer.valueOf(a11));
            }
            m6238a("cancel succ:" + i11);
        } catch (Exception e11) {
            m6238a("cancel error" + e11);
        }
    }

    public void a(int i11, Notification notification) {
        String str = this.f947a;
        NotificationManager a11 = a();
        try {
            int i12 = Build.VERSION.SDK_INT;
            if (m6239a()) {
                notification.extras.putString("xmsf_target_package", str);
                if (i12 >= 29) {
                    a11.notifyAsPackage(str, null, i11, notification);
                    return;
                }
            }
            a11.notify(i11, notification);
        } catch (Exception unused) {
        }
    }

    @TargetApi(26)
    public void a(NotificationChannel notificationChannel) {
        String str = this.f947a;
        try {
            if (!m6239a()) {
                a().createNotificationChannel(notificationChannel);
                return;
            }
            int a11 = a(str);
            if (a11 != -1) {
                com.xiaomi.push.bj.b(f944a, "createNotificationChannelsForPackage", str, Integer.valueOf(a11), a(Arrays.asList(notificationChannel)));
            }
        } catch (Exception e11) {
            m6238a("createNotificationChannel error" + e11);
        }
    }

    public void a(NotificationChannel notificationChannel, boolean z11) {
        String str = this.f947a;
        try {
            if (!z11) {
                a(notificationChannel);
                return;
            }
            int a11 = a(str);
            if (a11 != -1) {
                com.xiaomi.push.bj.b(f944a, "updateNotificationChannelForPackage", str, Integer.valueOf(a11), notificationChannel);
            }
        } catch (Exception e11) {
            m6238a("updateNotificationChannel error " + e11);
        }
    }

    private static void a(Context context) {
        if (f46260a == null) {
            f46260a = context.getApplicationContext();
            NotificationManager a11 = a();
            Boolean bool = (Boolean) com.xiaomi.push.bj.a((Object) a11, "isSystemConditionProviderEnabled", "xmsf_fake_condition_provider_path");
            m6238a("fwk is support.init:" + bool);
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            f946a = booleanValue;
            if (booleanValue) {
                f944a = com.xiaomi.push.bj.a((Object) a11, "getService", new Object[0]);
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m6238a(String str) {
        com.xiaomi.channel.commonutils.logger.b.m5639a("NMHelper:" + str);
    }

    /* renamed from: a, reason: collision with other method in class */
    private static boolean m6239a() {
        if (com.xiaomi.push.j.m6171a() && ba.a(f46260a).a(hm.NotificationBelongToAppSwitch.a(), true)) {
            return f946a;
        }
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m6240a(Context context) {
        a(context);
        return m6239a();
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6247a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(b(""));
    }

    /* renamed from: a, reason: collision with other method in class */
    private StatusBarNotification[] m6241a() {
        if (!com.xiaomi.push.j.m6172a(m6243a())) {
            return null;
        }
        try {
            Object a11 = com.xiaomi.push.bj.a(f944a, "getActiveNotifications", m6243a().getPackageName());
            if (a11 instanceof StatusBarNotification[]) {
                return (StatusBarNotification[]) a11;
            }
            return null;
        } catch (Throwable th2) {
            m6238a("getAllNotifications error " + th2);
            return null;
        }
    }
}
