package ss;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class h {
    @Nullable
    public static String a(@NonNull Context context, @NonNull String str) {
        Map<String, String> f11 = f(context);
        if (f11 == null) {
            return null;
        }
        return f11.get(str);
    }

    @Nullable
    public static String b(@NonNull Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null) {
                return null;
            }
            return applicationInfo.sourceDir;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static String c(@NonNull Context context) {
        return d(context, null);
    }

    @Nullable
    public static String d(@NonNull Context context, @NonNull String str) {
        c e11 = e(context);
        return e11 == null ? str : e11.a();
    }

    @Nullable
    public static c e(@NonNull Context context) {
        String b11 = b(context);
        if (TextUtils.isEmpty(b11)) {
            return null;
        }
        return d.a(new File(b11));
    }

    @Nullable
    public static Map<String, String> f(@NonNull Context context) {
        String b11 = b(context);
        if (TextUtils.isEmpty(b11)) {
            return null;
        }
        return d.b(new File(b11));
    }
}
