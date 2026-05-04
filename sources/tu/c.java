package tu;

import android.os.Looper;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static Thread f90953a;

    public static void a() {
        if (!b()) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
    }

    public static boolean b() {
        if (f90953a == null) {
            f90953a = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == f90953a;
    }
}
