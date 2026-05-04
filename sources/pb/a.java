package pb;

import android.app.Application;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static Application f80331a;

    public static Application a() {
        return f80331a;
    }

    public static void d(Application app2) {
        f80331a = app2;
    }

    public abstract void b();

    public void c() {
        f80331a = null;
    }
}
