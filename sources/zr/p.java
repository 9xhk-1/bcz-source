package zr;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public static Handler f102863a = new Handler(Looper.getMainLooper());

    public static void a(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        f102863a.post(runnable);
    }
}
