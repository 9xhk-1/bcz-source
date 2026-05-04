package com.meizu.cloud.pushsdk.handler.a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.SparseArray;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import com.meizu.cloud.pushsdk.handler.a.c.e;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class a<T> implements com.meizu.cloud.pushsdk.handler.c {

    /* renamed from: a, reason: collision with root package name */
    private com.meizu.cloud.pushsdk.handler.a f39838a;

    /* renamed from: b, reason: collision with root package name */
    private Context f39839b;

    /* renamed from: c, reason: collision with root package name */
    private SparseArray<String> f39840c;

    public a(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null.");
        }
        this.f39839b = context.getApplicationContext();
        this.f39838a = aVar;
        SparseArray<String> sparseArray = new SparseArray<>();
        this.f39840c = sparseArray;
        sparseArray.put(2, "MESSAGE_TYPE_PUSH_SERVICE_V2");
        this.f39840c.put(4, "MESSAGE_TYPE_PUSH_SERVICE_V3");
        this.f39840c.put(16, "MESSAGE_TYPE_REGISTER");
        this.f39840c.put(32, "MESSAGE_TYPE_UNREGISTER");
        this.f39840c.put(8, "MESSAGE_TYPE_THROUGH");
        this.f39840c.put(64, "MESSAGE_TYPE_NOTIFICATION_CLICK");
        this.f39840c.put(128, "MESSAGE_TYPE_NOTIFICATION_DELETE");
        this.f39840c.put(256, "MESSAGE_TYPE_PUSH_SWITCH_STATUS");
        this.f39840c.put(512, "MESSAGE_TYPE_PUSH_REGISTER_STATUS");
        this.f39840c.put(2048, "MESSAGE_TYPE_PUSH_SUBTAGS_STATUS");
        this.f39840c.put(1024, "MESSAGE_TYPE_PUSH_UNREGISTER_STATUS");
        this.f39840c.put(4096, "MESSAGE_TYPE_PUSH_SUBALIAS_STATUS");
        this.f39840c.put(8192, "MESSAGE_TYPE_SCHEDULE_NOTIFICATION");
        this.f39840c.put(16384, "MESSAGE_TYPE_RECEIVE_NOTIFY_MESSAGE");
        this.f39840c.put(32768, "MESSAGE_TYPE_NOTIFICATION_STATE");
        this.f39840c.put(65536, "MESSAGE_TYPE_UPLOAD_FILE_LOG");
        this.f39840c.put(131072, "MESSAGE_TYPE_NOTIFICATION_ARRIVED");
        this.f39840c.put(262144, "MESSAGE_TYPE_NOTIFICATION_WITHDRAW");
        this.f39840c.put(524288, "MESSAGE_TYPE_BRIGHT_NOTIFICATION");
        this.f39840c.put(1048576, "MESSAGE_TYPE_NOTIFICATION_CLOSE");
    }

    private String e() {
        String str = null;
        for (int i11 = 0; i11 < 2; i11++) {
            str = b();
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return str;
    }

    public com.meizu.cloud.pushsdk.notification.c a(T t11) {
        return null;
    }

    public abstract void a(T t11, com.meizu.cloud.pushsdk.notification.c cVar);

    public String b() {
        return new e.a((String) com.meizu.cloud.pushsdk.c.a.a(PushConstants.GET_PUBLIC_KEY).a().a().a()).a();
    }

    public com.meizu.cloud.pushsdk.handler.a c() {
        return this.f39838a;
    }

    public abstract T c(Intent intent);

    public int d(T t11) {
        return 0;
    }

    public String f(Intent intent) {
        return intent.getStringExtra(PushConstants.EXTRA_APP_PUSH_SEQ_ID);
    }

    public String g(Intent intent) {
        String stringExtra = intent.getStringExtra(PushConstants.EXTRA_APP_PUSH_SERVICE_DEFAULT_PACKAGE_NAME);
        return TextUtils.isEmpty(stringExtra) ? d().getPackageName() : stringExtra;
    }

    public String h(Intent intent) {
        String stringExtra = intent.getStringExtra(PushConstants.EXTRA_APP_PUSH_TASK_TIMES_TAMP);
        DebugLogger.i("AbstractMessageHandler", "receive push timestamp from pushservice " + stringExtra);
        return TextUtils.isEmpty(stringExtra) ? String.valueOf(System.currentTimeMillis() / 1000) : stringExtra;
    }

    public boolean i(Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra(PushConstants.MZ_PUSH_WHITE_LIST, false);
        DebugLogger.i("AbstractMessageHandler", "receive push whiteList from pushservice " + booleanExtra);
        return booleanExtra;
    }

    public long j(Intent intent) {
        long longExtra = intent.getLongExtra(PushConstants.MZ_PUSH_DELAYED_REPORT_MILLIS, 0L);
        DebugLogger.i("AbstractMessageHandler", "receive push delayedReportMillis from pushservice " + longExtra);
        return longExtra;
    }

    public String k(Intent intent) {
        return intent.getStringExtra("method");
    }

    private String a(int i11) {
        return this.f39840c.get(i11);
    }

    public String b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("launcher");
            return (!jSONObject.has(com.igexin.push.core.b.aC) || TextUtils.isEmpty(jSONObject.getString(com.igexin.push.core.b.aC))) ? "" : jSONObject.getString(com.igexin.push.core.b.aC);
        } catch (Exception unused) {
            DebugLogger.e("AbstractMessageHandler", "parse desk top json error");
            return "";
        }
    }

    public void c(MessageV3 messageV3) {
        com.meizu.cloud.pushsdk.notification.model.a a11 = com.meizu.cloud.pushsdk.notification.model.a.a(messageV3);
        if (a11 != null) {
            DebugLogger.i("AbstractMessageHandler", "delete notifyKey " + a11.b() + " notifyId " + a11.a());
            if (TextUtils.isEmpty(a11.b())) {
                com.meizu.cloud.pushsdk.notification.c.b.c(d(), messageV3.getUploadDataPackageName(), a11.a());
            } else {
                com.meizu.cloud.pushsdk.notification.c.b.a(d(), messageV3.getUploadDataPackageName(), a11.b());
            }
        }
    }

    public Context d() {
        return this.f39839b;
    }

    public String e(Intent intent) {
        return intent.getStringExtra(PushConstants.EXTRA_APP_PUSH_TASK_ID);
    }

    public void f(T t11) {
    }

    public boolean g(T t11) {
        return true;
    }

    public void a(Context context, MessageV3 messageV3) {
        com.meizu.cloud.pushsdk.handler.a.a.a b11;
        com.meizu.cloud.pushsdk.notification.model.a a11;
        if (messageV3.getAdvertisementOption() == null || TextUtils.isEmpty(messageV3.getAdvertisementOption().getAdPackage()) || (b11 = com.meizu.cloud.pushsdk.b.a(context).b()) == null || (a11 = com.meizu.cloud.pushsdk.notification.model.a.a(messageV3)) == null) {
            return;
        }
        b11.a(a11.a());
    }

    public void b(MessageV3 messageV3) {
        if (!MinSdkChecker.isSupportSetDrawableSmallIcon()) {
            c(messageV3);
            return;
        }
        com.meizu.cloud.pushsdk.notification.model.a a11 = com.meizu.cloud.pushsdk.notification.model.a.a(messageV3);
        if (a11 != null) {
            DebugLogger.e("AbstractMessageHandler", "delete notifyId " + a11.a() + " notifyKey " + a11.b());
            if (TextUtils.isEmpty(a11.b())) {
                com.meizu.cloud.pushsdk.platform.a.b.a(d()).a(messageV3.getUploadDataPackageName(), a11.a());
            } else {
                com.meizu.cloud.pushsdk.platform.a.b.a(d()).a(messageV3.getUploadDataPackageName(), a11.b());
            }
        }
    }

    public void c(T t11) {
    }

    public String d(Intent intent) {
        String stringExtra = intent != null ? intent.getStringExtra(PushConstants.MZ_PUSH_MESSAGE_STATISTICS_IMEI_KEY) : null;
        if (!TextUtils.isEmpty(stringExtra)) {
            return stringExtra;
        }
        String a11 = com.meizu.cloud.pushsdk.b.c.a(d());
        DebugLogger.e("AbstractMessageHandler", "force get deviceId " + a11);
        return a11;
    }

    public void e(T t11) {
    }

    public void a(MessageV3 messageV3) {
        if (messageV3 == null || messageV3.getAdvertisementOption() == null || TextUtils.isEmpty(messageV3.getAdvertisementOption().getAdPackage())) {
            if (!MinSdkChecker.isSupportSetDrawableSmallIcon()) {
                c().b(d(), MzPushMessage.fromMessageV3(messageV3));
                return;
            }
            if (MzSystemUtils.isRunningProcess(d(), messageV3.getUploadDataPackageName())) {
                DebugLogger.i("AbstractMessageHandler", "send notification arrived message to " + messageV3.getUploadDataPackageName());
                Intent intent = new Intent();
                if (MinSdkChecker.isSupportTransmitMessageValue(this.f39839b, messageV3.getUploadDataPackageName())) {
                    intent.putExtra(PushConstants.MZ_MESSAGE_VALUE, com.meizu.cloud.pushsdk.handler.d.a(messageV3));
                } else {
                    intent.putExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE, messageV3);
                }
                intent.putExtra("method", "notification_arrived");
                MzSystemUtils.sendMessageFromBroadcast(d(), intent, PushConstants.MZ_PUSH_ON_MESSAGE_ACTION, messageV3.getUploadDataPackageName());
            }
        }
    }

    public void b(T t11) {
    }

    public boolean a(int i11, String str) {
        boolean z11;
        if (i11 == 0) {
            z11 = com.meizu.cloud.pushsdk.util.b.e(d(), str);
        } else {
            z11 = true;
            if (i11 == 1) {
                z11 = com.meizu.cloud.pushsdk.util.b.h(d(), str);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(i11 == 0 ? " canNotificationMessage " : " canThroughMessage ");
        sb2.append(z11);
        DebugLogger.i("AbstractMessageHandler", sb2.toString());
        return z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa A[ADDED_TO_REGION] */
    @Override // com.meizu.cloud.pushsdk.handler.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(android.content.Intent r8) {
        /*
            r7 = this;
            boolean r0 = r7.a(r8)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "current message Type "
            r0.append(r2)
            int r2 = r7.a()
            java.lang.String r2 = r7.a(r2)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "AbstractMessageHandler"
            com.meizu.cloud.pushinternal.DebugLogger.i(r2, r0)
            java.lang.Object r0 = r7.c(r8)
            java.lang.String r8 = r7.k(r8)
            boolean r8 = r7.a(r0, r8)
            if (r8 != 0) goto L3a
            java.lang.String r8 = "invalid push message"
            com.meizu.cloud.pushinternal.DebugLogger.e(r2, r8)
            return r1
        L3a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r3 = "current Handler message "
            r8.append(r3)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            com.meizu.cloud.pushinternal.DebugLogger.i(r2, r8)
            r7.b(r0)
            int r8 = r7.d(r0)
            r3 = 1
            if (r8 == 0) goto L8d
            if (r8 == r3) goto L8a
            r4 = 2
            if (r8 == r4) goto L83
            r4 = 3
            if (r8 == r4) goto L7a
            r4 = 4
            if (r8 == r4) goto L6e
            r3 = 5
            if (r8 == r3) goto L68
        L66:
            r3 = r1
            goto L90
        L68:
            java.lang.String r8 = "ad cannot show message"
        L6a:
            com.meizu.cloud.pushinternal.DebugLogger.i(r2, r8)
            goto L66
        L6e:
            java.lang.String r8 = "bright notification"
            com.meizu.cloud.pushinternal.DebugLogger.i(r2, r8)
            r7.f(r0)
        L76:
            r6 = r3
            r3 = r1
            r1 = r6
            goto L90
        L7a:
            java.lang.String r8 = "schedule notification"
            com.meizu.cloud.pushinternal.DebugLogger.i(r2, r8)
            r7.e(r0)
            goto L76
        L83:
            java.lang.String r8 = "notification on time ,show message"
        L85:
            com.meizu.cloud.pushinternal.DebugLogger.i(r2, r8)
            r1 = r3
            goto L90
        L8a:
            java.lang.String r8 = "expire notification, don't show message"
            goto L6a
        L8d:
            java.lang.String r8 = "schedule send message off, send message directly"
            goto L85
        L90:
            boolean r8 = r7.g(r0)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "can send message "
            r4.append(r5)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            com.meizu.cloud.pushinternal.DebugLogger.i(r2, r4)
            if (r1 == 0) goto Lbd
            if (r3 == 0) goto Lbd
            if (r8 == 0) goto Lbd
            com.meizu.cloud.pushsdk.notification.c r8 = r7.a(r0)
            r7.a(r0, r8)
            r7.c(r0)
            java.lang.String r8 = "send message end "
            com.meizu.cloud.pushinternal.DebugLogger.i(r2, r8)
        Lbd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.handler.a.a.b(android.content.Intent):boolean");
    }

    private boolean b(String str, MessageV3 messageV3, String str2) {
        if (TextUtils.isEmpty(str)) {
            DebugLogger.e("AbstractMessageHandler", "security check fail, public key is null");
            return false;
        }
        String a11 = com.meizu.cloud.pushsdk.util.c.a(str, str2);
        DebugLogger.i("AbstractMessageHandler", "decrypt sign: " + a11);
        boolean a12 = com.meizu.cloud.pushsdk.handler.a.c.e.a(a11, messageV3);
        DebugLogger.i("AbstractMessageHandler", "check public key result: " + a12);
        return a12;
    }

    public final boolean a(MessageV3 messageV3, String str) {
        String a11 = com.meizu.cloud.pushsdk.handler.a.c.e.a(messageV3);
        if (TextUtils.isEmpty(a11)) {
            DebugLogger.i("AbstractMessageHandler", "message does not contain signature field");
            return false;
        }
        String k11 = com.meizu.cloud.pushsdk.util.b.k(d(), messageV3.getPackageName());
        DebugLogger.i("AbstractMessageHandler", "local public key is: " + k11);
        if (a(k11, messageV3, str)) {
            DebugLogger.i("AbstractMessageHandler", "message special approval no check");
            return true;
        }
        if (b(k11, messageV3, a11)) {
            DebugLogger.i("AbstractMessageHandler", "security check passed");
            return true;
        }
        String e11 = e();
        DebugLogger.i("AbstractMessageHandler", "network request public key: " + e11);
        if (!b(e11, messageV3, a11)) {
            DebugLogger.e("AbstractMessageHandler", "security check fail");
            return false;
        }
        com.meizu.cloud.pushsdk.util.b.k(d(), messageV3.getPackageName(), e11);
        DebugLogger.i("AbstractMessageHandler", "security check passed");
        return true;
    }

    public boolean a(T t11, String str) {
        return true;
    }

    public boolean a(String str) {
        try {
            return d().getPackageName().equals(new JSONObject(str).getString("appId"));
        } catch (Exception unused) {
            DebugLogger.e("AbstractMessageHandler", "parse notification error");
            return false;
        }
    }

    private boolean a(String str, MessageV3 messageV3, String str2) {
        String str3;
        if (!TextUtils.isEmpty(str)) {
            str3 = "sa, public key not empty";
        } else if (!"private".equals(str2)) {
            str3 = "sa, message not click method";
        } else {
            if (com.meizu.cloud.pushsdk.util.b.l(d(), messageV3.getPackageName())) {
                com.meizu.cloud.pushsdk.util.b.c(d(), messageV3.getPackageName(), false);
                return true;
            }
            str3 = "sa, not first request";
        }
        DebugLogger.i("AbstractMessageHandler", str3);
        return false;
    }
}
