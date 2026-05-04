package qb;

import android.os.Looper;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f82032a = true;

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f82033b = true;

    public static final boolean a() {
        return f82033b;
    }

    public static final boolean b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return f82032a;
        }
        return true;
    }

    public static final void c(boolean open) {
        f82033b = open;
    }

    public static final void d(boolean open) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            f82032a = open;
        }
    }
}
