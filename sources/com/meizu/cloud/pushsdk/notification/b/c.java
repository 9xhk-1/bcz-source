package com.meizu.cloud.pushsdk.notification.b;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;

/* loaded from: classes7.dex */
public class c extends com.meizu.cloud.pushsdk.notification.a {
    public c(Context context, PushNotificationBuilder pushNotificationBuilder) {
        super(context, pushNotificationBuilder);
    }

    @Override // com.meizu.cloud.pushsdk.notification.a
    public void a(Notification notification, MessageV3 messageV3) {
        if (MinSdkChecker.isSupportNotificationBuild()) {
            RemoteViews remoteViews = new RemoteViews(this.f39897a.getPackageName(), com.meizu.cloud.pushsdk.notification.c.c.a(this.f39897a));
            remoteViews.setTextViewText(com.meizu.cloud.pushsdk.notification.c.c.d(this.f39897a), messageV3.getTitle());
            remoteViews.setTextViewText(com.meizu.cloud.pushsdk.notification.c.c.e(this.f39897a), messageV3.getContent());
            remoteViews.setLong(com.meizu.cloud.pushsdk.notification.c.c.f(this.f39897a), "setTime", System.currentTimeMillis());
            a(remoteViews, messageV3);
            remoteViews.setViewVisibility(com.meizu.cloud.pushsdk.notification.c.c.g(this.f39897a), 8);
            remoteViews.setViewVisibility(com.meizu.cloud.pushsdk.notification.c.c.h(this.f39897a), 8);
            notification.contentView = remoteViews;
        }
    }

    public void a(RemoteViews remoteViews, MessageV3 messageV3) {
        if (messageV3.getAppIconSetting() == null || a()) {
            remoteViews.setImageViewBitmap(com.meizu.cloud.pushsdk.notification.c.c.k(this.f39897a), a(this.f39897a, messageV3.getUploadDataPackageName()));
            return;
        }
        if (messageV3.getAppIconSetting().isDefaultLargeIcon()) {
            remoteViews.setImageViewBitmap(com.meizu.cloud.pushsdk.notification.c.c.k(this.f39897a), a(this.f39897a, messageV3.getUploadDataPackageName()));
            return;
        }
        Bitmap a11 = a(messageV3.getAppIconSetting().getLargeIconUrl());
        if (a11 != null) {
            remoteViews.setImageViewBitmap(com.meizu.cloud.pushsdk.notification.c.c.k(this.f39897a), a11);
        } else {
            remoteViews.setImageViewBitmap(com.meizu.cloud.pushsdk.notification.c.c.k(this.f39897a), a(this.f39897a, messageV3.getUploadDataPackageName()));
        }
    }
}
