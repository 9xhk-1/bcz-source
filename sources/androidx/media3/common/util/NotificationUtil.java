package androidx.media3.common.util;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"InlinedApi"})
@UnstableApi
/* loaded from: classes2.dex */
public final class NotificationUtil {
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Importance {
    }

    private NotificationUtil() {
    }

    public static void createNotificationChannel(Context context, String str, @StringRes int i11, @StringRes int i12, int i13) {
        if (Util.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) Assertions.checkNotNull((NotificationManager) context.getSystemService("notification"));
            o.a();
            NotificationChannel a11 = n.a(str, context.getString(i11), i13);
            if (i12 != 0) {
                a11.setDescription(context.getString(i12));
            }
            notificationManager.createNotificationChannel(a11);
        }
    }

    public static void setNotification(Context context, int i11, @Nullable Notification notification) {
        NotificationManager notificationManager = (NotificationManager) Assertions.checkNotNull((NotificationManager) context.getSystemService("notification"));
        if (notification != null) {
            notificationManager.notify(i11, notification);
        } else {
            notificationManager.cancel(i11);
        }
    }
}
