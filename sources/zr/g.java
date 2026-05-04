package zr;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import androidx.core.content.PermissionChecker;
import com.huawei.secure.android.common.exception.NoPermissionCheckerException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f102843a = "PermissionUtil";

    public static boolean a(Context context, String str, String str2) throws NoPermissionCheckerException {
        if (Binder.getCallingPid() == Process.myPid()) {
            return false;
        }
        return b(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    public static boolean b(Context context, String str, int i11, int i12, String str2) throws NoPermissionCheckerException {
        try {
            return context.getApplicationInfo().targetSdkVersion > 23 ? context.checkPermission(str, i11, i12) == 0 : PermissionChecker.checkPermission(context, str, i11, i12, str2) == 0;
        } catch (Throwable th2) {
            Log.e(f102843a, "checkPermission: " + th2.getMessage() + " , you should implementation support library or androidx library");
            throw new NoPermissionCheckerException("you should implementation support library or androidx library");
        }
    }

    public static boolean c(Context context, String str) throws NoPermissionCheckerException {
        return b(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
