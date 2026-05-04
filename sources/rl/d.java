package rl;

import android.content.ClipData;
import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.openinstall.sdk.a;
import tz.j0;
import tz.k;
import tz.o;

/* loaded from: classes6.dex */
public final class d {
    @Nullable
    public static String a(@NonNull Context context) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (j0.f91313a) {
                j0.a("不能在主线程调用", new Object[0]);
            }
            return null;
        }
        a.C0730a a11 = io.openinstall.sdk.a.a(context.getApplicationContext());
        if (a11 != null) {
            return a11.a();
        }
        return null;
    }

    @Nullable
    public static String b(@NonNull Context context) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            k kVar = new k();
            kVar.b(context.getApplicationContext());
            return kVar.a();
        }
        if (!j0.f91313a) {
            return null;
        }
        j0.a("不能在主线程调用", new Object[0]);
        return null;
    }

    public static boolean c(ClipData clipData) {
        o b11 = o.b(clipData);
        if (b11 == null) {
            return false;
        }
        return b11.k(1) || b11.k(2);
    }
}
