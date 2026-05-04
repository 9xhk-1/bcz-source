package com.baicizhan.client.business.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class SystemSettingHelperKt {
    public static final void goAppSetting(@m80.k Context context) {
        g0.p(context, "context");
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        context.startActivity(intent);
    }

    public static final void tryGoNotificationSetting(@m80.k Context context) {
        g0.p(context, "context");
        if (Build.VERSION.SDK_INT < 26) {
            goAppSetting(context);
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        intent.putExtra(NotificationCompat.EXTRA_CHANNEL_ID, context.getApplicationInfo().uid);
        context.startActivity(intent);
    }
}
