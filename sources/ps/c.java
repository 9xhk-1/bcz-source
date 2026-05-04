package ps;

import android.os.Build;
import android.util.Log;
import g80.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c {
    public static a a() {
        Log.i("MediaPlayerFactory", "[sdk" + Build.VERSION.SDK_INT + ", cpu " + b());
        return b() ? new a() : new b();
    }

    public static boolean b() {
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr != null && strArr.length != 0) {
            for (String str : strArr) {
                if (h.f53495a.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
