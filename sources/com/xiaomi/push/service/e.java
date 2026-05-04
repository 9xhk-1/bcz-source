package com.xiaomi.push.service;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.hms.framework.common.ContainerUtils;
import com.xiaomi.push.service.ay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
class e {

    /* renamed from: a, reason: collision with other field name */
    private static final int[] f1010a = {1, 2, 4, 8, 16};

    /* renamed from: a, reason: collision with root package name */
    private static final SparseArray<ay.a<String, String, String>> f46371a = new f(5);

    /* renamed from: b, reason: collision with root package name */
    private static final SparseArray<Integer> f46372b = new g(5);

    public static int a(String str, String str2) {
        int i11 = a(str, str2, 8) ? 8 : 0;
        if (a(str, str2, 16)) {
            i11 |= 16;
        }
        if (a(str, str2, 1)) {
            i11 |= 1;
        }
        if (a(str, str2, 2)) {
            i11 |= 2;
        }
        return a(str, str2, 4) ? i11 | 4 : i11;
    }

    private static SharedPreferences a(Context context) {
        return context.getSharedPreferences("ch_permission_cache_file", 0);
    }

    public static void a(Context context, String str) {
        List<NotificationChannel> m6246a;
        if (!com.xiaomi.push.j.m6172a(context) || TextUtils.isEmpty(str) || (m6246a = ax.a(context, str).m6246a()) == null) {
            return;
        }
        synchronized (e.class) {
            try {
                SharedPreferences a11 = a(context);
                ArrayList arrayList = new ArrayList();
                Iterator<NotificationChannel> it = m6246a.iterator();
                while (it.hasNext()) {
                    String str2 = (String) com.xiaomi.push.bj.a(androidx.core.app.i.a(it.next()), "mId");
                    if (!TextUtils.isEmpty(str2) && a11.contains(str2)) {
                        arrayList.add(str2);
                    }
                }
                if (arrayList.size() > 0) {
                    a(a11, arrayList);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void a(Context context, String str, String str2, int i11, String str3, boolean z11, int i12) {
        if (!com.xiaomi.push.j.m6172a(context) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            if (com.xiaomi.push.j.m6172a(context)) {
                com.xiaomi.channel.commonutils.logger.b.m5639a("ChannelPC: can`t setup permission with permissionCode:" + String.valueOf(str3) + " channelId:" + String.valueOf(str2) + " targetPkg:" + str);
                return;
            }
            return;
        }
        int a11 = com.xiaomi.push.t.a(str3, 0);
        boolean a12 = a(i11, a11);
        if (z11) {
            a(str, str2, a11, i12);
            if (a12) {
                synchronized (e.class) {
                    a(a(context), a11, str2);
                }
                return;
            }
            return;
        }
        synchronized (e.class) {
            try {
                SharedPreferences a13 = a(context);
                if (!a12) {
                    if (a13.contains(str2)) {
                    }
                }
                a(a13, a11, str, str2, i12);
                if (a12) {
                    a(a13, a11, str2);
                } else {
                    a(a13, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void a(SharedPreferences sharedPreferences, int i11, String str) {
        sharedPreferences.edit().putInt(str, i11).commit();
    }

    private static void a(SharedPreferences sharedPreferences, int i11, String str, String str2, int i12) {
        if (sharedPreferences.getInt(str2, 0) != i11) {
            a(str, str2, i11, i12);
        }
    }

    private static void a(SharedPreferences sharedPreferences, String str) {
        a(sharedPreferences, new h(str));
    }

    private static void a(SharedPreferences sharedPreferences, List<String> list) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            edit.remove(it.next());
        }
        edit.commit();
    }

    public static void a(String str, String str2, int i11, int i12) {
        for (int i13 : f1010a) {
            if ((f46372b.get(i13).intValue() & i12) == 0) {
                a(str, str2, i13, (i11 & i13) > 0);
            } else {
                com.xiaomi.channel.commonutils.logger.b.m5639a("ChannelPermissions.grantPermission:" + str + ":" + str2 + ": <" + i13 + "> :stoped by userLock");
            }
        }
    }

    private static void a(String str, String str2, int i11, boolean z11) {
        com.xiaomi.channel.commonutils.logger.b.m5639a("ChannelPermissions.grantPermission:" + str + ":" + str2 + ": <" + i11 + ContainerUtils.KEY_VALUE_DELIMITER + z11 + "> :" + ay.a(com.xiaomi.push.s.m6183a(), str, str2, f46371a.get(i11), z11));
    }

    private static boolean a(int i11, int i12) {
        return i11 >= 4 || (i12 & 2) > 0 || (i12 & 1) > 0 || (i12 & 8) > 0 || (i12 & 16) > 0;
    }

    private static boolean a(String str, String str2, int i11) {
        boolean z11 = ay.a(com.xiaomi.push.s.m6183a(), str, str2, f46371a.get(i11)) == 1;
        com.xiaomi.channel.commonutils.logger.b.m5639a("ChannelPermissions.checkPermission:" + str + ":" + str2 + ": <" + i11 + ContainerUtils.KEY_VALUE_DELIMITER + z11 + ">");
        return z11;
    }
}
