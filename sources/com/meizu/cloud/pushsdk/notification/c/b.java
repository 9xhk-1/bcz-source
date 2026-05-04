package com.meizu.cloud.pushsdk.notification.c;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.media.RingtoneManager;
import android.net.Uri;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static Field f39904a;

    /* renamed from: b, reason: collision with root package name */
    private static Field f39905b;

    /* renamed from: c, reason: collision with root package name */
    private static Field f39906c;

    /* renamed from: d, reason: collision with root package name */
    private static final Object f39907d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static final Map<String, Set<String>> f39908e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private static Map<String, Uri> f39909f;

    static {
        try {
            f39904a = Notification.class.getDeclaredField("mFlymeNotification");
            Field declaredField = Class.forName("android.app.NotificationExt").getDeclaredField("internalApp");
            f39905b = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = Notification.class.getDeclaredField("replyIntent");
            f39906c = declaredField2;
            declaredField2.setAccessible(true);
        } catch (ClassNotFoundException e11) {
            e11.printStackTrace();
        } catch (NoSuchFieldException e12) {
            DebugLogger.e("NotificationUtils", "init NotificationUtils error " + e12.getMessage());
        }
    }

    public static void a(Notification notification, PendingIntent pendingIntent) {
        Field field = f39906c;
        if (field != null) {
            try {
                field.set(notification, pendingIntent);
            } catch (IllegalAccessException e11) {
                DebugLogger.e("NotificationUtils", "setReplyIntent error " + e11.getMessage());
            }
        }
    }

    public static Uri b(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str) || RingtoneManager.getActualDefaultRingtoneUri(context, 2) == null) {
            return null;
        }
        if (f39909f == null) {
            b(context);
        }
        Map<String, Uri> map = f39909f;
        if (map != null && map.size() != 0) {
            return f39909f.get(str.toLowerCase());
        }
        return null;
    }

    public static void c(Context context, String str, int i11) {
        Set<String> set = f39908e.get(str);
        if (set != null) {
            set.remove(String.valueOf(i11));
            DebugLogger.i("NotificationUtils", "remove notifyId " + i11);
        }
    }

    public static void a(Notification notification, boolean z11) {
        Field field = f39904a;
        if (field == null || f39905b == null) {
            return;
        }
        try {
            f39905b.set(field.get(notification), Integer.valueOf(z11 ? 1 : 0));
        } catch (IllegalAccessException e11) {
            DebugLogger.e("NotificationUtils", "setInternalApp error " + e11.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:
    
        if (0 == 0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static synchronized void b(android.content.Context r6) {
        /*
            java.lang.Class<com.meizu.cloud.pushsdk.notification.c.b> r0 = com.meizu.cloud.pushsdk.notification.c.b.class
            monitor-enter(r0)
            java.util.Map<java.lang.String, android.net.Uri> r1 = com.meizu.cloud.pushsdk.notification.c.b.f39909f     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L9
            monitor-exit(r0)
            return
        L9:
            r1 = 0
            android.media.RingtoneManager r2 = new android.media.RingtoneManager     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            r6 = 2
            r2.setType(r6)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            android.database.Cursor r1 = r2.getCursor()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            if (r1 != 0) goto L24
            if (r1 == 0) goto L22
            r1.close()     // Catch: java.lang.Throwable -> L1f
            goto L22
        L1f:
            r6 = move-exception
            goto L8f
        L22:
            monitor-exit(r0)
            return
        L24:
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            int r3 = r1.getCount()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            com.meizu.cloud.pushsdk.notification.c.b.f39909f = r2     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
        L33:
            if (r2 == 0) goto L66
            r2 = 1
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            java.lang.String r3 = r1.getString(r6)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            r4 = 0
            long r4 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            android.net.Uri r3 = android.content.ContentUris.withAppendedId(r3, r4)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            if (r4 != 0) goto L61
            if (r3 == 0) goto L61
            java.util.Map<java.lang.String, android.net.Uri> r4 = com.meizu.cloud.pushsdk.notification.c.b.f39909f     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            java.lang.String r2 = r2.toLowerCase()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            r4.put(r2, r3)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            goto L61
        L5d:
            r6 = move-exception
            goto L89
        L5f:
            r6 = move-exception
            goto L6a
        L61:
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            goto L33
        L66:
            r1.close()     // Catch: java.lang.Throwable -> L1f
            goto L87
        L6a:
            java.lang.String r2 = "NotificationUtils"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r3.<init>()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r4 = "get ringtone info error, "
            r3.append(r4)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L5d
            r3.append(r6)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L5d
            com.meizu.cloud.pushinternal.DebugLogger.e(r2, r6)     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L87
            goto L66
        L87:
            monitor-exit(r0)
            return
        L89:
            if (r1 == 0) goto L8e
            r1.close()     // Catch: java.lang.Throwable -> L1f
        L8e:
            throw r6     // Catch: java.lang.Throwable -> L1f
        L8f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.notification.c.b.b(android.content.Context):void");
    }

    public static void a(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.cancelAll();
        }
    }

    public static void b(Context context, String str, int i11) {
        Map<String, Set<String>> map = f39908e;
        Set<String> set = map.get(str);
        DebugLogger.i("NotificationUtils", "store notifyId " + i11);
        if (set != null) {
            set.add(String.valueOf(i11));
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(String.valueOf(i11));
        map.put(str, hashSet);
    }

    public static void a(Context context, String str) {
        Set<String> set;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager == null || TextUtils.isEmpty(str) || (set = f39908e.get(str)) == null) {
            return;
        }
        for (String str2 : set) {
            DebugLogger.i("NotificationUtils", "clear notifyId " + str2 + " notification");
            notificationManager.cancel(Integer.parseInt(str2));
        }
        set.clear();
    }

    public static void a(Context context, String str, int i11) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            DebugLogger.i("NotificationUtils", "clear clearNotification notifyId " + i11);
            notificationManager.cancel(i11);
            Set<String> set = f39908e.get(str);
            if (set != null) {
                set.remove(String.valueOf(i11));
            }
        }
    }

    public static boolean a(Context context, String str, String str2) {
        synchronized (f39907d) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    return false;
                }
                int i11 = com.meizu.cloud.pushsdk.util.b.i(context, str, str2);
                DebugLogger.e("NotificationUtils", "removeNotifyKey " + str2 + " notifyId " + i11);
                c(context, str, i11);
                return com.meizu.cloud.pushsdk.util.b.j(context, str, str2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
