package tz;

import android.app.Activity;
import android.content.Context;
import android.os.Process;

/* loaded from: classes8.dex */
public class l0 {
    public static void a(Activity activity, String[] strArr, int i11) {
        activity.requestPermissions(strArr, i11);
    }

    public static boolean b(Context context) {
        return c(context, "android.permission.READ_PHONE_STATE");
    }

    public static boolean c(Context context, String str) {
        return str == null || context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }
}
