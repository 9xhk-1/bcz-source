package com.xiaomi.push.service;

import android.app.Notification;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes8.dex */
public class ay {

    /* renamed from: a, reason: collision with root package name */
    public static final a<String, String, String> f46262a;

    /* renamed from: b, reason: collision with root package name */
    public static final a<String, String, String> f46263b;

    /* renamed from: c, reason: collision with root package name */
    public static final a<String, String, String> f46264c;

    /* renamed from: d, reason: collision with root package name */
    public static final a<String, String, String> f46265d;

    /* renamed from: e, reason: collision with root package name */
    public static final a<String, String, String> f46266e;

    /* renamed from: f, reason: collision with root package name */
    public static final a<String, String, String> f46267f;

    /* renamed from: a, reason: collision with other field name */
    private static final String[] f949a = {"com.mi.globalbrowser", "com.android.browser"};

    /* renamed from: a, reason: collision with other field name */
    private static String f948a = null;

    public static class a<F, S, T> {

        /* renamed from: a, reason: collision with root package name */
        F f46268a;

        /* renamed from: b, reason: collision with root package name */
        S f46269b;

        /* renamed from: c, reason: collision with root package name */
        T f46270c;

        private a(F f11, S s11, T t11) {
            this.f46268a = f11;
            this.f46269b = s11;
            this.f46270c = t11;
        }
    }

    static {
        String str = "canSound";
        f46262a = new a<>("setSound", str, str);
        String str2 = "canVibrate";
        f46263b = new a<>("setVibrate", str2, str2);
        String str3 = "canLights";
        f46264c = new a<>("setLights", str3, str3);
        String str4 = "canShowOnKeyguard";
        f46265d = new a<>("setShowOnKeyguard", str4, str4);
        f46266e = new a<>("setFloat", "canFloat", "canShowFloat");
        String str5 = "canShowBadge";
        f46267f = new a<>("setShowBadge", str5, str5);
    }

    public static int a(ContentResolver contentResolver) {
        try {
            return Settings.Global.getInt(contentResolver, "user_aggregate", 0);
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("get user aggregate failed, " + e11);
            return 0;
        }
    }

