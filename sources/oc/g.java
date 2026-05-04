package oc;

import android.app.Activity;
import android.content.Context;
import com.google.android.material.timepicker.TimeModel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f76764a = "PushManager";

    /* renamed from: b, reason: collision with root package name */
    public static d f76765b;

    public static void a(sc.b w11) {
        sc.c.c().a(w11);
    }

    public static void b(Context context, int userId) {
        i.f().h(userId);
        qb.c.i(f76764a, TimeModel.f32588i, Integer.valueOf(userId));
    }

    public static void c() {
        sc.c.c().b();
    }

    public static void d(Activity activity, a appParam) {
        if (activity == null || f76765b != null) {
            qb.c.d(f76764a, "%b %b", Boolean.valueOf(activity == null), Boolean.valueOf(f76765b != null));
            return;
        }
        i.f().e(activity.getApplicationContext());
        i.f().c();
        d a11 = f.a(activity);
        f76765b = a11;
        a11.a(activity, appParam);
    }

    public static boolean e() {
        return f76765b != null;
    }

    public static void f(sc.b w11) {
        sc.c.c().e(w11);
    }

    public static void g(Context context) {
        qb.c.i(f76764a, "unBindAlia", new Object[0]);
        i.f().j(context);
        i.f().h(0);
    }

    public static void h(Context context) {
        d dVar = f76765b;
        qb.c.i(f76764a, " %s", dVar == null ? "null" : dVar.toString());
        d dVar2 = f76765b;
        if (dVar2 != null) {
            dVar2.b(context);
            f76765b = null;
        }
        i.f().j(context);
        i.f().c();
    }
}
