package com.igexin.push.core.a.c;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.igexin.assist.sdk.AssistPushConsts;
import com.igexin.push.extension.mod.BaseActionBean;
import com.igexin.push.extension.mod.PushMessageInterface;
import com.igexin.push.extension.mod.PushTaskBean;
import com.igexin.sdk.GetuiActivity;
import com.igexin.sdk.main.FeedbackImpl;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;

/* loaded from: classes7.dex */
public class h implements PushMessageInterface {

    /* renamed from: a, reason: collision with root package name */
    private static final String f37674a = com.igexin.push.core.b.f37734f + h.class.getName();

    /* renamed from: b, reason: collision with root package name */
    private static final int f37675b = 131;

    /* renamed from: c, reason: collision with root package name */
    private static final String f37676c = "push_small";

    /* renamed from: com.igexin.push.core.a.c.h$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ NotificationManager f37683a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f37684b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ PushTaskBean f37685c;

        public AnonymousClass2(NotificationManager notificationManager, int i11, PushTaskBean pushTaskBean) {
            this.f37683a = notificationManager;
            this.f37684b = i11;
            this.f37685c = pushTaskBean;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                StatusBarNotification[] activeNotifications = this.f37683a.getActiveNotifications();
                if (activeNotifications != null && activeNotifications.length > 0) {
                    for (StatusBarNotification statusBarNotification : activeNotifications) {
                        if (statusBarNotification.getId() == this.f37684b) {
                            return;
                        }
                    }
                }
                String unused = h.f37674a;
                FeedbackImpl.getInstance().feedbackMessageAction(this.f37685c, "10160", "show notification failed");
            } catch (Throwable th2) {
                com.igexin.c.a.c.a.a(th2);
            }
        }
    }

    public enum a {
        UNSET(0),
        BIG_IMAGE(1),
        LONG_TEXT(2),
        PURE_IMAGE(3);


        /* renamed from: e, reason: collision with root package name */
        int f37692e;

        a(int i11) {
            this.f37692e = i11;
        }

