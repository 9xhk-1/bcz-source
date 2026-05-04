package p1;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.aurelhubert.ahbottomnavigation.notification.AHNotification;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a {
    public static int a(@NonNull AHNotification notification, @ColorInt int defaultBackgroundColor) {
        int g11 = notification.g();
        return g11 == 0 ? defaultBackgroundColor : g11;
    }

    public static int b(@NonNull AHNotification notification, @ColorInt int defaultTextColor) {
        int j11 = notification.j();
        return j11 == 0 ? defaultTextColor : j11;
    }
}
