package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class v {

    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public String f45232a;

        /* renamed from: a, reason: collision with other field name */
        public boolean f118a;

        /* renamed from: b, reason: collision with root package name */
        public String f45233b;

        /* renamed from: b, reason: collision with other field name */
        public boolean f119b;

        public b(String str, boolean z11, boolean z12, String str2) {
            this.f45232a = str;
            this.f118a = z11;
            this.f119b = z12;
            this.f45233b = str2;
        }
    }

    private static ActivityInfo a(PackageManager packageManager, Intent intent, Class<?> cls) {
        Iterator<ResolveInfo> it = packageManager.queryBroadcastReceivers(intent, 16384).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && cls.getCanonicalName().equals(activityInfo.name)) {
                return activityInfo;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d A[EDGE_INSN: B:23:0x009d->B:24:0x009d BREAK  A[LOOP:0: B:8:0x0069->B:37:0x0069], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.Context r6) {
        /*
            java.lang.String r0 = "com.xiaomi.push.service.receivers.PingReceiver"
            android.content.pm.PackageManager r1 = r6.getPackageManager()
            java.lang.String r2 = r6.getPackageName()
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = com.xiaomi.push.service.bk.f46315p
            r3.<init>(r4)
            r3.setPackage(r2)
            java.lang.Class r4 = com.xiaomi.push.s.a(r6, r0)     // Catch: java.lang.ClassNotFoundException -> L30
            android.content.pm.ActivityInfo r3 = a(r1, r3, r4)     // Catch: java.lang.ClassNotFoundException -> L30
            boolean r4 = com.xiaomi.mipush.sdk.MiPushClient.shouldUseMIUIPush(r6)     // Catch: java.lang.ClassNotFoundException -> L30
            if (r4 != 0) goto L42
            if (r3 == 0) goto L32
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.ClassNotFoundException -> L30
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.ClassNotFoundException -> L30
            java.lang.Boolean[] r0 = new java.lang.Boolean[]{r0, r4}     // Catch: java.lang.ClassNotFoundException -> L30
            a(r3, r0)     // Catch: java.lang.ClassNotFoundException -> L30
            goto L53
        L30:
            r0 = move-exception
            goto L50
        L32:
            com.xiaomi.mipush.sdk.v$a r3 = new com.xiaomi.mipush.sdk.v$a     // Catch: java.lang.ClassNotFoundException -> L30
            java.lang.String r4 = "<receiver android:name=\"%1$s\" .../> is missing or disabled in AndroidManifest."
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.ClassNotFoundException -> L30
            java.lang.String r0 = java.lang.String.format(r4, r0)     // Catch: java.lang.ClassNotFoundException -> L30
            r3.<init>(r0)     // Catch: java.lang.ClassNotFoundException -> L30
            throw r3     // Catch: java.lang.ClassNotFoundException -> L30
        L42:
            if (r3 == 0) goto L53
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.ClassNotFoundException -> L30
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.ClassNotFoundException -> L30
            java.lang.Boolean[] r0 = new java.lang.Boolean[]{r0, r4}     // Catch: java.lang.ClassNotFoundException -> L30
            a(r3, r0)     // Catch: java.lang.ClassNotFoundException -> L30
            goto L53
        L50:
            com.xiaomi.channel.commonutils.logger.b.a(r0)
        L53:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r3 = "com.xiaomi.mipush.RECEIVE_MESSAGE"
            r0.<init>(r3)
            r0.setPackage(r2)
            r2 = 16384(0x4000, float:2.2959E-41)
            java.util.List r0 = r1.queryBroadcastReceivers(r0, r2)
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L69:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L9d
            java.lang.Object r3 = r0.next()
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            if (r3 == 0) goto L9a
            java.lang.String r4 = r3.name     // Catch: java.lang.ClassNotFoundException -> L95
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.ClassNotFoundException -> L95
            if (r4 != 0) goto L9a
            java.lang.Class<com.xiaomi.mipush.sdk.PushMessageReceiver> r4 = com.xiaomi.mipush.sdk.PushMessageReceiver.class
            java.lang.String r5 = r3.name     // Catch: java.lang.ClassNotFoundException -> L95
            java.lang.Class r5 = com.xiaomi.push.s.a(r6, r5)     // Catch: java.lang.ClassNotFoundException -> L95
            boolean r4 = r4.isAssignableFrom(r5)     // Catch: java.lang.ClassNotFoundException -> L95
            if (r4 == 0) goto L9a
            boolean r2 = r3.enabled     // Catch: java.lang.ClassNotFoundException -> L95
            if (r2 == 0) goto L9a
            r2 = 1
            goto L9b
        L95:
            r3 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a(r3)
            goto L69
        L9a:
            r2 = r1
        L9b:
            if (r2 == 0) goto L69
        L9d:
            if (r2 == 0) goto Lc1
            boolean r0 = com.xiaomi.mipush.sdk.MiPushClient.getOpenHmsPush(r6)
            if (r0 == 0) goto Lb3
            java.lang.String r0 = "com.huawei.android.push.intent.RECEIVE"
            java.lang.String r1 = "com.xiaomi.assemble.control.HmsPushReceiver"
            a(r6, r0, r1)
            java.lang.String r0 = "com.huawei.intent.action.PUSH"
            java.lang.String r1 = "com.huawei.hms.support.api.push.PushEventReceiver"
            a(r6, r0, r1)
        Lb3:
            boolean r0 = com.xiaomi.mipush.sdk.MiPushClient.getOpenVIVOPush(r6)
            if (r0 == 0) goto Lc0
            java.lang.String r0 = "com.vivo.pushclient.action.RECEIVE"
            java.lang.String r1 = "com.xiaomi.assemble.control.FTOSPushMessageReceiver"
            a(r6, r0, r1)
        Lc0:
            return
        Lc1:
            com.xiaomi.mipush.sdk.v$a r6 = new com.xiaomi.mipush.sdk.v$a
            java.lang.String r0 = "Receiver: none of the subclasses of PushMessageReceiver is enabled or defined."
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.v.c(android.content.Context):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Context context, PackageInfo packageInfo) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put(PushMessageHandler.class.getCanonicalName(), new b(PushMessageHandler.class.getCanonicalName(), true, true, ""));
        hashMap2.put(MessageHandleService.class.getCanonicalName(), new b(MessageHandleService.class.getCanonicalName(), true, false, ""));
        if (!MiPushClient.shouldUseMIUIPush(context) || a(packageInfo, new String[]{"com.xiaomi.push.service.XMJobService", "com.xiaomi.push.service.XMPushService"})) {
            hashMap2.put("com.xiaomi.push.service.XMJobService", new b("com.xiaomi.push.service.XMJobService", true, false, "android.permission.BIND_JOB_SERVICE"));
            hashMap2.put("com.xiaomi.push.service.XMPushService", new b("com.xiaomi.push.service.XMPushService", true, false, ""));
        }
        if (MiPushClient.getOpenFCMPush(context)) {
            hashMap2.put("com.xiaomi.assemble.control.MiFireBaseInstanceIdService", new b("com.xiaomi.assemble.control.MiFireBaseInstanceIdService", true, false, ""));
            hashMap2.put("com.xiaomi.assemble.control.MiFirebaseMessagingService", new b("com.xiaomi.assemble.control.MiFirebaseMessagingService", true, false, ""));
        }
        if (MiPushClient.getOpenOPPOPush(context)) {
            hashMap2.put("com.xiaomi.assemble.control.COSPushMessageService", new b("com.xiaomi.assemble.control.COSPushMessageService", true, true, "com.coloros.mcs.permission.SEND_MCS_MESSAGE"));
        }
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                if (!TextUtils.isEmpty(serviceInfo.name) && hashMap2.containsKey(serviceInfo.name)) {
                    b bVar = (b) hashMap2.remove(serviceInfo.name);
                    boolean z11 = bVar.f118a;
                    boolean z12 = bVar.f119b;
                    String str = bVar.f45233b;
                    if (z11 != serviceInfo.enabled) {
                        throw new a(String.format("<service android:name=\"%1$s\" .../> in AndroidManifest had the wrong enabled attribute, which should be android:enabled=%2$b.", serviceInfo.name, Boolean.valueOf(z11)));
                    }
                    if (z12 != serviceInfo.exported) {
                        throw new a(String.format("<service android:name=\"%1$s\" .../> in AndroidManifest had the wrong exported attribute, which should be android:exported=%2$b.", serviceInfo.name, Boolean.valueOf(z12)));
                    }
                    if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, serviceInfo.permission)) {
                        throw new a(String.format("<service android:name=\"%1$s\" .../> in AndroidManifest had the wrong permission attribute, which should be android:permission=\"%2$s\".", serviceInfo.name, str));
                    }
                    hashMap.put(serviceInfo.name, serviceInfo.processName);
                    if (hashMap2.isEmpty()) {
                        break;
                    }
                }
            }
        }
        if (!hashMap2.isEmpty()) {
            throw new a(String.format("<service android:name=\"%1$s\" .../> is missing or disabled in AndroidManifest.", hashMap2.keySet().iterator().next()));
        }
        if (!TextUtils.equals((CharSequence) hashMap.get(PushMessageHandler.class.getCanonicalName()), (CharSequence) hashMap.get(MessageHandleService.class.getCanonicalName()))) {
            throw new a(String.format("\"%1$s\" and \"%2$s\" must be running in the same process.", PushMessageHandler.class.getCanonicalName(), MessageHandleService.class.getCanonicalName()));
        }
        if (hashMap.containsKey("com.xiaomi.push.service.XMJobService") && hashMap.containsKey("com.xiaomi.push.service.XMPushService") && !TextUtils.equals((CharSequence) hashMap.get("com.xiaomi.push.service.XMJobService"), (CharSequence) hashMap.get("com.xiaomi.push.service.XMPushService"))) {
            throw new a(String.format("\"%1$s\" and \"%2$s\" must be running in the same process.", "com.xiaomi.push.service.XMJobService", "com.xiaomi.push.service.XMPushService"));
        }
    }

    public static void a(Context context) {
        new Thread(new w(context)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, PackageInfo packageInfo) {
        HashSet hashSet = new HashSet();
        String str = context.getPackageName() + ".permission.MIPUSH_RECEIVE";
        hashSet.addAll(Arrays.asList("android.permission.INTERNET", yk.e.f100168b, str, "android.permission.ACCESS_WIFI_STATE", "android.permission.VIBRATE"));
        PermissionInfo[] permissionInfoArr = packageInfo.permissions;
        if (permissionInfoArr != null) {
            for (PermissionInfo permissionInfo : permissionInfoArr) {
                if (str.equals(permissionInfo.name)) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (strArr != null) {
                        for (String str2 : strArr) {
                            if (!TextUtils.isEmpty(str2) && hashSet.contains(str2)) {
                                hashSet.remove(str2);
                                if (hashSet.isEmpty()) {
                                    break;
                                }
                            }
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        throw new a(String.format("<uses-permission android:name=\"%1$s\"/> is missing in AndroidManifest.", hashSet.iterator().next()));
                    }
                    return;
                }
            }
        }
        throw new a(String.format("<permission android:name=\"%1$s\" .../> is undefined in AndroidManifest.", str));
    }

    private static void a(Context context, String str, String str2) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        Intent intent = new Intent(str);
        intent.setPackage(packageName);
        Iterator<ResolveInfo> it = packageManager.queryBroadcastReceivers(intent, 16384).iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            z11 = (activityInfo == null || TextUtils.isEmpty(activityInfo.name) || !activityInfo.name.equals(str2)) ? false : true;
            if (z11) {
                break;
            }
        }
        if (!z11) {
            throw new a(String.format("<receiver android:name=\"%1$s\" .../> is missing or disabled in AndroidManifest.", str2));
        }
    }

    private static void a(ActivityInfo activityInfo, Boolean[] boolArr) {
        if (boolArr[0].booleanValue() != activityInfo.enabled) {
            throw new a(String.format("<receiver android:name=\"%1$s\" .../> in AndroidManifest had the wrong enabled attribute, which should be android:enabled=%2$b.", activityInfo.name, boolArr[0]));
        }
        if (boolArr[1].booleanValue() != activityInfo.exported) {
            throw new a(String.format("<receiver android:name=\"%1$s\" .../> in AndroidManifest had the wrong exported attribute, which should be android:exported=%2$b.", activityInfo.name, boolArr[1]));
        }
    }

    private static boolean a(PackageInfo packageInfo, String[] strArr) {
        for (ServiceInfo serviceInfo : packageInfo.services) {
            if (a(strArr, serviceInfo.name)) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(String[] strArr, String str) {
        if (strArr != null && str != null) {
            for (String str2 : strArr) {
                if (TextUtils.equals(str2, str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
