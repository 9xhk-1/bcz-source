package com.meizu.cloud.pushsdk.notification.a;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import com.meizu.cloud.pushsdk.notification.model.AppIconSetting;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;

/* loaded from: classes7.dex */
public class c extends com.meizu.cloud.pushsdk.notification.a {
    public c(Context context, PushNotificationBuilder pushNotificationBuilder) {
        super(context, pushNotificationBuilder);
    }

    @Override // com.meizu.cloud.pushsdk.notification.a
    public void b(Notification.Builder builder, MessageV3 messageV3) {
        AppIconSetting appIconSetting;
        Bitmap a11;
        String str;
        if ((!MzSystemUtils.isInternational() || MzSystemUtils.isMeizuAndFlyme()) && (appIconSetting = messageV3.getAppIconSetting()) != null) {
            if (!appIconSetting.isDefaultLargeIcon()) {
                if (Thread.currentThread() != this.f39897a.getMainLooper().getThread()) {
                    Bitmap a12 = a(appIconSetting.getLargeIconUrl());
                    if (a12 == null) {
                        builder.setLargeIcon(a(this.f39897a, messageV3.getUploadDataPackageName()));
                        return;
                    } else {
                        DebugLogger.i("AbstractPushNotification", "On other Thread down load largeIcon image success");
                        builder.setLargeIcon(a12);
                        return;
                    }
                }
                return;
            }
            PushNotificationBuilder pushNotificationBuilder = this.f39898b;
            if (pushNotificationBuilder == null || pushNotificationBuilder.getLargeIcon() == 0) {
                PushNotificationBuilder pushNotificationBuilder2 = this.f39898b;
                if (pushNotificationBuilder2 == null || pushNotificationBuilder2.getAppLargeIcon() == null) {
                    a11 = a(this.f39897a, messageV3.getUploadDataPackageName());
                    str = "set largeIcon by package default large icon";
                } else {
                    a11 = this.f39898b.getAppLargeIcon();
                    str = "set largeIcon by bitmap provided by user setting";
                }
            } else {
                a11 = BitmapFactory.decodeResource(this.f39897a.getResources(), this.f39898b.getLargeIcon());
                str = "set largeIcon by resource id";
            }
            DebugLogger.i("AbstractPushNotification", str);
            builder.setLargeIcon(a11);
        }
    }
}
