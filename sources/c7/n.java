package c7;

import android.content.Context;
import android.os.Build;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class n {
    public static final long a(@m80.k Context context) {
        long longVersionCode;
        g0.p(context, "context");
        try {
            if (Build.VERSION.SDK_INT < 28) {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            }
            longVersionCode = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).getLongVersionCode();
            return longVersionCode;
        } catch (Throwable th2) {
            z6.b.f101032b.e("getVersionCode", "getVersionCode", th2);
            return 0L;
        }
    }

    @m80.k
    public static final String b(@m80.k Context context) {
        g0.p(context, "context");
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str == null ? "" : str;
        } catch (Throwable th2) {
            z6.b.f101032b.e("getVersionCode", "getVersionCode", th2);
            return "";
        }
    }
}
