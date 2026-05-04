package com.huawei.hms.push;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.api.push.TransActivity;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResourceLoaderUtil;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public static int f36216a;

    public static synchronized void a(Context context, k kVar) {
        int hashCode;
        int hashCode2;
        int i11;
        int i12;
        synchronized (o.class) {
            if (context != null) {
                try {
                    if (!a(kVar)) {
                        HMSLog.d("PushSelfShowLog", "showNotification, the msg id = " + kVar.p());
                        if (f36216a == 0) {
                            f36216a = (context.getPackageName() + System.currentTimeMillis()).hashCode();
                        }
                        if (TextUtils.isEmpty(kVar.l())) {
                            String q11 = kVar.q();
                            if (!TextUtils.isEmpty(q11)) {
                                int hashCode3 = q11.hashCode();
                                kVar.a(hashCode3);
                                HMSLog.d("PushSelfShowLog", "notification msgTag = " + hashCode3);
                            }
                            if (kVar.s() != -1) {
                                hashCode = kVar.s();
                                i12 = (kVar.k() + System.currentTimeMillis()).hashCode();
                                i11 = i12 + 1;
                                hashCode2 = (kVar.s() + kVar.k() + context.getPackageName()).hashCode();
                            } else {
                                int i13 = f36216a;
                                int i14 = i13 + 1;
                                int i15 = i13 + 2;
                                int i16 = i13 + 3;
                                int i17 = i13 + 4;
                                f36216a = i17;
                                hashCode2 = i17;
                                hashCode = i14;
                                i12 = i15;
                                i11 = i16;
                            }
                        } else {
                            hashCode = (kVar.l() + kVar.k()).hashCode();
                            int i18 = f36216a;
                            int i19 = i18 + 1;
                            int i21 = i18 + 2;
                            f36216a = i21;
                            hashCode2 = (kVar.l() + kVar.k() + context.getPackageName()).hashCode();
                            i11 = i21;
                            i12 = i19;
                        }
                        HMSLog.d("PushSelfShowLog", "notifyId:" + hashCode + ",openNotifyId:" + i12 + ",delNotifyId:" + i11 + ",alarmNotifyId:" + hashCode2);
                        if (kVar.f() <= 0) {
                            hashCode2 = 0;
                        }
                        int[] iArr = {hashCode, i12, i11, hashCode2};
                        Notification a11 = q.e() ? a(context, kVar, iArr) : null;
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                        if (notificationManager != null && a11 != null) {
                            if (Build.VERSION.SDK_INT >= 26) {
                                String string = context.getString(ResourceLoaderUtil.getStringId("hms_push_channel"));
                                androidx.media3.common.util.o.a();
                                notificationManager.createNotificationChannel(androidx.media3.common.util.n.a("HwPushChannelID", string, 3));
                            }
                            notificationManager.notify(hashCode, a11);
                            d(context, kVar, iArr);
                            e.a(context, kVar.p(), kVar.b(), "100");
                        }
                    }
                } finally {
                }
            }
        }
    }

    public static PendingIntent b(Context context, k kVar, int[] iArr) {
        Intent a11 = a(context, kVar, iArr, "2", 268435456);
        if (!a()) {
            return PendingIntent.getBroadcast(context, iArr[2], a11, q.b());
        }
        a11.setClass(context, TransActivity.class);
        a11.setFlags(268468224);
        return PendingIntent.getActivity(context, iArr[2], a11, q.b());
    }

    public static PendingIntent c(Context context, k kVar, int[] iArr) {
        Intent a11 = a(context, kVar, iArr, "1", 268435456);
        if (!a()) {
            return PendingIntent.getBroadcast(context, iArr[1], a11, q.b());
        }
        a11.setClass(context, TransActivity.class);
        a11.setFlags(268468224);
        return PendingIntent.getActivity(context, iArr[1], a11, q.b());
    }

    public static void d(Context context, k kVar, int[] iArr) {
        HMSLog.i("PushSelfShowLog", "setAutoClear time is: " + kVar.f());
        if (kVar.f() <= 0) {
            return;
        }
        a(context, a(context, kVar, iArr, "-1", 32), kVar.f(), iArr[3]);
    }

    public static void d(k kVar, Notification.Builder builder) {
        String u11 = kVar.u();
        String j11 = kVar.j();
        if (TextUtils.isEmpty(j11)) {
            builder.setContentText(u11);
            return;
        }
        builder.setContentText(j11);
        if (TextUtils.isEmpty(u11)) {
            return;
        }
        builder.setContentTitle(u11);
    }

    public static void c(k kVar, Notification.Builder builder) {
        builder.setTicker(kVar.x());
    }

    @SuppressLint({"NewApi"})
    public static void b(Context context, Notification.Builder builder, k kVar) {
        if ("com.huawei.android.pushagent".equals(context.getPackageName())) {
            Bundle bundle = new Bundle();
            String k11 = kVar.k();
            if (TextUtils.isEmpty(k11)) {
                return;
            }
            bundle.putString("hw_origin_sender_package_name", k11);
            builder.setExtras(bundle);
        }
    }

    public static void b(k kVar, Notification.Builder builder) {
        String t11 = kVar.t();
        if (TextUtils.isEmpty(t11)) {
            return;
        }
        builder.setSubText(t11);
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static Intent a(Context context, k kVar, int[] iArr, String str, int i11) {
        Intent intent = new Intent("com.huawei.intent.action.PUSH_DELAY_NOTIFY");
        intent.putExtra("selfshow_info", kVar.o()).putExtra("selfshow_token", kVar.y()).putExtra("selfshow_event_id", str).putExtra("selfshow_notify_id", iArr[0]).putExtra("selfshow_auto_clear_id", iArr[3]).setPackage(context.getPackageName()).setFlags(i11);
        return intent;
    }

    public static Notification a(Context context, k kVar, int[] iArr) {
        Notification.Builder builder = new Notification.Builder(context);
        if (m.a(kVar) == n.STYLE_BIGTEXT) {
            m.a(builder, kVar.g(), kVar);
        }
        l.a(context, builder, kVar);
        b(kVar, builder);
        d(kVar, builder);
        a(context, kVar, builder);
        a(builder);
        a(kVar, builder);
        c(kVar, builder);
        builder.setContentIntent(c(context, kVar, iArr));
        builder.setDeleteIntent(b(context, kVar, iArr));
        if (Build.VERSION.SDK_INT >= 26) {
            builder.setChannelId("HwPushChannelID");
        }
        b(context, builder, kVar);
        a(context, builder, kVar);
        return builder.build();
    }

    @SuppressLint({"NewApi"})
    public static void a(Context context, Notification.Builder builder, k kVar) {
        if (HwBuildEx.VERSION.EMUI_SDK_INT < 11 || !q.a(context)) {
            return;
        }
        Bundle bundle = new Bundle();
        String k11 = kVar.k();
        HMSLog.i("PushSelfShowLog", "the package name of notification is:" + k11);
        if (!TextUtils.isEmpty(k11)) {
            String a11 = q.a(context, k11);
            HMSLog.i("PushSelfShowLog", "the app name is:" + a11);
            if (a11 != null) {
                bundle.putCharSequence("android.extraAppName", a11);
            }
        }
        builder.setExtras(bundle);
    }

    public static void a(Context context, Intent intent, long j11, int i11) {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("enter setDelayAlarm(interval:");
            sb2.append(j11);
            sb2.append("ms.");
            HMSLog.d("PushSelfShowLog", sb2.toString());
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
            if (alarmManager != null) {
                alarmManager.set(0, System.currentTimeMillis() + j11, PendingIntent.getBroadcast(context, i11, intent, q.b()));
            }
        } catch (Exception e11) {
            HMSLog.w("PushSelfShowLog", "set DelayAlarm error." + e11.toString());
        }
    }

    public static void a(Context context, k kVar, Notification.Builder builder) {
        Bitmap a11 = l.a(context, kVar);
        if (a11 != null) {
            builder.setLargeIcon(a11);
        }
    }

    public static void a(Notification.Builder builder) {
        builder.setShowWhen(true);
        builder.setWhen(System.currentTimeMillis());
    }

    public static void a(k kVar, Notification.Builder builder) {
        builder.setAutoCancel(kVar.e() == 1);
        builder.setOngoing(false);
    }

    public static boolean a(k kVar) {
        if (kVar != null) {
            return TextUtils.isEmpty(kVar.u()) && TextUtils.isEmpty(kVar.j());
        }
        return true;
    }
}