        private int a() {
            return this.f37692e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x012c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int a(com.igexin.push.core.b.l r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.core.a.c.h.a(com.igexin.push.core.b.l, boolean):int");
    }

    @TargetApi(26)
    private static Notification.Builder b(com.igexin.push.core.b.l lVar) {
        Notification.Builder builder = new Notification.Builder(com.igexin.push.core.e.f38035l);
        NotificationManager notificationManager = (NotificationManager) com.igexin.push.core.e.f38035l.getSystemService("notification");
        try {
            Class<?> cls = Class.forName("android.app.NotificationChannel");
            Constructor<?> constructor = cls.getConstructor(String.class, CharSequence.class, Integer.TYPE);
            Class<?> cls2 = notificationManager.getClass();
            if (((Parcelable) cls2.getMethod("getNotificationChannel", String.class).invoke(notificationManager, lVar.f37820j)) == null) {
                Parcelable parcelable = (Parcelable) constructor.newInstance(lVar.f37820j, lVar.f37821k, Integer.valueOf(lVar.f37822l));
                Method method = cls2.getMethod("createNotificationChannel", Class.forName("android.app.NotificationChannel"));
                Method method2 = cls.getMethod("enableVibration", Boolean.TYPE);
                Method method3 = cls.getMethod("setSound", Uri.class, AudioAttributes.class);
                method2.invoke(parcelable, Boolean.valueOf(lVar.f37813c));
                if (!lVar.f37814d) {
                    method3.invoke(parcelable, null, null);
                } else if (!TextUtils.isEmpty(lVar.f37826p)) {
                    method3.invoke(parcelable, c(lVar.f37826p), null);
                }
                method.invoke(notificationManager, parcelable);
            }
            builder.getClass().getMethod("setChannelId", String.class).invoke(builder, lVar.f37820j);
            return builder;
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return builder;
        }
    }

    private static Uri c(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return Uri.parse("android.resource://" + com.igexin.push.core.e.f38035l.getPackageName() + "/raw/" + str.toLowerCase());
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0279  */
    @Override // com.igexin.push.extension.mod.PushMessageInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean executeAction(com.igexin.push.extension.mod.PushTaskBean r22, com.igexin.push.extension.mod.BaseActionBean r23) {
        /*
            Method dump skipped, instructions count: 960
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.core.a.c.h.executeAction(com.igexin.push.extension.mod.PushTaskBean, com.igexin.push.extension.mod.BaseActionBean):boolean");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(66:5|6|7|(10:144|145|10|(1:12)|13|(1:15)|16|(1:18)|19|(48:27|28|(3:138|139|(0))|30|31|32|(1:36)|37|38|(7:42|43|(4:45|(1:47)|48|49)|50|(1:52)|(2:54|(2:56|48))|49)|57|58|(2:60|(1:65)(1:64))|66|(2:126|(2:133|(2:135|136))(1:132))(1:72)|73|(1:75)|76|(1:78)|79|(1:81)|82|(1:84)|85|(1:87)|88|(1:90)|91|(1:93)|94|(1:96)|97|(1:99)|100|(1:102)|103|(1:125)|106|(1:108)|109|(2:121|122)|111|(1:113)|114|(1:116)|117|(1:119)|120)(2:24|25))|9|10|(0)|13|(0)|16|(0)|19|(1:21)|27|28|(0)|30|31|32|(2:34|36)|37|38|(8:40|42|43|(0)|50|(0)|(0)|49)|57|58|(0)|66|(1:68)|126|(1:128)|133|(0)|73|(0)|76|(0)|79|(0)|82|(0)|85|(0)|88|(0)|91|(0)|94|(0)|97|(0)|100|(0)|103|(0)|125|106|(0)|109|(0)|111|(0)|114|(0)|117|(0)|120) */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0133, code lost:
    
        r15.f37834x = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x00b5, code lost:
    
        if (r0 > 0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x021f A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:6:0x0023, B:10:0x0051, B:12:0x0057, B:13:0x005d, B:15:0x0063, B:16:0x0069, B:18:0x006f, B:19:0x0075, B:21:0x007e, B:24:0x0088, B:27:0x00a6, B:31:0x00b8, B:34:0x00c2, B:36:0x00cc, B:37:0x00d2, B:40:0x00da, B:42:0x00e4, B:45:0x00f1, B:49:0x011b, B:50:0x00fa, B:52:0x0100, B:54:0x0106, B:68:0x0138, B:70:0x013e, B:72:0x0148, B:73:0x0185, B:75:0x018b, B:76:0x0194, B:78:0x019c, B:79:0x01a5, B:81:0x01ad, B:82:0x01b6, B:84:0x01be, B:85:0x01c7, B:87:0x01cf, B:88:0x01d7, B:90:0x01df, B:91:0x01e7, B:93:0x01ef, B:94:0x01f7, B:96:0x01ff, B:97:0x0207, B:99:0x020f, B:100:0x0217, B:102:0x021f, B:103:0x0228, B:106:0x0233, B:108:0x023b, B:109:0x0243, B:122:0x0249, B:111:0x0283, B:113:0x028b, B:114:0x0293, B:116:0x029b, B:117:0x02a3, B:119:0x02ab, B:124:0x0256, B:125:0x022f, B:128:0x0152, B:130:0x0158, B:132:0x0162, B:135:0x016c, B:137:0x0133, B:148:0x0049, B:145:0x0043, B:58:0x011d, B:60:0x0123, B:64:0x012d, B:65:0x0130), top: B:5:0x0023, inners: #0, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x023b A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:6:0x0023, B:10:0x0051, B:12:0x0057, B:13:0x005d, B:15:0x0063, B:16:0x0069, B:18:0x006f, B:19:0x0075, B:21:0x007e, B:24:0x0088, B:27:0x00a6, B:31:0x00b8, B:34:0x00c2, B:36:0x00cc, B:37:0x00d2, B:40:0x00da, B:42:0x00e4, B:45:0x00f1, B:49:0x011b, B:50:0x00fa, B:52:0x0100, B:54:0x0106, B:68:0x0138, B:70:0x013e, B:72:0x0148, B:73:0x0185, B:75:0x018b, B:76:0x0194, B:78:0x019c, B:79:0x01a5, B:81:0x01ad, B:82:0x01b6, B:84:0x01be, B:85:0x01c7, B:87:0x01cf, B:88:0x01d7, B:90:0x01df, B:91:0x01e7, B:93:0x01ef, B:94:0x01f7, B:96:0x01ff, B:97:0x0207, B:99:0x020f, B:100:0x0217, B:102:0x021f, B:103:0x0228, B:106:0x0233, B:108:0x023b, B:109:0x0243, B:122:0x0249, B:111:0x0283, B:113:0x028b, B:114:0x0293, B:116:0x029b, B:117:0x02a3, B:119:0x02ab, B:124:0x0256, B:125:0x022f, B:128:0x0152, B:130:0x0158, B:132:0x0162, B:135:0x016c, B:137:0x0133, B:148:0x0049, B:145:0x0043, B:58:0x011d, B:60:0x0123, B:64:0x012d, B:65:0x0130), top: B:5:0x0023, inners: #0, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x028b A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:6:0x0023, B:10:0x0051, B:12:0x0057, B:13:0x005d, B:15:0x0063, B:16:0x0069, B:18:0x006f, B:19:0x0075, B:21:0x007e, B:24:0x0088, B:27:0x00a6, B:31:0x00b8, B:34:0x00c2, B:36:0x00cc, B:37:0x00d2, B:40:0x00da, B:42:0x00e4, B:45:0x00f1, B:49:0x011b, B:50:0x00fa, B:52:0x0100, B:54:0x0106, B:68:0x0138, B:70:0x013e, B:72:0x0148, B:73:0x0185, B:75:0x018b, B:76:0x0194, B:78:0x019c, B:79:0x01a5, B:81:0x01ad, B:82:0x01b6, B:84:0x01be, B:85:0x01c7, B:87:0x01cf, B:88:0x01d7, B:90:0x01df, B:91:0x01e7, B:93:0x01ef, B:94:0x01f7, B:96:0x01ff, B:97:0x0207, B:99:0x020f, B:100:0x0217, B:102:0x021f, B:103:0x0228, B:106:0x0233, B:108:0x023b, B:109:0x0243, B:122:0x0249, B:111:0x0283, B:113:0x028b, B:114:0x0293, B:116:0x029b, B:117:0x02a3, B:119:0x02ab, B:124:0x0256, B:125:0x022f, B:128:0x0152, B:130:0x0158, B:132:0x0162, B:135:0x016c, B:137:0x0133, B:148:0x0049, B:145:0x0043, B:58:0x011d, B:60:0x0123, B:64:0x012d, B:65:0x0130), top: B:5:0x0023, inners: #0, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x029b A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:6:0x0023, B:10:0x0051, B:12:0x0057, B:13:0x005d, B:15:0x0063, B:16:0x0069, B:18:0x006f, B:19:0x0075, B:21:0x007e, B:24:0x0088, B:27:0x00a6, B:31:0x00b8, B:34:0x00c2, B:36:0x00cc, B:37:0x00d2, B:40:0x00da, B:42:0x00e4, B:45:0x00f1, B:49:0x011b, B:50:0x00fa, B:52:0x0100, B:54:0x0106, B:68:0x0138, B:70:0x013e, B:72:0x0148, B:73:0x0185, B:75:0x018b, B:76:0x0194, B:78:0x019c, B:79:0x01a5, B:81:0x01ad, B:82:0x01b6, B:84:0x01be, B:85:0x01c7, B:87:0x01cf, B:88:0x01d7, B:90:0x01df, B:91:0x01e7, B:93:0x01ef, B:94:0x01f7, B:96:0x01ff, B:97:0x0207, B:99:0x020f, B:100:0x0217, B:102:0x021f, B:103:0x0228, B:106:0x0233, B:108:0x023b, B:109:0x0243, B:122:0x0249, B:111:0x0283, B:113:0x028b, B:114:0x0293, B:116:0x029b, B:117:0x02a3, B:119:0x02ab, B:124:0x0256, B:125:0x022f, B:128:0x0152, B:130:0x0158, B:132:0x0162, B:135:0x016c, B:137:0x0133, B:148:0x0049, B:145:0x0043, B:58:0x011d, B:60:0x0123, B:64:0x012d, B:65:0x0130), top: B:5:0x0023, inners: #0, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ab A[Catch: Exception -> 0x004e, TRY_LEAVE, TryCatch #1 {Exception -> 0x004e, blocks: (B:6:0x0023, B:10:0x0051, B:12:0x0057, B:13:0x005d, B:15:0x0063, B:16:0x0069, B:18:0x006f, B:19:0x0075, B:21:0x007e, B:24:0x0088, B:27:0x00a6, B:31:0x00b8, B:34:0x00c2, B:36:0x00cc, B:37:0x00d2, B:40:0x00da, B:42:0x00e4, B:45:0x00f1, B:49:0x011b, B:50:0x00fa, B:52:0x0100, B:54:0x0106, B:68:0x0138, B:70:0x013e, B:72:0x0148, B:73:0x0185, B:75:0x018b, B:76:0x0194, B:78:0x019c, B:79:0x01a5, B:81:0x01ad, B:82:0x01b6, B:84:0x01be, B:85:0x01c7, B:87:0x01cf, B:88:0x01d7, B:90:0x01df, B:91:0x01e7, B:93:0x01ef, B:94:0x01f7, B:96:0x01ff, B:97:0x0207, B:99:0x020f, B:100:0x0217, B:102:0x021f, B:103:0x0228, B:106:0x0233, B:108:0x023b, B:109:0x0243, B:122:0x0249, B:111:0x0283, B:113:0x028b, B:114:0x0293, B:116:0x029b, B:117:0x02a3, B:119:0x02ab, B:124:0x0256, B:125:0x022f, B:128:0x0152, B:130:0x0158, B:132:0x0162, B:135:0x016c, B:137:0x0133, B:148:0x0049, B:145:0x0043, B:58:0x011d, B:60:0x0123, B:64:0x012d, B:65:0x0130), top: B:5:0x0023, inners: #0, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0249 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0057 A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:6:0x0023, B:10:0x0051, B:12:0x0057, B:13:0x005d, B:15:0x0063, B:16:0x0069, B:18:0x006f, B:19:0x0075, B:21:0x007e, B:24:0x0088, B:27:0x00a6, B:31:0x00b8, B:34:0x00c2, B:36:0x00cc, B:37:0x00d2, B:40:0x00da, B:42:0x00e4, B:45:0x00f1, B:49:0x011b, B:50:0x00fa, B:52:0x0100, B:54:0x0106, B:68:0x0138, B:70:0x013e, B:72:0x0148, B:73:0x0185, B:75:0x018b, B:76:0x0194, B:78:0x019c, B:79:0x01a5, B:81:0x01ad, B:82:0x01b6, B:84:0x01be, B:85:0x01c7, B:87:0x01cf, B:88:0x01d7, B:90:0x01df, B:91:0x01e7, B:93:0x01ef, B:94:0x01f7, B:96:0x01ff, B:97:0x0207, B:99:0x020f, B:100:0x0217, B:102:0x021f, B:103:0x0228, B:106:0x0233, B:108:0x023b, B:109:0x0243, B:122:0x0249, B:111:0x0283, B:113:0x028b, B:114:0x0293, B:116:0x029b, B:117:0x02a3, B:119:0x02ab, B:124:0x0256, B:125:0x022f, B:128:0x0152, B:130:0x0158, B:132:0x0162, B:135:0x016c, B:137:0x0133, B:148:0x0049, B:145:0x0043, B:58:0x011d, B:60:0x0123, B:64:0x012d, B:65:0x0130), top: B:5:0x0023, inners: #0, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x016c A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:6:0x0023, B:10:0x0051, B:12:0x0057, B:13:0x005d, B:15:0x0063, B:16:0x0069, B:18:0x006f, B:19:0x0075, B:21:0x007e, B:24:0x0088, B:27:0x00a6, B:31:0x00b8, B:34:0x00c2, B:36:0x00cc, B:37:0x00d2, B:40:0x00da, B:42:0x00e4, B:45:0x00f1, B:49:0x011b, B:50:0x00fa, B:52:0x0100, B:54:0x0106, B:68:0x0138, B:70:0x013e, B:72:0x0148, B:73:0x0185, B:75:0x018b, B:76:0x0194, B:78:0x019c, B:79:0x01a5, B:81:0x01ad, B:82:0x01b6, B:84:0x01be, B:85:0x01c7, B:87:0x01cf, B:88:0x01d7, B:90:0x01df, B:91:0x01e7, B:93:0x01ef, B:94:0x01f7, B:96:0x01ff, B:97:0x0207, B:99:0x020f, B:100:0x0217, B:102:0x021f, B:103:0x0228, B:106:0x0233, B:108:0x023b, B:109:0x0243, B:122:0x0249, B:111:0x0283, B:113:0x028b, B:114:0x0293, B:116:0x029b, B:117:0x02a3, B:119:0x02ab, B:124:0x0256, B:125:0x022f, B:128:0x0152, B:130:0x0158, B:132:0x0162, B:135:0x016c, B:137:0x0133, B:148:0x0049, B:145:0x0043, B:58:0x011d, B:60:0x0123, B:64:0x012d, B:65:0x0130), top: B:5:0x0023, inners: #0, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063 A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:6:0x0023, B:10:0x0051, B:12:0x0057, B:13:0x005d, B:15:0x0063, B:16:0x0069, B:18:0x006f, B:19:0x0075, B:21:0x007e, B:24:0x0088, B:27:0x00a6, B:31:0x00b8, B:34:0x00c2, B:36:0x00cc, B:37:0x00d2, B:40:0x00da, B:42:0x00e4, B:45:0x00f1, B:49:0x011b, B:50:0x00fa, B:52:0x0100, B:54:0x0106, B:68:0x0138, B:70:0x013e, B:72:0x0148, B:73:0x0185, B:75:0x018b, B:76:0x0194, B:78:0x019c, B:79:0x01a5, B:81:0x01ad, B:82:0x01b6, B:84:0x01be, B:85:0x01c7, B:87:0x01cf, B:88:0x01d7, B:90:0x01df, B:91:0x01e7, B:93:0x01ef, B:94:0x01f7, B:96:0x01ff, B:97:0x0207, B:99:0x020f, B:100:0x0217, B:102:0x021f, B:103:0x0228, B:106:0x0233, B:108:0x023b, B:109:0x0243, B:122:0x0249, B:111:0x0283, B:113:0x028b, B:114:0x0293, B:116:0x029b, B:117:0x02a3, B:119:0x02ab, B:124:0x0256, B:125:0x022f, B:128:0x0152, B:130:0x0158, B:132:0x0162, B:135:0x016c, B:137:0x0133, B:148:0x0049, B:145:0x0043, B:58:0x011d, B:60:0x0123, B:64:0x012d, B:65:0x0130), top: B:5:0x0023, inners: #0, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:6:0x0023, B:10:0x0051, B:12:0x0057, B:13:0x005d, B:15:0x0063, B:16:0x0069, B:18:0x006f, B:19:0x0075, B:21:0x007e, B:24:0x0088, B:27:0x00a6, B:31:0x00b8, B:34:0x00c2, B:36:0x00cc, B:37:0x00d2, B:40:0x00da, B:42:0x00e4, B:45:0x00f1, B:49:0x011b, B:50:0x00fa, B:52:0x0100, B:54:0x0106, B:68:0x0138, B:70:0x013e, B:72:0x0148, B:73:0x0185, B:75:0x018b, B:76:0x0194, B:78:0x019c, B:79:0x01a5, B:81:0x01ad, B:82:0x01b6, B:84:0x01be, B:85:0x01c7, B:87:0x01cf, B:88:0x01d7, B:90:0x01df, B:91:0x01e7, B:93:0x01ef, B:94:0x01f7, B:96:0x01ff, B:97:0x0207, B:99:0x020f, B:100:0x0217, B:102:0x021f, B:103:0x0228, B:106:0x0233, B:108:0x023b, B:109:0x0243, B:122:0x0249, B:111:0x0283, B:113:0x028b, B:114:0x0293, B:116:0x029b, B:117:0x02a3, B:119:0x02ab, B:124:0x0256, B:125:0x022f, B:128:0x0152, B:130:0x0158, B:132:0x0162, B:135:0x016c, B:137:0x0133, B:148:0x0049, B:145:0x0043, B:58:0x011d, B:60:0x0123, B:64:0x012d, B:65:0x0130), top: B:5:0x0023, inners: #0, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f1 A[Catch: Exception -> 0x004e, TRY_ENTER, TryCatch #1 {Exception -> 0x004e, blocks: (B:6:0x0023, B:10:0x0051, B:12:0x0057, B:13:0x005d, B:15:0x0063, B:16:0x0069, B:18:0x006f, B:19:0x0075, B:21:0x007e, B:24:0x0088, B:27:0x00a6, B:31:0x00b8, B:34:0x00c2, B:36:0x00cc, B:37:0x00d2, B:40:0x00da, B:42:0x00e4, B:45:0x00f1, B:49:0x011b, B:50:0x00fa, B:52:0x0100, B:54:0x0106, B:68:0x0138, B:70:0x013e, B:72:0x0148, B:73:0x0185, B:75:0x018b, B:76:0x0194, B:78:0x019c, B:79:0x01a5, B:81:0x01ad, B:82:0x01b6, B:84:0x01be, B:85:0x01c7, B:87:0x01cf, B:88:0x01d7, B:90:0x01df, B:91:0x01e7, B:93:0x01ef, B:94:0x01f7, B:96:0x01ff, B:97:0x0207, B:99:0x020f, B:100:0x0217, B:102:0x021f, B:103:0x0228, B:106:0x0233, B:108:0x023b, B:109:0x0243, B:122:0x0249, B:111:0x0283, B:113:0x028b, B:114:0x0293, B:116:0x029b, B:117:0x02a3, B:119:0x02ab, B:124:0x0256, B:125:0x022f, B:128:0x0152, B:130:0x0158, B:132:0x0162, B:135:0x016c, B:137:0x0133, B:148:0x0049, B:145:0x0043, B:58:0x011d, B:60:0x0123, B:64:0x012d, B:65:0x0130), top: B:5:0x0023, inners: #0, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100 A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:6:0x0023, B:10:0x0051, B:12:0x0057, B:13:0x005d, B:15:0x0063, B:16:0x0069, B:18:0x006f, B:19:0x0075, B:21:0x007e, B:24:0x0088, B:27:0x00a6, B:31:0x00b8, B:34:0x00c2, B:36:0x00cc, B:37:0x00d2, B:40:0x00da, B:42:0x00e4, B:45:0x00f1, B:49:0x011b, B:50:0x00fa, B:52:0x0100, B:54:0x0106, B:68:0x0138, B:70:0x013e, B:72:0x0148, B:73:0x0185, B:75:0x018b, B:76:0x0194, B:78:0x019c, B:79:0x01a5, B:81:0x01ad, B:82:0x01b6, B:84:0x01be, B:85:0x01c7, B:87:0x01cf, B:88:0x01d7, B:90:0x01df, B:91:0x01e7, B:93:0x01ef, B:94:0x01f7, B:96:0x01ff, B:97:0x0207, B:99:0x020f, B:100:0x0217, B:102:0x021f, B:103:0x0228, B:106:0x0233, B:108:0x023b, B:109:0x0243, B:122:0x0249, B:111:0x0283, B:113:0x028b, B:114:0x0293, B:116:0x029b, B:117:0x02a3, B:119:0x02ab, B:124:0x0256, B:125:0x022f, B:128:0x0152, B:130:0x0158, B:132:0x0162, B:135:0x016c, B:137:0x0133, B:148:0x0049, B:145:0x0043, B:58:0x011d, B:60:0x0123, B:64:0x012d, B:65:0x0130), top: B:5:0x0023, inners: #0, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0106 A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:6:0x0023, B:10:0x0051, B:12:0x0057, B:13:0x005d, B:15:0x0063, B:16:0x0069, B:18:0x006f, B:19:0x0075, B:21:0x007e, B:24:0x0088, B:27:0x00a6, B:31:0x00b8, B:34:0x00c2, B:36:0x00cc, B:37:0x00d2, B:40:0x00da, B:42:0x00e4, B:45:0x00f1, B:49:0x011b, B:50:0x00fa, B:52:0x0100, B:54:0x0106, B:68:0x0138, B:70:0x013e, B:72:0x0148, B:73:0x0185, B:75:0x018b, B:76:0x0194, B:78:0x019c, B:79:0x01a5, B:81:0x01ad, B:82:0x01b6, B:84:0x01be, B:85:0x01c7, B:87:0x01cf, B:88:0x01d7, B:90:0x01df, B:91:0x01e7, B:93:0x01ef, B:94:0x01f7, B:96:0x01ff, B:97:0x0207, B:99:0x020f, B:100:0x0217, B:102:0x021f, B:103:0x0228, B:106:0x0233, B:108:0x023b, B:109:0x0243, B:122:0x0249, B:111:0x0283, B:113:0x028b, B:114:0x0293, B:116:0x029b, B:117:0x02a3, B:119:0x02ab, B:124:0x0256, B:125:0x022f, B:128:0x0152, B:130:0x0158, B:132:0x0162, B:135:0x016c, B:137:0x0133, B:148:0x0049, B:145:0x0043, B:58:0x011d, B:60:0x0123, B:64:0x012d, B:65:0x0130), top: B:5:0x0023, inners: #0, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0123 A[Catch: Exception -> 0x0133, TryCatch #4 {Exception -> 0x0133, blocks: (B:58:0x011d, B:60:0x0123, B:64:0x012d, B:65:0x0130), top: B:57:0x011d, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018b A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:6:0x0023, B:10:0x0051, B:12:0x0057, B:13:0x005d, B:15:0x0063, B:16:0x0069, B:18:0x006f, B:19:0x0075, B:21:0x007e, B:24:0x0088, B:27:0x00a6, B:31:0x00b8, B:34:0x00c2, B:36:0x00cc, B:37:0x00d2, B:40:0x00da, B:42:0x00e4, B:45:0x00f1, B:49:0x011b, B:50:0x00fa, B:52:0x0100, B:54:0x0106, B:68:0x0138, B:70:0x013e, B:72:0x0148, B:73:0x0185, B:75:0x018b, B:76:0x0194, B:78:0x019c, B:79:0x01a5, B:81:0x01ad, B:82:0x01b6, B:84:0x01be, B:85:0x01c7, B:87:0x01cf, B:88:0x01d7, B:90:0x01df, B:91:0x01e7, B:93:0x01ef, B:94:0x01f7, B:96:0x01ff, B:97:0x0207, B:99:0x020f, B:100:0x0217, B:102:0x021f, B:103:0x0228, B:106:0x0233, B:108:0x023b, B:109:0x0243, B:122:0x0249, B:111:0x0283, B:113:0x028b, B:114:0x0293, B:116:0x029b, B:117:0x02a3, B:119:0x02ab, B:124:0x0256, B:125:0x022f, B:128:0x0152, B:130:0x0158, B:132:0x0162, B:135:0x016c, B:137:0x0133, B:148:0x0049, B:145:0x0043, B:58:0x011d, B:60:0x0123, B:64:0x012d, B:65:0x0130), top: B:5:0x0023, inners: #0, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019c A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:6:0x0023, B:10:0x0051, B:12:0x0057, B:13:0x005d, B:15:0x0063, B:16:0x0069, B:18:0x006f, B:19:0x0075, B:21:0x007e, B:24:0x0088, B:27:0x00a6, B:31:0x00b8, B:34:0x00c2, B:36:0x00cc, B:37:0x00d2, B:40:0x00da, B:42:0x00e4, B:45:0x00f1, B:49:0x011b, B:50:0x00fa, B:52:0x0100, B:54:0x0106, B:68:0x0138, B:70:0x013e, B:72:0x0148, B:73:0x0185, B:75:0x018b, B:76:0x0194, B:78:0x019c, B:79:0x01a5, B:81:0x01ad, B:82:0x01b6, B:84:0x01be, B:85:0x01c7, B:87:0x01cf, B:88:0x01d7, B:90:0x01df, B:91:0x01e7, B:93:0x01ef, B:94:0x01f7, B:96:0x01ff, B:97:0x0207, B:99:0x020f, B:100:0x0217, B:102:0x021f, B:103:0x0228, B:106:0x0233, B:108:0x023b, B:109:0x0243, B:122:0x0249, B:111:0x0283, B:113:0x028b, B:114:0x0293, B:116:0x029b, B:117:0x02a3, B:119:0x02ab, B:124:0x0256, B:125:0x022f, B:128:0x0152, B:130:0x0158, B:132:0x0162, B:135:0x016c, B:137:0x0133, B:148:0x0049, B:145:0x0043, B:58:0x011d, B:60:0x0123, B:64:0x012d, B:65:0x0130), top: B:5:0x0023, inners: #0, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ad A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:6:0x0023, B:10:0x0051, B:12:0x0057, B:13:0x005d, B:15:0x0063, B:16:0x0069, B:18:0x006f, B:19:0x0075, B:21:0x007e, B:24:0x0088, B:27:0x00a6, B:31:0x00b8, B:34:0x00c2, B:36:0x00cc, B:37:0x00d2, B:40:0x00da, B:42:0x00e4, B:45:0x00f1, B:49:0x011b, B:50:0x00fa, B:52:0x0100, B:54:0x0106, B:68:0x0138, B:70:0x013e, B:72:0x0148, B:73:0x0185, B:75:0x018b, B:76:0x0194, B:78:0x019c, B:79:0x01a5, B:81:0x01ad, B:82:0x01b6, B:84:0x01be, B:85:0x01c7, B:87:0x01cf, B:88:0x01d7, B:90:0x01df, B:91:0x01e7, B:93:0x01ef, B:94:0x01f7, B:96:0x01ff, B:97:0x0207, B:99:0x020f, B:100:0x0217, B:102:0x021f, B:103:0x0228, B:106:0x0233, B:108:0x023b, B:109:0x0243, B:122:0x0249, B:111:0x0283, B:113:0x028b, B:114:0x0293, B:116:0x029b, B:117:0x02a3, B:119:0x02ab, B:124:0x0256, B:125:0x022f, B:128:0x0152, B:130:0x0158, B:132:0x0162, B:135:0x016c, B:137:0x0133, B:148:0x0049, B:145:0x0043, B:58:0x011d, B:60:0x0123, B:64:0x012d, B:65:0x0130), top: B:5:0x0023, inners: #0, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01be A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:6:0x0023, B:10:0x0051, B:12:0x0057, B:13:0x005d, B:15:0x0063, B:16:0x0069, B:18:0x006f, B:19:0x0075, B:21:0x007e, B:24:0x0088, B:27:0x00a6, B:31:0x00b8, B:34:0x00c2, B:36:0x00cc, B:37:0x00d2, B:40:0x00da, B:42:0x00e4, B:45:0x00f1, B:49:0x011b, B:50:0x00fa, B:52:0x0100, B:54:0x0106, B:68:0x0138, B:70:0x013e, B:72:0x0148, B:73:0x0185, B:75:0x018b, B:76:0x0194, B:78:0x019c, B:79:0x01a5, B:81:0x01ad, B:82:0x01b6, B:84:0x01be, B:85:0x01c7, B:87:0x01cf, B:88:0x01d7, B:90:0x01df, B:91:0x01e7, B:93:0x01ef, B:94:0x01f7, B:96:0x01ff, B:97:0x0207, B:99:0x020f, B:100:0x0217, B:102:0x021f, B:103:0x0228, B:106:0x0233, B:108:0x023b, B:109:0x0243, B:122:0x0249, B:111:0x0283, B:113:0x028b, B:114:0x0293, B:116:0x029b, B:117:0x02a3, B:119:0x02ab, B:124:0x0256, B:125:0x022f, B:128:0x0152, B:130:0x0158, B:132:0x0162, B:135:0x016c, B:137:0x0133, B:148:0x0049, B:145:0x0043, B:58:0x011d, B:60:0x0123, B:64:0x012d, B:65:0x0130), top: B:5:0x0023, inners: #0, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cf A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:6:0x0023, B:10:0x0051, B:12:0x0057, B:13:0x005d, B:15:0x0063, B:16:0x0069, B:18:0x006f, B:19:0x0075, B:21:0x007e, B:24:0x0088, B:27:0x00a6, B:31:0x00b8, B:34:0x00c2, B:36:0x00cc, B:37:0x00d2, B:40:0x00da, B:42:0x00e4, B:45:0x00f1, B:49:0x011b, B:50:0x00fa, B:52:0x0100, B:54:0x0106, B:68:0x0138, B:70:0x013e, B:72:0x0148, B:73:0x0185, B:75:0x018b, B:76:0x0194, B:78:0x019c, B:79:0x01a5, B:81:0x01ad, B:82:0x01b6, B:84:0x01be, B:85:0x01c7, B:87:0x01cf, B:88:0x01d7, B:90:0x01df, B:91:0x01e7, B:93:0x01ef, B:94:0x01f7, B:96:0x01ff, B:97:0x0207, B:99:0x020f, B:100:0x0217, B:102:0x021f, B:103:0x0228, B:106:0x0233, B:108:0x023b, B:109:0x0243, B:122:0x0249, B:111:0x0283, B:113:0x028b, B:114:0x0293, B:116:0x029b, B:117:0x02a3, B:119:0x02ab, B:124:0x0256, B:125:0x022f, B:128:0x0152, B:130:0x0158, B:132:0x0162, B:135:0x016c, B:137:0x0133, B:148:0x0049, B:145:0x0043, B:58:0x011d, B:60:0x0123, B:64:0x012d, B:65:0x0130), top: B:5:0x0023, inners: #0, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01df A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:6:0x0023, B:10:0x0051, B:12:0x0057, B:13:0x005d, B:15:0x0063, B:16:0x0069, B:18:0x006f, B:19:0x0075, B:21:0x007e, B:24:0x0088, B:27:0x00a6, B:31:0x00b8, B:34:0x00c2, B:36:0x00cc, B:37:0x00d2, B:40:0x00da, B:42:0x00e4, B:45:0x00f1, B:49:0x011b, B:50:0x00fa, B:52:0x0100, B:54:0x0106, B:68:0x0138, B:70:0x013e, B:72:0x0148, B:73:0x0185, B:75:0x018b, B:76:0x0194, B:78:0x019c, B:79:0x01a5, B:81:0x01ad, B:82:0x01b6, B:84:0x01be, B:85:0x01c7, B:87:0x01cf, B:88:0x01d7, B:90:0x01df, B:91:0x01e7, B:93:0x01ef, B:94:0x01f7, B:96:0x01ff, B:97:0x0207, B:99:0x020f, B:100:0x0217, B:102:0x021f, B:103:0x0228, B:106:0x0233, B:108:0x023b, B:109:0x0243, B:122:0x0249, B:111:0x0283, B:113:0x028b, B:114:0x0293, B:116:0x029b, B:117:0x02a3, B:119:0x02ab, B:124:0x0256, B:125:0x022f, B:128:0x0152, B:130:0x0158, B:132:0x0162, B:135:0x016c, B:137:0x0133, B:148:0x0049, B:145:0x0043, B:58:0x011d, B:60:0x0123, B:64:0x012d, B:65:0x0130), top: B:5:0x0023, inners: #0, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ef A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:6:0x0023, B:10:0x0051, B:12:0x0057, B:13:0x005d, B:15:0x0063, B:16:0x0069, B:18:0x006f, B:19:0x0075, B:21:0x007e, B:24:0x0088, B:27:0x00a6, B:31:0x00b8, B:34:0x00c2, B:36:0x00cc, B:37:0x00d2, B:40:0x00da, B:42:0x00e4, B:45:0x00f1, B:49:0x011b, B:50:0x00fa, B:52:0x0100, B:54:0x0106, B:68:0x0138, B:70:0x013e, B:72:0x0148, B:73:0x0185, B:75:0x018b, B:76:0x0194, B:78:0x019c, B:79:0x01a5, B:81:0x01ad, B:82:0x01b6, B:84:0x01be, B:85:0x01c7, B:87:0x01cf, B:88:0x01d7, B:90:0x01df, B:91:0x01e7, B:93:0x01ef, B:94:0x01f7, B:96:0x01ff, B:97:0x0207, B:99:0x020f, B:100:0x0217, B:102:0x021f, B:103:0x0228, B:106:0x0233, B:108:0x023b, B:109:0x0243, B:122:0x0249, B:111:0x0283, B:113:0x028b, B:114:0x0293, B:116:0x029b, B:117:0x02a3, B:119:0x02ab, B:124:0x0256, B:125:0x022f, B:128:0x0152, B:130:0x0158, B:132:0x0162, B:135:0x016c, B:137:0x0133, B:148:0x0049, B:145:0x0043, B:58:0x011d, B:60:0x0123, B:64:0x012d, B:65:0x0130), top: B:5:0x0023, inners: #0, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ff A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:6:0x0023, B:10:0x0051, B:12:0x0057, B:13:0x005d, B:15:0x0063, B:16:0x0069, B:18:0x006f, B:19:0x0075, B:21:0x007e, B:24:0x0088, B:27:0x00a6, B:31:0x00b8, B:34:0x00c2, B:36:0x00cc, B:37:0x00d2, B:40:0x00da, B:42:0x00e4, B:45:0x00f1, B:49:0x011b, B:50:0x00fa, B:52:0x0100, B:54:0x0106, B:68:0x0138, B:70:0x013e, B:72:0x0148, B:73:0x0185, B:75:0x018b, B:76:0x0194, B:78:0x019c, B:79:0x01a5, B:81:0x01ad, B:82:0x01b6, B:84:0x01be, B:85:0x01c7, B:87:0x01cf, B:88:0x01d7, B:90:0x01df, B:91:0x01e7, B:93:0x01ef, B:94:0x01f7, B:96:0x01ff, B:97:0x0207, B:99:0x020f, B:100:0x0217, B:102:0x021f, B:103:0x0228, B:106:0x0233, B:108:0x023b, B:109:0x0243, B:122:0x0249, B:111:0x0283, B:113:0x028b, B:114:0x0293, B:116:0x029b, B:117:0x02a3, B:119:0x02ab, B:124:0x0256, B:125:0x022f, B:128:0x0152, B:130:0x0158, B:132:0x0162, B:135:0x016c, B:137:0x0133, B:148:0x0049, B:145:0x0043, B:58:0x011d, B:60:0x0123, B:64:0x012d, B:65:0x0130), top: B:5:0x0023, inners: #0, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x020f A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:6:0x0023, B:10:0x0051, B:12:0x0057, B:13:0x005d, B:15:0x0063, B:16:0x0069, B:18:0x006f, B:19:0x0075, B:21:0x007e, B:24:0x0088, B:27:0x00a6, B:31:0x00b8, B:34:0x00c2, B:36:0x00cc, B:37:0x00d2, B:40:0x00da, B:42:0x00e4, B:45:0x00f1, B:49:0x011b, B:50:0x00fa, B:52:0x0100, B:54:0x0106, B:68:0x0138, B:70:0x013e, B:72:0x0148, B:73:0x0185, B:75:0x018b, B:76:0x0194, B:78:0x019c, B:79:0x01a5, B:81:0x01ad, B:82:0x01b6, B:84:0x01be, B:85:0x01c7, B:87:0x01cf, B:88:0x01d7, B:90:0x01df, B:91:0x01e7, B:93:0x01ef, B:94:0x01f7, B:96:0x01ff, B:97:0x0207, B:99:0x020f, B:100:0x0217, B:102:0x021f, B:103:0x0228, B:106:0x0233, B:108:0x023b, B:109:0x0243, B:122:0x0249, B:111:0x0283, B:113:0x028b, B:114:0x0293, B:116:0x029b, B:117:0x02a3, B:119:0x02ab, B:124:0x0256, B:125:0x022f, B:128:0x0152, B:130:0x0158, B:132:0x0162, B:135:0x016c, B:137:0x0133, B:148:0x0049, B:145:0x0043, B:58:0x011d, B:60:0x0123, B:64:0x012d, B:65:0x0130), top: B:5:0x0023, inners: #0, #2, #4 }] */
    @Override // com.igexin.push.extension.mod.PushMessageInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.igexin.push.extension.mod.BaseActionBean parseAction(org.json.JSONObject r19) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.core.a.c.h.parseAction(org.json.JSONObject):com.igexin.push.extension.mod.BaseActionBean");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // com.igexin.push.extension.mod.PushMessageInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.igexin.push.extension.mod.PushMessageInterface.ActionPrepareState prepareExecuteAction(com.igexin.push.extension.mod.PushTaskBean r10, com.igexin.push.extension.mod.BaseActionBean r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.igexin.push.core.b.l
            if (r0 == 0) goto L5d
            r0 = r11
            com.igexin.push.core.b.l r0 = (com.igexin.push.core.b.l) r0
            java.lang.String r2 = r0.f37817g
            java.lang.String r7 = r0.A
            java.lang.String r3 = r10.getTaskId()
            java.lang.String r4 = r10.getMessageId()
            r10 = 1
            java.lang.String r1 = ""
            r5 = 0
            if (r7 == 0) goto L29
            java.lang.String r6 = com.igexin.push.g.j.a(r7)
            boolean r8 = r6.equals(r1)
            if (r8 == 0) goto L27
            r0.G = r5
            r8 = r10
            goto L2a
        L27:
            r0.E = r6
        L29:
            r8 = r5
        L2a:
            if (r2 == 0) goto L3b
            java.lang.String r6 = com.igexin.push.g.j.a(r2)
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L39
            r0.F = r5
            goto L3c
        L39:
            r0.D = r6
        L3b:
            r10 = r5
        L3c:
            if (r10 != 0) goto L44
            if (r8 == 0) goto L41
            goto L44
        L41:
            com.igexin.push.extension.mod.PushMessageInterface$ActionPrepareState r10 = com.igexin.push.extension.mod.PushMessageInterface.ActionPrepareState.success
            return r10
        L44:
            if (r10 == 0) goto L4d
            r6 = 2
            r1 = r9
            r5 = r11
            r1.a(r2, r3, r4, r5, r6)
            goto L4e
        L4d:
            r5 = r11
        L4e:
            if (r8 == 0) goto L5a
            r8 = 8
            r6 = r4
            r4 = r7
            r7 = r5
            r5 = r3
            r3 = r9
            r3.a(r4, r5, r6, r7, r8)
        L5a:
            com.igexin.push.extension.mod.PushMessageInterface$ActionPrepareState r10 = com.igexin.push.extension.mod.PushMessageInterface.ActionPrepareState.wait
            return r10
        L5d:
            com.igexin.push.extension.mod.PushMessageInterface$ActionPrepareState r10 = com.igexin.push.extension.mod.PushMessageInterface.ActionPrepareState.stop
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.core.a.c.h.prepareExecuteAction(com.igexin.push.extension.mod.PushTaskBean, com.igexin.push.extension.mod.BaseActionBean):com.igexin.push.extension.mod.PushMessageInterface$ActionPrepareState");
    }

    private static int a(String str) {
        int i11 = 0;
        for (int i12 = 0; i12 != str.length(); i12++) {
            i11 = (i11 * 131) + str.charAt(i12);
        }
        if (i11 == Integer.MIN_VALUE) {
            i11 = 1;
        }
        return Math.abs(i11);
    }

    private static PendingIntent b(String str) {
        try {
            Context context = com.igexin.push.core.e.f38035l;
            com.igexin.push.core.a.b.d();
            Intent intent = new Intent(context, (Class<?>) com.igexin.push.core.a.b.a(com.igexin.push.core.e.f38035l));
            intent.putExtra("isSummary", true);
            intent.putExtra("action", "com.igexin.action.notification.delete");
            intent.putExtra("groupId", str);
            return PendingIntent.getService(com.igexin.push.core.e.f38035l, new Random().nextInt(1000), intent, (com.igexin.push.g.n.a(com.igexin.push.core.e.f38035l) < 31 || Build.VERSION.SDK_INT < 30) ? C.BUFFER_FLAG_FIRST_SAMPLE : 201326592);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return null;
        }
    }

    private static Notification a(String str, int i11, com.igexin.push.core.b.l lVar) {
        Notification.Builder builder;
        if (TextUtils.isEmpty(str) || com.igexin.push.core.e.f38008aj.containsKey(str)) {
            return null;
        }
        int i12 = Build.VERSION.SDK_INT;
        com.igexin.push.core.e.f38008aj.put(str, new HashSet<>());
        PendingIntent b11 = b(str);
        if (i12 >= 26) {
            builder = new Notification.Builder(com.igexin.push.core.e.f38035l);
            NotificationManager notificationManager = (NotificationManager) com.igexin.push.core.e.f38035l.getSystemService("notification");
            try {
                Constructor<?> constructor = Class.forName("android.app.NotificationChannel").getConstructor(String.class, CharSequence.class, Integer.TYPE);
                Class<?> cls = notificationManager.getClass();
                if (((Parcelable) cls.getMethod("getNotificationChannel", String.class).invoke(notificationManager, lVar.f37820j)) == null) {
                    cls.getMethod("createNotificationChannel", Class.forName("android.app.NotificationChannel")).invoke(notificationManager, (Parcelable) constructor.newInstance(lVar.f37820j, lVar.f37821k, Integer.valueOf(lVar.f37822l)));
                }
                builder.getClass().getMethod("setChannelId", String.class).invoke(builder, lVar.f37820j);
            } catch (Throwable th2) {
                com.igexin.c.a.c.a.a(th2);
            }
        } else {
            builder = new Notification.Builder(com.igexin.push.core.e.f38035l);
        }
        Notification build = builder.setContentTitle("summary").setContentText("summary").setDeleteIntent(b11).setAutoCancel(false).setGroup(str).setSmallIcon(i11).setGroupSummary(true).build();
        if (!TextUtils.isEmpty(lVar.f37833w)) {
            builder.setCategory(lVar.f37833w);
        }
        return build;
    }

    private static PendingIntent a(String str, int i11, String str2, String str3, int i12, com.igexin.push.core.b.l lVar) {
        Intent intent = new Intent();
        intent.putExtra("taskid", str2);
        intent.putExtra("messageid", str3);
        intent.putExtra("appid", com.igexin.push.core.e.f37998a);
        intent.putExtra("actionid", lVar.getDoActionId());
        intent.putExtra("accesstoken", com.igexin.push.core.e.aC);
        intent.putExtra("notifID", i12);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(lVar.f37818h);
        intent.putExtra("notifyStyle", sb2.toString());
        intent.putExtra("id", lVar.f37835y);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(lVar.C);
        intent.putExtra("bigStyle", sb3.toString());
        intent.putExtra("isFloat", false);
        intent.putExtra("checkpackage", com.igexin.push.core.e.f38035l.getPackageName());
        intent.putExtra("feedbackid", lVar.getActionId().substring(lVar.getActionId().length() - 1));
        String str4 = lVar.f37811a;
        if (str4 == null) {
            str4 = "";
        }
        intent.putExtra("title", str4);
        String str5 = lVar.f37812b;
        if (str5 == null) {
            str5 = "";
        }
        intent.putExtra("content", str5);
        intent.putExtra("redisplayFreq", i11);
        intent.putExtra("groupId", str);
        String str6 = lVar.f37830t;
        if (str6 == null) {
            str6 = "";
        }
        intent.putExtra("url", str6);
        String str7 = lVar.f37831u;
        if (str7 == null) {
            str7 = "";
        }
        intent.putExtra(RemoteMessageConst.Notification.INTENT_URI, str7);
        String str8 = lVar.f37832v;
        intent.putExtra(AssistPushConsts.MSG_TYPE_PAYLOAD, str8 != null ? str8 : "");
        try {
            Intent intent2 = new Intent(com.igexin.push.core.e.f38035l, (Class<?>) GetuiActivity.class);
            intent2.setFlags(268435456);
            intent2.putExtra("action", "com.igexin.action.notification.click");
            intent2.putExtra("broadcast_intent", intent);
            return PendingIntent.getActivity(com.igexin.push.core.e.f38035l, new Random().nextInt(1000), intent2, 201326592);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            Intent intent3 = new Intent("com.igexin.action.notification.click");
            intent3.setAction("com.igexin.action.notification.click");
            intent3.putExtra("action", "com.igexin.action.notification.click");
            intent3.putExtra("broadcast_intent", intent);
            return PendingIntent.getBroadcast(com.igexin.push.core.e.f38035l, new Random().nextInt(1000), intent3, 201326592);
        }
    }

    private static PendingIntent a(String str, int i11, String str2, String str3, String str4, com.igexin.push.core.b.l lVar) {
        try {
            Context context = com.igexin.push.core.e.f38035l;
            com.igexin.push.core.a.b.d();
            Intent intent = new Intent(context, (Class<?>) com.igexin.push.core.a.b.a(com.igexin.push.core.e.f38035l));
            intent.putExtra("taskid", str3);
            intent.putExtra("messageid", str4);
            intent.putExtra("appid", com.igexin.push.core.e.f37998a);
            intent.putExtra(com.alipay.sdk.m.s.a.f11004r, str2);
            intent.putExtra("actionid", lVar.getDoActionId());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(lVar.f37818h);
            intent.putExtra("notifyStyle", sb2.toString());
            intent.putExtra("id", lVar.f37835y);
            intent.putExtra("feedbackid", lVar.getActionId().substring(lVar.getActionId().length() + (-1)));
            intent.putExtra("action", "com.igexin.action.notification.delete");
            intent.putExtra("redisplayFreq", i11);
            intent.putExtra("groupId", str);
            return PendingIntent.getService(com.igexin.push.core.e.f38035l, new Random().nextInt(1000), intent, (com.igexin.push.g.n.a(com.igexin.push.core.e.f38035l) < 31 || Build.VERSION.SDK_INT < 30) ? C.BUFFER_FLAG_FIRST_SAMPLE : 201326592);
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            com.igexin.c.a.c.a.a(f37674a + "|getDelPendingIntent err：" + e11.toString(), new Object[0]);
            return null;
        }
    }

    private static Bitmap a(com.igexin.push.core.b.l lVar) {
        Bitmap bitmap;
        String str = lVar.D;
        if (TextUtils.isEmpty(str)) {
            bitmap = null;
        } else {
            bitmap = com.igexin.push.g.l.a(str);
            String str2 = f37674a;
            StringBuilder sb2 = new StringBuilder("|use net logo bitmap is null = ");
            sb2.append(bitmap == null);
            com.igexin.c.a.c.a.a(str2, sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            sb3.append("|use net logo bitmap is null = ");
            sb3.append(bitmap == null);
            com.igexin.c.a.c.a.a(sb3.toString(), new Object[0]);
        }
        if (bitmap == null) {
            return BitmapFactory.decodeResource(com.igexin.push.core.e.f38035l.getResources(), a(lVar, false));
        }
        return bitmap;
    }

    private static void a(Notification notification) {
        com.igexin.push.g.a.b();
    }

    private static void a(Notification notification, com.igexin.push.core.b.l lVar) {
        notification.defaults = 4;
        notification.ledARGB = -16711936;
        notification.ledOnMS = 1000;
        notification.ledOffMS = 3000;
        notification.flags = 1;
        notification.flags = lVar.f37815e ? 1 | 16 : 1 | 32;
        if (lVar.f37813c) {
            notification.defaults = 4 | 2;
        }
        if (lVar.f37814d) {
            if (TextUtils.isEmpty(lVar.f37826p)) {
                notification.defaults |= 1;
            } else {
                notification.sound = c(lVar.f37826p);
            }
        }
        int i11 = lVar.f37825o;
        if (i11 > 0) {
            com.igexin.push.g.d.a(i11, false);
            com.igexin.push.g.d.c(lVar.f37825o, false);
            com.igexin.push.g.d.b(lVar.f37825o, false);
        }
        notification.icon = a(lVar, true);
    }

    private static void a(com.igexin.push.core.b.l lVar, String str, String str2, String str3, String str4) {
        com.igexin.push.core.l.a().a(str, str2, str3, str4, lVar.f37830t, lVar.f37831u, lVar.f37832v);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x025b  */
    @android.annotation.SuppressLint({"WrongConstant"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.igexin.push.extension.mod.PushTaskBean r22, com.igexin.push.core.b.l r23, int r24) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.core.a.c.h.a(com.igexin.push.extension.mod.PushTaskBean, com.igexin.push.core.b.l, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str, final String str2, final String str3, final BaseActionBean baseActionBean, final int i11) {
        String str4;
        String str5;
        String str6 = "width=" + com.igexin.push.core.e.f38034k + "&height=" + com.igexin.push.core.e.f38033j;
        if (str.contains(str6)) {
            str4 = str;
        } else {
            if (str.indexOf("?") > 0) {
                str5 = str + "&" + str6;
            } else {
                str5 = str + "?" + str6;
            }
            str4 = str5;
        }
        com.igexin.push.core.h.b bVar = new com.igexin.push.core.h.b(str4, str, str2, baseActionBean, i11, new com.igexin.push.core.h.d() { // from class: com.igexin.push.core.a.c.h.1
            @Override // com.igexin.push.core.h.d
            public final void a() {
                BaseActionBean baseActionBean2 = baseActionBean;
                if (((com.igexin.push.core.b.l) baseActionBean2).H >= 3) {
                    ((com.igexin.push.core.b.l) baseActionBean2).F = true;
                }
                if (((com.igexin.push.core.b.l) baseActionBean2).I >= 3) {
                    ((com.igexin.push.core.b.l) baseActionBean2).G = true;
                }
                if (!((com.igexin.push.core.b.l) baseActionBean2).F || !((com.igexin.push.core.b.l) baseActionBean2).G) {
                    h.this.a(str, str2, str3, baseActionBean2, i11);
                    return;
                }
                if (com.igexin.push.core.e.a(str2) == 0) {
                    com.igexin.push.core.e.c.a();
                    com.igexin.push.core.e.c.a(com.igexin.push.core.b.f37711ah, str2);
                    Map<String, PushTaskBean> map = com.igexin.push.core.e.f38006ah;
                    com.igexin.push.core.a.b.d();
                    PushTaskBean pushTaskBean = map.get(com.igexin.push.core.a.b.a(str2, str3));
                    if (pushTaskBean != null) {
                        pushTaskBean.setStatus(com.igexin.push.core.b.f37711ah);
                    }
                    com.igexin.push.core.a.b.d();
                    com.igexin.push.core.a.b.a(str2, str3, "1");
                }
            }

            @Override // com.igexin.push.core.h.d
            public final void a(BaseActionBean baseActionBean2) {
                int i12 = i11;
                if (i12 == 2) {
                    ((com.igexin.push.core.b.l) baseActionBean).F = true;
                } else if (i12 == 8) {
                    ((com.igexin.push.core.b.l) baseActionBean).G = true;
                }
                com.igexin.push.core.b.l lVar = (com.igexin.push.core.b.l) baseActionBean2;
                if (lVar.F && lVar.G && com.igexin.push.core.e.a(str2) == 0) {
                    com.igexin.push.core.e.c.a();
                    com.igexin.push.core.e.c.a(com.igexin.push.core.b.f37711ah, str2);
                    Map<String, PushTaskBean> map = com.igexin.push.core.e.f38006ah;
                    com.igexin.push.core.a.b.d();
                    PushTaskBean pushTaskBean = map.get(com.igexin.push.core.a.b.a(str2, str3));
                    if (pushTaskBean != null) {
                        pushTaskBean.setStatus(com.igexin.push.core.b.f37711ah);
                    }
                    com.igexin.push.core.a.b.d();
                    com.igexin.push.core.a.b.a(str2, str3, "1");
                }
            }
        });
        if (i11 == 2) {
            ((com.igexin.push.core.b.l) baseActionBean).H++;
        } else if (i11 == 8) {
            ((com.igexin.push.core.b.l) baseActionBean).I++;
        }
        com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new com.igexin.push.f.a.e(bVar), false, true);
    }
}
