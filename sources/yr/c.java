package yr;

import android.content.Context;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static Context f100278a;

    public static Context a() {
        return f100278a;
    }

    public static void b(Context context) {
        if (context == null || f100278a != null) {
            return;
        }
        f100278a = context.getApplicationContext();
    }
}