    public static String b(Notification notification) {
        CharSequence charSequence;
        Bundle bundle = notification.extras;
        if (bundle != null) {
            charSequence = bundle.getCharSequence(NotificationCompat.EXTRA_TEXT);
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence(NotificationCompat.EXTRA_BIG_TEXT);
            }
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence("mipush.customContent");
            }
        } else {
            charSequence = null;
        }
        return charSequence != null ? charSequence.toString() : "";
    }

    public static String c(Notification notification) {
        Object a11;
        try {
            Bundle bundle = notification.extras;
            r0 = bundle != null ? bundle.getString(HiAnalyticsConstant.BI_KEY_TARGET_PACKAGE) : null;
            if (TextUtils.isEmpty(r0) && (a11 = com.xiaomi.push.bj.a(notification, "extraNotification")) != null) {
                return (String) com.xiaomi.push.bj.a(a11, "getTargetPkg", new Object[0]);
            }
        } catch (Exception unused) {
        }
        return r0;
    }

    public static int a(Context context, String str) {
        return com.xiaomi.push.g.b(context, str);
    }

    public static void b(Notification notification, boolean z11) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putBoolean("miui.enableKeyguard", z11);
            }
            Object a11 = com.xiaomi.push.bj.a(notification, "extraNotification");
            if (a11 != null) {
                com.xiaomi.push.bj.a(a11, "setEnableKeyguard", Boolean.valueOf(z11));
            }
        } catch (Exception unused) {
        }
    }

    public static int a(Context context, String str, String str2, a<String, String, String> aVar) {
        if (aVar == null) {
            return -1;
        }
        try {
            Bundle a11 = a(context, aVar.f46269b, str, str2, (Bundle) null);
            if (a11 == null || !a11.containsKey(aVar.f46270c)) {
                return -1;
            }
            return a11.getBoolean(aVar.f46270c) ? 1 : 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    private static Bundle a(Context context, String str, String str2, String str3, Bundle bundle) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("call notification provider failed!");
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("package", str2);
        if (!TextUtils.isEmpty(str3)) {
            bundle2.putString("channel_id", str3);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        return context.getContentResolver().call(Uri.parse("content://statusbar.notification"), str, (String) null, bundle2);
    }

    public static <T> T a(Notification notification, String str) {
        Bundle bundle = notification.extras;
        if (bundle == null) {
            return null;
        }
        try {
            return (T) bundle.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> T a(Object obj, String str, T t11) {
        Object obj2 = null;
        try {
            if (obj instanceof Notification) {
                obj2 = a((Notification) obj, str);
            } else if (obj instanceof Map) {
                obj2 = ((Map) obj).get(str);
            } else if (obj instanceof Bundle) {
                obj2 = ((Bundle) obj).get(str);
            } else {
                com.xiaomi.channel.commonutils.logger.b.m5639a("not support get value from classType:" + obj);
            }
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("get value error " + e11);
        }
        return obj2 == null ? t11 : (T) obj2;
    }

    public static String a(Notification notification) {
        CharSequence charSequence;
        Bundle bundle = notification.extras;
        if (bundle != null) {
            charSequence = bundle.getCharSequence(NotificationCompat.EXTRA_TITLE);
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence(NotificationCompat.EXTRA_TITLE_BIG);
            }
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence("mipush.customTitle");
            }
        } else {
            charSequence = null;
        }
        return charSequence != null ? charSequence.toString() : "";
    }

    public static String a(Object obj) {
        return (String) a(obj, "msg_busi_type", "");
    }

    public static void a(Notification notification, int i11) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putInt("miui.messageCount", i11);
            }
            Object a11 = com.xiaomi.push.bj.a(notification, "extraNotification");
            if (a11 != null) {
                com.xiaomi.push.bj.a(a11, "setMessageCount", Integer.valueOf(i11));
            }
        } catch (Exception unused) {
        }
    }

    public static void a(Notification notification, int i11, int i12) {
        if (notification != null) {
            if (notification.extras == null) {
                notification.extras = new Bundle();
            }
            notification.extras.putInt("is_priority", i11);
            notification.extras.putInt("mipush_class", i12);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m6249a(Notification notification, String str) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putString(HiAnalyticsConstant.BI_KEY_TARGET_PACKAGE, str);
            }
            Object a11 = com.xiaomi.push.bj.a(notification, "extraNotification");
            if (a11 != null) {
                com.xiaomi.push.bj.a(a11, "setTargetPkg", str);
            }
        } catch (Exception unused) {
        }
    }

    public static void a(Notification notification, boolean z11) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putBoolean("miui.enableFloat", z11);
            }
            Object a11 = com.xiaomi.push.bj.a(notification, "extraNotification");
            if (a11 != null) {
                com.xiaomi.push.bj.a(a11, "setEnableFloat", Boolean.valueOf(z11));
            }
        } catch (Exception unused) {
        }
    }

    public static void a(Context context, String str, Intent intent) {
        if (intent == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(str);
        }
        arrayList.addAll(Arrays.asList(f949a));
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            String str2 = (String) arrayList.get(i11);
            if (!TextUtils.isEmpty(str2)) {
                Intent intent2 = new Intent(intent);
                intent2.setPackage(str2);
                try {
                    if (context.getPackageManager().resolveActivity(intent2, 65536) != null) {
                        intent.setPackage(str2);
                        break;
                    }
                    continue;
                } catch (Exception e11) {
                    com.xiaomi.channel.commonutils.logger.b.m5639a("can't match url intent. " + e11);
                }
            }
        }
        intent.setPackage(intent.getPackage());
    }

    public static void a(Map<String, String> map, Bundle bundle, String str) {
        if (map == null || bundle == null || TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("cp map to b fail:" + str);
            return;
        }
        if (TextUtils.isEmpty(map.get(str))) {
            bundle.remove(str);
        } else {
            bundle.putString(str, map.get(str));
        }
    }

    public static boolean a(Notification.Builder builder, boolean z11) {
        if (Build.VERSION.SDK_INT >= 26) {
            builder.setGroupAlertBehavior(z11 ? 2 : 1);
            return true;
        }
        com.xiaomi.channel.commonutils.logger.b.b("not support setGroupAlertBehavior");
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m6250a(ContentResolver contentResolver) {
        int a11 = a(contentResolver);
        return a11 == 1 || a11 == 2;
    }

    public static boolean a(Context context, String str, String str2, a<String, String, String> aVar, boolean z11) {
        if (aVar == null) {
            return false;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putBoolean(aVar.f46270c, z11);
            a(context, aVar.f46268a, str, str2, bundle);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a(Map<String, String> map) {
        return Boolean.parseBoolean((String) a(map, "not_suppress", n6.m.f74525c));
    }

    /* renamed from: a, reason: collision with other method in class */
    public static Notification.Action[] m6251a(Notification notification) {
        Parcelable[] parcelableArray;
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr;
        }
        Bundle bundle = notification.extras;
        if (bundle == null || (parcelableArray = bundle.getParcelableArray("mipush.customActions")) == null) {
            return null;
        }
        return (Notification.Action[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Notification.Action[].class);
    }
}
