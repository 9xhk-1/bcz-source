package com.meizu.cloud.pushsdk;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Process;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.util.d;
import java.util.List;

/* loaded from: classes7.dex */
public class NotificationService extends IntentService {
    public NotificationService() {
        super("NotificationService");
    }

    public String a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Intent intent = new Intent(str2);
            intent.setPackage(str);
            List<ResolveInfo> queryBroadcastReceivers = getPackageManager().queryBroadcastReceivers(intent, 0);
            if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                return queryBroadcastReceivers.get(0).activityInfo.name;
            }
        }
        return null;
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        DebugLogger.i("NotificationService", "NotificationService destroy");
        super.onDestroy();
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        boolean z11;
        Process.setThreadPriority(10);
        if (intent == null) {
            return;
        }
        try {
            DebugLogger.i("NotificationService", "onHandleIntent action " + intent.getAction());
            intent.getStringExtra("method");
            String stringExtra = intent.getStringExtra("command_type");
            if (!PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && !PushConstants.MZ_PUSH_ON_REGISTER_ACTION.equals(intent.getAction()) && !PushConstants.MZ_PUSH_ON_UNREGISTER_ACTION.equals(intent.getAction())) {
                z11 = false;
                DebugLogger.d("NotificationService", "-- command_type -- " + stringExtra + " legalAction " + z11);
                if (TextUtils.isEmpty(stringExtra) && "reflect_receiver".equals(stringExtra) && z11) {
                    String stringExtra2 = intent.getStringExtra(PushConstants.MZ_PUSH_CONTROL_MESSAGE);
                    DebugLogger.i("NotificationService", "control message is " + stringExtra2);
                    if (!TextUtils.isEmpty(stringExtra2)) {
                        com.meizu.cloud.pushsdk.d.a.a(this, new com.meizu.cloud.pushsdk.handler.a.c.b(stringExtra2, null, null).b().c());
                    }
                    a(intent);
                    return;
                }
                return;
            }
            z11 = true;
            DebugLogger.d("NotificationService", "-- command_type -- " + stringExtra + " legalAction " + z11);
            if (TextUtils.isEmpty(stringExtra)) {
            }
        } catch (Exception e11) {
            DebugLogger.e("NotificationService", "onHandleIntent error " + e11.getMessage());
        }
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    public NotificationService(String str) {
        super(str);
    }

    public void a(Intent intent) {
        String a11 = a(getPackageName(), intent.getAction());
        if (TextUtils.isEmpty(a11)) {
            d.a(this, intent, "reflectReceiver sendbroadcast", 2005);
            DebugLogger.i("NotificationService", " reflectReceiver error: receiver for: " + intent.getAction() + " not found, package: " + getPackageName());
            intent.setPackage(getPackageName());
            sendBroadcast(intent);
            return;
        }
        try {
            d.a(this, intent, "reflectReceiver startservice", 2003);
            intent.setClassName(getPackageName(), a11);
            com.meizu.cloud.pushsdk.b.b.d a12 = com.meizu.cloud.pushsdk.b.b.a.a(a11).a((Class<?>[]) null).a(null);
            if (!a12.f39382a || a12.f39383b == 0) {
                return;
            }
            DebugLogger.i("NotificationService", "Reflect MzPushReceiver true");
            com.meizu.cloud.pushsdk.b.b.a.a(a12.f39383b).a("onReceive", Context.class, Intent.class).a(a12.f39383b, getApplicationContext(), intent);
        } catch (Exception e11) {
            DebugLogger.i("NotificationService", "reflect e: " + e11);
            d.a(this, intent, e11.getMessage(), 2004);
        }
    }
}
