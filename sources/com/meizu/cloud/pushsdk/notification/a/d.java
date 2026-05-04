package com.meizu.cloud.pushsdk.notification.a;

import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.handler.MessageV4;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import com.meizu.cloud.pushsdk.notification.c.e;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import java.io.File;

/* loaded from: classes7.dex */
public class d extends c {
    public d(Context context, PushNotificationBuilder pushNotificationBuilder) {
        super(context, pushNotificationBuilder);
    }

    @Override // com.meizu.cloud.pushsdk.notification.a
    public void a(Notification.Builder builder, MessageV3 messageV3) {
        if (MinSdkChecker.isSupportNotificationBuild()) {
            Notification.BigTextStyle bigTextStyle = new Notification.BigTextStyle();
            bigTextStyle.setBigContentTitle(messageV3.getTitle());
            bigTextStyle.bigText(messageV3.getNotificationStyle().getExpandableText());
            builder.setStyle(bigTextStyle);
        }
    }

    @Override // com.meizu.cloud.pushsdk.notification.a
    public void a(Notification notification, MessageV3 messageV3) {
        super.a(notification, messageV3);
        MessageV4 parse = MessageV4.parse(messageV3);
        if (parse.getActVideoSetting() == null) {
            DebugLogger.e("AbstractPushNotification", "only wifi can download act");
            return;
        }
        if (parse.getActVideoSetting().isWifiDisplay() && !com.meizu.cloud.pushsdk.util.a.b(this.f39897a)) {
            DebugLogger.e("AbstractPushNotification", "only wifi can download act");
            return;
        }
        final String str = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/pushSdkAct/" + messageV3.getUploadDataPackageName();
        String valueOf = String.valueOf(System.currentTimeMillis());
        String actUrl = parse.getActVideoSetting().getActUrl();
        if (!TextUtils.isEmpty(actUrl) && com.meizu.cloud.pushsdk.c.a.a(actUrl, str, valueOf).a().c().b()) {
            DebugLogger.i("AbstractPushNotification", "down load " + actUrl + " success");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            String str2 = File.separator;
            sb2.append(str2);
            sb2.append("ACT-");
            sb2.append(valueOf);
            String sb3 = sb2.toString();
            boolean a11 = new e(str + str2 + valueOf, sb3).a();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("zip file ");
            sb4.append(a11);
            DebugLogger.i("AbstractPushNotification", sb4.toString());
            if (a11) {
                Bundle bundle = new Bundle();
                bundle.putString("path", sb3);
                Bundle bundle2 = new Bundle();
                bundle2.putBundle("big", bundle);
                if (MinSdkChecker.isSupportVideoNotification()) {
                    notification.extras.putBundle("flyme.active", bundle2);
                }
            }
        }
        com.meizu.cloud.pushsdk.d.b.a.b.a(new Runnable() { // from class: com.meizu.cloud.pushsdk.notification.a.d.1
            @Override // java.lang.Runnable
            public void run() {
                for (File file : com.meizu.cloud.pushsdk.notification.c.a.b(str, String.valueOf(System.currentTimeMillis() - 86400000))) {
                    com.meizu.cloud.pushsdk.notification.c.a.b(file.getPath());
                    DebugLogger.i("AbstractPushNotification", "Delete file directory " + file.getName() + "\n");
                }
            }
        });
    }
}
